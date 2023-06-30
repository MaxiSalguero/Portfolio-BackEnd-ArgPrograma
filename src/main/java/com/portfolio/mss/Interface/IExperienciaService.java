package com.portfolio.mss.Interface;

import com.portfolio.mss.Entity.Experiencia;
import java.util.List;

public interface IExperienciaService {
    //Traer Experiencia
    public List<Experiencia> getExperiencia();
    
    //Guardar Experiencia
    public void saveExperiencia(Experiencia exp);
    
    //Eliminar Experiencia
    public void deleteExperiencia(Long id);
    
    //Buscar Experiencia por id
    public Experiencia findExperiencia(Long id);
    
    //Editar Experiencia
    public Experiencia updExperiencia(Experiencia exp);
}
