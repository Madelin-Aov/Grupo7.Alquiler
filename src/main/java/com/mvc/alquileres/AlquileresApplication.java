package com.mvc.alquileres;

import com.mvc.alquileres.entities.Propietario;
import com.mvc.alquileres.repositories.IPropietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.mvc.alquileres.entities"} )
@EnableJpaRepositories(basePackages = {"com.mvc.alquileres"})
@ComponentScan(basePackages = {"com.mvc.alquileres"})
public class AlquileresApplication {

    public static void main(String[] args){
        SpringApplication.run(AlquileresApplication.class, args);
    }
 
}
