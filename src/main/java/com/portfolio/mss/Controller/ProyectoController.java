package com.portfolio.mss.Controller;

import com.portfolio.mss.Entity.Proyecto;
import com.portfolio.mss.Interface.IProyectoService;
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
public class ProyectoController {
    @Autowired IProyectoService iproyectoService;
    
    @GetMapping("/proyecto/traer")
    public List<Proyecto> getProyecto() {
        return iproyectoService.getProyecto();
    }
    
    @GetMapping("/proyecto/traer/primero")
    public Proyecto findProyecto() {
        return iproyectoService.findProyecto((long)1);
    }
    
    @PostMapping("/proyecto/crear")
    public String createProyecto(@RequestBody Proyecto proyect){
        iproyectoService.saveProyecto(proyect);
        return "El proyecto fue creado correctamente";
    }
    

    @DeleteMapping("/proyecto/borrar/{id}")
    public String deleteProyecto(@PathVariable Long id) {
        iproyectoService.deleteProyecto(id);
        return "El proyecto fue eliminado correctamente";
    }
    
    @PutMapping("/proyecto/editar")
    public void udpProyecto(@RequestBody Proyecto proyect) {
	iproyectoService.updProyecto(proyect);
	}
}
