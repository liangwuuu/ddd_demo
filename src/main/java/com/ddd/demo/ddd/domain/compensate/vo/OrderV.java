package com.ddd.demo.ddd.domain.compensate.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 订单-值对象
 *
 * @author wangling
 * @date 2021-9-16
 */
@Data
public class OrderV implements Serializable {

    //一个域在访问其他域的模型时，把获取到的模型做层转换映射到自己域的模型中（不直接使用别的域模型作为自己域模型中的一部分）
    //防止源域模型发生变更，依赖源域模型的调用方，在需要源域模型新功能时，必须要全局依赖修改，才在能兼容
    //防止域上下文不一致产生的冲突

    /**
     * 店铺编号-系统中转需要
     */
    private Integer shopId;
    /**
     * 订单编码
     */
    private Long subOid;
    /**
     * 店铺名称
     */
    private String shopName;
    /**
     * acid用户编码
     */
    private Long acId;
    /**
     * 用户名称
     */
    private String username;
    /**
     * 仓库编码
     */
    private Integer wid;
    /**
     * 仓库名称
     */
    private String warehouseName;
    /**
     * 商品明细
     */
    private List<OrderGoodsV> orderGoodsList;
}
