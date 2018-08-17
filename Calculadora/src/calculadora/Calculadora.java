/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import calculadora.CalculadoraAritmetica;
import calculadora.CalculadoraTrigonometrica;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CalculadoraAritmetica micalculadora;  
        CalculadoraTrigonometrica calculadorapro;
        calculadorapro=new CalculadoraTrigonometrica();
        micalculadora = new CalculadoraAritmetica();
        Scanner capt = new Scanner(System.in);
        System.out.println("seleccione el tipo de operaciones que quiere: \n 1.aritmeticas  \n 2.trigonometricas \n 3. conversion  ");
     
        
        System.out.println("selecciono operciones aritmeticas : \n 1.sumar  \n 2.restar \n 3. multiplicar \n 4. dividir");

        int opcion = capt.nextInt();
        switch (opcion) {
            case 1:
                 System.out.println("primer numero ");
            int a = capt.nextInt();
        System.out.println("segundo numero ");
        int b = capt.nextInt();
                micalculadora.operando1 = a;
                micalculadora.operando2 = b;    
                System.out.println(micalculadora.sumar());

                break;
            case 2:
                 System.out.println("primer numero ");
        int a = capt.nextInt();
        System.out.println("segundo numero ");
        int b = capt.nextInt();
                micalculadora.operando1 = a;
                micalculadora.operando2 = b;
                System.out.println(micalculadora.restar());
                break;
            case 3:
              
                micalculadora.operando1 = a;
                micalculadora.operando2 = b;
                System.out.println(micalculadora.multiplicar());
                break;
            case 4:
                micalculadora.operando1 = a;
                micalculadora.operando2 = b;
                System.out.println(micalculadora.dividir());
                break;
            default:
                System.out.println(" escoja una opcion");

        }
   
              
              }
}
