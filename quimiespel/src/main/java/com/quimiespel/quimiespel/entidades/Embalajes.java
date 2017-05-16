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
@Table(name = "embalajes", catalog = "quimirespel", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Embalajes.findAll", query = "SELECT e FROM Embalajes e")
    , @NamedQuery(name = "Embalajes.findByIdEmbalaje", query = "SELECT e FROM Embalajes e WHERE e.idEmbalaje = :idEmbalaje")
    , @NamedQuery(name = "Embalajes.findByDescripcion", query = "SELECT e FROM Embalajes e WHERE e.descripcion = :descripcion")})
public class Embalajes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEmbalaje")
    private Long idEmbalaje;
    @Size(max = 120)
    @Column(name = "Descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "embalajes")
    private List<Formatosdetalle> formatosdetalleList;

    public Embalajes() {
    }

    public Embalajes(Long idEmbalaje) {
        this.idEmbalaje = idEmbalaje;
    }

    public Long getIdEmbalaje() {
        return idEmbalaje;
    }

    public void setIdEmbalaje(Long idEmbalaje) {
        this.idEmbalaje = idEmbalaje;
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
        hash += (idEmbalaje != null ? idEmbalaje.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Embalajes)) {
            return false;
        }
        Embalajes other = (Embalajes) object;
        if ((this.idEmbalaje == null && other.idEmbalaje != null) || (this.idEmbalaje != null && !this.idEmbalaje.equals(other.idEmbalaje))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.quimiespel.quimiespel.entidades.Embalajes[ idEmbalaje=" + idEmbalaje + " ]";
    }
    
}
