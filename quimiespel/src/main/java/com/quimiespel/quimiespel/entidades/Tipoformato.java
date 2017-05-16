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
@Table(name = "tipoformato", catalog = "quimirespel", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipoformato.findAll", query = "SELECT t FROM Tipoformato t")
    , @NamedQuery(name = "Tipoformato.findByIdTipoFormato", query = "SELECT t FROM Tipoformato t WHERE t.idTipoFormato = :idTipoFormato")
    , @NamedQuery(name = "Tipoformato.findByDescripcion", query = "SELECT t FROM Tipoformato t WHERE t.descripcion = :descripcion")})
public class Tipoformato implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTipoFormato")
    private Long idTipoFormato;
    @Size(max = 70)
    @Column(name = "Descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoformato")
    private List<Formatosencabezado> formatosencabezadoList;

    public Tipoformato() {
    }

    public Tipoformato(Long idTipoFormato) {
        this.idTipoFormato = idTipoFormato;
    }

    public Long getIdTipoFormato() {
        return idTipoFormato;
    }

    public void setIdTipoFormato(Long idTipoFormato) {
        this.idTipoFormato = idTipoFormato;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        hash += (idTipoFormato != null ? idTipoFormato.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoformato)) {
            return false;
        }
        Tipoformato other = (Tipoformato) object;
        if ((this.idTipoFormato == null && other.idTipoFormato != null) || (this.idTipoFormato != null && !this.idTipoFormato.equals(other.idTipoFormato))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.quimiespel.quimiespel.entidades.Tipoformato[ idTipoFormato=" + idTipoFormato + " ]";
    }
    
}
