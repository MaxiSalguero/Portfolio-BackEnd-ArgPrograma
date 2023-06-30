package com.portfolio.mss.Service;

import com.portfolio.mss.Entity.Proyecto;
import com.portfolio.mss.Interface.IProyectoService;
import com.portfolio.mss.Repository.IProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpProyectoService implements IProyectoService{
    @Autowired IProyectoRepository iproyectoRepository;
    
    @Override
    public List<Proyecto> getProyecto() {
        List<Proyecto> proyect = iproyectoRepository.findAll();
        return proyect;
    }

    @Override
    public void saveProyecto(Proyecto proyect) {
        iproyectoRepository.save(proyect);
    }

    @Override
    public void deleteProyecto(Long id) {
        iproyectoRepository.deleteById(id);
    }

    @Override
    public Proyecto findProyecto(Long id) {
        Proyecto proyect = iproyectoRepository.findById(id).orElse(null);
        return proyect;
    }
    
    @Override
    public Proyecto updProyecto(Proyecto proyect) {
	return iproyectoRepository.save(proyect);
    }
}
