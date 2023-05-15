/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mvc.alquileres.repositories;

import com.mvc.alquileres.entities.Propietario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Administrator
 */
@Repository
public interface IPropietarioRepository extends JpaRepository<Propietario,Integer>{
    List<Propietario> findAllByNombre(String nombre);
}
