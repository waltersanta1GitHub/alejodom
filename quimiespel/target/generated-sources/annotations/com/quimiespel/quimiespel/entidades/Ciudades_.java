package com.quimiespel.quimiespel.entidades;

import com.quimiespel.quimiespel.entidades.CiudadesPK;
import com.quimiespel.quimiespel.entidades.Departamento;
import com.quimiespel.quimiespel.entidades.Empleados;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-16T12:39:49")
@StaticMetamodel(Ciudades.class)
public class Ciudades_ { 

    public static volatile ListAttribute<Ciudades, Empleados> empleadosList;
    public static volatile SingularAttribute<Ciudades, CiudadesPK> ciudadesPK;
    public static volatile SingularAttribute<Ciudades, Departamento> departamento;
    public static volatile SingularAttribute<Ciudades, String> nombre;

}