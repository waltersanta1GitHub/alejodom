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
public class FormatosdetallePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idFormatoDetalle")
    private long idFormatoDetalle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EstadoMaterial_id")
    private long estadoMaterialid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Embalajes_id")
    private long embalajesid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Unidades_id")
    private long unidadesid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FormatosEncabezado_id")
    private long formatosEncabezadoid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FormatosEncabezado_TipoFormato_id")
    private long formatosEncabezadoTipoFormatoid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FormatosEncabezado_CIIU_id")
    private long formatosEncabezadoCIIUid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FormatosEncabezado_Empleados_id")
    private long formatosEncabezadoEmpleadosid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FormatosEncabezado_Emp_Cargos_id")
    private long formatosEncabezadoEmpCargosid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FormatosEncabezado_Emp_TipoDocumento_id")
    private long formatosEncabezadoEmpTipoDocumentoid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FormatosEncabezado_Emp_Areas_id")
    private long formatosEncabezadoEmpAreasid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FormatosEncabezado_Emp_Ciud_idCiudad")
    private long formatosEncabezadoEmpCiudidCiudad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FormatosEncabezado_Emp_Ciud_Dep_idDepartamento")
    private long formatosEncabezadoEmpCiudDepidDepartamento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FormatosEncabezado_Estado_id")
    private long formatosEncabezadoEstadoid;

    public FormatosdetallePK() {
    }

    public FormatosdetallePK(long idFormatoDetalle, long estadoMaterialid, long embalajesid, long unidadesid, long formatosEncabezadoid, long formatosEncabezadoTipoFormatoid, long formatosEncabezadoCIIUid, long formatosEncabezadoEmpleadosid, long formatosEncabezadoEmpCargosid, long formatosEncabezadoEmpTipoDocumentoid, long formatosEncabezadoEmpAreasid, long formatosEncabezadoEmpCiudidCiudad, long formatosEncabezadoEmpCiudDepidDepartamento, long formatosEncabezadoEstadoid) {
        this.idFormatoDetalle = idFormatoDetalle;
        this.estadoMaterialid = estadoMaterialid;
        this.embalajesid = embalajesid;
        this.unidadesid = unidadesid;
        this.formatosEncabezadoid = formatosEncabezadoid;
        this.formatosEncabezadoTipoFormatoid = formatosEncabezadoTipoFormatoid;
        this.formatosEncabezadoCIIUid = formatosEncabezadoCIIUid;
        this.formatosEncabezadoEmpleadosid = formatosEncabezadoEmpleadosid;
        this.formatosEncabezadoEmpCargosid = formatosEncabezadoEmpCargosid;
        this.formatosEncabezadoEmpTipoDocumentoid = formatosEncabezadoEmpTipoDocumentoid;
        this.formatosEncabezadoEmpAreasid = formatosEncabezadoEmpAreasid;
        this.formatosEncabezadoEmpCiudidCiudad = formatosEncabezadoEmpCiudidCiudad;
        this.formatosEncabezadoEmpCiudDepidDepartamento = formatosEncabezadoEmpCiudDepidDepartamento;
        this.formatosEncabezadoEstadoid = formatosEncabezadoEstadoid;
    }

    public long getIdFormatoDetalle() {
        return idFormatoDetalle;
    }

    public void setIdFormatoDetalle(long idFormatoDetalle) {
        this.idFormatoDetalle = idFormatoDetalle;
    }

    public long getEstadoMaterialid() {
        return estadoMaterialid;
    }

    public void setEstadoMaterialid(long estadoMaterialid) {
        this.estadoMaterialid = estadoMaterialid;
    }

    public long getEmbalajesid() {
        return embalajesid;
    }

    public void setEmbalajesid(long embalajesid) {
        this.embalajesid = embalajesid;
    }

    public long getUnidadesid() {
        return unidadesid;
    }

    public void setUnidadesid(long unidadesid) {
        this.unidadesid = unidadesid;
    }

    public long getFormatosEncabezadoid() {
        return formatosEncabezadoid;
    }

    public void setFormatosEncabezadoid(long formatosEncabezadoid) {
        this.formatosEncabezadoid = formatosEncabezadoid;
    }

    public long getFormatosEncabezadoTipoFormatoid() {
        return formatosEncabezadoTipoFormatoid;
    }

    public void setFormatosEncabezadoTipoFormatoid(long formatosEncabezadoTipoFormatoid) {
        this.formatosEncabezadoTipoFormatoid = formatosEncabezadoTipoFormatoid;
    }

    public long getFormatosEncabezadoCIIUid() {
        return formatosEncabezadoCIIUid;
    }

    public void setFormatosEncabezadoCIIUid(long formatosEncabezadoCIIUid) {
        this.formatosEncabezadoCIIUid = formatosEncabezadoCIIUid;
    }

    public long getFormatosEncabezadoEmpleadosid() {
        return formatosEncabezadoEmpleadosid;
    }

    public void setFormatosEncabezadoEmpleadosid(long formatosEncabezadoEmpleadosid) {
        this.formatosEncabezadoEmpleadosid = formatosEncabezadoEmpleadosid;
    }

    public long getFormatosEncabezadoEmpCargosid() {
        return formatosEncabezadoEmpCargosid;
    }

    public void setFormatosEncabezadoEmpCargosid(long formatosEncabezadoEmpCargosid) {
        this.formatosEncabezadoEmpCargosid = formatosEncabezadoEmpCargosid;
    }

    public long getFormatosEncabezadoEmpTipoDocumentoid() {
        return formatosEncabezadoEmpTipoDocumentoid;
    }

    public void setFormatosEncabezadoEmpTipoDocumentoid(long formatosEncabezadoEmpTipoDocumentoid) {
        this.formatosEncabezadoEmpTipoDocumentoid = formatosEncabezadoEmpTipoDocumentoid;
    }

    public long getFormatosEncabezadoEmpAreasid() {
        return formatosEncabezadoEmpAreasid;
    }

    public void setFormatosEncabezadoEmpAreasid(long formatosEncabezadoEmpAreasid) {
        this.formatosEncabezadoEmpAreasid = formatosEncabezadoEmpAreasid;
    }

    public long getFormatosEncabezadoEmpCiudidCiudad() {
        return formatosEncabezadoEmpCiudidCiudad;
    }

    public void setFormatosEncabezadoEmpCiudidCiudad(long formatosEncabezadoEmpCiudidCiudad) {
        this.formatosEncabezadoEmpCiudidCiudad = formatosEncabezadoEmpCiudidCiudad;
    }

    public long getFormatosEncabezadoEmpCiudDepidDepartamento() {
        return formatosEncabezadoEmpCiudDepidDepartamento;
    }

    public void setFormatosEncabezadoEmpCiudDepidDepartamento(long formatosEncabezadoEmpCiudDepidDepartamento) {
        this.formatosEncabezadoEmpCiudDepidDepartamento = formatosEncabezadoEmpCiudDepidDepartamento;
    }

    public long getFormatosEncabezadoEstadoid() {
        return formatosEncabezadoEstadoid;
    }

    public void setFormatosEncabezadoEstadoid(long formatosEncabezadoEstadoid) {
        this.formatosEncabezadoEstadoid = formatosEncabezadoEstadoid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idFormatoDetalle;
        hash += (int) estadoMaterialid;
        hash += (int) embalajesid;
        hash += (int) unidadesid;
        hash += (int) formatosEncabezadoid;
        hash += (int) formatosEncabezadoTipoFormatoid;
        hash += (int) formatosEncabezadoCIIUid;
        hash += (int) formatosEncabezadoEmpleadosid;
        hash += (int) formatosEncabezadoEmpCargosid;
        hash += (int) formatosEncabezadoEmpTipoDocumentoid;
        hash += (int) formatosEncabezadoEmpAreasid;
        hash += (int) formatosEncabezadoEmpCiudidCiudad;
        hash += (int) formatosEncabezadoEmpCiudDepidDepartamento;
        hash += (int) formatosEncabezadoEstadoid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FormatosdetallePK)) {
            return false;
        }
        FormatosdetallePK other = (FormatosdetallePK) object;
        if (this.idFormatoDetalle != other.idFormatoDetalle) {
            return false;
        }
        if (this.estadoMaterialid != other.estadoMaterialid) {
            return false;
        }
        if (this.embalajesid != other.embalajesid) {
            return false;
        }
        if (this.unidadesid != other.unidadesid) {
            return false;
        }
        if (this.formatosEncabezadoid != other.formatosEncabezadoid) {
            return false;
        }
        if (this.formatosEncabezadoTipoFormatoid != other.formatosEncabezadoTipoFormatoid) {
            return false;
        }
        if (this.formatosEncabezadoCIIUid != other.formatosEncabezadoCIIUid) {
            return false;
        }
        if (this.formatosEncabezadoEmpleadosid != other.formatosEncabezadoEmpleadosid) {
            return false;
        }
        if (this.formatosEncabezadoEmpCargosid != other.formatosEncabezadoEmpCargosid) {
            return false;
        }
        if (this.formatosEncabezadoEmpTipoDocumentoid != other.formatosEncabezadoEmpTipoDocumentoid) {
            return false;
        }
        if (this.formatosEncabezadoEmpAreasid != other.formatosEncabezadoEmpAreasid) {
            return false;
        }
        if (this.formatosEncabezadoEmpCiudidCiudad != other.formatosEncabezadoEmpCiudidCiudad) {
            return false;
        }
        if (this.formatosEncabezadoEmpCiudDepidDepartamento != other.formatosEncabezadoEmpCiudDepidDepartamento) {
            return false;
        }
        if (this.formatosEncabezadoEstadoid != other.formatosEncabezadoEstadoid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.quimiespel.quimiespel.entidades.FormatosdetallePK[ idFormatoDetalle=" + idFormatoDetalle + ", estadoMaterialid=" + estadoMaterialid + ", embalajesid=" + embalajesid + ", unidadesid=" + unidadesid + ", formatosEncabezadoid=" + formatosEncabezadoid + ", formatosEncabezadoTipoFormatoid=" + formatosEncabezadoTipoFormatoid + ", formatosEncabezadoCIIUid=" + formatosEncabezadoCIIUid + ", formatosEncabezadoEmpleadosid=" + formatosEncabezadoEmpleadosid + ", formatosEncabezadoEmpCargosid=" + formatosEncabezadoEmpCargosid + ", formatosEncabezadoEmpTipoDocumentoid=" + formatosEncabezadoEmpTipoDocumentoid + ", formatosEncabezadoEmpAreasid=" + formatosEncabezadoEmpAreasid + ", formatosEncabezadoEmpCiudidCiudad=" + formatosEncabezadoEmpCiudidCiudad + ", formatosEncabezadoEmpCiudDepidDepartamento=" + formatosEncabezadoEmpCiudDepidDepartamento + ", formatosEncabezadoEstadoid=" + formatosEncabezadoEstadoid + " ]";
    }
    
}
