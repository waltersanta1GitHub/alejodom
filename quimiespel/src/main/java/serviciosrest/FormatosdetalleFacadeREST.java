/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosrest;

import com.quimiespel.quimiespel.entidades.Formatosdetalle;
import com.quimiespel.quimiespel.entidades.FormatosdetallePK;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.PathSegment;

/**
 *
 * @author jose.santamaria
 */
@Stateless
@Path("formatosdetalles")
public class FormatosdetalleFacadeREST extends AbstractFacade<Formatosdetalle> {

    @PersistenceContext(unitName = "com.quimiespel_quimiespel_war_1.0PU")
    private EntityManager em;

    private FormatosdetallePK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;idFormatoDetalle=idFormatoDetalleValue;estadoMaterialid=estadoMaterialidValue;embalajesid=embalajesidValue;unidadesid=unidadesidValue;formatosEncabezadoid=formatosEncabezadoidValue;formatosEncabezadoTipoFormatoid=formatosEncabezadoTipoFormatoidValue;formatosEncabezadoCIIUid=formatosEncabezadoCIIUidValue;formatosEncabezadoEmpleadosid=formatosEncabezadoEmpleadosidValue;formatosEncabezadoEmpCargosid=formatosEncabezadoEmpCargosidValue;formatosEncabezadoEmpTipoDocumentoid=formatosEncabezadoEmpTipoDocumentoidValue;formatosEncabezadoEmpAreasid=formatosEncabezadoEmpAreasidValue;formatosEncabezadoEmpCiudidCiudad=formatosEncabezadoEmpCiudidCiudadValue;formatosEncabezadoEmpCiudDepidDepartamento=formatosEncabezadoEmpCiudDepidDepartamentoValue;formatosEncabezadoEstadoid=formatosEncabezadoEstadoidValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        com.quimiespel.quimiespel.entidades.FormatosdetallePK key = new com.quimiespel.quimiespel.entidades.FormatosdetallePK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> idFormatoDetalle = map.get("idFormatoDetalle");
        if (idFormatoDetalle != null && !idFormatoDetalle.isEmpty()) {
            key.setIdFormatoDetalle(new java.lang.Long(idFormatoDetalle.get(0)));
        }
        java.util.List<String> estadoMaterialid = map.get("estadoMaterialid");
        if (estadoMaterialid != null && !estadoMaterialid.isEmpty()) {
            key.setEstadoMaterialid(new java.lang.Long(estadoMaterialid.get(0)));
        }
        java.util.List<String> embalajesid = map.get("embalajesid");
        if (embalajesid != null && !embalajesid.isEmpty()) {
            key.setEmbalajesid(new java.lang.Long(embalajesid.get(0)));
        }
        java.util.List<String> unidadesid = map.get("unidadesid");
        if (unidadesid != null && !unidadesid.isEmpty()) {
            key.setUnidadesid(new java.lang.Long(unidadesid.get(0)));
        }
        java.util.List<String> formatosEncabezadoid = map.get("formatosEncabezadoid");
        if (formatosEncabezadoid != null && !formatosEncabezadoid.isEmpty()) {
            key.setFormatosEncabezadoid(new java.lang.Long(formatosEncabezadoid.get(0)));
        }
        java.util.List<String> formatosEncabezadoTipoFormatoid = map.get("formatosEncabezadoTipoFormatoid");
        if (formatosEncabezadoTipoFormatoid != null && !formatosEncabezadoTipoFormatoid.isEmpty()) {
            key.setFormatosEncabezadoTipoFormatoid(new java.lang.Long(formatosEncabezadoTipoFormatoid.get(0)));
        }
        java.util.List<String> formatosEncabezadoCIIUid = map.get("formatosEncabezadoCIIUid");
        if (formatosEncabezadoCIIUid != null && !formatosEncabezadoCIIUid.isEmpty()) {
            key.setFormatosEncabezadoCIIUid(new java.lang.Long(formatosEncabezadoCIIUid.get(0)));
        }
        java.util.List<String> formatosEncabezadoEmpleadosid = map.get("formatosEncabezadoEmpleadosid");
        if (formatosEncabezadoEmpleadosid != null && !formatosEncabezadoEmpleadosid.isEmpty()) {
            key.setFormatosEncabezadoEmpleadosid(new java.lang.Long(formatosEncabezadoEmpleadosid.get(0)));
        }
        java.util.List<String> formatosEncabezadoEmpCargosid = map.get("formatosEncabezadoEmpCargosid");
        if (formatosEncabezadoEmpCargosid != null && !formatosEncabezadoEmpCargosid.isEmpty()) {
            key.setFormatosEncabezadoEmpCargosid(new java.lang.Long(formatosEncabezadoEmpCargosid.get(0)));
        }
        java.util.List<String> formatosEncabezadoEmpTipoDocumentoid = map.get("formatosEncabezadoEmpTipoDocumentoid");
        if (formatosEncabezadoEmpTipoDocumentoid != null && !formatosEncabezadoEmpTipoDocumentoid.isEmpty()) {
            key.setFormatosEncabezadoEmpTipoDocumentoid(new java.lang.Long(formatosEncabezadoEmpTipoDocumentoid.get(0)));
        }
        java.util.List<String> formatosEncabezadoEmpAreasid = map.get("formatosEncabezadoEmpAreasid");
        if (formatosEncabezadoEmpAreasid != null && !formatosEncabezadoEmpAreasid.isEmpty()) {
            key.setFormatosEncabezadoEmpAreasid(new java.lang.Long(formatosEncabezadoEmpAreasid.get(0)));
        }
        java.util.List<String> formatosEncabezadoEmpCiudidCiudad = map.get("formatosEncabezadoEmpCiudidCiudad");
        if (formatosEncabezadoEmpCiudidCiudad != null && !formatosEncabezadoEmpCiudidCiudad.isEmpty()) {
            key.setFormatosEncabezadoEmpCiudidCiudad(new java.lang.Long(formatosEncabezadoEmpCiudidCiudad.get(0)));
        }
        java.util.List<String> formatosEncabezadoEmpCiudDepidDepartamento = map.get("formatosEncabezadoEmpCiudDepidDepartamento");
        if (formatosEncabezadoEmpCiudDepidDepartamento != null && !formatosEncabezadoEmpCiudDepidDepartamento.isEmpty()) {
            key.setFormatosEncabezadoEmpCiudDepidDepartamento(new java.lang.Long(formatosEncabezadoEmpCiudDepidDepartamento.get(0)));
        }
        java.util.List<String> formatosEncabezadoEstadoid = map.get("formatosEncabezadoEstadoid");
        if (formatosEncabezadoEstadoid != null && !formatosEncabezadoEstadoid.isEmpty()) {
            key.setFormatosEncabezadoEstadoid(new java.lang.Long(formatosEncabezadoEstadoid.get(0)));
        }
        return key;
    }

    public FormatosdetalleFacadeREST() {
        super(Formatosdetalle.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Formatosdetalle entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") PathSegment id, Formatosdetalle entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        com.quimiespel.quimiespel.entidades.FormatosdetallePK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Formatosdetalle find(@PathParam("id") PathSegment id) {
        com.quimiespel.quimiespel.entidades.FormatosdetallePK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Formatosdetalle> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Formatosdetalle> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
