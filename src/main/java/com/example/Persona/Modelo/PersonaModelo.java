
package com.example.Persona.Modelo;

import com.sun.istack.NotNull;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PersonaModelo {
    @Id
    private Long dni;
    @NotNull
    private String nombre;
    @NotNull
    private String apellido;
    @NotNull
    private Boolean empleado;

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Boolean getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Boolean empleado) {
        this.empleado = empleado;
    }
    
}
