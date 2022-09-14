package com.zhixinw.stp.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhixinw.stp.service.OrderService;

@RestController
@RequestMapping("/api/stp")
public class Controller {
	
	@Autowired
	private OrderService orderService;

	@GetMapping("/get/{ctry}")
	public ResponseEntity<Object> send(@PathVariable(name = "ctry") String ctry){
		return ResponseEntity.ok(orderService.placeOrder());
	}
}
