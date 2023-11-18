  
package org.web.principal;

import java.util.Scanner;
import org.web.entidad.Cliente;
import org.web.entidad.Producto;
import org.web.modelo.ClienteImpl;
import org.web.modelo.ProductoImpl;

 
public class Ventas {

    public static void main(String[] args) {
        System.out.println("Registro de producto");
         try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Elige la operación a realizar:");
            System.out.println("1. Registrar Cliente");
            System.out.println("2. Registrar Producto");
            
            int opcion = scanner.nextInt();
            switch(opcion){
                case 1 -> {
                    ClienteImpl cliente = new ClienteImpl();
                    
                    cliente.Registrar(new Cliente(1,"Juan"));
                }
                case 2 -> {
                    ProductoImpl producto = new ProductoImpl();
                     
                    producto.Registrar(new Producto(opcion, "Detergente Patito", new Cliente(1)));
                    
                }
            }
         }
    }
}
    

