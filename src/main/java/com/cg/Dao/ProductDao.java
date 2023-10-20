package com.cg.Dao;

import java.util.List;

import com.cg.entity.Product;

public interface ProductDao {
	public String addProduct(Product product);

	public List<Product> getProductList();
}
