/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultora;

import java.util.Scanner;

/**
 *
 * @author blacktiger
 */
public class Consultora {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        Institucion i1 = new Institucion();       
        Institucion i2 = new Institucion();
       
       System.out.println("Codigo: ");
       i1.setCodigo(sc.nextInt());       
       System.out.println("nombre: ");
       i1.setNombre(sc.next());       
       System.out.println("tipo: (institucion/universidad) ");
       i1.setTipo(sc.next());       
       System.out.println("año: ");
       i1.setAnno(sc.nextInt());
       System.out.println("valor: ");
       i1.setValorA(sc.nextInt());
       
      
       
       System.out.println("Codigo: ");
       i2.setCodigo(sc.nextInt());       
       System.out.println("nombre: ");
       i2.setNombre(sc.next());       
       System.out.println("tipo: (institucion/universidad) ");
       i2.setTipo(sc.next());       
       System.out.println("año: ");
       i2.setAnno(sc.nextInt());
       System.out.println("valor: ");
       i2.setValorA(sc.nextInt());         
        
     
        
        //llamar al arbol
        
        Arbol arbol = new Arbol();        
        Nodo n1 = new Nodo(i1);//Nodo(i1.getCodigo()+" "+ i1.getAnno()+" "+i1.getNombre());
        Nodo n2 = new Nodo(i2);//Nodo(i2.getCodigo()+" "+ i2.getAnno()+" "+i2.getNombre());
        
        arbol.setRaiz(n1);
        n1.setNodoIz(n2);
        
        arbol.postOrden(n1);
        
        System.out.println("***** PILA ******");
        arbol.prueba();
        
        System.out.println("***** LISTA ******");
        arbol.obtenerLista();
        
        
        
    }
    
}
