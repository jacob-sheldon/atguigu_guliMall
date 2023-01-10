package com.jacob.gulimall.product;

import com.jacob.gulimall.product.entity.BrandEntity;
import com.jacob.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("Apple");
        brandService.save(brandEntity);
        System.out.println("保存成功。。。");
    }

}
