/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mvc.alquileres.services;

import com.mvc.alquileres.entities.Propietario;
import org.springframework.stereotype.Service;
import com.mvc.alquileres.repositories.IPropietarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Administrator
 */
@Service
public class PropietarioService {
    
    @Autowired
    private IPropietarioRepository propietarioRepository;
    
    public List<Propietario> getAll(){
        return propietarioRepository.findAll();
    }
    
    public Propietario save(String nombre)throws Exception{
        Propietario propietario = new Propietario();
        propietario.setNombre(nombre);
        return propietarioRepository.save(propietario);
    }
}
