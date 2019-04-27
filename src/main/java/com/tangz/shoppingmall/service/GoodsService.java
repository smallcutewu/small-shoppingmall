package com.tangz.shoppingmall.service;

import com.tangz.shoppingmall.meta.Goods;

import java.util.List;


public interface GoodsService {
    int insertGoods(Goods goods);

    Goods findById(int id);

    int updateGoods(Goods goods);

    int deleteGoods(int id);

    List<Goods> getGoodsList();
}
