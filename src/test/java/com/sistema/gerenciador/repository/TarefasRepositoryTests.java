package com.sistema.gerenciador.repository;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sistema.gerenciador.model.Tarefas;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class TarefasRepositoryTests {
	
	@Autowired
	private TarefasRepository tarefasRepository;
	
	@Test
	private void testCadastrar() {
		Tarefas tarefa = new Tarefas("tarefa1", "nova tarefa", "usuário1", "alta", new Date());
		Tarefas salva = tarefasRepository.save(tarefa);
		Assert.assertNotNull(salva.getTitulo());
	}
	
}
