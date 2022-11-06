package com.mkj.gtest.service;
import  com.mkj.gtest.entity.ProductInfomation;
import org.springframework.stereotype.Service;

@Service
public interface ProductInformationService 
{
	public ProductInfomation addProductInfo(ProductInfomation productInfo);

}
