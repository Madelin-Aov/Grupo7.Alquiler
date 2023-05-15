/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mvc.alquileres.services;

import com.mvc.alquileres.entities.AvisoAlquiler;
import com.mvc.alquileres.repositories.IAvisoAlquilerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrator
 */
@Service
public class AvisoAlquilerService {

    @Autowired
    private IAvisoAlquilerRepository avisoAlquilerRepository;

    public List<AvisoAlquiler> getAll() {
        return avisoAlquilerRepository.findAll();
    }
}
