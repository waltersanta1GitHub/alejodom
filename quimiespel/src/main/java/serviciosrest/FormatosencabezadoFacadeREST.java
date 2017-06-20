/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosrest;

import com.quimiespel.quimiespel.entidades.Formatosencabezado;
import com.quimiespel.quimiespel.entidades.FormatosencabezadoPK;
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
@Path("formatosencabezados")
public class FormatosencabezadoFacadeREST extends AbstractFacade<Formatosencabezado> {

    @PersistenceContext(unitName = "com.quimiespel_quimiespel_war_1.0PU")
    private EntityManager em;

    private FormatosencabezadoPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;id=idValue;tipoFormatoid=tipoFormatoidValue;cIIUid=cIIUidValue;empleadosid=empleadosidValue;empleadosCargosid=empleadosCargosidValue;empleadosTipoDocumentoid=empleadosTipoDocumentoidValue;empleadosAreasid=empleadosAreasidValue;empleadosCiudadesidCiudad=empleadosCiudadesidCiudadValue;empleadosCiudadesDepartamentoidDepartamento=empleadosCiudadesDepartamentoidDepartamentoValue;estadoid=estadoidValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        com.quimiespel.quimiespel.entidades.FormatosencabezadoPK key = new com.quimiespel.quimiespel.entidades.FormatosencabezadoPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> id = map.get("id");
        if (id != null && !id.isEmpty()) {
            key.setId(new java.lang.Long(id.get(0)));
        }
        java.util.List<String> tipoFormatoid = map.get("tipoFormatoid");
        if (tipoFormatoid != null && !tipoFormatoid.isEmpty()) {
            key.setTipoFormatoid(new java.lang.Long(tipoFormatoid.get(0)));
        }
        java.util.List<String> cIIUid = map.get("cIIUid");
        if (cIIUid != null && !cIIUid.isEmpty()) {
            key.setCIIUid(new java.lang.Long(cIIUid.get(0)));
        }
        java.util.List<String> empleadosid = map.get("empleadosid");
        if (empleadosid != null && !empleadosid.isEmpty()) {
            key.setEmpleadosid(new java.lang.Long(empleadosid.get(0)));
        }
        java.util.List<String> empleadosCargosid = map.get("empleadosCargosid");
        if (empleadosCargosid != null && !empleadosCargosid.isEmpty()) {
            key.setEmpleadosCargosid(new java.lang.Long(empleadosCargosid.get(0)));
        }
        java.util.List<String> empleadosTipoDocumentoid = map.get("empleadosTipoDocumentoid");
        if (empleadosTipoDocumentoid != null && !empleadosTipoDocumentoid.isEmpty()) {
            key.setEmpleadosTipoDocumentoid(new java.lang.Long(empleadosTipoDocumentoid.get(0)));
        }
        java.util.List<String> empleadosAreasid = map.get("empleadosAreasid");
        if (empleadosAreasid != null && !empleadosAreasid.isEmpty()) {
            key.setEmpleadosAreasid(new java.lang.Long(empleadosAreasid.get(0)));
        }
        java.util.List<String> empleadosCiudadesidCiudad = map.get("empleadosCiudadesidCiudad");
        if (empleadosCiudadesidCiudad != null && !empleadosCiudadesidCiudad.isEmpty()) {
            key.setEmpleadosCiudadesidCiudad(new java.lang.Long(empleadosCiudadesidCiudad.get(0)));
        }
        java.util.List<String> empleadosCiudadesDepartamentoidDepartamento = map.get("empleadosCiudadesDepartamentoidDepartamento");
        if (empleadosCiudadesDepartamentoidDepartamento != null && !empleadosCiudadesDepartamentoidDepartamento.isEmpty()) {
            key.setEmpleadosCiudadesDepartamentoidDepartamento(new java.lang.Long(empleadosCiudadesDepartamentoidDepartamento.get(0)));
        }
        java.util.List<String> estadoid = map.get("estadoid");
        if (estadoid != null && !estadoid.isEmpty()) {
            key.setEstadoid(new java.lang.Long(estadoid.get(0)));
        }
        return key;
    }

    public FormatosencabezadoFacadeREST() {
        super(Formatosencabezado.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Formatosencabezado entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") PathSegment id, Formatosencabezado entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        com.quimiespel.quimiespel.entidades.FormatosencabezadoPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Formatosencabezado find(@PathParam("id") PathSegment id) {
        com.quimiespel.quimiespel.entidades.FormatosencabezadoPK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Formatosencabezado> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Formatosencabezado> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
