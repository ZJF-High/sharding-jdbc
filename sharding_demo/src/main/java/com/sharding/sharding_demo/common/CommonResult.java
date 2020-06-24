package com.sharding.sharding_demo.common;

import lombok.Data;

@Data
public class CommonResult {

	private int code;

	private String message;

	private Object object;

	public CommonResult() {
	}

	public CommonResult(int code, Object object) {
		this.code = code;
		this.object = object;
	}

	public static CommonResult success(Object object) {
		return new CommonResult (200, object);
	}


	public static CommonResult error(int code,Object object) {
		return new CommonResult (code, object);
	}


}
