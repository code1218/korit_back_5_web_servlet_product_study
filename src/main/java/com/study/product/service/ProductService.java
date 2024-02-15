package com.study.product.service;

import com.study.product.dao.ProductDao;

public class ProductService {
	private static ProductService instance;
	private ProductDao productDao;
	
	private ProductService() {
		productDao = ProductDao.getInstance();
	}
	
	public static ProductService getInstance() {
		if(instance == null) {
			instance = new ProductService();
		}
		return instance;
	}
	
	public boolean duplicatedProductName(String productName) {
		boolean result = false;
		
		return result;
	}

	public void addProduct() {
		
	}
	
	
}






