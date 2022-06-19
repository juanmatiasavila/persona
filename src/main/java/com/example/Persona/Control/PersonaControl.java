package com.example.Persona.Control;

import com.example.Persona.Modelo.PersonaModelo;
import com.example.Persona.Servicio.PersonaServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
public class PersonaControl {

    @Autowired
    PersonaServicio personaSerivicio;

    @GetMapping()
    public List<PersonaModelo> listarPersona() {
        return personaSerivicio.listarPersona();
    }

    @PostMapping("/A")
    public ResponseEntity<String> agregarPersona(@RequestBody PersonaModelo personaModelo) {
        if (personaSerivicio.buscarPersona(personaModelo.getDni()).isPresent()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Dni existente");
        } else {
            personaSerivicio.agregarPersona(personaModelo);
            return ResponseEntity.status(HttpStatus.CREATED).body("Persona agregada");
        }
    }

    @DeleteMapping("/B/{dni}")
    public ResponseEntity<String> eliminarPersona(@PathVariable Long dni) {
        if (personaSerivicio.buscarPersona(dni).isPresent()) {
            personaSerivicio.eliminarPersona(dni);
            return ResponseEntity.status(HttpStatus.OK).body("Persona Eliminada");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Dni no encontrado");
        }
    }

    @PutMapping("/M")
    public ResponseEntity<String> modificarPersona(@RequestBody PersonaModelo personaModelo) {
        if (personaSerivicio.buscarPersona(personaModelo.getDni()).isPresent()) {
            personaSerivicio.modificarPersona(personaModelo);
            return ResponseEntity.status(HttpStatus.OK).body("Persona Modificada");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Dni no encontrado");
        }
    }

}
