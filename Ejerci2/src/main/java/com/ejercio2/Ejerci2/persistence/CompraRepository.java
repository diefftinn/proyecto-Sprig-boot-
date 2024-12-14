package com.ejercio2.Ejerci2.persistence;

import com.ejercio2.Ejerci2.domain.entity.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Long> {}
