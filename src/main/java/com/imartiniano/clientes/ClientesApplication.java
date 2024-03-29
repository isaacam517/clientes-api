package com.imartiniano.clientes;

import com.imartiniano.clientes.model.entity.Cliente;
import com.imartiniano.clientes.repository.ClienteRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientesApplication {

//	@Bean
//	public CommandLineRunner run( @Autowired ClienteRepository repository ) {
//		return args -> {
//			Cliente cliente = Cliente.builder().cpf("12345678910").nome("Isaac Martiniano").build();
//			repository.save(cliente);
//		};
//	}

	public static void main(String[] args) {
		SpringApplication.run(ClientesApplication.class, args);
	}

}
