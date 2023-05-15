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
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Administrator
 */
@Controller
public class PropietarioController {

    @Autowired
    private PropietarioService propietarioService;
            
    @GetMapping("/")
    public String index(ModelMap model){
        
        List<Propietario> propetarios = propietarioService.getAll();

        model.addAttribute("propietariosList" ,propetarios);
        return "home";
    }
    @GetMapping("/crear")
    public String crear(){
    
        Propietario prop = new Propietario();
        prop.setNombre("Evelin");
        prop.setApellido("Huallpa");
        prop.setId(4);
        
        propietarioService.crear(prop);
       return "crear";
        
    }
    @GetMapping("/eliminar")
    public String eliminar(){
    
      
        propietarioService.eliminar(3);
        return "eliminar";
    }
    @GetMapping("/editar")
    public String editar (){
        
        
    Propietario prop = propietarioService.getById(2); 
    prop.setNombre("Bruno");
    
    prop.setApellido("Diaz");
    
   propietarioService.editar(prop);
    
    
    return "editar";
    
    }
    @RequestMapping("/propietario")
    public String busqueda(@RequestParam("nombre") String nombre, ModelMap model){
        List<Propietario> propietarios = propietarioService.getByname(nombre);
        model.addAttribute("propietarios", propietarios );
        return "busqueda";
    }
}
