package com.portfolio.mss.Controller;

import com.portfolio.mss.Entity.Educacion;
import com.portfolio.mss.Interface.IEducacionService;
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
@CrossOrigin(origins="http://localhost:4200")
public class EducacionController {
    @Autowired IEducacionService ieducacionService;
    
    @GetMapping("educacion/traer")
    public List<Educacion> getEducacion() {
        return ieducacionService.getEducacion();
    }
    
    @PostMapping("educacion/crear")
    public String createEducacion(@RequestBody Educacion edu){
        ieducacionService.saveEducacion(edu);
        return "La educacion fue creada correctamente";
    }
    

    @DeleteMapping("educacion/borrar/{id}")
    public String deleteEducacion(@PathVariable Long id) {
        ieducacionService.deleteEducacion(id);
        return "La educacion fue eliminada correctamente";
    }
    
    @PutMapping("educacion/editar")
    public void udpEducacion(@RequestBody Educacion edu) {
	ieducacionService.updEducacion(edu);
	}

}
