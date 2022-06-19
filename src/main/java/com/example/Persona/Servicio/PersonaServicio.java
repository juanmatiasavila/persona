package com.example.Persona.Servicio;

import com.example.Persona.Modelo.PersonaModelo;
import com.example.Persona.Repositorio.PersonaRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServicio {

    @Autowired
    PersonaRepositorio personaRepositorio;

    public Optional<PersonaModelo> buscarPersona(Long dni) {
        return personaRepositorio.findById(dni);
    }

    public List<PersonaModelo> listarPersona() {
        return personaRepositorio.findAll();
    }

    public PersonaModelo agregarPersona(PersonaModelo persona) {
        return personaRepositorio.save(persona);
    }

    public void eliminarPersona(Long dni) {
        personaRepositorio.deleteById(dni);
    }

    public PersonaModelo modificarPersona(PersonaModelo persona) {
        return personaRepositorio.save(persona);
    }
}
