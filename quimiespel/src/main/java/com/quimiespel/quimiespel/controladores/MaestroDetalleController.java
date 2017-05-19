package com.quimiespel.quimiespel.controladores;


import com.quimiespel.quimiespel.entidades.Formatosencabezado;
import com.quimiespel.quimiespel.controladores.util.JsfUtil;
import com.quimiespel.quimiespel.controladores.util.JsfUtil.PersistAction;
import com.quimiespel.quimiespel.fachadas.FormatosencabezadoFacade;
import com.quimiespel.quimiespel.entidades.Formatosdetalle;
import com.quimiespel.quimiespel.entidades.Unidades;
import com.quimiespel.quimiespel.fachadas.FormatosdetalleFacade;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.TableColumn.CellEditEvent;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import org.primefaces.event.RowEditEvent;


/**
 *
 * @author jose.santamaria
 */

@Named("maestrodetalleController")
@SessionScoped
public class MaestroDetalleController implements Serializable{

    
     @EJB
    private com.quimiespel.quimiespel.fachadas.FormatosdetalleFacade formatoDetalleFacade;
    private List<Formatosdetalle> formatoDetalleItems = null;
    private Formatosdetalle formatoDetalleSelected;
    
    @EJB
    private com.quimiespel.quimiespel.fachadas.FormatosencabezadoFacade formatoEncabezadoFacade;
    private List<Formatosencabezado> formatoEncabezadoItems = null;
    private Formatosencabezado formatoEncabezadoSelected;

    public List<Formatosencabezado> getFormatoEncabezadoItems() {
        return formatoEncabezadoItems;
    }

    public void setFormatoEncabezadoItems(List<Formatosencabezado> formatoEncabezadoItems) {
        this.formatoEncabezadoItems = formatoEncabezadoItems;
    }

    public Formatosencabezado getFormatoEncabezadoSelected() {
        return formatoEncabezadoSelected;
    }

    public void setFormatoEncabezadoSelected(Formatosencabezado formatoEncabezadoSelected) {
        this.formatoEncabezadoSelected = formatoEncabezadoSelected;
    }

    public List<Formatosdetalle> getFormatoDetalleItems() {
        return formatoDetalleItems;
    }

    public void setFormatoDetalleItems(List<Formatosdetalle> formatoDetalleItems) {
        this.formatoDetalleItems = formatoDetalleItems;
    }

    public Formatosdetalle getFormatoDetalleSelected() {
        return formatoDetalleSelected;
    }

    public void setFormatoDetalleSelected(Formatosdetalle formatoDetalleSelected) {
        this.formatoDetalleSelected = formatoDetalleSelected;
    }
    
     private FormatosdetalleFacade getFormatoDetalleFacade() {
        return formatoDetalleFacade;
    }
    
    public MaestroDetalleController() {
    }
    
    protected void setFormatoEncabezadoEmbeddableKeys() {
        formatoEncabezadoSelected.getFormatosencabezadoPK().setTipoFormatoid(formatoEncabezadoSelected.getTipoformato().getIdTipoFormato());
        formatoEncabezadoSelected.getFormatosencabezadoPK().setEmpleadosAreasid(formatoEncabezadoSelected.getEmpleados().getEmpleadosPK().getAreasid());
        formatoEncabezadoSelected.getFormatosencabezadoPK().setEmpleadosCargosid(formatoEncabezadoSelected.getEmpleados().getEmpleadosPK().getCargosid());
        formatoEncabezadoSelected.getFormatosencabezadoPK().setEmpleadosCiudadesDepartamentoidDepartamento(formatoEncabezadoSelected.getEmpleados().getEmpleadosPK().getCiudadesDepartamentoidDepartamento());
        formatoEncabezadoSelected.getFormatosencabezadoPK().setCIIUid(formatoEncabezadoSelected.getCiiu().getId());
        formatoEncabezadoSelected.getFormatosencabezadoPK().setEstadoid(formatoEncabezadoSelected.getEstado().getId());
        formatoEncabezadoSelected.getFormatosencabezadoPK().setEmpleadosid(formatoEncabezadoSelected.getEmpleados().getEmpleadosPK().getId());
        formatoEncabezadoSelected.getFormatosencabezadoPK().setEmpleadosTipoDocumentoid(formatoEncabezadoSelected.getEmpleados().getEmpleadosPK().getTipoDocumentoid());
        formatoEncabezadoSelected.getFormatosencabezadoPK().setEmpleadosCiudadesidCiudad(formatoEncabezadoSelected.getEmpleados().getEmpleadosPK().getCiudadesidCiudad());
    }

    protected void initializeFormatoEncabezadoEmbeddableKey() {
        formatoEncabezadoSelected.setFormatosencabezadoPK(new com.quimiespel.quimiespel.entidades.FormatosencabezadoPK());
    }
    
    private FormatosencabezadoFacade getFormatoEncabezadoFacade() {
        return formatoEncabezadoFacade;
    }
    
    protected void setFormatoDetalleEmbeddableKeys() {
        formatoDetalleSelected.getFormatosdetallePK().setFormatosEncabezadoCIIUid(formatoDetalleSelected.getFormatosencabezado().getFormatosencabezadoPK().getCIIUid());
        formatoDetalleSelected.getFormatosdetallePK().setFormatosEncabezadoEmpCargosid(formatoDetalleSelected.getFormatosencabezado().getFormatosencabezadoPK().getEmpleadosCargosid());
        formatoDetalleSelected.getFormatosdetallePK().setFormatosEncabezadoid(formatoDetalleSelected.getFormatosencabezado().getFormatosencabezadoPK().getId());
        formatoDetalleSelected.getFormatosdetallePK().setFormatosEncabezadoEmpTipoDocumentoid(formatoDetalleSelected.getFormatosencabezado().getFormatosencabezadoPK().getEmpleadosTipoDocumentoid());
        formatoDetalleSelected.getFormatosdetallePK().setFormatosEncabezadoEmpleadosid(formatoDetalleSelected.getFormatosencabezado().getFormatosencabezadoPK().getEmpleadosid());
        formatoDetalleSelected.getFormatosdetallePK().setFormatosEncabezadoEmpCiudidCiudad(formatoDetalleSelected.getFormatosencabezado().getFormatosencabezadoPK().getEmpleadosCiudadesidCiudad());
        formatoDetalleSelected.getFormatosdetallePK().setFormatosEncabezadoTipoFormatoid(formatoDetalleSelected.getFormatosencabezado().getFormatosencabezadoPK().getTipoFormatoid());
        formatoDetalleSelected.getFormatosdetallePK().setFormatosEncabezadoEstadoid(formatoDetalleSelected.getFormatosencabezado().getFormatosencabezadoPK().getEstadoid());
        formatoDetalleSelected.getFormatosdetallePK().setEstadoMaterialid(formatoDetalleSelected.getEstadomaterial().getIdEstadoMaterial());
        formatoDetalleSelected.getFormatosdetallePK().setFormatosEncabezadoEmpCiudDepidDepartamento(formatoDetalleSelected.getFormatosencabezado().getFormatosencabezadoPK().getEmpleadosCiudadesDepartamentoidDepartamento());
        formatoDetalleSelected.getFormatosdetallePK().setFormatosEncabezadoEmpAreasid(formatoDetalleSelected.getFormatosencabezado().getFormatosencabezadoPK().getEmpleadosAreasid());
        formatoDetalleSelected.getFormatosdetallePK().setEmbalajesid(formatoDetalleSelected.getEmbalajes().getIdEmbalaje());
        formatoDetalleSelected.getFormatosdetallePK().setUnidadesid(formatoDetalleSelected.getUnidades().getIdUnidad());
    }

    protected void initializeFormatoDetalleEmbeddableKey() {
        formatoDetalleSelected.setFormatosdetallePK(new com.quimiespel.quimiespel.entidades.FormatosdetallePK());
    }
    
    @PostConstruct
    public void init() {
     
        formatoDetalleItems= new ArrayList<>();
        
        Formatosdetalle lineaCero= new Formatosdetalle();
        lineaCero.setUnidades( new Unidades(Long.parseLong("1")));
        lineaCero.setNombreResiduo("----");
        
        for (int i = 0; i < 5; i++) {
            formatoDetalleItems.add(lineaCero);
        }
        
        
    }
    
    // Eventos
    
    
     public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Car Edited", ((Formatosdetalle) event.getObject()).getIdLinea()+"");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edit Cancelled", ((Formatosdetalle) event.getObject()).getIdLinea()+"");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onCellEdit(CellEditEvent event) {
        Object oldValue = event.getOldValue();
        Object newValue = event.getNewValue();
         
        if(newValue != null && !newValue.equals(oldValue)) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cell Changed", "Old: " + oldValue + ", New:" + newValue);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }
    
    
    
}
