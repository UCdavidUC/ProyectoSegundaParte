/*
 * Clase Nodo: Esta clase representa el nodo del árbol de derivavión, cada nodo
 * tiene una una cadena de caracteres terminales y no terminales y una lista
 * de nodos hijos ya que no lo podemos considera como binario, debido a que 
 * cada Simbolo no terminal puede producir más de dos cadenas.
 */
package segundaparte;

import java.util.ArrayList;

/**
 * 
 * @author Alejandra Martínez Cuevas
 * @author David Sánchez Almanza
 * @version 1.0.0
 */
public class Nodo {
    
    private Cadena cadena;
    private ArrayList<Nodo> hijos;
    
    public Nodo () {
        
    }
    
    public Nodo (Cadena cadena, ArrayList<Nodo> hijos) {
        this.cadena = cadena;
        this.hijos = hijos;
    }
    
    public Cadena getCadena() {
        return cadena;
    }
    public void setCadena(Cadena c) {
        cadena = c;
    }
    public ArrayList<Nodo> getHijos() {
        return hijos;
    }
    public void setHijos(ArrayList<Nodo> h) {
        hijos = h;
    }
    
    public void addSon(Nodo n) {
        hijos.add(n);
    }
    
    public void printNodo() {
        System.out.println(cadena);
    }
    
}
