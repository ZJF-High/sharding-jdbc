package com.sharding.sharding_demo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sharding.sharding_demo.common.CommonResult;
import com.sharding.sharding_demo.entity.Shop;
import com.sharding.sharding_demo.service.ShopService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("shop")
@Api("Shop Controller")
public class ShopController {

	@Autowired
	private ShopService shopService;

	@GetMapping("selectAll")
	@ApiOperation ("select all")
	public CommonResult selectAll(){
		List list = shopService.selectAll (null);
		return CommonResult.success (list);
	}

	@PostMapping("insert")
	@ApiOperation ("insert one")
	public CommonResult insert(Shop shop){
		int i = shopService.insert (shop);
		return CommonResult.success (i);
	}

	@PostMapping("queryByPage")
	@ApiOperation ("分页查询")
	public CommonResult queryByPage(@RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "15") Integer pageSize,Shop shop){
		PageHelper.startPage (pageNum, pageSize);
		List list = shopService.selectAll (shop);
		return CommonResult.success (new PageInfo<> (list));

	}

}
