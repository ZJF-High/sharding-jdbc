package com.sharding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@MapperScan("com.sharding.sharding_demo.dao")
@SpringBootApplication
@EnableSwagger2
public class ShardingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run (ShardingDemoApplication.class, args);
	}


	@Bean
	public Docket createRestApi() {
		return new Docket (DocumentationType.SWAGGER_2)
				.apiInfo (apiInfo ())
				.select ()
				//为当前包路径
				.apis (RequestHandlerSelectors.basePackage ("com.hsyt.sharding_demo.controller"))
				.paths (PathSelectors.any ())
				.build ();
//        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class)).build();
	}

	//构建 api文档的详细信息函数,注意这里的注解引用的是哪个
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder ()
				//页面标题
				.title ("Spring Boot 使用 Swagger2 构建RESTful API")
				//创建人
				.contact (new Contact ("hsyuntai", "http://www.baidu.com", ""))
				//版本号
				.version ("1.0")
				//描述
				.description ("Sharding jdbc demo")
				.build ();
	}

}
