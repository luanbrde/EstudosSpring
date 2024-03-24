package com.example.ProjetoJoao.Resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProjetoJoao.Entities.Tarefas;
import com.example.ProjetoJoao.Services.TarefasServices;

@RestController
@RequestMapping(value = "/tarefas")
public class TarefasResources {
	
	@Autowired
	public TarefasServices tarefasServices;
	
	
	public ResponseEntity<List> BuscaTudo(){
		
		List<Tarefas> list = tarefasServices.buscaTudo();
		return ResponseEntity.ok().body(list);
		
	}
	
	
	
	@PostMapping
	public Tarefas save(@RequestBody Tarefas tarefas){
		return tarefasServices.save(tarefas);
		
		
	}
	


	
	
	
	
	
	
	
	
}
