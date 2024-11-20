package com.ss.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ss.dto.ProductDto;
import com.ss.entity.Product;
@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public void save(ProductDto p) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Product> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getByCode(int code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int code) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Product> findByPriceRange(double min, double max) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findPriceAcending() {
		// TODO Auto-generated method stub
		return null;
	}

}
