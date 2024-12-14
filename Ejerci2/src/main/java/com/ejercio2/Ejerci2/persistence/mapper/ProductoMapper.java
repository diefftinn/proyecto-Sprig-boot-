package com.ejercio2.Ejerci2.persistence.mapper;


import com.ejercio2.Ejerci2.domain.dto.ProductoDTO;
import com.ejercio2.Ejerci2.domain.entity.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductoMapper {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "precio", target = "precio")
    ProductoDTO toDto(Producto producto);

    @InheritInverseConfiguration
    Producto toEntity(ProductoDTO productoDTO);
}