package com.ejercio2.Ejerci2.persistence.mapper;


import com.ejercio2.Ejerci2.domain.dto.ClienteDTO;
import com.ejercio2.Ejerci2.domain.entity.Cliente;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClienteMapper {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "email", target = "email")
    ClienteDTO toDto(Cliente cliente);

    @InheritInverseConfiguration
    Cliente toEntity(ClienteDTO clienteDTO);
}