package com.ejercio2.Ejerci2.web;

import com.ejercio2.Ejerci2.domain.dto.ClienteDTO;
import com.ejercio2.Ejerci2.domain.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<ClienteDTO> listar() {
        return clienteService.listarClientes();
    }

    @PostMapping
    public ClienteDTO crear(@RequestBody ClienteDTO clienteDTO) {
        return clienteService.crearCliente(clienteDTO);
    }
}
