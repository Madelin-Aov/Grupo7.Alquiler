/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mvc.alquileres.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Administrator
 */
@Entity
@Getter @Setter
@Table(name = "aviso_alquiler")
public class AvisoAlquiler {
      
    @Id
    private int id;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "descripcion")
    private String descripcion;
       
    @Column(name = "status")
    private String status;
       
    @Column(name = "imagen")
    private String imagen;
}
