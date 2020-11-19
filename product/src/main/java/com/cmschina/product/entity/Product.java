package com.cmschina.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Alias("Product")
@Data
@ApiModel("${comments}")
@TableName("tb_product")
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId
    @ApiModelProperty("产品号")
    private int prodId;

    @ApiModelProperty("产品名称")
    private String prodName;

    @ApiModelProperty("产品类型")
    private int prodType;

    @ApiModelProperty("产品描述")
    private String prodDesc;

    @ApiModelProperty("产品图片链接")
    private String prodLink;
}
