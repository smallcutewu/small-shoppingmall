package com.tangz.shoppingmall.service;

import com.tangz.shoppingmall.meta.User;

public interface UserService {
    User findById(int id);

    User findByName(String name);

    int checkoutUser(String name, String password);
}
