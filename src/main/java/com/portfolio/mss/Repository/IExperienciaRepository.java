package com.portfolio.mss.Repository;

import com.portfolio.mss.Entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienciaRepository extends JpaRepository<Experiencia,Long>{
    
}
