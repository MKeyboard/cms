package com.cmschina.product.rest;

import com.cmschina.product.entity.Product;
import com.cmschina.product.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api("产品信息")
public class ProductRest {

    @Autowired
    private ProductService productService;


    @ApiOperation("产品列表")
    @GetMapping("getProductList")
    public List<Product> getProductList(){
        return productService.getProductList();
    }
}
