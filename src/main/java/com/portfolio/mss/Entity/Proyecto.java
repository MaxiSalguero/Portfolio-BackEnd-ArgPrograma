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
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    private String titulo;
    private String descripcion;
    private String img;

    public Proyecto() {
    }

    public Proyecto(Long id, String titulo, String descripcion, String img) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.img = img;
    }
    
}
