
package com.example.Persona.Repositorio;


import com.example.Persona.Modelo.PersonaModelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepositorio extends JpaRepository<PersonaModelo, Long>{
    
}
