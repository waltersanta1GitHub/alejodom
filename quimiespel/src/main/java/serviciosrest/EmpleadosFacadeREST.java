/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosrest;

import com.quimiespel.quimiespel.entidades.Empleados;
import com.quimiespel.quimiespel.entidades.EmpleadosPK;
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
@Path("empleados")
public class EmpleadosFacadeREST extends AbstractFacade<Empleados> {

    @PersistenceContext(unitName = "com.quimiespel_quimiespel_war_1.0PU")
    private EntityManager em;

    private EmpleadosPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;id=idValue;cargosid=cargosidValue;tipoDocumentoid=tipoDocumentoidValue;areasid=areasidValue;ciudadesidCiudad=ciudadesidCiudadValue;ciudadesDepartamentoidDepartamento=ciudadesDepartamentoidDepartamentoValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        com.quimiespel.quimiespel.entidades.EmpleadosPK key = new com.quimiespel.quimiespel.entidades.EmpleadosPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> id = map.get("id");
        if (id != null && !id.isEmpty()) {
            key.setId(new java.lang.Long(id.get(0)));
        }
        java.util.List<String> cargosid = map.get("cargosid");
        if (cargosid != null && !cargosid.isEmpty()) {
            key.setCargosid(new java.lang.Long(cargosid.get(0)));
        }
        java.util.List<String> tipoDocumentoid = map.get("tipoDocumentoid");
        if (tipoDocumentoid != null && !tipoDocumentoid.isEmpty()) {
            key.setTipoDocumentoid(new java.lang.Long(tipoDocumentoid.get(0)));
        }
        java.util.List<String> areasid = map.get("areasid");
        if (areasid != null && !areasid.isEmpty()) {
            key.setAreasid(new java.lang.Long(areasid.get(0)));
        }
        java.util.List<String> ciudadesidCiudad = map.get("ciudadesidCiudad");
        if (ciudadesidCiudad != null && !ciudadesidCiudad.isEmpty()) {
            key.setCiudadesidCiudad(new java.lang.Long(ciudadesidCiudad.get(0)));
        }
        java.util.List<String> ciudadesDepartamentoidDepartamento = map.get("ciudadesDepartamentoidDepartamento");
        if (ciudadesDepartamentoidDepartamento != null && !ciudadesDepartamentoidDepartamento.isEmpty()) {
            key.setCiudadesDepartamentoidDepartamento(new java.lang.Long(ciudadesDepartamentoidDepartamento.get(0)));
        }
        return key;
    }

    public EmpleadosFacadeREST() {
        super(Empleados.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Empleados entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") PathSegment id, Empleados entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        com.quimiespel.quimiespel.entidades.EmpleadosPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Empleados find(@PathParam("id") PathSegment id) {
        com.quimiespel.quimiespel.entidades.EmpleadosPK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Empleados> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Empleados> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
