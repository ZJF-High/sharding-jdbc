package com.sharding.sharding_demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sharding.sharding_demo.dao.ShopMapper;
import com.sharding.sharding_demo.entity.Shop;
import com.sharding.sharding_demo.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {

	@Autowired
	private ShopMapper shopMapper;

	@Override
	public int insert(Shop shop) {
		return shopMapper.insert (shop);
	}

	@Override
	public List selectAll(Shop shop) {
		QueryWrapper<Shop> wrapper=new QueryWrapper<> ();
		if(shop!=null)
		wrapper.like ("productname", shop.getProductname ());
		return shopMapper.selectList (wrapper);
	}

	@Override
	public Shop deleteById(Integer id) {
		return shopMapper.selectById (id);
	}
}
