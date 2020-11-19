package com.cmschina.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cmschina.product.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProductDao extends BaseMapper<Product> {

    List<Product> getProductList();
}
