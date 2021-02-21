package com.sistema.gerenciador.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.gerenciador.model.Tarefas;

public interface TarefasRepository extends JpaRepository<Tarefas, Long> {

}
