package com.example.onetomany;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeatureService {
	@Autowired
	private FeatureRepository featureRepository;
	
	public Feature save(Feature feature)
	{
		return featureRepository.save(feature);
	}
	public List<Feature> readAll()
	{
		return (List<Feature>)featureRepository.findAll();
	}
    public Feature read(Integer id)
    {
    	return featureRepository.findById(id).get();
    }
    public Integer delete(Integer id)
    {
    	featureRepository.deleteById(id);
    	return id;
    }
}
