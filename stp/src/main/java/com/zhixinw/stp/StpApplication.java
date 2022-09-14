package com.zhixinw.stp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(excludeFilters = {
		@ComponentScan.Filter(type = FilterType.REGEX, pattern = "com.zhixinw.stp.service.imp*")
})
public class StpApplication{

	public static void main(String[] args) {
		SpringApplication.run(StpApplication.class, args);
	}
}
