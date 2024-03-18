package com.imartiniano.clientes.repository;

import com.imartiniano.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Cliente, Integer> {

}
