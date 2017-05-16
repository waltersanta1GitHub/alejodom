package com.quimiespel.quimiespel.entidades;

import com.quimiespel.quimiespel.entidades.Empleados;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-16T12:39:49")
@StaticMetamodel(Tipodocumento.class)
public class Tipodocumento_ { 

    public static volatile SingularAttribute<Tipodocumento, String> tipoDocumento;
    public static volatile SingularAttribute<Tipodocumento, String> codigo;
    public static volatile ListAttribute<Tipodocumento, Empleados> empleadosList;
    public static volatile SingularAttribute<Tipodocumento, Long> id;

}