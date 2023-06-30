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
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    private String institucion;
    private String fecha_inicio;
    private String fecha_fin;
    private String titulo;
    private String url_imagen;

    public Educacion() {
    }

    public Educacion(Long id, String institucion, String fecha_inicio, String fecha_fin, String titulo, String url_imagen) {
        this.id = id;
        this.institucion = institucion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.titulo = titulo;
        this.url_imagen = url_imagen;
    }


    
    
}
