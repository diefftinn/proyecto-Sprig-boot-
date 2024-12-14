package com.ejercio2.Ejerci2.domain.service;

import com.ejercio2.Ejerci2.domain.dto.ClienteDTO;
import com.ejercio2.Ejerci2.domain.entity.Cliente;
import com.ejercio2.Ejerci2.persistence.ClienteRepository;
import com.ejercio2.Ejerci2.persistence.mapper.ClienteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private ClienteMapper clienteMapper;

    public List<ClienteDTO> listarClientes() {
        return clienteRepository.findAll().stream().map(clienteMapper::toDto).collect(Collectors.toList());
    }

    public ClienteDTO crearCliente(ClienteDTO clienteDTO) {
        Cliente cliente = clienteMapper.toEntity(clienteDTO);
        return clienteMapper.toDto(clienteRepository.save(cliente));
    }
}
