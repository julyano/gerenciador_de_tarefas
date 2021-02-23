package com.sistema.gerenciador.controller;

import java.util.LinkedHashMap;
import java.util.Map;

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

	private Map<String, String> responsavelOptionsMap;
	
	private Map<String, String> prioridadeOptionsMap;
	
	public TarefasController() {
		responsavelOptionsMap = new LinkedHashMap<>();
		
		responsavelOptionsMap.put("Juliano", "Juliano");
		responsavelOptionsMap.put("Ana", "Ana");
		responsavelOptionsMap.put("Tom", "Tom");
		responsavelOptionsMap.put("Luna", "Luna");
		responsavelOptionsMap.put("Bruno", "Bruno");
		responsavelOptionsMap.put("Kelly", "Kelly");
		
		prioridadeOptionsMap = new LinkedHashMap<>();
		
		prioridadeOptionsMap.put("Alta", "Alta");
		prioridadeOptionsMap.put("Baixa", "Baixa");
		prioridadeOptionsMap.put("Média", "Média");		
	}
	
	public void salvar() {
		tarefasRepository.save(getTarefas());
	}

	public Tarefas getTarefas() {
		return tarefas;
	}

	public void setTarefas(Tarefas tarefas) {
		this.tarefas = tarefas;
	}
	
	public Map<String, String> getResponsavelOptionsMap() {
		return responsavelOptionsMap;
	}
	
	public Map<String, String> getPrioridadeOptionsMap() {
		return prioridadeOptionsMap;
	}
}