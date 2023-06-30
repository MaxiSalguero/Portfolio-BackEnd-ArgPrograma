
package com.portfolio.mss.Entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    private int porcentaje;
    private String img;

    public Skill() {
    }

    public Skill(Long id, int porcentaje, String img) {
        this.id = id;
        this.porcentaje = porcentaje;
        this.img = img;
    }
    
}
