package com.sistema.gerenciador.controller;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import com.sistema.gerenciador.model.Tarefas;
import com.sistema.gerenciador.repository.TarefasRepository;

@Named
@ViewScoped
public class TarefasController {
	
	@Autowired
	private TarefasRepository tarefasRepository; 
	
	private Tarefas tarefas = new Tarefas(); 
	
	public void salvar() {
		tarefasRepository.save(getTarefas());
	}

	public Tarefas getTarefas() {
		return tarefas;
	}

	public void setTarefas(Tarefas tarefas) {
		this.tarefas = tarefas;
	}
}