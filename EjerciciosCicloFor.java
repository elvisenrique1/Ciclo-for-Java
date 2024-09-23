package ejerciciosciclofor;

import java.util.Scanner;

/**
 *
 * @author elvis
 */
public class EjerciciosCicloFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Imprimir los números del 1 al 10, sin imprimir números 2, 5 y 9, uno abajo del otro.
        */
        
        /*
        Imprimir los números del 1 al 30 sin imprimir números entre el 10 y el 20 uno abajo del otro
        */
        
        /*
        Imprimir los números del 1 al 10 salteando de a dos, uno abajo del otro.

        Imprimir los números del 10 al 1, uno abajo del otro.
        
        Imprimir la suma de los números impares del 1 al 10.
        */
        
        /*
        Una persona desea invertir $1000 en un banco, el cual le otorga un 2% de interés mensual ¿Cuál
        será la cantidad de dinero que esta persona tendrá al cabo de un año?
        En el primer mes tendrá acumulado 1000 $ más 20 $ de interés ( 2% de 1000 ). En el segundo
        mes se le sumará un 2% a la base de 1020 $ del mes anterior y así sucesivamente. 
        */

        /*
        Crear un programa que ingrese una oración y muestre cuál es el carácter que más se repite.
        Consideraciones
        * No debe incluir el espacio en blanco.
        * La oración a ingresar no debe estar vacía.
        */
        
        System.out.println("*** Ciclo For ***");
        
        System.out.println("\n*.- Ejercicio 1 -.*");        
        System.out.println("*.- Imprimir los números del 1 al 10, sin imprimir números 2, 5 y 9, uno abajo del otro. -.*");
        for(int i = 1; i <= 10; i++){
            if(i != 2 && i != 5 && i != 9)                
             System.out.println(i);
        }
        
        System.out.println("\n*.- Ejercicio 2 -.*");
        System.out.println("*.- Imprimir los números del 1 al 30 sin imprimir números entre el 10 y el 20 uno abajo del otro -.*");
        for(int j = 1; j <= 30; j++){
            if(j <= 10 || j>=20)
                System.out.println(j);
        }
        
        System.out.println("\n*.- Ejercicio 3 -.*");
        System.out.println("*.- Imprimir los números del 1 al 10 salteando de a dos, uno abajo del otro. -.*");
        for(int k = 1; k <= 10; k+=2){
            System.out.println(k);
        }
        
        System.out.println("\n *.- Ejercicio 4 -.*");
        System.out.println("*.- Imprimir los números del 10 al 1, uno abajo del otro. -.*");
        for(int l = 10; l >= 1; l--){
            System.out.println(l);
        }
        
        System.out.println("\n *.- Ejercicio 5 -.*");
        System.out.println("Imprimir la suma de los números impares del 1 al 10.");
        int sumaTotalImpares = 0;
        for(int num = 1; num <= 10; num+= 2){
                //System.out.println("(sumaTotalImpares + num)-> " + sumaTotalImpares + " + " + num);
                sumaTotalImpares += num;
                System.out.println("Suma total impares: " + sumaTotalImpares);            
        }
        
        /*
        Una persona desea invertir $1000 en un banco, el cual le otorga un 2% de interés mensual ¿Cuál
        será la cantidad de dinero que esta persona tendrá al cabo de un año?
        En el primer mes tendrá acumulado 1000 $ más 20 $ de interés ( 2% de 1000 ). En el segundo
        mes se le sumará un 2% a la base de 1020 $ del mes anterior y así sucesivamente.
        */
        
        System.out.println("\n *.- Ejercicio 6 -.*");
        float dineroInicial = 1000;
        float dineroFinal;
        float tasaInteresMensual = 0.02f;
        float interesMensual;        
        int meses = 12;
        
        for(int mes = 1; mes <= meses; mes++){
            interesMensual = dineroInicial * tasaInteresMensual;
            dineroFinal = dineroInicial + interesMensual;
            dineroInicial = dineroFinal;
                
            System.out.println("Total cantidad de dinero por mes: " + dineroFinal);
            
        }
        
        /*
        Crear un programa que ingrese una oración y muestre cuál es el carácter que más se repite.
        Consideraciones
        * No debe incluir el espacio en blanco.
        * La oración a ingresar no debe estar vacía.
        */
        
        System.out.println("\n *.- Ejercicio 7 -.*");       
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("*.- Ingresa una oración y muestra cual es el caracter que más se repite: ");
        String oracion = teclado.nextLine();
        // Tu conclusión es buena, pero la oración final es demasiado larga y complicada.
        
        System.out.print("\nIngrese el caracter a verificar el nro. de repeticiones: ");
        char caracter = teclado.next().charAt(0);
        
        int cantCaracter = 0;
        
        for (int i = 0; i < oracion.length(); i++) {
            if(oracion.charAt(i) == caracter){
                cantCaracter++;
            }            
        }
        
        System.out.println("\n*.- El caracter \"" +caracter+ "\" se repite "+cantCaracter+" en la oracion: \"" +oracion+"\"");
                
    }
    
}
