/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Suma;

/**
 *
 * @author Brian
 */
public class Suma { //Declaramos los atributos iniciales
    int n1, n2, resultado ;
   
public Suma (int a, int b){ //Creamos un constructor para inicializar las variables a y b
    this.n1 = a ;
    this.n2 = b ;
}
public int sumar (){    //creamos un método (nos dará error hasta hacer un return)
    this.resultado = this.n1 + this.n2 ;
    return this.resultado ;
}
public static void main(String[] args) {    //añadimos un main para crear un nuevo objeto
   Suma suma1 = new Suma(50,30) ;           // y más adelante proyectarlo en pantalla.
    int resultado = suma1.sumar() ;
    System.out.println("La suma es: "+resultado);  
    System.out.println("Este es el segundo cambio");
    System.out.println("Segundo cambio");
}
}
