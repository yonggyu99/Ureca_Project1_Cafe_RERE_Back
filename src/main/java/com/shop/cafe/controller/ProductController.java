package com.shop.cafe.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.cafe.dto.Product;
import com.shop.cafe.service.ProductService;

@RestController		//컨트롤러여야 url을 라우팅 할 수 있다.
@CrossOrigin("http://127.0.0.1:5500/")
public class ProductController {

	@Autowired
	ProductService productService;
	
	Map<String,Object> storage = new HashMap();
	
	@GetMapping("getAllProducts")
	public List<Product> getAllporoducts() {
		try {
			Object o = storage.get("firstPageProducts");
			if(o == null) {
				List<Product>list = productService.getAllProducts();
				storage.put("firstPageProducts", list);
				return list;
			}
			
			return (List<Product>) o;
			
		} catch (Exception e) {
			
			e.printStackTrace();
			return null;
			
		}
	}
	
}
