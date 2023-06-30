package com.portfolio.mss.Repository;

import com.portfolio.mss.Entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyectoRepository extends JpaRepository<Proyecto,Long> {
    
}
