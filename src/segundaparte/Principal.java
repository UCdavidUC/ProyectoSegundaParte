/*
 * Clase Principal: Esta clase lee el archivo que contiene la gramática, una vez
 * leido realiza las operaciones necesarias para construir el árbol de deriva-
 * ción correcto.
 */
package segundaparte;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alejandra Martínez Cuevas
 * @author David Sánchez Almanza
 * @version 1.0.0
 */
public class Principal {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        System.out.println("Análisis Sintáctico Descendente");
        System.out.println("1. Introduzca una gramática contenida en un archivo de texto.");
        System.out.println("2. Introduzca una gramática contenida en un archivo de texto.");
        Scanner in = new Scanner(System.in);
        int opcion = in.nextInt();
        switch (opcion) {
            case 1: 
            break;
            case 2:
            break;
            default:
            break;
        }
                
        FileReader fileReader = new FileReader("src/segundaparte/archivoprueba.txt");
        BufferedReader br = new BufferedReader(fileReader);
        //Lee todas las producciones
        String primeraLinea = br.readLine();
        ArrayList<Character> list = new ArrayList<Character>();
        char[] c = new char[primeraLinea.length()];
        System.out.println(primeraLinea + ' ' + primeraLinea.length());
        for (int i = 0; i < primeraLinea.length(); i++) {
            c[i] = primeraLinea.charAt(i);
            list.add(c[i]);
            System.out.println(c[i]);
        }
        Cadena cadenaTerminal = new Cadena(list);
        cadenaTerminal.print();
        String cadena;
        while((cadena = br.readLine()) != null) {
            ArrayList<Character> lista = new ArrayList<>();
            for(int i = 0; i < cadena.length(); i++) {
                c[i] = cadena.charAt(i);
                lista.add(c[i]);
            }
            System.out.println(lista);
        }
        //Una vez guardadas inicia el analsis sintáctico descendente
        //Se busca que una vez construida la cadena se almacene en un nodo
        //para hacer los pasos recursivos, se pone una condicion para el primer
        //simbolo no terminal de la cadena, el cual se sustituye por cada una
        //de las producciones correspondientes, esto se puede hacer gracias a 
        //que en las clase produccion existe un simbolo no terminal con el cual
        //se compara el primer no terminal de la cadena con la cual estamos
        //trabajando.
    }
}
