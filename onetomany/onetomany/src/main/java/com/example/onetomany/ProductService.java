package com.example.onetomany;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.Id;

@Service
public class ProductService {
	@Autowired
	private ProductRepository  productRepository;
	
	public Product save(Product product)
	{
		for(Feature feature:product.getFeatures())
		{
			feature.setProduct(product);
		}
		return productRepository.save(product);
	}
	public List<Product>readAll()
	{
		return (List<Product>)productRepository.findAll();
	}
	public Product read(Integer id)
	{
		return productRepository.findById(id).get();
	}
	public Integer delete(Integer id)
	{
		productRepository.deleteById(id);
		return id;
	}
	}


