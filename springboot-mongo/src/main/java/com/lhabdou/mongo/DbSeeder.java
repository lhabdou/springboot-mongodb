package com.lhabdou.mongo;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.lhabdou.mongo.entities.Emplacement;
import com.lhabdou.mongo.entities.Graine;
import com.lhabdou.mongo.entities.Racine;
import com.lhabdou.mongo.repository.GraineRepository;

//@Component
public class DbSeeder implements CommandLineRunner {

	private GraineRepository graineRepository;
	
	

	public DbSeeder (GraineRepository graineRepository) {
		this.graineRepository = graineRepository;
	}



	@Override
	public void run(String... args) throws Exception {
		Graine graine1 = new Graine("Maïs", new Date(), Arrays.asList(new Racine("rac1", 45, true),
				new Racine("rac2", 12, true), new Racine("rac3", 52, false)), 42d, new Emplacement("France", "Lille"));
		Graine graine2 = new Graine("Tomates", new Date(), Arrays.asList(new Racine("rac1", 45, true),
				new Racine("rac2", 12, true), new Racine("rac3", 52, false)), 42d, new Emplacement("France", "Lille"));
		Graine graine3 = new Graine("Maï", new Date(), Arrays.asList(new Racine("rac1", 45, true)), 42d,
				new Emplacement("France", "Lille"));

		// drop all graines
		
		this.graineRepository.deleteAll();
		
		// add our hotels 
		
		List<Graine> graines = Arrays.asList(graine1, graine2, graine3); 
		this.graineRepository.saveAll(graines);
		
	}
	
	 


}
