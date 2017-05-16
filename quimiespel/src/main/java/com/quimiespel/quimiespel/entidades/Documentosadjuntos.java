/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quimiespel.quimiespel.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jose.santamaria
 */
@Entity
@Table(name = "documentosadjuntos", catalog = "quimirespel", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Documentosadjuntos.findAll", query = "SELECT d FROM Documentosadjuntos d")
    , @NamedQuery(name = "Documentosadjuntos.findByIdDocumentoAdjunto", query = "SELECT d FROM Documentosadjuntos d WHERE d.idDocumentoAdjunto = :idDocumentoAdjunto")
    , @NamedQuery(name = "Documentosadjuntos.findByExtencion", query = "SELECT d FROM Documentosadjuntos d WHERE d.extencion = :extencion")
    , @NamedQuery(name = "Documentosadjuntos.findByFileType", query = "SELECT d FROM Documentosadjuntos d WHERE d.fileType = :fileType")
    , @NamedQuery(name = "Documentosadjuntos.findByFechaCarga", query = "SELECT d FROM Documentosadjuntos d WHERE d.fechaCarga = :fechaCarga")
    , @NamedQuery(name = "Documentosadjuntos.findByIdPadre", query = "SELECT d FROM Documentosadjuntos d WHERE d.idPadre = :idPadre")
    , @NamedQuery(name = "Documentosadjuntos.findByCreatedBy", query = "SELECT d FROM Documentosadjuntos d WHERE d.createdBy = :createdBy")})
public class Documentosadjuntos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idDocumentoAdjunto")
    private Long idDocumentoAdjunto;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "Titulo")
    private String titulo;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "Url")
    private String url;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Extencion")
    private String extencion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "FileType")
    private String fileType;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Contenido")
    private String contenido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaCarga")
    @Temporal(TemporalType.DATE)
    private Date fechaCarga;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdPadre")
    private long idPadre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CreatedBy")
    private long createdBy;

    public Documentosadjuntos() {
    }

    public Documentosadjuntos(Long idDocumentoAdjunto) {
        this.idDocumentoAdjunto = idDocumentoAdjunto;
    }

    public Documentosadjuntos(Long idDocumentoAdjunto, String titulo, String url, String extencion, String fileType, Date fechaCarga, long idPadre, long createdBy) {
        this.idDocumentoAdjunto = idDocumentoAdjunto;
        this.titulo = titulo;
        this.url = url;
        this.extencion = extencion;
        this.fileType = fileType;
        this.fechaCarga = fechaCarga;
        this.idPadre = idPadre;
        this.createdBy = createdBy;
    }

    public Long getIdDocumentoAdjunto() {
        return idDocumentoAdjunto;
    }

    public void setIdDocumentoAdjunto(Long idDocumentoAdjunto) {
        this.idDocumentoAdjunto = idDocumentoAdjunto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getExtencion() {
        return extencion;
    }

    public void setExtencion(String extencion) {
        this.extencion = extencion;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Date getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(Date fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public long getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(long idPadre) {
        this.idPadre = idPadre;
    }

    public long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(long createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDocumentoAdjunto != null ? idDocumentoAdjunto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Documentosadjuntos)) {
            return false;
        }
        Documentosadjuntos other = (Documentosadjuntos) object;
        if ((this.idDocumentoAdjunto == null && other.idDocumentoAdjunto != null) || (this.idDocumentoAdjunto != null && !this.idDocumentoAdjunto.equals(other.idDocumentoAdjunto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.quimiespel.quimiespel.entidades.Documentosadjuntos[ idDocumentoAdjunto=" + idDocumentoAdjunto + " ]";
    }
    
}
