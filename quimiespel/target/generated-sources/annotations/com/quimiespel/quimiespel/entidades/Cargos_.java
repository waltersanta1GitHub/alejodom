package com.quimiespel.quimiespel.entidades;

import com.quimiespel.quimiespel.entidades.Empleados;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-16T12:39:49")
@StaticMetamodel(Cargos.class)
public class Cargos_ { 

    public static volatile SingularAttribute<Cargos, String> descripcion;
    public static volatile SingularAttribute<Cargos, Long> idCargo;
    public static volatile ListAttribute<Cargos, Empleados> empleadosList;

}