package com.quimiespel.quimiespel.controladores;

import com.quimiespel.quimiespel.entidades.Empleados;
import com.quimiespel.quimiespel.controladores.util.JsfUtil;
import com.quimiespel.quimiespel.controladores.util.JsfUtil.PersistAction;
import com.quimiespel.quimiespel.fachadas.EmpleadosFacade;

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

@Named("empleadosController")
@SessionScoped
public class EmpleadosController implements Serializable {

    @EJB
    private com.quimiespel.quimiespel.fachadas.EmpleadosFacade ejbFacade;
    private List<Empleados> items = null;
    private Empleados selected;

    public EmpleadosController() {
    }

    public Empleados getSelected() {
        return selected;
    }

    public void setSelected(Empleados selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
        selected.getEmpleadosPK().setCargosid(selected.getCargos().getIdCargo());
        selected.getEmpleadosPK().setTipoDocumentoid(selected.getTipodocumento().getId());
        selected.getEmpleadosPK().setAreasid(selected.getAreas().getId());
        selected.getEmpleadosPK().setCiudadesidCiudad(selected.getCiudades().getCiudadesPK().getIdCiudad());
        selected.getEmpleadosPK().setCiudadesDepartamentoidDepartamento(selected.getCiudades().getCiudadesPK().getDepartamentoidDepartamento());
    }

    protected void initializeEmbeddableKey() {
        selected.setEmpleadosPK(new com.quimiespel.quimiespel.entidades.EmpleadosPK());
    }

    private EmpleadosFacade getFacade() {
        return ejbFacade;
    }

    public Empleados prepareCreate() {
        selected = new Empleados();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("EmpleadosCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("EmpleadosUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("EmpleadosDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<Empleados> getItems() {
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

    public Empleados getEmpleados(com.quimiespel.quimiespel.entidades.EmpleadosPK id) {
        return getFacade().find(id);
    }

    public List<Empleados> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<Empleados> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = Empleados.class)
    public static class EmpleadosControllerConverter implements Converter {

        private static final String SEPARATOR = "#";
        private static final String SEPARATOR_ESCAPED = "\\#";

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            EmpleadosController controller = (EmpleadosController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "empleadosController");
            return controller.getEmpleados(getKey(value));
        }

        com.quimiespel.quimiespel.entidades.EmpleadosPK getKey(String value) {
            com.quimiespel.quimiespel.entidades.EmpleadosPK key;
            String values[] = value.split(SEPARATOR_ESCAPED);
            key = new com.quimiespel.quimiespel.entidades.EmpleadosPK();
            key.setId(Long.parseLong(values[0]));
            key.setCargosid(Long.parseLong(values[1]));
            key.setTipoDocumentoid(Long.parseLong(values[2]));
            key.setAreasid(Long.parseLong(values[3]));
            key.setCiudadesidCiudad(Long.parseLong(values[4]));
            key.setCiudadesDepartamentoidDepartamento(Long.parseLong(values[5]));
            return key;
        }

        String getStringKey(com.quimiespel.quimiespel.entidades.EmpleadosPK value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value.getId());
            sb.append(SEPARATOR);
            sb.append(value.getCargosid());
            sb.append(SEPARATOR);
            sb.append(value.getTipoDocumentoid());
            sb.append(SEPARATOR);
            sb.append(value.getAreasid());
            sb.append(SEPARATOR);
            sb.append(value.getCiudadesidCiudad());
            sb.append(SEPARATOR);
            sb.append(value.getCiudadesDepartamentoidDepartamento());
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Empleados) {
                Empleados o = (Empleados) object;
                return getStringKey(o.getEmpleadosPK());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Empleados.class.getName()});
                return null;
            }
        }

    }

}
