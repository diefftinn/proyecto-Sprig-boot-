package com.ejercio2.Ejerci2.domain.service;

import com.ejercio2.Ejerci2.domain.dto.CompraDTO;
import com.ejercio2.Ejerci2.domain.entity.Compra;
import com.ejercio2.Ejerci2.persistence.CompraRepository;
import com.ejercio2.Ejerci2.persistence.mapper.CompraMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompraService {
    @Autowired
    private CompraRepository compraRepository;
    @Autowired
    private CompraMapper compraMapper;

    public List<CompraDTO> listarCompras() {
        return compraRepository.findAll().stream().map(compraMapper::toDto).collect(Collectors.toList());
    }

    public CompraDTO crearCompra(CompraDTO compraDTO) {
        Compra compra = compraMapper.toEntity(compraDTO);
        return compraMapper.toDto(compraRepository.save(compra));
    }
}

