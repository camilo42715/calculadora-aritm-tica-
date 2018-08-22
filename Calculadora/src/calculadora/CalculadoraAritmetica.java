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

    public double operando1;
    public double operando2;

    public double sumar() {
      double r;
        r = operando1 + operando2;
        return r;
    }

    public double restar() {
        double r;
        r = operando1 - operando2;
        return r;
    }

    public double multiplicar() {
        double r;
        r = operando1 * operando2;
        return r;
    }

    public double dividir() {
        double r;
        
        r= (operando1 *1.0 /operando2);
        return r;
    }
}
