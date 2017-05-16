package com.quimiespel.quimiespel.entidades;

import com.quimiespel.quimiespel.entidades.Areas;
import com.quimiespel.quimiespel.entidades.Cargos;
import com.quimiespel.quimiespel.entidades.Ciudades;
import com.quimiespel.quimiespel.entidades.EmpleadosPK;
import com.quimiespel.quimiespel.entidades.Formatosencabezado;
import com.quimiespel.quimiespel.entidades.Tipodocumento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-16T12:39:49")
@StaticMetamodel(Empleados.class)
public class Empleados_ { 

    public static volatile SingularAttribute<Empleados, EmpleadosPK> empleadosPK;
    public static volatile ListAttribute<Empleados, Formatosencabezado> formatosencabezadoList;
    public static volatile SingularAttribute<Empleados, String> documento;
    public static volatile SingularAttribute<Empleados, Areas> areas;
    public static volatile SingularAttribute<Empleados, Cargos> cargos;
    public static volatile SingularAttribute<Empleados, String> nombre;
    public static volatile SingularAttribute<Empleados, String> telefonoFijo;
    public static volatile SingularAttribute<Empleados, Date> fechanacimiento;
    public static volatile SingularAttribute<Empleados, String> apellido;
    public static volatile SingularAttribute<Empleados, String> telefonoMovil;
    public static volatile SingularAttribute<Empleados, String> email;
    public static volatile SingularAttribute<Empleados, Ciudades> ciudades;
    public static volatile SingularAttribute<Empleados, Tipodocumento> tipodocumento;

}