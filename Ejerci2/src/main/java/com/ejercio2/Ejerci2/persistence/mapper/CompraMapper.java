package com.ejercio2.Ejerci2.persistence.mapper;

import com.ejercio2.Ejerci2.domain.dto.CompraDTO;
import com.ejercio2.Ejerci2.domain.entity.Compra;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CompraMapper {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "cliente.nombre", target = "clienteNombre")
    @Mapping(source = "fecha", target = "fecha")
    CompraDTO toDto(Compra compra);

    @InheritInverseConfiguration
    Compra toEntity(CompraDTO compraDTO);
}