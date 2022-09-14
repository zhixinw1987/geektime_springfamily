package com.zhixinw.stp.service.impl.in;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import com.zhixinw.stp.service.OrderService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@ConditionalOnProperty(prefix = "app", name = "ctry", havingValue = "IN")
public class OrderServiceImpl implements OrderService {

	@Override
	public String placeOrder() {
		log.info("place order in IN");
		return "IN";
	}

}
