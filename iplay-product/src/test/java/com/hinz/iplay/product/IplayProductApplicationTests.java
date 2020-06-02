package com.hinz.iplay.product;

import com.hinz.iplay.product.entity.BrandEntity;
import com.hinz.iplay.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class IplayProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();

        // 更新
//        brandEntity.setBrandId(5L);
//        brandEntity.setDescript("华为牛逼");
//        brandService.updateById(brandEntity);

         //插入
        brandEntity.setName("hinz");
        brandService.save(brandEntity);
        System.out.println("保存成功...");

        /*List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id",5L));
        list.forEach((item)-> {
            System.out.println(item);
        });*/
    }

}
