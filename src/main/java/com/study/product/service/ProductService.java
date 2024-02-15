package com.study.product.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.study.product.dao.ProductDao;
import com.study.product.dto.InsertProductReqDto;
import com.study.product.dto.InsertProductRespDto;
import com.study.product.dto.SearchProductRespDto;
import com.study.product.vo.ProductVo;

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
	
	public boolean isDuplicatedProductName(String productName) {
		return productDao.findProductByProductName(productName) != null;
	}

	public InsertProductRespDto addProduct(InsertProductReqDto insertProductReqDto) {
		ProductVo productVo = insertProductReqDto.toVo();	//200주소
		
		int successCount = productDao.save(productVo);
		
		return productVo.toInsertDto(successCount);
	}
	
	public List<SearchProductRespDto> searchProducts() {
		List<SearchProductRespDto> searchProductRespDtos = new ArrayList<>();
		
		List<ProductVo> productVos = productDao.getProductList();
		
		for(ProductVo productVo : productVos) {
			searchProductRespDtos.add(productVo.toSearchDto());
		}
		
		return searchProductRespDtos;
		
//		Stream<String> strStream = Stream.of("a", "b", "c", "d");
//		
//		strStream.peek(str -> System.out.println(str));
//		
//		List<String> strList = strStream.peek(System.out::println).collect(Collectors.toList());
//		
//		return productDao.getProductList().stream()
//			.map(vo -> vo.toSearchDto())
//			.collect(Collectors.toList());
//		
//		// [ 1,2,3,4,5 ]	->		[2,4,6,8,10]
//		
//		// let nums = [ 1,2,3,4,5 ];
//		// let num2 = nums.map(num => num * 2);	[ 2,4,6,8,10 ]
//		
//		
//		return productDao.getProductList().stream()
//				.map(ProductVo::toSearchDto)
//				.collect(Collectors.toList());
		
	}
	
}
















