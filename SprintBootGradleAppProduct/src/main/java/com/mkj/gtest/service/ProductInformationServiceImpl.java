package com.mkj.gtest.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkj.gtest.entity.ProductInfomation;
import com.mkj.gtest.repository.ProductInformationRepository;
@Service
public class ProductInformationServiceImpl implements ProductInformationService{

	@Autowired
	ProductInformationRepository productinformationrepository;
   
	@Transactional
	@Override
	public ProductInfomation addProductInfo(ProductInfomation productInfo) {
		// TODO Auto-generated method stub
		ProductInfomation savedProfile=ProductInformationRepository.save(productInfo);
		return savedProfile;
	}
	
	
	

}
