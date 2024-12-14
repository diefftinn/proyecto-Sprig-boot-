package com.ejercio2.Ejerci2.domain.service;

import com.ejercio2.Ejerci2.domain.dto.CategoriaDTO;
import com.ejercio2.Ejerci2.domain.entity.Categoria;
import com.ejercio2.Ejerci2.persistence.CategoriaRepository;
import com.ejercio2.Ejerci2.persistence.mapper.CategoriaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private CategoriaMapper categoriaMapper;

    public List<CategoriaDTO> listarCategorias() {
        return categoriaRepository.findAll().stream().map(categoriaMapper::toDto).collect(Collectors.toList());
    }

    public CategoriaDTO crearCategoria(CategoriaDTO categoriaDTO) {
        Categoria categoria = categoriaMapper.toEntity(categoriaDTO);
        return categoriaMapper.toDto(categoriaRepository.save(categoria));
    }
}
