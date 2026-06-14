package com.pe.cloud.computing.ciclo8.project_avm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pe.cloud.computing.ciclo8.project_avm.repository.VideojuegoRepository;

@Controller
public class VideojuegoController {

    @Autowired
    private VideojuegoRepository repository;

    @GetMapping("/")
    public String listar(Model model) {

        model.addAttribute(
                "videojuegos",
                repository.findAll());

        return "index";
    }
}
