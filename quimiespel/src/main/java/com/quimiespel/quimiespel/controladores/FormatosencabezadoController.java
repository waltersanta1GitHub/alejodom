package com.quimiespel.quimiespel.controladores;

import com.quimiespel.quimiespel.entidades.Formatosencabezado;
import com.quimiespel.quimiespel.controladores.util.JsfUtil;
import com.quimiespel.quimiespel.controladores.util.JsfUtil.PersistAction;
import com.quimiespel.quimiespel.fachadas.FormatosencabezadoFacade;

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

@Named("formatosencabezadoController")
@SessionScoped
public class FormatosencabezadoController implements Serializable {

    @EJB
    private com.quimiespel.quimiespel.fachadas.FormatosencabezadoFacade ejbFacade;
    private List<Formatosencabezado> items = null;
    private Formatosencabezado selected;

    public FormatosencabezadoController() {
    }

    public Formatosencabezado getSelected() {
        return selected;
    }

    public void setSelected(Formatosencabezado selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
        selected.getFormatosencabezadoPK().setTipoFormatoid(selected.getTipoformato().getIdTipoFormato());
        selected.getFormatosencabezadoPK().setEmpleadosAreasid(selected.getEmpleados().getEmpleadosPK().getAreasid());
        selected.getFormatosencabezadoPK().setEmpleadosCargosid(selected.getEmpleados().getEmpleadosPK().getCargosid());
        selected.getFormatosencabezadoPK().setEmpleadosCiudadesDepartamentoidDepartamento(selected.getEmpleados().getEmpleadosPK().getCiudadesDepartamentoidDepartamento());
        selected.getFormatosencabezadoPK().setCIIUid(selected.getCiiu().getId());
        selected.getFormatosencabezadoPK().setEstadoid(selected.getEstado().getId());
        selected.getFormatosencabezadoPK().setEmpleadosid(selected.getEmpleados().getEmpleadosPK().getId());
        selected.getFormatosencabezadoPK().setEmpleadosTipoDocumentoid(selected.getEmpleados().getEmpleadosPK().getTipoDocumentoid());
        selected.getFormatosencabezadoPK().setEmpleadosCiudadesidCiudad(selected.getEmpleados().getEmpleadosPK().getCiudadesidCiudad());
    }

    protected void initializeEmbeddableKey() {
        selected.setFormatosencabezadoPK(new com.quimiespel.quimiespel.entidades.FormatosencabezadoPK());
    }

    private FormatosencabezadoFacade getFacade() {
        return ejbFacade;
    }

    public Formatosencabezado prepareCreate() {
        selected = new Formatosencabezado();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("FormatosencabezadoCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("FormatosencabezadoUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("FormatosencabezadoDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<Formatosencabezado> getItems() {
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

    public Formatosencabezado getFormatosencabezado(com.quimiespel.quimiespel.entidades.FormatosencabezadoPK id) {
        return getFacade().find(id);
    }

    public List<Formatosencabezado> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<Formatosencabezado> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = Formatosencabezado.class)
    public static class FormatosencabezadoControllerConverter implements Converter {

        private static final String SEPARATOR = "#";
        private static final String SEPARATOR_ESCAPED = "\\#";

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            FormatosencabezadoController controller = (FormatosencabezadoController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "formatosencabezadoController");
            return controller.getFormatosencabezado(getKey(value));
        }

        com.quimiespel.quimiespel.entidades.FormatosencabezadoPK getKey(String value) {
            com.quimiespel.quimiespel.entidades.FormatosencabezadoPK key;
            String values[] = value.split(SEPARATOR_ESCAPED);
            key = new com.quimiespel.quimiespel.entidades.FormatosencabezadoPK();
            key.setId(Long.parseLong(values[0]));
            key.setTipoFormatoid(Long.parseLong(values[1]));
            key.setCIIUid(Long.parseLong(values[2]));
            key.setEmpleadosid(Long.parseLong(values[3]));
            key.setEmpleadosCargosid(Long.parseLong(values[4]));
            key.setEmpleadosTipoDocumentoid(Long.parseLong(values[5]));
            key.setEmpleadosAreasid(Long.parseLong(values[6]));
            key.setEmpleadosCiudadesidCiudad(Long.parseLong(values[7]));
            key.setEmpleadosCiudadesDepartamentoidDepartamento(Long.parseLong(values[8]));
            key.setEstadoid(Long.parseLong(values[9]));
            return key;
        }

        String getStringKey(com.quimiespel.quimiespel.entidades.FormatosencabezadoPK value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value.getId());
            sb.append(SEPARATOR);
            sb.append(value.getTipoFormatoid());
            sb.append(SEPARATOR);
            sb.append(value.getCIIUid());
            sb.append(SEPARATOR);
            sb.append(value.getEmpleadosid());
            sb.append(SEPARATOR);
            sb.append(value.getEmpleadosCargosid());
            sb.append(SEPARATOR);
            sb.append(value.getEmpleadosTipoDocumentoid());
            sb.append(SEPARATOR);
            sb.append(value.getEmpleadosAreasid());
            sb.append(SEPARATOR);
            sb.append(value.getEmpleadosCiudadesidCiudad());
            sb.append(SEPARATOR);
            sb.append(value.getEmpleadosCiudadesDepartamentoidDepartamento());
            sb.append(SEPARATOR);
            sb.append(value.getEstadoid());
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Formatosencabezado) {
                Formatosencabezado o = (Formatosencabezado) object;
                return getStringKey(o.getFormatosencabezadoPK());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Formatosencabezado.class.getName()});
                return null;
            }
        }

    }

}
