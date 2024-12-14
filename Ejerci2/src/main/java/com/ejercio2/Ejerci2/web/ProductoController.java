package com.ejercio2.Ejerci2.web;

import com.ejercio2.Ejerci2.domain.dto.ProductoDTO;
import com.ejercio2.Ejerci2.domain.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<ProductoDTO> listar() {
        return productoService.listarProductos();
    }

    @PostMapping
    public ProductoDTO crear(@RequestBody ProductoDTO productoDTO) {
        return productoService.crearProducto(productoDTO);
    }
}
