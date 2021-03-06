package com.jasonless.mall.service.goods.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jasonless.mall.api.cart.model.Cart;
import com.jasonless.mall.api.goods.model.Sku;

import java.util.List;

/**
 * @author Jasonless
 * @date 2020/12/3
 */
public interface SkuService extends IService<Sku> {

    /**
     * 根据推广产品分类ID查询SKU列表
     * @param id
     * @return
     */
    List<Sku> typeSkuItems(Integer id);

    void delTypeSkuItems(Integer id);

    List<Sku> updateTypeSkuItems(Integer id);

    /***
     * 库存递减
     * @param carts
     */
    void decount(List<Cart> carts);

}
