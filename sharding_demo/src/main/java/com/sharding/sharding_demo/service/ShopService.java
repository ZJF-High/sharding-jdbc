package com.sharding.sharding_demo.service;

import com.sharding.sharding_demo.entity.Shop;

import java.util.List;


public interface ShopService {

	int insert(Shop shop);

	List selectAll(Shop shop);

	Shop deleteById(Integer id);

}
