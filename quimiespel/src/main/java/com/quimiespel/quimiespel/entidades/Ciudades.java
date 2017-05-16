/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quimiespel.quimiespel.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jose.santamaria
 */
@Entity
@Table(name = "ciudades", catalog = "quimirespel", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ciudades.findAll", query = "SELECT c FROM Ciudades c")
    , @NamedQuery(name = "Ciudades.findByIdCiudad", query = "SELECT c FROM Ciudades c WHERE c.ciudadesPK.idCiudad = :idCiudad")
    , @NamedQuery(name = "Ciudades.findByNombre", query = "SELECT c FROM Ciudades c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Ciudades.findByDepartamentoidDepartamento", query = "SELECT c FROM Ciudades c WHERE c.ciudadesPK.departamentoidDepartamento = :departamentoidDepartamento")})
public class Ciudades implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CiudadesPK ciudadesPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "Nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ciudades")
    private List<Empleados> empleadosList;
    @JoinColumn(name = "Departamento_idDepartamento", referencedColumnName = "idDepartamento", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Departamento departamento;

    public Ciudades() {
    }

    public Ciudades(CiudadesPK ciudadesPK) {
        this.ciudadesPK = ciudadesPK;
    }

    public Ciudades(CiudadesPK ciudadesPK, String nombre) {
        this.ciudadesPK = ciudadesPK;
        this.nombre = nombre;
    }

    public Ciudades(long idCiudad, long departamentoidDepartamento) {
        this.ciudadesPK = new CiudadesPK(idCiudad, departamentoidDepartamento);
    }

    public CiudadesPK getCiudadesPK() {
        return ciudadesPK;
    }

    public void setCiudadesPK(CiudadesPK ciudadesPK) {
        this.ciudadesPK = ciudadesPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public List<Empleados> getEmpleadosList() {
        return empleadosList;
    }

    public void setEmpleadosList(List<Empleados> empleadosList) {
        this.empleadosList = empleadosList;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ciudadesPK != null ? ciudadesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ciudades)) {
            return false;
        }
        Ciudades other = (Ciudades) object;
        if ((this.ciudadesPK == null && other.ciudadesPK != null) || (this.ciudadesPK != null && !this.ciudadesPK.equals(other.ciudadesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.quimiespel.quimiespel.entidades.Ciudades[ ciudadesPK=" + ciudadesPK + " ]";
    }
    
}
