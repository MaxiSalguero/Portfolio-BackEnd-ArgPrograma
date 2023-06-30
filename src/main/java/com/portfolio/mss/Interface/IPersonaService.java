package com.portfolio.mss.Interface;

import com.portfolio.mss.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer Personas
    public List<Persona> getPersona();
    
    //Guardar Persona
    public void savePersona(Persona persona);
    
    //Eliminar Persona
    public void deletePersona(Long id);
    
    //Buscar Persona por id
    public Persona findPersona(Long id);
    
    //Editar Persona
    public Persona updPersona(Persona persona);
    
}
