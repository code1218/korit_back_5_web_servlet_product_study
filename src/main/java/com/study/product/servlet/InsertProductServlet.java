package com.study.product.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.study.product.dto.InsertProductReqDto;
import com.study.product.service.ProductService;
import com.study.product.utils.RequestUtil;

@WebServlet("/product")
public class InsertProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductService productService;
       
    public InsertProductServlet() {
        super();
        productService = ProductService.getInstance();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		InsertProductReqDto reqDto = RequestUtil.convertJsonData(request, InsertProductReqDto.class);
		
		
	}
	
	public <T> T test() {
		T a = null;
		
		return a;
		
	}

}












