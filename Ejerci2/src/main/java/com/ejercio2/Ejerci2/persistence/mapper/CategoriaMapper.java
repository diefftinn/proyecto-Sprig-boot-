package com.ejercio2.Ejerci2.persistence.mapper;

import com.ejercio2.Ejerci2.domain.dto.CategoriaDTO;
import com.ejercio2.Ejerci2.domain.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CategoriaMapper {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "nombre", target = "nombre")
    CategoriaDTO toDto(Categoria categoria);

    @InheritInverseConfiguration
    Categoria toEntity(CategoriaDTO categoriaDTO);
}
