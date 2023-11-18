 
package org.web.modelo;

import javax.persistence.EntityManager;
import org.web.entidad.Producto;
import org.web.interfaces.iVentas;
import org.web.servicio.Conectar;

public class ProductoImpl implements iVentas<Producto>{
    private EntityManager entityManager(){
    return Conectar.getConectar().getEmf().createEntityManager();
    }
     EntityManager em = entityManager();
    @Override
    public String Registrar(Producto producto) {
             String Resultado;
            try {
            em.getTransaction().begin();
            em.persist(producto);
            em.getTransaction().commit();
            Resultado = "Cliente Registrado";
        } catch (Exception e) {
            em.getTransaction().rollback();
            Resultado = "Error"+e.getMessage();
        }     
        return Resultado;
    }
}
