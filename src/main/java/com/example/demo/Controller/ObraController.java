package com.example.demo.Controller;

import com.example.demo.Models.Obra;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Obras")
public class ObraController {

    @GetMapping
    public Obra getInfo(){
        Obra novaObra = new Obra(1, "Ajeitar sala", 2022, "Exatas", "Uninassau",
                "Ciencia da Computacao", "Sei lá", "cuscuz");

        return novaObra;
    }
}
