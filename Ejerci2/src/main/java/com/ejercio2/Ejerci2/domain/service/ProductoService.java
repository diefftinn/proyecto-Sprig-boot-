package com.ejercio2.Ejerci2.domain.service;

import com.ejercio2.Ejerci2.domain.dto.ProductoDTO;
import com.ejercio2.Ejerci2.domain.entity.Producto;
import com.ejercio2.Ejerci2.persistence.ProductoRepository;
import com.ejercio2.Ejerci2.persistence.mapper.ProductoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;
    @Autowired
    private ProductoMapper productoMapper;

    public List<ProductoDTO> listarProductos() {
        return productoRepository.findAll().stream().map(productoMapper::toDto).collect(Collectors.toList());
    }

    public ProductoDTO crearProducto(ProductoDTO productoDTO) {
        Producto producto = productoMapper.toEntity(productoDTO);
        return productoMapper.toDto(productoRepository.save(producto));
    }
}
