
Druid配置
https://github.com/alibaba/druid/wiki/DruidDataSource%E9%85%8D%E7%BD%AE%E5%B1%9E%E6%80%A7%E5%88%97%E8%A1%A8


nacos 作为配置中心使用
1、 必须使用 bootstrap.properties 配置文件来配置Nacos Server 地址
spring.application.name=nacos-config
spring.cloud.nacos.config.server-addr=127.0.0.1:8848

nacos 增加配置
Data ID:    nacos-config.properties

Group  :    DEFAULT_GROUP

配置格式:    Properties

配置内容：   user.name=nacos-config-properties
            user.age=90
            
注意dataid是以 properties(默认的文件扩展名方式)为扩展名。



在应用的 bootstrap.properties 配置文件中显示的声明 dataid 文件扩展名
spring.cloud.nacos.config.file-extension=yaml

@RefreshScope 动态刷新配置



可支持profile粒度的配置
${spring.application.name}-${profile}.${file-extension:properties}

${spring.profiles.active} 当通过配置文件来指定时必须放在 bootstrap.properties 文件中
spring.profiles.active=develop

Data ID:        nacos-config-develop.yaml

Group  :        DEFAULT_GROUP

配置格式:        YAML

配置内容:        current.env: develop-env

此案例中我们通过 spring.profiles.active=<profilename> 的方式写死在配置文件中，而在真正的项目实施过程中这个变量的值是需要不同环境而有不同的值。这个时候通常的做法是通过 -Dspring.profiles.active=<profile> 参数指定其配置来达到环境间灵活的切换。

支持自定义 namespace 的配置
在没有明确指定 ${spring.cloud.nacos.config.namespace} 配置的情况下， 默认使用的是 Nacos 上 Public 这个namespae。
spring.cloud.nacos.config.namespace=b3404bc0-d7dc-4855-b519-570ed34b62d7

该配置必须放在 bootstrap.properties 文件中。此外 spring.cloud.nacos.config.namespace 的值是 namespace 对应的 id，id 值可以在 Nacos 的控制台获取。并且在添加配置时注意不要选择其他的 namespae，否则将会导致读取不到正确的配置。



2、openfeign 简单使用
主运行类IplayProductApplication启用@EnableFeignClients

客户端发起调用
@FeignClient("iplay-member")
public interface ProductFeign {

    @RequestMapping("/member/member/testFeign") 
    R testFeign();
}

iplay-member为服务端的spring.application.name
服务端和客户端都必须注册进注册中心


3、gateway简单使用



4、前端开发环境搭建
visual studio code 
相关插件
Auto Close Tag
Auto Rename Tag
ESLint
HTML CSS Support
HTML Snippets
JavaScript (ES6) code snippets
Live Server
open in browser
Vetur



搭建 vue-cli + webpack 安装配置
npm install -g vue-cli
npm install  webpack -g

vue init webpack


mkdir -p /mydata/nginx/www /mydata/nginx/logs /mydata/nginx/conf

docker run -d -p 80:80 -p 443:443 --name nginx-server -v /home/nginx/www:/usr/share/nginx/html 
-v /home/nginx/conf/nginx.conf:/etc/nginx/nginx.conf -v /home/nginx/logs:/var/log/nginx nginx


前端开发

1、接口全部调用统一网关 然后再由网关去请求响应服务
修改网关地址：D:\space\iplay\renren-fast-vue\static\config\index.js 
  // api接口请求地址
  window.SITE_CONFIG['baseUrl'] = 'http://localhost:80/api';

2、配置好响应网关
网关路由的时候默认按照配置顺序路由 因此应该网关配置先精确在模糊

3、跨域处理
接口全部调用统一网关 然后再由网关去请求响应服务之后出现
Access to XMLHttpRequest at 'http://localhost:10003/api/sys/menu/nav?t=1592359305614' from origin 'http://localhost:8001' 
has been blocked by CORS policy: Response to preflight request doesn't pass access control check: No 'Access-Control-Allow-Origin' 
header is present on the requested resource.

什么事跨域 ： 当一个请求url的协议、域名、端口三者之间任意一个与当前页面url不同即为跨域

解决：
网关服务配置允许跨域
@Configuration
public class GulimallCorsConfiguration {

    @Bean
    public CorsWebFilter corsWebFilter(){
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

        CorsConfiguration corsConfiguration = new CorsConfiguration();

        //1、配置跨域
        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedMethod("*");
        corsConfiguration.addAllowedOrigin("*");
        corsConfiguration.setAllowCredentials(true);

        source.registerCorsConfiguration("/**",corsConfiguration);
        return new CorsWebFilter(source);
    }
}



4、路由重写
filters:
            - RewritePath=/api/(?<segment>.*),/renren-fast/$\{segment}
            
http://localhost:10003/api/captcha.jpg   http://localhost:8080/renren-fast/captcha.jpg