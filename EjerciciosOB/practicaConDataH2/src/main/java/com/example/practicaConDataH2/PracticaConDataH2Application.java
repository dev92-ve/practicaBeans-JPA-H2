package com.example.practicaConDataH2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PracticaConDataH2Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(PracticaConDataH2Application.class, args);
		TelefonosRepository repository = context.getBean(TelefonosRepository.class);

		//creando objetos

		Telefonos nacional = new Telefonos(null, "Redmi Note 8", 221.0, "Xiaomi", "Gamer");
		Telefonos importado = new Telefonos(null, "Vergatario", 150.5, "Vtelca", "Basico");
		//guardando objetos
		repository.save(nacional);
		repository.save(importado);
		System.out.println("Los telefonos guardados son: " + repository.count());
		//recuperando por ID
		System.out.println(repository.findAll());
	}

}
