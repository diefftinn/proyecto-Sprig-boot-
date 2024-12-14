package com.ejercio2.Ejerci2.persistence;

import com.ejercio2.Ejerci2.domain.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {}

