package com.portfolio.mss.Interface;

import com.portfolio.mss.Entity.Skill;
import java.util.List;

public interface ISkillService {

    //Traer Skill
    public List<Skill> getSkill();

    //Guardar Skill
    public void saveSkill(Skill skill);

    //Eliminar Skill
    public void deleteSkill(Long id);

    //Buscar Skill por id
    public Skill findSkill(Long id);

    //Editar Skill
    public Skill updSkill(Skill skill);
}
