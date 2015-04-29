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
        System.out.println("1. Introduzca una gramática contenida en un archivo de texto");
        System.out.println("2. Usar el archivo contenido en la aplicación");
        Scanner in = new Scanner(System.in);
        int opcion = in.nextInt();
        boolean valido = false;
        FileReader fileReader = new FileReader("src/segundaparte/archivoprueba.txt");
        BufferedReader br = new BufferedReader(fileReader);
        while (valido == false)
            if (opcion == 1) {
                System.out.print("Nombre del archivo: ");
                String path = in.nextLine();
                String filePath = '"' + path + '"';
                fileReader = new FileReader(filePath);
                br = new BufferedReader(fileReader);
                valido = true;
            } else {
                if (opcion == 2) {
                    fileReader = new FileReader("src/segundaparte/archivoprueba.txt");
                    br = new BufferedReader(fileReader);
                    valido = true;
                } else {
                    System.out.println("La opcion introducida no es valida, intende de nuevo");
                }
            }
        String primeraLinea = br.readLine();
        ArrayList<Character> list = new ArrayList<>();
        char[] c = new char[primeraLinea.length()];
        System.out.println(primeraLinea + ' ' + primeraLinea.length());
        for (int i = 0; i < primeraLinea.length(); i++) {
            c[i] = primeraLinea.charAt(i);
            list.add(c[i]);
        }
        Cadena cadenaTerminal = new Cadena(list);
        cadenaTerminal.print();
        ArrayList<Produccion> producciones = new ArrayList<>();
        String cadena;
        while((cadena = br.readLine()) != null) {
            ArrayList<Character> produccion = new ArrayList<>();
            char k[] = new char[cadena.length()];
            for(int i = 0; i < cadena.length(); i++) {
                k[i] = cadena.charAt(i);
                if (k[i] != '-' && k[i] != '>') {
                    produccion.add(k[i]);
                }
            }
            ArrayList<Character> produccion2 = new ArrayList<>();
            ArrayList<Character> produccion3 = new ArrayList<>();
            int marcadorDelete = 0;
            int count = 0;
            for(int i = 0; i < produccion.size(); i++) {                
                if(produccion.get(i) == '|' && count == 0) {
                    produccion.remove(i);
                    produccion2.add(produccion.get(0));
                    marcadorDelete = i;
                    count++;
                } else {
                    if(produccion .get(i) == '|' && count == 1) {
                        produccion.remove(i);
                        produccion3.add(produccion.get(0));
                        count++;
                    }
                }
                if(count == 1) {
                    produccion2.add(produccion.get(i));
                }
                if (count == 2) {
                    produccion3.add(produccion.get(i));
                }
            }
            for (int i = marcadorDelete; i < produccion.size(); i++) {
                produccion.remove(i);
                i = i - 1;
            }
            Cadena cad = new Cadena(produccion);
            Produccion p = new Produccion(k[1], cad);
            producciones.add(p);
            if(produccion2.size() > 0) {
                Cadena cad2 = new Cadena(produccion2);
                Produccion p2 = new Produccion(k[1], cad2);
                producciones.add(p2);
            }
            if(produccion3.size() > 0) {
                Cadena cad3 = new Cadena(produccion3);
                Produccion p3 = new Produccion(k[1], cad3);
                producciones.add(p3);
            }
        }
        for(int i = 0; i < producciones.size(); i++) {
            System.out.println(producciones.get(i));
        }
        ArrayList<Character> cadenaNodoInicial = new ArrayList<>();
        cadenaNodoInicial.add('S');
        Cadena cadenaRaiz = new Cadena(cadenaNodoInicial);
        Nodo raiz = new Nodo();
        
        Arbol arbol = new Arbol();
        
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
