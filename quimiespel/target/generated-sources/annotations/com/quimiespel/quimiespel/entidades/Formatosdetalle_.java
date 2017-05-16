package com.quimiespel.quimiespel.entidades;

import com.quimiespel.quimiespel.entidades.Embalajes;
import com.quimiespel.quimiespel.entidades.Estadomaterial;
import com.quimiespel.quimiespel.entidades.FormatosdetallePK;
import com.quimiespel.quimiespel.entidades.Formatosencabezado;
import com.quimiespel.quimiespel.entidades.Unidades;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-16T12:39:49")
@StaticMetamodel(Formatosdetalle.class)
public class Formatosdetalle_ { 

    public static volatile SingularAttribute<Formatosdetalle, Date> fechaTempA;
    public static volatile SingularAttribute<Formatosdetalle, Date> fechaTempB;
    public static volatile SingularAttribute<Formatosdetalle, Date> fechaTempC;
    public static volatile SingularAttribute<Formatosdetalle, Date> fechaTempD;
    public static volatile SingularAttribute<Formatosdetalle, Date> horaTempD;
    public static volatile SingularAttribute<Formatosdetalle, Date> horaTempC;
    public static volatile SingularAttribute<Formatosdetalle, Date> horaTempB;
    public static volatile SingularAttribute<Formatosdetalle, Embalajes> embalajes;
    public static volatile SingularAttribute<Formatosdetalle, String> cadenaTempG;
    public static volatile SingularAttribute<Formatosdetalle, String> cadenaTempF;
    public static volatile SingularAttribute<Formatosdetalle, FormatosdetallePK> formatosdetallePK;
    public static volatile SingularAttribute<Formatosdetalle, String> cadenaTempH;
    public static volatile SingularAttribute<Formatosdetalle, Date> horaTempA;
    public static volatile SingularAttribute<Formatosdetalle, Formatosencabezado> formatosencabezado;
    public static volatile SingularAttribute<Formatosdetalle, Integer> idLinea;
    public static volatile SingularAttribute<Formatosdetalle, String> cadenaTempA;
    public static volatile SingularAttribute<Formatosdetalle, Boolean> booleanoTempC;
    public static volatile SingularAttribute<Formatosdetalle, String> cadenaTempC;
    public static volatile SingularAttribute<Formatosdetalle, Boolean> booleanoTempD;
    public static volatile SingularAttribute<Formatosdetalle, String> cadenaTempB;
    public static volatile SingularAttribute<Formatosdetalle, String> cadenaTempE;
    public static volatile SingularAttribute<Formatosdetalle, String> cadenaTempD;
    public static volatile SingularAttribute<Formatosdetalle, Boolean> booleanoTempA;
    public static volatile SingularAttribute<Formatosdetalle, Boolean> booleanoTempB;
    public static volatile SingularAttribute<Formatosdetalle, String> nombreResiduo;
    public static volatile SingularAttribute<Formatosdetalle, BigInteger> enteroTempB;
    public static volatile SingularAttribute<Formatosdetalle, BigInteger> enteroTempA;
    public static volatile SingularAttribute<Formatosdetalle, Unidades> unidades;
    public static volatile SingularAttribute<Formatosdetalle, BigInteger> enteroTempD;
    public static volatile SingularAttribute<Formatosdetalle, BigInteger> enteroTempC;
    public static volatile SingularAttribute<Formatosdetalle, Integer> cantidad;
    public static volatile SingularAttribute<Formatosdetalle, Estadomaterial> estadomaterial;

}