/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundaparte;

import java.util.ArrayList;

/**
 *
 * @author Alejandra Martínez Cuevas
 * @author David Sánchez Almanza
 */
public class Arbol {
    
    private ArrayList<Nodo> arbol;
    
    public Arbol () {
        
    }
    public Arbol (ArrayList<Nodo> arbol) {
        this.arbol = arbol;
    }
    
    public ArrayList<Nodo> getArbol() {
        return arbol;
    }
    public void setArbol(ArrayList<Nodo> a) {
        arbol = a;
    }
    
    public void agregaHijos(Nodo raiz, ArrayList<Produccion> producciones) {
        
    }
    
}
