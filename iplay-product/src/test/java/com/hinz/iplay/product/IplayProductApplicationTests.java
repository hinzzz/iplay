package com.hinz.iplay.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hinz.iplay.product.entity.BrandEntity;
import com.hinz.iplay.product.entity.CategoryEntity;
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

        CategoryEntity c1 = new CategoryEntity();
        CategoryEntity c2 = new CategoryEntity();
        c1.setCatId(1L);
        c2.setCatId(1L);
        System.out.println(c1.getCatId() == c2.getCatId());

        c1.setCatId(129L);
        c2.setCatId(129L);
        System.out.println(c1.getCatId() == c2.getCatId());

        c1.setCatId(1000L);
        c2.setCatId(1000L);
        System.out.println(c1.getCatId() == c2.getCatId());

        c1.setCatId(164L);
        c2.setCatId(164L);
        System.out.println(c1.getCatId() == c2.getCatId());
    }

}
