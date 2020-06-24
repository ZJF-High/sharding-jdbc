package com.sharding.sharding_demo.shop_test;

import com.sharding.sharding_demo.service.ShopService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith (SpringRunner.class)
@SpringBootTest
public class ShardingTest {

	@Autowired
	private ShopService shopService;

	@Test
	public  void  testInsert() throws InterruptedException {
		System.out.println ("jjj");
		//for (int i=0;i<300000;i++){
		//	Shop shop = new Shop ();
		//	shop.setProductname ("Test Sharding JDBC data _"+i);
		//	shop.setPicpath ("c:\\pic\\adc");
		//	shop.setDiscription ("shop "+i);
		//	shop.setPrice (i%5);
		//	shopService.insert (shop);
		//	Thread.sleep (2);
		//}
	}

}
