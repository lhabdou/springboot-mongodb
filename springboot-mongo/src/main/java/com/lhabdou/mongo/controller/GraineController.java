/**
 * 
 */
package com.lhabdou.mongo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lhabdou.mongo.entities.Graine;
import com.lhabdou.mongo.repository.GraineRepository;

/**
 * @author asoilihi
 *
 */
@RestController
@RequestMapping("/graines")
public class GraineController {
	
	private GraineRepository graineRepository; 

	

	public GraineController(GraineRepository graineRepository) {
		this.graineRepository = graineRepository;
	}



	@GetMapping("/all")
	public List<Graine> getAll() {
		
		List<Graine> graines = this.graineRepository.findAll(); 
		
		return graines; 
	}
	

}
