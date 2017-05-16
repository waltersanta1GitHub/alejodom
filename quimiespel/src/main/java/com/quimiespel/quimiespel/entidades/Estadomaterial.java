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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jose.santamaria
 */
@Entity
@Table(name = "estadomaterial", catalog = "quimirespel", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estadomaterial.findAll", query = "SELECT e FROM Estadomaterial e")
    , @NamedQuery(name = "Estadomaterial.findByIdEstadoMaterial", query = "SELECT e FROM Estadomaterial e WHERE e.idEstadoMaterial = :idEstadoMaterial")
    , @NamedQuery(name = "Estadomaterial.findByDescripcion", query = "SELECT e FROM Estadomaterial e WHERE e.descripcion = :descripcion")})
public class Estadomaterial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEstadoMaterial")
    private Long idEstadoMaterial;
    @Size(max = 60)
    @Column(name = "Descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estadomaterial")
    private List<Formatosdetalle> formatosdetalleList;

    public Estadomaterial() {
    }

    public Estadomaterial(Long idEstadoMaterial) {
        this.idEstadoMaterial = idEstadoMaterial;
    }

    public Long getIdEstadoMaterial() {
        return idEstadoMaterial;
    }

    public void setIdEstadoMaterial(Long idEstadoMaterial) {
        this.idEstadoMaterial = idEstadoMaterial;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Formatosdetalle> getFormatosdetalleList() {
        return formatosdetalleList;
    }

    public void setFormatosdetalleList(List<Formatosdetalle> formatosdetalleList) {
        this.formatosdetalleList = formatosdetalleList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstadoMaterial != null ? idEstadoMaterial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estadomaterial)) {
            return false;
        }
        Estadomaterial other = (Estadomaterial) object;
        if ((this.idEstadoMaterial == null && other.idEstadoMaterial != null) || (this.idEstadoMaterial != null && !this.idEstadoMaterial.equals(other.idEstadoMaterial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.quimiespel.quimiespel.entidades.Estadomaterial[ idEstadoMaterial=" + idEstadoMaterial + " ]";
    }
    
}
