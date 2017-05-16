/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quimiespel.quimiespel.entidades;

import java.io.Serializable;
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
@Table(name = "empleados", catalog = "quimirespel", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleados.findAll", query = "SELECT e FROM Empleados e")
    , @NamedQuery(name = "Empleados.findById", query = "SELECT e FROM Empleados e WHERE e.empleadosPK.id = :id")
    , @NamedQuery(name = "Empleados.findByNombre", query = "SELECT e FROM Empleados e WHERE e.nombre = :nombre")
    , @NamedQuery(name = "Empleados.findByApellido", query = "SELECT e FROM Empleados e WHERE e.apellido = :apellido")
    , @NamedQuery(name = "Empleados.findByDocumento", query = "SELECT e FROM Empleados e WHERE e.documento = :documento")
    , @NamedQuery(name = "Empleados.findByFechanacimiento", query = "SELECT e FROM Empleados e WHERE e.fechanacimiento = :fechanacimiento")
    , @NamedQuery(name = "Empleados.findByTelefonoFijo", query = "SELECT e FROM Empleados e WHERE e.telefonoFijo = :telefonoFijo")
    , @NamedQuery(name = "Empleados.findByTelefonoMovil", query = "SELECT e FROM Empleados e WHERE e.telefonoMovil = :telefonoMovil")
    , @NamedQuery(name = "Empleados.findByEmail", query = "SELECT e FROM Empleados e WHERE e.email = :email")
    , @NamedQuery(name = "Empleados.findByCargosid", query = "SELECT e FROM Empleados e WHERE e.empleadosPK.cargosid = :cargosid")
    , @NamedQuery(name = "Empleados.findByTipoDocumentoid", query = "SELECT e FROM Empleados e WHERE e.empleadosPK.tipoDocumentoid = :tipoDocumentoid")
    , @NamedQuery(name = "Empleados.findByAreasid", query = "SELECT e FROM Empleados e WHERE e.empleadosPK.areasid = :areasid")
    , @NamedQuery(name = "Empleados.findByCiudadesidCiudad", query = "SELECT e FROM Empleados e WHERE e.empleadosPK.ciudadesidCiudad = :ciudadesidCiudad")
    , @NamedQuery(name = "Empleados.findByCiudadesDepartamentoidDepartamento", query = "SELECT e FROM Empleados e WHERE e.empleadosPK.ciudadesDepartamentoidDepartamento = :ciudadesDepartamentoidDepartamento")})
public class Empleados implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EmpleadosPK empleadosPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "Apellido")
    private String apellido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Documento")
    private String documento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fechanacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechanacimiento;
    @Size(max = 45)
    @Column(name = "TelefonoFijo")
    private String telefonoFijo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "TelefonoMovil")
    private String telefonoMovil;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 100)
    @Column(name = "Email")
    private String email;
    @JoinColumn(name = "Areas_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Areas areas;
    @JoinColumn(name = "Cargos_id", referencedColumnName = "idCargo", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Cargos cargos;
    @JoinColumns({
        @JoinColumn(name = "Ciudades_idCiudad", referencedColumnName = "idCiudad", insertable = false, updatable = false)
        , @JoinColumn(name = "Ciudades_Departamento_idDepartamento", referencedColumnName = "Departamento_idDepartamento", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Ciudades ciudades;
    @JoinColumn(name = "TipoDocumento_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Tipodocumento tipodocumento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empleados")
    private List<Formatosencabezado> formatosencabezadoList;

    public Empleados() {
    }

    public Empleados(EmpleadosPK empleadosPK) {
        this.empleadosPK = empleadosPK;
    }

    public Empleados(EmpleadosPK empleadosPK, String nombre, String apellido, String documento, Date fechanacimiento, String telefonoMovil) {
        this.empleadosPK = empleadosPK;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.fechanacimiento = fechanacimiento;
        this.telefonoMovil = telefonoMovil;
    }

    public Empleados(long id, long cargosid, long tipoDocumentoid, long areasid, long ciudadesidCiudad, long ciudadesDepartamentoidDepartamento) {
        this.empleadosPK = new EmpleadosPK(id, cargosid, tipoDocumentoid, areasid, ciudadesidCiudad, ciudadesDepartamentoidDepartamento);
    }

    public EmpleadosPK getEmpleadosPK() {
        return empleadosPK;
    }

    public void setEmpleadosPK(EmpleadosPK empleadosPK) {
        this.empleadosPK = empleadosPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Areas getAreas() {
        return areas;
    }

    public void setAreas(Areas areas) {
        this.areas = areas;
    }

    public Cargos getCargos() {
        return cargos;
    }

    public void setCargos(Cargos cargos) {
        this.cargos = cargos;
    }

    public Ciudades getCiudades() {
        return ciudades;
    }

    public void setCiudades(Ciudades ciudades) {
        this.ciudades = ciudades;
    }

    public Tipodocumento getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(Tipodocumento tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    @XmlTransient
    public List<Formatosencabezado> getFormatosencabezadoList() {
        return formatosencabezadoList;
    }

    public void setFormatosencabezadoList(List<Formatosencabezado> formatosencabezadoList) {
        this.formatosencabezadoList = formatosencabezadoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empleadosPK != null ? empleadosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleados)) {
            return false;
        }
        Empleados other = (Empleados) object;
        if ((this.empleadosPK == null && other.empleadosPK != null) || (this.empleadosPK != null && !this.empleadosPK.equals(other.empleadosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.quimiespel.quimiespel.entidades.Empleados[ empleadosPK=" + empleadosPK + " ]";
    }
    
}
