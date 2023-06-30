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
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    private String experiencia;
    private String fecha_inicio;
    private String fecha_fin;
    private String localidad;
    private String compania;
    private String url_imagen;

    public Experiencia() {
    }

    public Experiencia(Long id, String experiencia, String fecha_inicio, String fecha_fin, String localidad, String compania, String url_imagen) {
        this.id = id;
        this.experiencia = experiencia;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.localidad = localidad;
        this.compania = compania;
        this.url_imagen = url_imagen;
    }


    
    
}
