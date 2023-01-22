package com.ssl.note.seata.order.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@TableName("`order`")
@Data
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "product_id", type = IdType.AUTO)
    private Integer productId;

    private Integer count;
}
