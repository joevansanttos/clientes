package io.github.joevansanttos.clientes.model.repository;

import io.github.joevansanttos.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository <Cliente, Integer> {
}
