package com.portfolio.mss.Controller;

import com.portfolio.mss.Entity.Skill;
import com.portfolio.mss.Interface.ISkillService;
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
public class SkillController {
    @Autowired ISkillService iskillService;
    
    @GetMapping("/skill/traer")
    public List<Skill> getSkill() {
        return iskillService.getSkill();
    }
    
    @PostMapping("/skill/crear")
    public String createSkill(@RequestBody Skill skill){
        iskillService.saveSkill(skill);
        return "La skill fue creada correctamente";
    }
    

    @DeleteMapping("skill/borrar/{id}")
    public String deleteSkill(@PathVariable Long id) {
        iskillService.deleteSkill(id);
        return "La skill fue eliminada correctamente";
    }
    
    @PutMapping("skill/editar")
    public void udpSkill(@RequestBody Skill skill) {
	iskillService.updSkill(skill);
	}
    
}
