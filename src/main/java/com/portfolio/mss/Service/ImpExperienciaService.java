package com.portfolio.mss.Service;

import com.portfolio.mss.Entity.Experiencia;
import com.portfolio.mss.Interface.IExperienciaService;
import com.portfolio.mss.Repository.IExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpExperienciaService implements IExperienciaService {
    @Autowired IExperienciaRepository iexperienciaRepository;

    @Override
    public List<Experiencia> getExperiencia() {
        List<Experiencia> experiencia = iexperienciaRepository.findAll();
        return experiencia;
    }

    @Override
    public void saveExperiencia(Experiencia exp) {
        iexperienciaRepository.save(exp);
    }

    @Override
    public void deleteExperiencia(Long id) {
        iexperienciaRepository.deleteById(id);
    }

    @Override
    public Experiencia findExperiencia(Long id) {
        Experiencia experiencia = iexperienciaRepository.findById(id).orElse(null);
        return experiencia;
    }
    
    @Override
    public Experiencia updExperiencia(Experiencia exp) {
	return iexperienciaRepository.save(exp);
    }
    
}
