package com.example.ProjetoJoao.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.ProjetoJoao.Entities.Tarefas;
import com.example.ProjetoJoao.Repositories.TarefasRepositories;

public class TarefasServices {
	
	@Autowired
	public TarefasRepositories tarefasRepositories;
	
	
	public List<Tarefas> buscaTudo(){
		
		return tarefasRepositories.findAll();
	}
	
	public Tarefas save(Tarefas tarefas) {
		
		return tarefasRepositories.save(tarefas);
	}


}
