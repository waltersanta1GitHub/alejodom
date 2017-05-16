/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quimiespel.quimiespel.entidades;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jose.santamaria
 */
@Entity
@Table(name = "formatosencabezado", catalog = "quimirespel", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Formatosencabezado.findAll", query = "SELECT f FROM Formatosencabezado f")
    , @NamedQuery(name = "Formatosencabezado.findById", query = "SELECT f FROM Formatosencabezado f WHERE f.formatosencabezadoPK.id = :id")
    , @NamedQuery(name = "Formatosencabezado.findByRazonSocial", query = "SELECT f FROM Formatosencabezado f WHERE f.razonSocial = :razonSocial")
    , @NamedQuery(name = "Formatosencabezado.findByNit", query = "SELECT f FROM Formatosencabezado f WHERE f.nit = :nit")
    , @NamedQuery(name = "Formatosencabezado.findByTelefono", query = "SELECT f FROM Formatosencabezado f WHERE f.telefono = :telefono")
    , @NamedQuery(name = "Formatosencabezado.findByDireccion", query = "SELECT f FROM Formatosencabezado f WHERE f.direccion = :direccion")
    , @NamedQuery(name = "Formatosencabezado.findByLatitud", query = "SELECT f FROM Formatosencabezado f WHERE f.latitud = :latitud")
    , @NamedQuery(name = "Formatosencabezado.findByLogitud", query = "SELECT f FROM Formatosencabezado f WHERE f.logitud = :logitud")
    , @NamedQuery(name = "Formatosencabezado.findByNombreContacto", query = "SELECT f FROM Formatosencabezado f WHERE f.nombreContacto = :nombreContacto")
    , @NamedQuery(name = "Formatosencabezado.findByTelefonoContacto", query = "SELECT f FROM Formatosencabezado f WHERE f.telefonoContacto = :telefonoContacto")
    , @NamedQuery(name = "Formatosencabezado.findByEmail", query = "SELECT f FROM Formatosencabezado f WHERE f.email = :email")
    , @NamedQuery(name = "Formatosencabezado.findByNumVisita", query = "SELECT f FROM Formatosencabezado f WHERE f.numVisita = :numVisita")
    , @NamedQuery(name = "Formatosencabezado.findByFechaVisita", query = "SELECT f FROM Formatosencabezado f WHERE f.fechaVisita = :fechaVisita")
    , @NamedQuery(name = "Formatosencabezado.findByHoraVisita", query = "SELECT f FROM Formatosencabezado f WHERE f.horaVisita = :horaVisita")
    , @NamedQuery(name = "Formatosencabezado.findByEspecificacionSeguridad", query = "SELECT f FROM Formatosencabezado f WHERE f.especificacionSeguridad = :especificacionSeguridad")
    , @NamedQuery(name = "Formatosencabezado.findByEspecificacionAdicional", query = "SELECT f FROM Formatosencabezado f WHERE f.especificacionAdicional = :especificacionAdicional")
    , @NamedQuery(name = "Formatosencabezado.findByFechaTempA", query = "SELECT f FROM Formatosencabezado f WHERE f.fechaTempA = :fechaTempA")
    , @NamedQuery(name = "Formatosencabezado.findByFechaTempB", query = "SELECT f FROM Formatosencabezado f WHERE f.fechaTempB = :fechaTempB")
    , @NamedQuery(name = "Formatosencabezado.findByFechaTempC", query = "SELECT f FROM Formatosencabezado f WHERE f.fechaTempC = :fechaTempC")
    , @NamedQuery(name = "Formatosencabezado.findByFechaTempD", query = "SELECT f FROM Formatosencabezado f WHERE f.fechaTempD = :fechaTempD")
    , @NamedQuery(name = "Formatosencabezado.findByHoraTempA", query = "SELECT f FROM Formatosencabezado f WHERE f.horaTempA = :horaTempA")
    , @NamedQuery(name = "Formatosencabezado.findByHoraTempB", query = "SELECT f FROM Formatosencabezado f WHERE f.horaTempB = :horaTempB")
    , @NamedQuery(name = "Formatosencabezado.findByHoraTempC", query = "SELECT f FROM Formatosencabezado f WHERE f.horaTempC = :horaTempC")
    , @NamedQuery(name = "Formatosencabezado.findByHoraTempD", query = "SELECT f FROM Formatosencabezado f WHERE f.horaTempD = :horaTempD")
    , @NamedQuery(name = "Formatosencabezado.findByEnteroTempA", query = "SELECT f FROM Formatosencabezado f WHERE f.enteroTempA = :enteroTempA")
    , @NamedQuery(name = "Formatosencabezado.findByEnteroTempB", query = "SELECT f FROM Formatosencabezado f WHERE f.enteroTempB = :enteroTempB")
    , @NamedQuery(name = "Formatosencabezado.findByEnteroTempC", query = "SELECT f FROM Formatosencabezado f WHERE f.enteroTempC = :enteroTempC")
    , @NamedQuery(name = "Formatosencabezado.findByEnteroTempD", query = "SELECT f FROM Formatosencabezado f WHERE f.enteroTempD = :enteroTempD")
    , @NamedQuery(name = "Formatosencabezado.findByBooleanoTempA", query = "SELECT f FROM Formatosencabezado f WHERE f.booleanoTempA = :booleanoTempA")
    , @NamedQuery(name = "Formatosencabezado.findByBooleanoTempB", query = "SELECT f FROM Formatosencabezado f WHERE f.booleanoTempB = :booleanoTempB")
    , @NamedQuery(name = "Formatosencabezado.findByBooleanoTempC", query = "SELECT f FROM Formatosencabezado f WHERE f.booleanoTempC = :booleanoTempC")
    , @NamedQuery(name = "Formatosencabezado.findByBooleanoTempD", query = "SELECT f FROM Formatosencabezado f WHERE f.booleanoTempD = :booleanoTempD")
    , @NamedQuery(name = "Formatosencabezado.findByCadenaTempA", query = "SELECT f FROM Formatosencabezado f WHERE f.cadenaTempA = :cadenaTempA")
    , @NamedQuery(name = "Formatosencabezado.findByCadenaTempB", query = "SELECT f FROM Formatosencabezado f WHERE f.cadenaTempB = :cadenaTempB")
    , @NamedQuery(name = "Formatosencabezado.findByCadenaTempC", query = "SELECT f FROM Formatosencabezado f WHERE f.cadenaTempC = :cadenaTempC")
    , @NamedQuery(name = "Formatosencabezado.findByCadenaTempD", query = "SELECT f FROM Formatosencabezado f WHERE f.cadenaTempD = :cadenaTempD")
    , @NamedQuery(name = "Formatosencabezado.findByCadenaTempE", query = "SELECT f FROM Formatosencabezado f WHERE f.cadenaTempE = :cadenaTempE")
    , @NamedQuery(name = "Formatosencabezado.findByCadenaTempF", query = "SELECT f FROM Formatosencabezado f WHERE f.cadenaTempF = :cadenaTempF")
    , @NamedQuery(name = "Formatosencabezado.findByCadenaTempG", query = "SELECT f FROM Formatosencabezado f WHERE f.cadenaTempG = :cadenaTempG")
    , @NamedQuery(name = "Formatosencabezado.findByCadenaTempH", query = "SELECT f FROM Formatosencabezado f WHERE f.cadenaTempH = :cadenaTempH")
    , @NamedQuery(name = "Formatosencabezado.findByTipoFormatoid", query = "SELECT f FROM Formatosencabezado f WHERE f.formatosencabezadoPK.tipoFormatoid = :tipoFormatoid")
    , @NamedQuery(name = "Formatosencabezado.findByCIIUid", query = "SELECT f FROM Formatosencabezado f WHERE f.formatosencabezadoPK.cIIUid = :cIIUid")
    , @NamedQuery(name = "Formatosencabezado.findByEmpleadosid", query = "SELECT f FROM Formatosencabezado f WHERE f.formatosencabezadoPK.empleadosid = :empleadosid")
    , @NamedQuery(name = "Formatosencabezado.findByEmpleadosCargosid", query = "SELECT f FROM Formatosencabezado f WHERE f.formatosencabezadoPK.empleadosCargosid = :empleadosCargosid")
    , @NamedQuery(name = "Formatosencabezado.findByEmpleadosTipoDocumentoid", query = "SELECT f FROM Formatosencabezado f WHERE f.formatosencabezadoPK.empleadosTipoDocumentoid = :empleadosTipoDocumentoid")
    , @NamedQuery(name = "Formatosencabezado.findByEmpleadosAreasid", query = "SELECT f FROM Formatosencabezado f WHERE f.formatosencabezadoPK.empleadosAreasid = :empleadosAreasid")
    , @NamedQuery(name = "Formatosencabezado.findByEmpleadosCiudadesidCiudad", query = "SELECT f FROM Formatosencabezado f WHERE f.formatosencabezadoPK.empleadosCiudadesidCiudad = :empleadosCiudadesidCiudad")
    , @NamedQuery(name = "Formatosencabezado.findByEmpleadosCiudadesDepartamentoidDepartamento", query = "SELECT f FROM Formatosencabezado f WHERE f.formatosencabezadoPK.empleadosCiudadesDepartamentoidDepartamento = :empleadosCiudadesDepartamentoidDepartamento")
    , @NamedQuery(name = "Formatosencabezado.findByEstadoid", query = "SELECT f FROM Formatosencabezado f WHERE f.formatosencabezadoPK.estadoid = :estadoid")
    , @NamedQuery(name = "Formatosencabezado.findByIdFormatoPadre", query = "SELECT f FROM Formatosencabezado f WHERE f.idFormatoPadre = :idFormatoPadre")
    , @NamedQuery(name = "Formatosencabezado.findByEnabled", query = "SELECT f FROM Formatosencabezado f WHERE f.enabled = :enabled")
    , @NamedQuery(name = "Formatosencabezado.findByUpdatedBy", query = "SELECT f FROM Formatosencabezado f WHERE f.updatedBy = :updatedBy")
    , @NamedQuery(name = "Formatosencabezado.findByCreatedBy", query = "SELECT f FROM Formatosencabezado f WHERE f.createdBy = :createdBy")
    , @NamedQuery(name = "Formatosencabezado.findByUpdateDate", query = "SELECT f FROM Formatosencabezado f WHERE f.updateDate = :updateDate")
    , @NamedQuery(name = "Formatosencabezado.findByCreatedDate", query = "SELECT f FROM Formatosencabezado f WHERE f.createdDate = :createdDate")})
public class Formatosencabezado implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FormatosencabezadoPK formatosencabezadoPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "RazonSocial")
    private String razonSocial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Nit")
    private String nit;
    @Size(max = 100)
    @Column(name = "Telefono")
    private String telefono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "Direccion")
    private String direccion;
    @Size(max = 150)
    @Column(name = "Latitud")
    private String latitud;
    @Size(max = 150)
    @Column(name = "Logitud")
    private String logitud;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 180)
    @Column(name = "NombreContacto")
    private String nombreContacto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "TelefonoContacto")
    private String telefonoContacto;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 120)
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "NumVisita")
    private String numVisita;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaVisita")
    @Temporal(TemporalType.DATE)
    private Date fechaVisita;
    @Basic(optional = false)
    @NotNull
    @Column(name = "HoraVisita")
    @Temporal(TemporalType.TIME)
    private Date horaVisita;
    @Size(max = 260)
    @Column(name = "EspecificacionSeguridad")
    private String especificacionSeguridad;
    @Size(max = 260)
    @Column(name = "EspecificacionAdicional")
    private String especificacionAdicional;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdFormatoPadre")
    private long idFormatoPadre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Enabled")
    private boolean enabled;
    @Column(name = "UpdatedBy")
    private BigInteger updatedBy;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CreatedBy")
    private long createdBy;
    @Column(name = "UpdateDate")
    @Temporal(TemporalType.DATE)
    private Date updateDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CreatedDate")
    @Temporal(TemporalType.DATE)
    private Date createdDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "formatosencabezado")
    private List<Formatosdetalle> formatosdetalleList;
    @JoinColumn(name = "CIIU_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Ciiu ciiu;
    @JoinColumns({
        @JoinColumn(name = "Empleados_id", referencedColumnName = "id", insertable = false, updatable = false)
        , @JoinColumn(name = "Empleados_Cargos_id", referencedColumnName = "Cargos_id", insertable = false, updatable = false)
        , @JoinColumn(name = "Empleados_TipoDocumento_id", referencedColumnName = "TipoDocumento_id", insertable = false, updatable = false)
        , @JoinColumn(name = "Empleados_Areas_id", referencedColumnName = "Areas_id", insertable = false, updatable = false)
        , @JoinColumn(name = "Empleados_Ciudades_idCiudad", referencedColumnName = "Ciudades_idCiudad", insertable = false, updatable = false)
        , @JoinColumn(name = "Empleados_Ciudades_Departamento_idDepartamento", referencedColumnName = "Ciudades_Departamento_idDepartamento", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Empleados empleados;
    @JoinColumn(name = "Estado_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Estado estado;
    @JoinColumn(name = "TipoFormato_id", referencedColumnName = "idTipoFormato", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Tipoformato tipoformato;

    public Formatosencabezado() {
    }

    public Formatosencabezado(FormatosencabezadoPK formatosencabezadoPK) {
        this.formatosencabezadoPK = formatosencabezadoPK;
    }

    public Formatosencabezado(FormatosencabezadoPK formatosencabezadoPK, String razonSocial, String nit, String direccion, String nombreContacto, String telefonoContacto, String numVisita, Date fechaVisita, Date horaVisita, long idFormatoPadre, boolean enabled, long createdBy, Date createdDate) {
        this.formatosencabezadoPK = formatosencabezadoPK;
        this.razonSocial = razonSocial;
        this.nit = nit;
        this.direccion = direccion;
        this.nombreContacto = nombreContacto;
        this.telefonoContacto = telefonoContacto;
        this.numVisita = numVisita;
        this.fechaVisita = fechaVisita;
        this.horaVisita = horaVisita;
        this.idFormatoPadre = idFormatoPadre;
        this.enabled = enabled;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
    }

    public Formatosencabezado(long id, long tipoFormatoid, long cIIUid, long empleadosid, long empleadosCargosid, long empleadosTipoDocumentoid, long empleadosAreasid, long empleadosCiudadesidCiudad, long empleadosCiudadesDepartamentoidDepartamento, long estadoid) {
        this.formatosencabezadoPK = new FormatosencabezadoPK(id, tipoFormatoid, cIIUid, empleadosid, empleadosCargosid, empleadosTipoDocumentoid, empleadosAreasid, empleadosCiudadesidCiudad, empleadosCiudadesDepartamentoidDepartamento, estadoid);
    }

    public FormatosencabezadoPK getFormatosencabezadoPK() {
        return formatosencabezadoPK;
    }

    public void setFormatosencabezadoPK(FormatosencabezadoPK formatosencabezadoPK) {
        this.formatosencabezadoPK = formatosencabezadoPK;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLogitud() {
        return logitud;
    }

    public void setLogitud(String logitud) {
        this.logitud = logitud;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumVisita() {
        return numVisita;
    }

    public void setNumVisita(String numVisita) {
        this.numVisita = numVisita;
    }

    public Date getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(Date fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public Date getHoraVisita() {
        return horaVisita;
    }

    public void setHoraVisita(Date horaVisita) {
        this.horaVisita = horaVisita;
    }

    public String getEspecificacionSeguridad() {
        return especificacionSeguridad;
    }

    public void setEspecificacionSeguridad(String especificacionSeguridad) {
        this.especificacionSeguridad = especificacionSeguridad;
    }

    public String getEspecificacionAdicional() {
        return especificacionAdicional;
    }

    public void setEspecificacionAdicional(String especificacionAdicional) {
        this.especificacionAdicional = especificacionAdicional;
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

    public long getIdFormatoPadre() {
        return idFormatoPadre;
    }

    public void setIdFormatoPadre(long idFormatoPadre) {
        this.idFormatoPadre = idFormatoPadre;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public BigInteger getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(BigInteger updatedBy) {
        this.updatedBy = updatedBy;
    }

    public long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @XmlTransient
    public List<Formatosdetalle> getFormatosdetalleList() {
        return formatosdetalleList;
    }

    public void setFormatosdetalleList(List<Formatosdetalle> formatosdetalleList) {
        this.formatosdetalleList = formatosdetalleList;
    }

    public Ciiu getCiiu() {
        return ciiu;
    }

    public void setCiiu(Ciiu ciiu) {
        this.ciiu = ciiu;
    }

    public Empleados getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleados empleados) {
        this.empleados = empleados;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Tipoformato getTipoformato() {
        return tipoformato;
    }

    public void setTipoformato(Tipoformato tipoformato) {
        this.tipoformato = tipoformato;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (formatosencabezadoPK != null ? formatosencabezadoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Formatosencabezado)) {
            return false;
        }
        Formatosencabezado other = (Formatosencabezado) object;
        if ((this.formatosencabezadoPK == null && other.formatosencabezadoPK != null) || (this.formatosencabezadoPK != null && !this.formatosencabezadoPK.equals(other.formatosencabezadoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.quimiespel.quimiespel.entidades.Formatosencabezado[ formatosencabezadoPK=" + formatosencabezadoPK + " ]";
    }
    
}
