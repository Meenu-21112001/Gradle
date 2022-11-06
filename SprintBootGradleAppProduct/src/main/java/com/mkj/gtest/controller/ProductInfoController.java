package com.mkj.gtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mkj.gtest.entity.Product;
import com.mkj.gtest.entity.ProductInfomation;
import com.mkj.gtest.service.ProductInformationService;
import com.mkj.gtest.service.ProductService;

@RestController
@RequestMapping("product/productinfo")
public class ProductInfoController 
{
	@Autowired
	ProductInformationService   productInfoService;
	@Autowired
	ProductService productService;

	@PostMapping("/add")
	public Product doProductInfoThings(@RequestBody ProductInfomation productInfo, @RequestParam String productName) {
		Product alreadySavedProduct = null;
		try {
			ProductInfomation savedProfile = productInfoService.addProductInfo(productInfo);
			if (savedProfile.getCertificateNumber() != 0) {
				alreadySavedProduct = productService.getProductByProductName(productName);
				if (alreadySavedProduct != null) {
					Product addProduct = productService.linkProduct(productInfo, alreadySavedProduct);

					return addProduct;
				} else {
					throw new Exception("User not found ,  " + alreadySavedProduct + " for " + productName);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
			return alreadySavedProduct;
		}

		return alreadySavedProduct;

		// code to add the profile
	}
}