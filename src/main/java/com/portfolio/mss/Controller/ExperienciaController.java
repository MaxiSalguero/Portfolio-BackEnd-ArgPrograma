package com.portfolio.mss.Controller;

import com.portfolio.mss.Entity.Experiencia;
import com.portfolio.mss.Interface.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="https://frontendmss.web.app")
public class ExperienciaController {
    @Autowired IExperienciaService iexperienciaService;
    
    @GetMapping("/experiencia/traer")
    public List<Experiencia> getExperiencia() {
        return iexperienciaService.getExperiencia();
    }
    
    @PostMapping("/experiencia/crear")
    public String createExperiencia(@RequestBody Experiencia exp){
        iexperienciaService.saveExperiencia(exp);
        return "La experiencia fue creada correctamente";
    }
    

    @DeleteMapping("/experiencia/borrar/{id}")
    public String deleteExperiencia(@PathVariable Long id) {
        iexperienciaService.deleteExperiencia(id);
        return "La experiencia fue eliminada correctamente";
    }
    
    @PutMapping("/experiencia/editar")
    public void udpExperiencia(@RequestBody Experiencia exp) {
	iexperienciaService.updExperiencia(exp);
	}

}
