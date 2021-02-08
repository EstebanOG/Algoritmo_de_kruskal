/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kruskal.Vista;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import logica.ParejasAristas;
import logica.colaDePrioridad.ColaDePrioridad;

/**
 *
 * @author Usuario
 */
public class PanelResultados extends JPanel{
    private ArrayList<ParejasAristas> parejasDeAristas = new ArrayList<>();
    public  PanelResultados(){
        setLayout(null);
        setBounds(12,558,1082,281);
        setBorder(new LineBorder(Color.BLACK));
        setVisible(true);
    }
    
    public void colaPrioridad(){
        ColaDePrioridad  cp = new ColaDePrioridad(100);
        parejasDeAristas.forEach((pa) -> {
            cp.insertar(pa);
        });
//        cp.insertar(6);
//        cp.insertar(7);
//        cp.insertar(5);
//        cp.insertar(1);
//        cp.insertar(4);
//        cp.insertar(3);
//        cp.insertar(1);
        cp.mostrarColaPrioridad();
    }

    public void setParejasDeAristas(ArrayList<ParejasAristas> parejasDeAristas) {
        this.parejasDeAristas = parejasDeAristas;
    }
}
