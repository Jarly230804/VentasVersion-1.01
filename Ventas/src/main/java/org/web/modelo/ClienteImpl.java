 
package org.web.modelo;

import javax.persistence.EntityManager;
import org.web.entidad.Cliente;
import org.web.interfaces.iVentas;
import org.web.servicio.Conectar;

public class ClienteImpl implements iVentas<Cliente>{
    private EntityManager entityManager(){
    return Conectar.getConectar().getEmf().createEntityManager();
}
     EntityManager em = entityManager();

    @Override
    public String Registrar(Cliente cliente) {
        String Resultado;
            try {
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();
            Resultado = "Cliente Registrado";
        } catch (Exception e) {
            em.getTransaction().rollback();
            Resultado = "Error"+e.getMessage();
        }     
        return Resultado;
    }
}

    

