package com.devsuperior.dsclient.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsclient.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L,"Pyter Barros","01306997488",5000.0,Instant.now(),0));
		list.add(new Client(2L,"Debora Moura","01306997488",6000.0,Instant.now(),1));
		return ResponseEntity.ok().body(list);		
	}
}
