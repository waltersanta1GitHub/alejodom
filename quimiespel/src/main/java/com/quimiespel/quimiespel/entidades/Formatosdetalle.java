/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quimiespel.quimiespel.entidades;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jose.santamaria
 */
@Entity
@Table(name = "formatosdetalle", catalog = "quimirespel", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Formatosdetalle.findAll", query = "SELECT f FROM Formatosdetalle f")
    , @NamedQuery(name = "Formatosdetalle.findByIdFormatoDetalle", query = "SELECT f FROM Formatosdetalle f WHERE f.formatosdetallePK.idFormatoDetalle = :idFormatoDetalle")
    , @NamedQuery(name = "Formatosdetalle.findByNombreResiduo", query = "SELECT f FROM Formatosdetalle f WHERE f.nombreResiduo = :nombreResiduo")
    , @NamedQuery(name = "Formatosdetalle.findByIdLinea", query = "SELECT f FROM Formatosdetalle f WHERE f.idLinea = :idLinea")
    , @NamedQuery(name = "Formatosdetalle.findByCantidad", query = "SELECT f FROM Formatosdetalle f WHERE f.cantidad = :cantidad")
    , @NamedQuery(name = "Formatosdetalle.findByFechaTempA", query = "SELECT f FROM Formatosdetalle f WHERE f.fechaTempA = :fechaTempA")
    , @NamedQuery(name = "Formatosdetalle.findByFechaTempB", query = "SELECT f FROM Formatosdetalle f WHERE f.fechaTempB = :fechaTempB")
    , @NamedQuery(name = "Formatosdetalle.findByFechaTempC", query = "SELECT f FROM Formatosdetalle f WHERE f.fechaTempC = :fechaTempC")
    , @NamedQuery(name = "Formatosdetalle.findByFechaTempD", query = "SELECT f FROM Formatosdetalle f WHERE f.fechaTempD = :fechaTempD")
    , @NamedQuery(name = "Formatosdetalle.findByHoraTempA", query = "SELECT f FROM Formatosdetalle f WHERE f.horaTempA = :horaTempA")
    , @NamedQuery(name = "Formatosdetalle.findByHoraTempB", query = "SELECT f FROM Formatosdetalle f WHERE f.horaTempB = :horaTempB")
    , @NamedQuery(name = "Formatosdetalle.findByHoraTempC", query = "SELECT f FROM Formatosdetalle f WHERE f.horaTempC = :horaTempC")
    , @NamedQuery(name = "Formatosdetalle.findByHoraTempD", query = "SELECT f FROM Formatosdetalle f WHERE f.horaTempD = :horaTempD")
    , @NamedQuery(name = "Formatosdetalle.findByEnteroTempA", query = "SELECT f FROM Formatosdetalle f WHERE f.enteroTempA = :enteroTempA")
    , @NamedQuery(name = "Formatosdetalle.findByEnteroTempB", query = "SELECT f FROM Formatosdetalle f WHERE f.enteroTempB = :enteroTempB")
    , @NamedQuery(name = "Formatosdetalle.findByEnteroTempC", query = "SELECT f FROM Formatosdetalle f WHERE f.enteroTempC = :enteroTempC")
    , @NamedQuery(name = "Formatosdetalle.findByEnteroTempD", query = "SELECT f FROM Formatosdetalle f WHERE f.enteroTempD = :enteroTempD")
    , @NamedQuery(name = "Formatosdetalle.findByBooleanoTempA", query = "SELECT f FROM Formatosdetalle f WHERE f.booleanoTempA = :booleanoTempA")
    , @NamedQuery(name = "Formatosdetalle.findByBooleanoTempB", query = "SELECT f FROM Formatosdetalle f WHERE f.booleanoTempB = :booleanoTempB")
    , @NamedQuery(name = "Formatosdetalle.findByBooleanoTempC", query = "SELECT f FROM Formatosdetalle f WHERE f.booleanoTempC = :booleanoTempC")
    , @NamedQuery(name = "Formatosdetalle.findByBooleanoTempD", query = "SELECT f FROM Formatosdetalle f WHERE f.booleanoTempD = :booleanoTempD")
    , @NamedQuery(name = "Formatosdetalle.findByCadenaTempA", query = "SELECT f FROM Formatosdetalle f WHERE f.cadenaTempA = :cadenaTempA")
    , @NamedQuery(name = "Formatosdetalle.findByCadenaTempB", query = "SELECT f FROM Formatosdetalle f WHERE f.cadenaTempB = :cadenaTempB")
    , @NamedQuery(name = "Formatosdetalle.findByCadenaTempC", query = "SELECT f FROM Formatosdetalle f WHERE f.cadenaTempC = :cadenaTempC")
    , @NamedQuery(name = "Formatosdetalle.findByCadenaTempD", query = "SELECT f FROM Formatosdetalle f WHERE f.cadenaTempD = :cadenaTempD")
    , @NamedQuery(name = "Formatosdetalle.findByCadenaTempE", query = "SELECT f FROM Formatosdetalle f WHERE f.cadenaTempE = :cadenaTempE")
    , @NamedQuery(name = "Formatosdetalle.findByCadenaTempF", query = "SELECT f FROM Formatosdetalle f WHERE f.cadenaTempF = :cadenaTempF")
    , @NamedQuery(name = "Formatosdetalle.findByCadenaTempG", query = "SELECT f FROM Formatosdetalle f WHERE f.cadenaTempG = :cadenaTempG")
    , @NamedQuery(name = "Formatosdetalle.findByCadenaTempH", query = "SELECT f FROM Formatosdetalle f WHERE f.cadenaTempH = :cadenaTempH")
    , @NamedQuery(name = "Formatosdetalle.findByEstadoMaterialid", query = "SELECT f FROM Formatosdetalle f WHERE f.formatosdetallePK.estadoMaterialid = :estadoMaterialid")
    , @NamedQuery(name = "Formatosdetalle.findByEmbalajesid", query = "SELECT f FROM Formatosdetalle f WHERE f.formatosdetallePK.embalajesid = :embalajesid")
    , @NamedQuery(name = "Formatosdetalle.findByUnidadesid", query = "SELECT f FROM Formatosdetalle f WHERE f.formatosdetallePK.unidadesid = :unidadesid")
    , @NamedQuery(name = "Formatosdetalle.findByFormatosEncabezadoid", query = "SELECT f FROM Formatosdetalle f WHERE f.formatosdetallePK.formatosEncabezadoid = :formatosEncabezadoid")
    , @NamedQuery(name = "Formatosdetalle.findByFormatosEncabezadoTipoFormatoid", query = "SELECT f FROM Formatosdetalle f WHERE f.formatosdetallePK.formatosEncabezadoTipoFormatoid = :formatosEncabezadoTipoFormatoid")
    , @NamedQuery(name = "Formatosdetalle.findByFormatosEncabezadoCIIUid", query = "SELECT f FROM Formatosdetalle f WHERE f.formatosdetallePK.formatosEncabezadoCIIUid = :formatosEncabezadoCIIUid")
    , @NamedQuery(name = "Formatosdetalle.findByFormatosEncabezadoEmpleadosid", query = "SELECT f FROM Formatosdetalle f WHERE f.formatosdetallePK.formatosEncabezadoEmpleadosid = :formatosEncabezadoEmpleadosid")
    , @NamedQuery(name = "Formatosdetalle.findByFormatosEncabezadoEmpCargosid", query = "SELECT f FROM Formatosdetalle f WHERE f.formatosdetallePK.formatosEncabezadoEmpCargosid = :formatosEncabezadoEmpCargosid")
    , @NamedQuery(name = "Formatosdetalle.findByFormatosEncabezadoEmpTipoDocumentoid", query = "SELECT f FROM Formatosdetalle f WHERE f.formatosdetallePK.formatosEncabezadoEmpTipoDocumentoid = :formatosEncabezadoEmpTipoDocumentoid")
    , @NamedQuery(name = "Formatosdetalle.findByFormatosEncabezadoEmpAreasid", query = "SELECT f FROM Formatosdetalle f WHERE f.formatosdetallePK.formatosEncabezadoEmpAreasid = :formatosEncabezadoEmpAreasid")
    , @NamedQuery(name = "Formatosdetalle.findByFormatosEncabezadoEmpCiudidCiudad", query = "SELECT f FROM Formatosdetalle f WHERE f.formatosdetallePK.formatosEncabezadoEmpCiudidCiudad = :formatosEncabezadoEmpCiudidCiudad")
    , @NamedQuery(name = "Formatosdetalle.findByFormatosEncabezadoEmpCiudDepidDepartamento", query = "SELECT f FROM Formatosdetalle f WHERE f.formatosdetallePK.formatosEncabezadoEmpCiudDepidDepartamento = :formatosEncabezadoEmpCiudDepidDepartamento")
    , @NamedQuery(name = "Formatosdetalle.findByFormatosEncabezadoEstadoid", query = "SELECT f FROM Formatosdetalle f WHERE f.formatosdetallePK.formatosEncabezadoEstadoid = :formatosEncabezadoEstadoid")})
public class Formatosdetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FormatosdetallePK formatosdetallePK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "NombreResiduo")
    private String nombreResiduo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idLinea")
    private int idLinea;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Cantidad")
    private int cantidad;
    @Column(name = "FechaTempA")
    @Temporal(TemporalType.DATE)
    private Date fechaTempA;
    @Column(name = "FechaTempB")
    @Temporal(TemporalType.DATE)
    private Date fechaTempB;
    @Column(name = "FechaTempC")
    @Temporal(TemporalType.DATE)
    private Date fechaTempC;
    @Column(name = "FechaTempD")
    @Temporal(TemporalType.DATE)
    private Date fechaTempD;
    @Column(name = "HoraTempA")
    @Temporal(TemporalType.TIME)
    private Date horaTempA;
    @Column(name = "HoraTempB")
    @Temporal(TemporalType.TIME)
    private Date horaTempB;
    @Column(name = "HoraTempC")
    @Temporal(TemporalType.TIME)
    private Date horaTempC;
    @Column(name = "HoraTempD")
    @Temporal(TemporalType.TIME)
    private Date horaTempD;
    @Column(name = "EnteroTempA")
    private BigInteger enteroTempA;
    @Column(name = "EnteroTempB")
    private BigInteger enteroTempB;
    @Column(name = "EnteroTempC")
    private BigInteger enteroTempC;
    @Column(name = "EnteroTempD")
    private BigInteger enteroTempD;
    @Column(name = "BooleanoTempA")
    private Boolean booleanoTempA;
    @Column(name = "BooleanoTempB")
    private Boolean booleanoTempB;
    @Column(name = "BooleanoTempC")
    private Boolean booleanoTempC;
    @Column(name = "BooleanoTempD")
    private Boolean booleanoTempD;
    @Size(max = 260)
    @Column(name = "CadenaTempA")
    private String cadenaTempA;
    @Size(max = 260)
    @Column(name = "CadenaTempB")
    private String cadenaTempB;
    @Size(max = 260)
    @Column(name = "CadenaTempC")
    private String cadenaTempC;
    @Size(max = 260)
    @Column(name = "CadenaTempD")
    private String cadenaTempD;
    @Size(max = 260)
    @Column(name = "CadenaTempE")
    private String cadenaTempE;
    @Size(max = 260)
    @Column(name = "CadenaTempF")
    private String cadenaTempF;
    @Size(max = 260)
    @Column(name = "CadenaTempG")
    private String cadenaTempG;
    @Size(max = 260)
    @Column(name = "CadenaTempH")
    private String cadenaTempH;
    @JoinColumn(name = "Embalajes_id", referencedColumnName = "idEmbalaje", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Embalajes embalajes;
    @JoinColumn(name = "EstadoMaterial_id", referencedColumnName = "idEstadoMaterial", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Estadomaterial estadomaterial;
    @JoinColumns({
        @JoinColumn(name = "FormatosEncabezado_id", referencedColumnName = "id", insertable = false, updatable = false)
        , @JoinColumn(name = "FormatosEncabezado_TipoFormato_id", referencedColumnName = "TipoFormato_id", insertable = false, updatable = false)
        , @JoinColumn(name = "FormatosEncabezado_CIIU_id", referencedColumnName = "CIIU_id", insertable = false, updatable = false)
        , @JoinColumn(name = "FormatosEncabezado_Empleados_id", referencedColumnName = "Empleados_id", insertable = false, updatable = false)
        , @JoinColumn(name = "FormatosEncabezado_Emp_Cargos_id", referencedColumnName = "Empleados_Cargos_id", insertable = false, updatable = false)
        , @JoinColumn(name = "FormatosEncabezado_Emp_TipoDocumento_id", referencedColumnName = "Empleados_TipoDocumento_id", insertable = false, updatable = false)
        , @JoinColumn(name = "FormatosEncabezado_Emp_Areas_id", referencedColumnName = "Empleados_Areas_id", insertable = false, updatable = false)
        , @JoinColumn(name = "FormatosEncabezado_Emp_Ciud_idCiudad", referencedColumnName = "Empleados_Ciudades_idCiudad", insertable = false, updatable = false)
        , @JoinColumn(name = "FormatosEncabezado_Emp_Ciud_Dep_idDepartamento", referencedColumnName = "Empleados_Ciudades_Departamento_idDepartamento", insertable = false, updatable = false)
        , @JoinColumn(name = "FormatosEncabezado_Estado_id", referencedColumnName = "Estado_id", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Formatosencabezado formatosencabezado;
    @JoinColumn(name = "Unidades_id", referencedColumnName = "idUnidad", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Unidades unidades;

    public Formatosdetalle() {
    }

    public Formatosdetalle(FormatosdetallePK formatosdetallePK) {
        this.formatosdetallePK = formatosdetallePK;
    }

    public Formatosdetalle(FormatosdetallePK formatosdetallePK, String nombreResiduo, int idLinea, int cantidad) {
        this.formatosdetallePK = formatosdetallePK;
        this.nombreResiduo = nombreResiduo;
        this.idLinea = idLinea;
        this.cantidad = cantidad;
    }

    public Formatosdetalle(long idFormatoDetalle, long estadoMaterialid, long embalajesid, long unidadesid, long formatosEncabezadoid, long formatosEncabezadoTipoFormatoid, long formatosEncabezadoCIIUid, long formatosEncabezadoEmpleadosid, long formatosEncabezadoEmpCargosid, long formatosEncabezadoEmpTipoDocumentoid, long formatosEncabezadoEmpAreasid, long formatosEncabezadoEmpCiudidCiudad, long formatosEncabezadoEmpCiudDepidDepartamento, long formatosEncabezadoEstadoid) {
        this.formatosdetallePK = new FormatosdetallePK(idFormatoDetalle, estadoMaterialid, embalajesid, unidadesid, formatosEncabezadoid, formatosEncabezadoTipoFormatoid, formatosEncabezadoCIIUid, formatosEncabezadoEmpleadosid, formatosEncabezadoEmpCargosid, formatosEncabezadoEmpTipoDocumentoid, formatosEncabezadoEmpAreasid, formatosEncabezadoEmpCiudidCiudad, formatosEncabezadoEmpCiudDepidDepartamento, formatosEncabezadoEstadoid);
    }

    public FormatosdetallePK getFormatosdetallePK() {
        return formatosdetallePK;
    }

    public void setFormatosdetallePK(FormatosdetallePK formatosdetallePK) {
        this.formatosdetallePK = formatosdetallePK;
    }

    public String getNombreResiduo() {
        return nombreResiduo;
    }

    public void setNombreResiduo(String nombreResiduo) {
        this.nombreResiduo = nombreResiduo;
    }

    public int getIdLinea() {
        return idLinea;
    }

    public void setIdLinea(int idLinea) {
        this.idLinea = idLinea;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaTempA() {
        return fechaTempA;
    }

    public void setFechaTempA(Date fechaTempA) {
        this.fechaTempA = fechaTempA;
    }

    public Date getFechaTempB() {
        return fechaTempB;
    }

    public void setFechaTempB(Date fechaTempB) {
        this.fechaTempB = fechaTempB;
    }

    public Date getFechaTempC() {
        return fechaTempC;
    }

    public void setFechaTempC(Date fechaTempC) {
        this.fechaTempC = fechaTempC;
    }

    public Date getFechaTempD() {
        return fechaTempD;
    }

    public void setFechaTempD(Date fechaTempD) {
        this.fechaTempD = fechaTempD;
    }

    public Date getHoraTempA() {
        return horaTempA;
    }

    public void setHoraTempA(Date horaTempA) {
        this.horaTempA = horaTempA;
    }

    public Date getHoraTempB() {
        return horaTempB;
    }

    public void setHoraTempB(Date horaTempB) {
        this.horaTempB = horaTempB;
    }

    public Date getHoraTempC() {
        return horaTempC;
    }

    public void setHoraTempC(Date horaTempC) {
        this.horaTempC = horaTempC;
    }

    public Date getHoraTempD() {
        return horaTempD;
    }

    public void setHoraTempD(Date horaTempD) {
        this.horaTempD = horaTempD;
    }

    public BigInteger getEnteroTempA() {
        return enteroTempA;
    }

    public void setEnteroTempA(BigInteger enteroTempA) {
        this.enteroTempA = enteroTempA;
    }

    public BigInteger getEnteroTempB() {
        return enteroTempB;
    }

    public void setEnteroTempB(BigInteger enteroTempB) {
        this.enteroTempB = enteroTempB;
    }

    public BigInteger getEnteroTempC() {
        return enteroTempC;
    }

    public void setEnteroTempC(BigInteger enteroTempC) {
        this.enteroTempC = enteroTempC;
    }

    public BigInteger getEnteroTempD() {
        return enteroTempD;
    }

    public void setEnteroTempD(BigInteger enteroTempD) {
        this.enteroTempD = enteroTempD;
    }

    public Boolean getBooleanoTempA() {
        return booleanoTempA;
    }

    public void setBooleanoTempA(Boolean booleanoTempA) {
        this.booleanoTempA = booleanoTempA;
    }

    public Boolean getBooleanoTempB() {
        return booleanoTempB;
    }

    public void setBooleanoTempB(Boolean booleanoTempB) {
        this.booleanoTempB = booleanoTempB;
    }

    public Boolean getBooleanoTempC() {
        return booleanoTempC;
    }

    public void setBooleanoTempC(Boolean booleanoTempC) {
        this.booleanoTempC = booleanoTempC;
    }

    public Boolean getBooleanoTempD() {
        return booleanoTempD;
    }

    public void setBooleanoTempD(Boolean booleanoTempD) {
        this.booleanoTempD = booleanoTempD;
    }

    public String getCadenaTempA() {
        return cadenaTempA;
    }

    public void setCadenaTempA(String cadenaTempA) {
        this.cadenaTempA = cadenaTempA;
    }

    public String getCadenaTempB() {
        return cadenaTempB;
    }

    public void setCadenaTempB(String cadenaTempB) {
        this.cadenaTempB = cadenaTempB;
    }

    public String getCadenaTempC() {
        return cadenaTempC;
    }

    public void setCadenaTempC(String cadenaTempC) {
        this.cadenaTempC = cadenaTempC;
    }

    public String getCadenaTempD() {
        return cadenaTempD;
    }

    public void setCadenaTempD(String cadenaTempD) {
        this.cadenaTempD = cadenaTempD;
    }

    public String getCadenaTempE() {
        return cadenaTempE;
    }

    public void setCadenaTempE(String cadenaTempE) {
        this.cadenaTempE = cadenaTempE;
    }

    public String getCadenaTempF() {
        return cadenaTempF;
    }

    public void setCadenaTempF(String cadenaTempF) {
        this.cadenaTempF = cadenaTempF;
    }

    public String getCadenaTempG() {
        return cadenaTempG;
    }

    public void setCadenaTempG(String cadenaTempG) {
        this.cadenaTempG = cadenaTempG;
    }

    public String getCadenaTempH() {
        return cadenaTempH;
    }

    public void setCadenaTempH(String cadenaTempH) {
        this.cadenaTempH = cadenaTempH;
    }

    public Embalajes getEmbalajes() {
        return embalajes;
    }

    public void setEmbalajes(Embalajes embalajes) {
        this.embalajes = embalajes;
    }

    public Estadomaterial getEstadomaterial() {
        return estadomaterial;
    }

    public void setEstadomaterial(Estadomaterial estadomaterial) {
        this.estadomaterial = estadomaterial;
    }

    public Formatosencabezado getFormatosencabezado() {
        return formatosencabezado;
    }

    public void setFormatosencabezado(Formatosencabezado formatosencabezado) {
        this.formatosencabezado = formatosencabezado;
    }

    public Unidades getUnidades() {
        return unidades;
    }

    public void setUnidades(Unidades unidades) {
        this.unidades = unidades;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (formatosdetallePK != null ? formatosdetallePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Formatosdetalle)) {
            return false;
        }
        Formatosdetalle other = (Formatosdetalle) object;
        if ((this.formatosdetallePK == null && other.formatosdetallePK != null) || (this.formatosdetallePK != null && !this.formatosdetallePK.equals(other.formatosdetallePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.quimiespel.quimiespel.entidades.Formatosdetalle[ formatosdetallePK=" + formatosdetallePK + " ]";
    }
    
}
