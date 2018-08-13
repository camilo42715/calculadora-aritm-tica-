/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author usuario
 */
public class CalculadoraAritmetica {

    int operando1;
    int operando2;

    int sumar() {
        int r;
        r = operando1 + operando2;
        return r;
    }

    int restar() {
        int r;
        r = operando1 - operando2;
        return r;
    }

    int multiplicar() {
        int r;
        r = operando1 * operando2;
        return r;
    }
   double dividir(){
        double r;
        r=operando1/operando2;
       return r;
    }
}
