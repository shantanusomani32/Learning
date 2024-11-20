package com.ss.service;

import java.util.List;

import com.ss.dto.ProductDto;
import com.ss.entity.Product;

public interface ProductService {
	
	void save(ProductDto p);
	
	List<Product> list();
	
	Product getByCode(int code);
	
	void delete (int code);
	
	List<Product> findByPriceRange(double min, double max);
	
	List<Product> findByCategory(String category);
	
	List<Product> findPriceAcending();

}
