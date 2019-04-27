package com.tangz.shoppingmall.service;

import com.tangz.shoppingmall.meta.Order;

import java.util.List;

public interface OrderService {
    int addOrder(Order order);

    String getSellerGoodsIds();

    String getUserGoodsIds(int userId);

    int getGoodsSelledNum(int goodsId);

    int getGoodsUserBuyNum(int goodsId, int userId);

    Order getOrderByUserIdAndGoodsId(int goodsId, int userId);

    List<Order> getOrderList(int userId);
}
