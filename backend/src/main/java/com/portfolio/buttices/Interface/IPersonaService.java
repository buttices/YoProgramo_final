package com.portfolio.buttices.Interface;

import com.portfolio.buttices.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //traer una persona //
    
    public List<Persona> getPersona();

    //Guardar un objeto del tipo Persona //
    
    public void savePersona(Persona persona);
    
    //Eliminar un usuario pero lo buscamos por IF//
    
    public void deletePersona(Long id);
    
    // Buscar persona por ID//
    
    public Persona findPersona(Long id);
    
}
