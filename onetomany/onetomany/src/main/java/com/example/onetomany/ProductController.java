package com.example.onetomany;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@PostMapping
	public Product save(@RequestBody Product product)
	{
		return productService.save(product);
	}
	/*
	 {
	   "id":1,
	   "name":"car",
	   "price":900000.00,
	   "features":[
	           {
	           "id":121,
	           "featureName":"max speed",
	           "featureDesc":"240 km/hr" 
	           },
	           {
	           "id":122,
	           "featureName":"average",
	           "featureDesc":"240 km/hr" 
	           },
	           {
	           "id":125,
	           "featureName":"ABS",
	           "featureDesc":"yes" 
	           }
	            ]
	 }
	
	 */
    @GetMapping
	public List<Product> readAll()
	{
    	return productService.readAll();
	}
    @GetMapping("/{id}")
    public Product read(@PathVariable Integer id)
    {
    	return productService.read(id);
    }
    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable Integer id)
    {
    	return productService.delete(id);
    	
    }
}
