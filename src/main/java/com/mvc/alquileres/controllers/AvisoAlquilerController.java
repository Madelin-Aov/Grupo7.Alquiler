/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mvc.alquileres.controllers;

import com.mvc.alquileres.entities.AvisoAlquiler;
import com.mvc.alquileres.services.AvisoAlquilerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Administrator
 */
 @Controller
public class AvisoAlquilerController {
    @Autowired
    private AvisoAlquilerService avisoAlquilerService;
    
    @GetMapping("/avisos")
    public String index(ModelMap model){
        
        List<AvisoAlquiler> avisos = avisoAlquilerService.getAll();

        model.addAttribute("avisos" ,avisos);
        return "avisos/index";
    }
}
