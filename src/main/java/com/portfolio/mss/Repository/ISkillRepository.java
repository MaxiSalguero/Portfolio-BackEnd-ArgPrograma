
package com.portfolio.mss.Repository;

import com.portfolio.mss.Entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISkillRepository extends JpaRepository<Skill,Long>{
    
}
