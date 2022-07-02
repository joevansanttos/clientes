package io.github.joevansanttos.clientes.model.repository;

import io.github.joevansanttos.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
