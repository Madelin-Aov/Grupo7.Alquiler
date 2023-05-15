/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mvc.alquileres.controllers;

import com.mvc.alquileres.entities.Propietario;
import com.mvc.alquileres.services.PropietarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Administrator
 */
@Controller
public class HomeController {

    @Autowired
    private PropietarioService propietarioService;
            
    @GetMapping("/")
    public String index(ModelMap model){
        
        List<Propietario> propetarios = propietarioService.getAll();

        model.addAttribute("propietariosList" ,propetarios);
        return "home";
    }
}
