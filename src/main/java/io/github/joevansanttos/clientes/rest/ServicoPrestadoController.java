package io.github.joevansanttos.clientes.rest;


import io.github.joevansanttos.clientes.model.entity.Cliente;
import io.github.joevansanttos.clientes.model.entity.ServicoPrestado;
import io.github.joevansanttos.clientes.model.repository.ClienteRepository;
import io.github.joevansanttos.clientes.model.repository.ServicoPrestadoRepository;
import io.github.joevansanttos.clientes.rest.dto.ServicoPrestadoDTO;
import io.github.joevansanttos.clientes.rest.util.BigDecimalConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/servicos-prestados")
@RequiredArgsConstructor
public class ServicoPrestadoController {




}
