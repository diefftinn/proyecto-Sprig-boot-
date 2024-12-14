package com.ejercio2.Ejerci2.web;

import com.ejercio2.Ejerci2.domain.dto.CategoriaDTO;
import com.ejercio2.Ejerci2.domain.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<CategoriaDTO> listar() {
        return categoriaService.listarCategorias();
    }

    @PostMapping
    public CategoriaDTO crear(@RequestBody CategoriaDTO categoriaDTO) {
        return categoriaService.crearCategoria(categoriaDTO);
    }
}
