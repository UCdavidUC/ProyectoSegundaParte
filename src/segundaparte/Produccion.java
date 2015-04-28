/*
 * Clase Produccion: Esta clase permite representar una produccion de una gramá-
 * tica, el constructor tiene un Símbolo no terminal y la cadena que produce.
 */
package segundaparte;

/**
 *
 * @author Alejandra Martínez Cuevas
 * @author David Sánchez Almanza
 * @version 1.0.0
 */
public class Produccion {
    
    private char simboloNoTerminal;
    private Cadena cadena;
    
    public Produccion(){
        
    }
    public Produccion(char simboloNoTerminal, Cadena cadena) {
        this.simboloNoTerminal = simboloNoTerminal;
        this.cadena = cadena;
    }
    
    public char getNoTerminal() {
        return simboloNoTerminal;
    }
    public void setNoTerminal (char sim) {
        simboloNoTerminal = sim;
    }
    public Cadena getCadena() {
        return cadena;
    }
    public void setCadena (Cadena c) {
        cadena = c;
    }
        
    public void print() {
        System.out.print(simboloNoTerminal + " -> " + cadena);
    }
    
}
