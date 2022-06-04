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
	
	private Instant date;
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = new ArrayList<>();		
		list.add(new Client(1L,"Adriano","11111111111",9000.00,date,0));
		list.add(new Client(2L,"Andre","12222222222",3000.00,date,0));
		list.add(new Client(3L,"Vera","12345678",2000.00,date,1));
		return ResponseEntity.ok().body(list);
	}
	
	
	
}
