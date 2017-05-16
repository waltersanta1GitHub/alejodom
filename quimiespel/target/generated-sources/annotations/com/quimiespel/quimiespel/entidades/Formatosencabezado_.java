package com.quimiespel.quimiespel.entidades;

import com.quimiespel.quimiespel.entidades.Ciiu;
import com.quimiespel.quimiespel.entidades.Empleados;
import com.quimiespel.quimiespel.entidades.Estado;
import com.quimiespel.quimiespel.entidades.Formatosdetalle;
import com.quimiespel.quimiespel.entidades.FormatosencabezadoPK;
import com.quimiespel.quimiespel.entidades.Tipoformato;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-16T12:39:49")
@StaticMetamodel(Formatosencabezado.class)
public class Formatosencabezado_ { 

    public static volatile SingularAttribute<Formatosencabezado, Estado> estado;
    public static volatile SingularAttribute<Formatosencabezado, String> numVisita;
    public static volatile SingularAttribute<Formatosencabezado, String> especificacionSeguridad;
    public static volatile SingularAttribute<Formatosencabezado, String> razonSocial;
    public static volatile SingularAttribute<Formatosencabezado, Long> idFormatoPadre;
    public static volatile SingularAttribute<Formatosencabezado, String> nit;
    public static volatile SingularAttribute<Formatosencabezado, FormatosencabezadoPK> formatosencabezadoPK;
    public static volatile SingularAttribute<Formatosencabezado, String> telefono;
    public static volatile SingularAttribute<Formatosencabezado, String> latitud;
    public static volatile SingularAttribute<Formatosencabezado, String> cadenaTempA;
    public static volatile SingularAttribute<Formatosencabezado, BigInteger> updatedBy;
    public static volatile SingularAttribute<Formatosencabezado, Boolean> booleanoTempC;
    public static volatile SingularAttribute<Formatosencabezado, String> cadenaTempC;
    public static volatile SingularAttribute<Formatosencabezado, Boolean> booleanoTempD;
    public static volatile SingularAttribute<Formatosencabezado, String> cadenaTempB;
    public static volatile SingularAttribute<Formatosencabezado, String> cadenaTempE;
    public static volatile SingularAttribute<Formatosencabezado, String> cadenaTempD;
    public static volatile SingularAttribute<Formatosencabezado, String> direccion;
    public static volatile SingularAttribute<Formatosencabezado, Boolean> booleanoTempA;
    public static volatile SingularAttribute<Formatosencabezado, Empleados> empleados;
    public static volatile SingularAttribute<Formatosencabezado, Boolean> booleanoTempB;
    public static volatile SingularAttribute<Formatosencabezado, String> nombreContacto;
    public static volatile SingularAttribute<Formatosencabezado, Ciiu> ciiu;
    public static volatile SingularAttribute<Formatosencabezado, Date> updateDate;
    public static volatile SingularAttribute<Formatosencabezado, Date> fechaTempA;
    public static volatile SingularAttribute<Formatosencabezado, Date> fechaTempB;
    public static volatile SingularAttribute<Formatosencabezado, Date> fechaTempC;
    public static volatile SingularAttribute<Formatosencabezado, Date> fechaTempD;
    public static volatile SingularAttribute<Formatosencabezado, Date> horaVisita;
    public static volatile SingularAttribute<Formatosencabezado, Boolean> enabled;
    public static volatile SingularAttribute<Formatosencabezado, Date> horaTempD;
    public static volatile SingularAttribute<Formatosencabezado, Date> horaTempC;
    public static volatile SingularAttribute<Formatosencabezado, Date> horaTempB;
    public static volatile SingularAttribute<Formatosencabezado, Tipoformato> tipoformato;
    public static volatile SingularAttribute<Formatosencabezado, Date> fechaVisita;
    public static volatile SingularAttribute<Formatosencabezado, String> cadenaTempG;
    public static volatile SingularAttribute<Formatosencabezado, String> logitud;
    public static volatile SingularAttribute<Formatosencabezado, String> cadenaTempF;
    public static volatile SingularAttribute<Formatosencabezado, String> cadenaTempH;
    public static volatile SingularAttribute<Formatosencabezado, Date> horaTempA;
    public static volatile ListAttribute<Formatosencabezado, Formatosdetalle> formatosdetalleList;
    public static volatile SingularAttribute<Formatosencabezado, String> email;
    public static volatile SingularAttribute<Formatosencabezado, String> especificacionAdicional;
    public static volatile SingularAttribute<Formatosencabezado, Date> createdDate;
    public static volatile SingularAttribute<Formatosencabezado, Long> createdBy;
    public static volatile SingularAttribute<Formatosencabezado, BigInteger> enteroTempB;
    public static volatile SingularAttribute<Formatosencabezado, BigInteger> enteroTempA;
    public static volatile SingularAttribute<Formatosencabezado, BigInteger> enteroTempD;
    public static volatile SingularAttribute<Formatosencabezado, BigInteger> enteroTempC;
    public static volatile SingularAttribute<Formatosencabezado, String> telefonoContacto;

}