package com.portfolio.mss.Service;

import com.portfolio.mss.Entity.Skill;
import com.portfolio.mss.Interface.ISkillService;
import com.portfolio.mss.Repository.ISkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpSkillService implements ISkillService{
    @Autowired ISkillRepository iskillRepository;
    
    @Override
    public List<Skill> getSkill() {
        List<Skill> skill = iskillRepository.findAll();
        return skill;
    }

    @Override
    public void saveSkill(Skill skill) {
        iskillRepository.save(skill);
    }

    @Override
    public void deleteSkill(Long id) {
        iskillRepository.deleteById(id);
    }

    @Override
    public Skill findSkill(Long id) {
        Skill skill = iskillRepository.findById(id).orElse(null);
        return skill;
    }
    
    @Override
    public Skill updSkill(Skill skill) {
	return iskillRepository.save(skill);
    }
}
