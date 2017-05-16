package com.quimiespel.quimiespel.controladores;

import com.quimiespel.quimiespel.entidades.Formatosdetalle;
import com.quimiespel.quimiespel.controladores.util.JsfUtil;
import com.quimiespel.quimiespel.controladores.util.JsfUtil.PersistAction;
import com.quimiespel.quimiespel.fachadas.FormatosdetalleFacade;

import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@Named("formatosdetalleController")
@SessionScoped
public class FormatosdetalleController implements Serializable {

    @EJB
    private com.quimiespel.quimiespel.fachadas.FormatosdetalleFacade ejbFacade;
    private List<Formatosdetalle> items = null;
    private Formatosdetalle selected;

    public FormatosdetalleController() {
    }

    public Formatosdetalle getSelected() {
        return selected;
    }

    public void setSelected(Formatosdetalle selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
        selected.getFormatosdetallePK().setFormatosEncabezadoCIIUid(selected.getFormatosencabezado().getFormatosencabezadoPK().getCIIUid());
        selected.getFormatosdetallePK().setFormatosEncabezadoEmpCargosid(selected.getFormatosencabezado().getFormatosencabezadoPK().getEmpleadosCargosid());
        selected.getFormatosdetallePK().setFormatosEncabezadoid(selected.getFormatosencabezado().getFormatosencabezadoPK().getId());
        selected.getFormatosdetallePK().setFormatosEncabezadoEmpTipoDocumentoid(selected.getFormatosencabezado().getFormatosencabezadoPK().getEmpleadosTipoDocumentoid());
        selected.getFormatosdetallePK().setFormatosEncabezadoEmpleadosid(selected.getFormatosencabezado().getFormatosencabezadoPK().getEmpleadosid());
        selected.getFormatosdetallePK().setFormatosEncabezadoEmpCiudidCiudad(selected.getFormatosencabezado().getFormatosencabezadoPK().getEmpleadosCiudadesidCiudad());
        selected.getFormatosdetallePK().setFormatosEncabezadoTipoFormatoid(selected.getFormatosencabezado().getFormatosencabezadoPK().getTipoFormatoid());
        selected.getFormatosdetallePK().setFormatosEncabezadoEstadoid(selected.getFormatosencabezado().getFormatosencabezadoPK().getEstadoid());
        selected.getFormatosdetallePK().setEstadoMaterialid(selected.getEstadomaterial().getIdEstadoMaterial());
        selected.getFormatosdetallePK().setFormatosEncabezadoEmpCiudDepidDepartamento(selected.getFormatosencabezado().getFormatosencabezadoPK().getEmpleadosCiudadesDepartamentoidDepartamento());
        selected.getFormatosdetallePK().setFormatosEncabezadoEmpAreasid(selected.getFormatosencabezado().getFormatosencabezadoPK().getEmpleadosAreasid());
        selected.getFormatosdetallePK().setEmbalajesid(selected.getEmbalajes().getIdEmbalaje());
        selected.getFormatosdetallePK().setUnidadesid(selected.getUnidades().getIdUnidad());
    }

    protected void initializeEmbeddableKey() {
        selected.setFormatosdetallePK(new com.quimiespel.quimiespel.entidades.FormatosdetallePK());
    }

    private FormatosdetalleFacade getFacade() {
        return ejbFacade;
    }

    public Formatosdetalle prepareCreate() {
        selected = new Formatosdetalle();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("FormatosdetalleCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("FormatosdetalleUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("FormatosdetalleDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<Formatosdetalle> getItems() {
        if (items == null) {
            items = getFacade().findAll();
        }
        return items;
    }

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            setEmbeddableKeys();
            try {
                if (persistAction != PersistAction.DELETE) {
                    getFacade().edit(selected);
                } else {
                    getFacade().remove(selected);
                }
                JsfUtil.addSuccessMessage(successMessage);
            } catch (EJBException ex) {
                String msg = "";
                Throwable cause = ex.getCause();
                if (cause != null) {
                    msg = cause.getLocalizedMessage();
                }
                if (msg.length() > 0) {
                    JsfUtil.addErrorMessage(msg);
                } else {
                    JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
                }
            } catch (Exception ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            }
        }
    }

    public Formatosdetalle getFormatosdetalle(com.quimiespel.quimiespel.entidades.FormatosdetallePK id) {
        return getFacade().find(id);
    }

    public List<Formatosdetalle> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<Formatosdetalle> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = Formatosdetalle.class)
    public static class FormatosdetalleControllerConverter implements Converter {

        private static final String SEPARATOR = "#";
        private static final String SEPARATOR_ESCAPED = "\\#";

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            FormatosdetalleController controller = (FormatosdetalleController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "formatosdetalleController");
            return controller.getFormatosdetalle(getKey(value));
        }

        com.quimiespel.quimiespel.entidades.FormatosdetallePK getKey(String value) {
            com.quimiespel.quimiespel.entidades.FormatosdetallePK key;
            String values[] = value.split(SEPARATOR_ESCAPED);
            key = new com.quimiespel.quimiespel.entidades.FormatosdetallePK();
            key.setIdFormatoDetalle(Long.parseLong(values[0]));
            key.setEstadoMaterialid(Long.parseLong(values[1]));
            key.setEmbalajesid(Long.parseLong(values[2]));
            key.setUnidadesid(Long.parseLong(values[3]));
            key.setFormatosEncabezadoid(Long.parseLong(values[4]));
            key.setFormatosEncabezadoTipoFormatoid(Long.parseLong(values[5]));
            key.setFormatosEncabezadoCIIUid(Long.parseLong(values[6]));
            key.setFormatosEncabezadoEmpleadosid(Long.parseLong(values[7]));
            key.setFormatosEncabezadoEmpCargosid(Long.parseLong(values[8]));
            key.setFormatosEncabezadoEmpTipoDocumentoid(Long.parseLong(values[9]));
            key.setFormatosEncabezadoEmpAreasid(Long.parseLong(values[10]));
            key.setFormatosEncabezadoEmpCiudidCiudad(Long.parseLong(values[11]));
            key.setFormatosEncabezadoEmpCiudDepidDepartamento(Long.parseLong(values[12]));
            key.setFormatosEncabezadoEstadoid(Long.parseLong(values[13]));
            return key;
        }

        String getStringKey(com.quimiespel.quimiespel.entidades.FormatosdetallePK value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value.getIdFormatoDetalle());
            sb.append(SEPARATOR);
            sb.append(value.getEstadoMaterialid());
            sb.append(SEPARATOR);
            sb.append(value.getEmbalajesid());
            sb.append(SEPARATOR);
            sb.append(value.getUnidadesid());
            sb.append(SEPARATOR);
            sb.append(value.getFormatosEncabezadoid());
            sb.append(SEPARATOR);
            sb.append(value.getFormatosEncabezadoTipoFormatoid());
            sb.append(SEPARATOR);
            sb.append(value.getFormatosEncabezadoCIIUid());
            sb.append(SEPARATOR);
            sb.append(value.getFormatosEncabezadoEmpleadosid());
            sb.append(SEPARATOR);
            sb.append(value.getFormatosEncabezadoEmpCargosid());
            sb.append(SEPARATOR);
            sb.append(value.getFormatosEncabezadoEmpTipoDocumentoid());
            sb.append(SEPARATOR);
            sb.append(value.getFormatosEncabezadoEmpAreasid());
            sb.append(SEPARATOR);
            sb.append(value.getFormatosEncabezadoEmpCiudidCiudad());
            sb.append(SEPARATOR);
            sb.append(value.getFormatosEncabezadoEmpCiudDepidDepartamento());
            sb.append(SEPARATOR);
            sb.append(value.getFormatosEncabezadoEstadoid());
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Formatosdetalle) {
                Formatosdetalle o = (Formatosdetalle) object;
                return getStringKey(o.getFormatosdetallePK());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Formatosdetalle.class.getName()});
                return null;
            }
        }

    }

}
