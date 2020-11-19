package com.cmschina.product.service.impl;

import com.cmschina.product.dao.ProductDao;
import com.cmschina.product.entity.Product;
import com.cmschina.product.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> getProductList() {
        List<Product> list=productDao.getProductList();
        return list;
    }
}
