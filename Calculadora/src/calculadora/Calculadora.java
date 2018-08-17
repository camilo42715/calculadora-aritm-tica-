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
        CalculadoraConversion concalculadora;
        concalculadora = new CalculadoraConversion();
        calculadorapro = new CalculadoraTrigonometrica();
        micalculadora = new CalculadoraAritmetica();
        Scanner capt = new Scanner(System.in);
        int operacion;
        int cas;
        double angulonuevo;

        System.out.println("seleccione el tipo de operaciones que quiere: \n 1.aritmeticas  \n 2.trigonometricas \n 3. conversion  ");
        int entrada = capt.nextInt();
        switch (entrada) {
            case 1:
                System.out.println("seleciones la operacin a realizar:  \n 1. Suma \n 2.Resta \n 3.Multiplicar \n 4.Divion");
                operacion = capt.nextInt();
                switch (operacion) {
                    case 1:
                        System.out.println("primer numero ");
                        int a = capt.nextInt();
                        System.out.println("segundo numero ");
                        int b = capt.nextInt();
                        micalculadora.operando1 = a;
                        micalculadora.operando2 = b;
                        System.out.println(micalculadora.sumar());

                    case 2:
                        System.out.println("primer numero ");
                        a = capt.nextInt();
                        System.out.println("segundo numero ");
                        b = capt.nextInt();
                        micalculadora.operando1 = a;
                        micalculadora.operando2 = b;

                        System.out.println(micalculadora.restar());
                    case 3:
                        System.out.println("primer numero ");
                        a = capt.nextInt();
                        System.out.println("segundo numero ");
                        b = capt.nextInt();
                        micalculadora.operando1 = a;
                        micalculadora.operando2 = b;
                        System.out.println(micalculadora.multiplicar());
                    case 4:
                        System.out.println("primer numero ");
                        a = capt.nextInt();
                        System.out.println("segundo numero ");
                        b = capt.nextInt();
                        micalculadora.operando1 = a;
                        micalculadora.operando2 = b;
                        System.out.println(micalculadora.dividir());
                    default:
                        System.out.println(" escoja el tipo de operaciones");
                }

            case 2:
                System.out.println("seleciones la operacin a realizar:  \n 1.seno \n 2.coseno \n 3.tangente");
                cas = capt.nextInt();
                switch (cas) {
                    case 1:
                        System.out.println("ingrese su  angulo");
                        angulonuevo = capt.nextInt();
                        calculadorapro.call = angulonuevo;
                        System.out.println(calculadorapro.seno());
                    case 2:
                        System.out.println("ingrese su  angulo");
                        angulonuevo = capt.nextInt();
                        
                        System.out.println(calculadorapro.coseno());
                    case 3:
                        System.out.println("ingrese su  angulo");
                        angulonuevo = capt.nextInt();
                        calculadorapro.convertir(angulonuevo);
                        calculadorapro.call = angulonuevo;
                        System.out.println(calculadorapro.tangente());
                    default:
                        System.out.println(" escoja el tipo de operaciones");
                }

            case 3: 
                  System.out.println("seleciones el tipo de conversion que quiere realizar  \n 1.masa \n 2.temperatura  \n 3.longitud");
                  int cas2=capt.nextInt();
                  switch(cas2){
                      case 1:
                  }
                  
                
            default:
                System.out.println(" escoja el tipo de operaciones");

        }

    }
}
