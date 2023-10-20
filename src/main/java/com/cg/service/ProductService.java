package com.cg.service;

import java.util.ArrayList;
import java.util.List;

import com.cg.Dao.ProductDao;
import com.cg.entity.Product;

public class ProductService implements ProductDao{
List<Product> productList=new ArrayList<>();

 

	
	public String addProduct(Product product) {
		productList.add(product);
    return"Product added successfully";
	}

 

 

	public List<Product> getProductList() {
	return productList;
	}
 
}
