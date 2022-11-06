package com.mkj.gtest.service;

import java.util.List;

import com.mkj.gtest.entity.Product;
import com.mkj.gtest.entity.ProductInfomation;

public interface ProductService 
{
	public List<Product> getAllProducts() throws Exception;

	public Product getProductByProductCode(int productCode) throws Exception;

	public Product getProductByProductName(String productName) throws Exception;

	public List<Product> getProductByCategory(String category) throws Exception;

	public List<Product> getProductsByCategoryAndPriceRangeAndDealerName(String category, float price1, float price2,
			String dealerName) throws Exception;

	public List<Product> getAllProductsByDealerName(String dealerName) throws Exception;

	public List<Product> getAllProductsByCategoryAndPriceAndRating(String category, float price, float rating)
			throws Exception;

	public String insertProduct(Product p) throws Exception;

	public Product linkProduct(ProductInfomation productInfo, Product alreadySavedProduct);

	
	

}
