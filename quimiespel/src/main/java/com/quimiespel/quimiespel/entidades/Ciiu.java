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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jose.santamaria
 */
@Entity
@Table(name = "ciiu", catalog = "quimirespel", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ciiu.findAll", query = "SELECT c FROM Ciiu c")
    , @NamedQuery(name = "Ciiu.findById", query = "SELECT c FROM Ciiu c WHERE c.id = :id")
    , @NamedQuery(name = "Ciiu.findByCodigo", query = "SELECT c FROM Ciiu c WHERE c.codigo = :codigo")
    , @NamedQuery(name = "Ciiu.findByDescripcion", query = "SELECT c FROM Ciiu c WHERE c.descripcion = :descripcion")})
public class Ciiu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "Codigo")
    private String codigo;
    @Size(max = 200)
    @Column(name = "Descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ciiu")
    private List<Formatosencabezado> formatosencabezadoList;

    public Ciiu() {
    }

    public Ciiu(Long id) {
        this.id = id;
    }

    public Ciiu(Long id, String codigo) {
        this.id = id;
        this.codigo = codigo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ciiu)) {
            return false;
        }
        Ciiu other = (Ciiu) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.quimiespel.quimiespel.entidades.Ciiu[ id=" + id + " ]";
    }
    
}
