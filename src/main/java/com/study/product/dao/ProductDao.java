package com.study.product.dao;

import com.study.product.dto.InsertUserReqDto;
import com.study.product.vo.ProductVo;

public class ProductDao {
	private static ProductDao instance;
	
	private ProductDao() {}
	
	public static ProductDao getInstance() {
		if(instance == null) {
			instance = new ProductDao();
		}
		return instance;
	}
	
	public ProductVo findProductByProductName(String productName) {
		ProductVo productVo = null;
		
		return productVo;
	}
	
	public int save(ProductVo productVo) {
		int successCount = 0;
		
		return successCount;
	}

}








