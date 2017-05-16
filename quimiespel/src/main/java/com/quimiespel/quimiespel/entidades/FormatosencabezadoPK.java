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
public class FormatosencabezadoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id")
    private long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TipoFormato_id")
    private long tipoFormatoid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CIIU_id")
    private long cIIUid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Empleados_id")
    private long empleadosid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Empleados_Cargos_id")
    private long empleadosCargosid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Empleados_TipoDocumento_id")
    private long empleadosTipoDocumentoid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Empleados_Areas_id")
    private long empleadosAreasid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Empleados_Ciudades_idCiudad")
    private long empleadosCiudadesidCiudad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Empleados_Ciudades_Departamento_idDepartamento")
    private long empleadosCiudadesDepartamentoidDepartamento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Estado_id")
    private long estadoid;

    public FormatosencabezadoPK() {
    }

    public FormatosencabezadoPK(long id, long tipoFormatoid, long cIIUid, long empleadosid, long empleadosCargosid, long empleadosTipoDocumentoid, long empleadosAreasid, long empleadosCiudadesidCiudad, long empleadosCiudadesDepartamentoidDepartamento, long estadoid) {
        this.id = id;
        this.tipoFormatoid = tipoFormatoid;
        this.cIIUid = cIIUid;
        this.empleadosid = empleadosid;
        this.empleadosCargosid = empleadosCargosid;
        this.empleadosTipoDocumentoid = empleadosTipoDocumentoid;
        this.empleadosAreasid = empleadosAreasid;
        this.empleadosCiudadesidCiudad = empleadosCiudadesidCiudad;
        this.empleadosCiudadesDepartamentoidDepartamento = empleadosCiudadesDepartamentoidDepartamento;
        this.estadoid = estadoid;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTipoFormatoid() {
        return tipoFormatoid;
    }

    public void setTipoFormatoid(long tipoFormatoid) {
        this.tipoFormatoid = tipoFormatoid;
    }

    public long getCIIUid() {
        return cIIUid;
    }

    public void setCIIUid(long cIIUid) {
        this.cIIUid = cIIUid;
    }

    public long getEmpleadosid() {
        return empleadosid;
    }

    public void setEmpleadosid(long empleadosid) {
        this.empleadosid = empleadosid;
    }

    public long getEmpleadosCargosid() {
        return empleadosCargosid;
    }

    public void setEmpleadosCargosid(long empleadosCargosid) {
        this.empleadosCargosid = empleadosCargosid;
    }

    public long getEmpleadosTipoDocumentoid() {
        return empleadosTipoDocumentoid;
    }

    public void setEmpleadosTipoDocumentoid(long empleadosTipoDocumentoid) {
        this.empleadosTipoDocumentoid = empleadosTipoDocumentoid;
    }

    public long getEmpleadosAreasid() {
        return empleadosAreasid;
    }

    public void setEmpleadosAreasid(long empleadosAreasid) {
        this.empleadosAreasid = empleadosAreasid;
    }

    public long getEmpleadosCiudadesidCiudad() {
        return empleadosCiudadesidCiudad;
    }

    public void setEmpleadosCiudadesidCiudad(long empleadosCiudadesidCiudad) {
        this.empleadosCiudadesidCiudad = empleadosCiudadesidCiudad;
    }

    public long getEmpleadosCiudadesDepartamentoidDepartamento() {
        return empleadosCiudadesDepartamentoidDepartamento;
    }

    public void setEmpleadosCiudadesDepartamentoidDepartamento(long empleadosCiudadesDepartamentoidDepartamento) {
        this.empleadosCiudadesDepartamentoidDepartamento = empleadosCiudadesDepartamentoidDepartamento;
    }

    public long getEstadoid() {
        return estadoid;
    }

    public void setEstadoid(long estadoid) {
        this.estadoid = estadoid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) tipoFormatoid;
        hash += (int) cIIUid;
        hash += (int) empleadosid;
        hash += (int) empleadosCargosid;
        hash += (int) empleadosTipoDocumentoid;
        hash += (int) empleadosAreasid;
        hash += (int) empleadosCiudadesidCiudad;
        hash += (int) empleadosCiudadesDepartamentoidDepartamento;
        hash += (int) estadoid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FormatosencabezadoPK)) {
            return false;
        }
        FormatosencabezadoPK other = (FormatosencabezadoPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.tipoFormatoid != other.tipoFormatoid) {
            return false;
        }
        if (this.cIIUid != other.cIIUid) {
            return false;
        }
        if (this.empleadosid != other.empleadosid) {
            return false;
        }
        if (this.empleadosCargosid != other.empleadosCargosid) {
            return false;
        }
        if (this.empleadosTipoDocumentoid != other.empleadosTipoDocumentoid) {
            return false;
        }
        if (this.empleadosAreasid != other.empleadosAreasid) {
            return false;
        }
        if (this.empleadosCiudadesidCiudad != other.empleadosCiudadesidCiudad) {
            return false;
        }
        if (this.empleadosCiudadesDepartamentoidDepartamento != other.empleadosCiudadesDepartamentoidDepartamento) {
            return false;
        }
        if (this.estadoid != other.estadoid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.quimiespel.quimiespel.entidades.FormatosencabezadoPK[ id=" + id + ", tipoFormatoid=" + tipoFormatoid + ", cIIUid=" + cIIUid + ", empleadosid=" + empleadosid + ", empleadosCargosid=" + empleadosCargosid + ", empleadosTipoDocumentoid=" + empleadosTipoDocumentoid + ", empleadosAreasid=" + empleadosAreasid + ", empleadosCiudadesidCiudad=" + empleadosCiudadesidCiudad + ", empleadosCiudadesDepartamentoidDepartamento=" + empleadosCiudadesDepartamentoidDepartamento + ", estadoid=" + estadoid + " ]";
    }
    
}
