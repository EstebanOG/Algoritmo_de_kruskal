
import cola.ColaDePrioridad;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class main {
    public static void main(String[] args) {
        ColaDePrioridad  cp = new ColaDePrioridad(100);
        cp.insertar(6);
        cp.insertar(7);
        cp.insertar(5);
        cp.insertar(1);
        cp.insertar(4);
        cp.insertar(3);
        cp.insertar(1);
        
        while(!cp.estaVacia())
            System.out.println(cp.eliminar());
            
    }
}
