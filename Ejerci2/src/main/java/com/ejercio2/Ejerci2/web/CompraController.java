package com.ejercio2.Ejerci2.web;

import com.ejercio2.Ejerci2.domain.dto.CompraDTO;
import com.ejercio2.Ejerci2.domain.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compras")
public class CompraController {
    @Autowired
    private CompraService compraService;

    @GetMapping
    public List<CompraDTO> listar() {
        return compraService.listarCompras();
    }

    @PostMapping
    public CompraDTO crear(@RequestBody CompraDTO compraDTO) {
        return compraService.crearCompra(compraDTO);
    }
}
