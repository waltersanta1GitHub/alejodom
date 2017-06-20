/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosrest;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author jose.santamaria
 */
@javax.ws.rs.ApplicationPath("v1")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(serviciosrest.AreasFacadeREST.class);
        resources.add(serviciosrest.CargosFacadeREST.class);
        resources.add(serviciosrest.CiiuFacadeREST.class);
        resources.add(serviciosrest.CiudadesFacadeREST.class);
        resources.add(serviciosrest.CrossOriginResourceSharingFilter.class);
        resources.add(serviciosrest.DepartamentoFacadeREST.class);
        resources.add(serviciosrest.DocumentosadjuntosFacadeREST.class);
        resources.add(serviciosrest.EmbalajesFacadeREST.class);
        resources.add(serviciosrest.EmpleadosFacadeREST.class);
        resources.add(serviciosrest.EstadoFacadeREST.class);
        resources.add(serviciosrest.EstadomaterialFacadeREST.class);
        resources.add(serviciosrest.FormatosdetalleFacadeREST.class);
        resources.add(serviciosrest.FormatosencabezadoFacadeREST.class);
        resources.add(serviciosrest.TipodocumentoFacadeREST.class);
        resources.add(serviciosrest.TipoformatoFacadeREST.class);
        resources.add(serviciosrest.UnidadesFacadeREST.class);
    }
    
}
