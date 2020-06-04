package com.hinz.iplay.product.feign;

import com.hinz.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：quanhz
 * @date ：Created in 2020/6/4 14:07
 */
@FeignClient("iplay-member")
public interface ProductFeign {

    @RequestMapping("/member/member/testFeign")
    R testFeign();
}
