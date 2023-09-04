package com.example.onetomany;



import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class Feature {
     @Id
	 private Integer id;
	 private String featureName;
	 private String featureDesc;
	 @ManyToOne
	 @JsonIgnore
	 private Product product;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFeatureName() {
		return featureName;
	}
	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}
	public String getFeatureDesc() {
		return featureDesc;
	}
	public void setFeatureDesc(String featureDesc) {
		this.featureDesc = featureDesc;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}

}
