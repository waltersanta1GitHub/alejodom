package com.quimiespel.quimiespel.entidades;

import com.quimiespel.quimiespel.entidades.Formatosdetalle;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-16T12:39:49")
@StaticMetamodel(Embalajes.class)
public class Embalajes_ { 

    public static volatile SingularAttribute<Embalajes, String> descripcion;
    public static volatile SingularAttribute<Embalajes, Long> idEmbalaje;
    public static volatile ListAttribute<Embalajes, Formatosdetalle> formatosdetalleList;

}