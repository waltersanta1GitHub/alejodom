/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quimiespel.quimiespel.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author jose.santamaria
 */
@Embeddable
public class CiudadesPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idCiudad")
    private long idCiudad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Departamento_idDepartamento")
    private long departamentoidDepartamento;

    public CiudadesPK() {
    }

    public CiudadesPK(long idCiudad, long departamentoidDepartamento) {
        this.idCiudad = idCiudad;
        this.departamentoidDepartamento = departamentoidDepartamento;
    }

    public long getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(long idCiudad) {
        this.idCiudad = idCiudad;
    }

    public long getDepartamentoidDepartamento() {
        return departamentoidDepartamento;
    }

    public void setDepartamentoidDepartamento(long departamentoidDepartamento) {
        this.departamentoidDepartamento = departamentoidDepartamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idCiudad;
        hash += (int) departamentoidDepartamento;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CiudadesPK)) {
            return false;
        }
        CiudadesPK other = (CiudadesPK) object;
        if (this.idCiudad != other.idCiudad) {
            return false;
        }
        if (this.departamentoidDepartamento != other.departamentoidDepartamento) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.quimiespel.quimiespel.entidades.CiudadesPK[ idCiudad=" + idCiudad + ", departamentoidDepartamento=" + departamentoidDepartamento + " ]";
    }
    
}
