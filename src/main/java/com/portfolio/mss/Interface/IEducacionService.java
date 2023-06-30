package com.portfolio.mss.Interface;

import com.portfolio.mss.Entity.Educacion;
import java.util.List;

public interface IEducacionService {
    //Traer Educacion
    public List<Educacion> getEducacion();
    
    //Guardar Educacion
    public void saveEducacion(Educacion edu);
    
    //Eliminar Educacion
    public void deleteEducacion(Long id);
    
    //Buscar Educacion por id
    public Educacion findEducacion(Long id);
    
    //Editar Educacion
    public Educacion updEducacion(Educacion edu);
}
