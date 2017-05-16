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
public class EmpleadosPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id")
    private long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Cargos_id")
    private long cargosid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TipoDocumento_id")
    private long tipoDocumentoid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Areas_id")
    private long areasid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ciudades_idCiudad")
    private long ciudadesidCiudad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ciudades_Departamento_idDepartamento")
    private long ciudadesDepartamentoidDepartamento;

    public EmpleadosPK() {
    }

    public EmpleadosPK(long id, long cargosid, long tipoDocumentoid, long areasid, long ciudadesidCiudad, long ciudadesDepartamentoidDepartamento) {
        this.id = id;
        this.cargosid = cargosid;
        this.tipoDocumentoid = tipoDocumentoid;
        this.areasid = areasid;
        this.ciudadesidCiudad = ciudadesidCiudad;
        this.ciudadesDepartamentoidDepartamento = ciudadesDepartamentoidDepartamento;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCargosid() {
        return cargosid;
    }

    public void setCargosid(long cargosid) {
        this.cargosid = cargosid;
    }

    public long getTipoDocumentoid() {
        return tipoDocumentoid;
    }

    public void setTipoDocumentoid(long tipoDocumentoid) {
        this.tipoDocumentoid = tipoDocumentoid;
    }

    public long getAreasid() {
        return areasid;
    }

    public void setAreasid(long areasid) {
        this.areasid = areasid;
    }

    public long getCiudadesidCiudad() {
        return ciudadesidCiudad;
    }

    public void setCiudadesidCiudad(long ciudadesidCiudad) {
        this.ciudadesidCiudad = ciudadesidCiudad;
    }

    public long getCiudadesDepartamentoidDepartamento() {
        return ciudadesDepartamentoidDepartamento;
    }

    public void setCiudadesDepartamentoidDepartamento(long ciudadesDepartamentoidDepartamento) {
        this.ciudadesDepartamentoidDepartamento = ciudadesDepartamentoidDepartamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) cargosid;
        hash += (int) tipoDocumentoid;
        hash += (int) areasid;
        hash += (int) ciudadesidCiudad;
        hash += (int) ciudadesDepartamentoidDepartamento;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpleadosPK)) {
            return false;
        }
        EmpleadosPK other = (EmpleadosPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.cargosid != other.cargosid) {
            return false;
        }
        if (this.tipoDocumentoid != other.tipoDocumentoid) {
            return false;
        }
        if (this.areasid != other.areasid) {
            return false;
        }
        if (this.ciudadesidCiudad != other.ciudadesidCiudad) {
            return false;
        }
        if (this.ciudadesDepartamentoidDepartamento != other.ciudadesDepartamentoidDepartamento) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.quimiespel.quimiespel.entidades.EmpleadosPK[ id=" + id + ", cargosid=" + cargosid + ", tipoDocumentoid=" + tipoDocumentoid + ", areasid=" + areasid + ", ciudadesidCiudad=" + ciudadesidCiudad + ", ciudadesDepartamentoidDepartamento=" + ciudadesDepartamentoidDepartamento + " ]";
    }
    
}
