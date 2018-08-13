/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

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
        Scanner capt = new Scanner(System.in);
        micalculadora = new CalculadoraAritmetica();
        System.out.println("primer numero ");
        int a = capt.nextInt();
        System.out.println("segundo numero ");
        int b = capt.nextInt();
        System.out.println("seleciio operciones: \n 1.sumar  \n 2.restar \n 3. multiplicar \n 4. dividir");

        int resultado = capt.nextInt();
        switch (resultado) {
            case 1:
                micalculadora.operando1 = a;
                micalculadora.operando2 = b;
                System.out.println(micalculadora.sumar());

                break;
            case 2:
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
