package br.com.alura.microservice.loja.controller;

import br.com.alura.microservice.loja.dto.CompraDTO;
import br.com.alura.microservice.loja.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by MarcoAntonioGoncalve on Dec, 2019
 */
@RestController
@RequestMapping("/compra")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @RequestMapping(method = RequestMethod.POST)
    public void realizaCompra(@RequestBody CompraDTO compraDTO){

        compraService.realizaCompra(compraDTO);

    }
}
