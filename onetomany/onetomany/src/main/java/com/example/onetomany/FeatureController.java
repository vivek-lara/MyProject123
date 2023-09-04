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
@RequestMapping("feature")
public class FeatureController {
	@Autowired
	private FeatureService featureService;
    @PostMapping
	public Feature save(@RequestBody Feature feature)
	{
		return featureService.save(feature);
	}
    @GetMapping
    public List<Feature> readAll()
    {
    	return featureService.readAll();
    }
    @GetMapping("/{id}")
    public Feature read(@PathVariable Integer id)
    {
    	return featureService.read(id);
    }
    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable Integer id)
    {
    	return featureService.delete(id);
    }
}
