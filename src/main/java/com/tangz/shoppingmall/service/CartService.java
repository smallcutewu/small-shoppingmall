package com.tangz.shoppingmall.service;

import com.tangz.shoppingmall.meta.ShoppingCart;

public interface CartService {
    int insertCart(ShoppingCart cart);

    ShoppingCart findByUserId(int userId);

    int updateCart(ShoppingCart cart);

}
