/*
 * Clase Cadena: Esta clase representa cadenas de Simbolos tanto terminales como
 * no terminales que serán utilizados para construir las producciones, la clase
 * utiliza un ArrayList<Simbolo> para hacer una lista de Simbolos que represen-
 * ta la cadena.
 */
package segundaparte;

import java.util.ArrayList;

/**
 *
 * @author Alejandra Martínez Cuevas
 * @author David Sánchez Almanza
 * @version 1.0.0
 */
public class Cadena {
    
    private ArrayList<Character> cadena;
    
    public Cadena() {
        
    }
    
    public Cadena(ArrayList<Character> cadena) {
        this.cadena = cadena;
    }
    
    public ArrayList<Character> getCadena() {
        return cadena;
    }
    public void setCadena(ArrayList<Character> c) {
        cadena = c;
    }
    
    public void addSimbolo(char c) {
        cadena.add(c);
    }
    
    public void print () {
        System.out.println(cadena);
    }
}
