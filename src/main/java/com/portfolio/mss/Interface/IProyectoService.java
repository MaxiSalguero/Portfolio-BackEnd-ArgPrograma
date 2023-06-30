package com.portfolio.mss.Interface;

import com.portfolio.mss.Entity.Proyecto;
import java.util.List;

public interface IProyectoService {
    //Traer Proyecto
    public List<Proyecto> getProyecto();

    //Guardar Proyecto
    public void saveProyecto(Proyecto proyect);

    //Eliminar Proyecto
    public void deleteProyecto(Long id);

    //Buscar Proyecto por id
    public Proyecto findProyecto(Long id);

    //Editar Proyecto
    public Proyecto updProyecto(Proyecto proyect);
}
