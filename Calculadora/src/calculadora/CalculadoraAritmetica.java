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

    public int operando1;
    public int operando2;

    public int sumar() {
        int r;
        r = operando1 + operando2;
        return r;
    }

    public int restar() {
        int r;
        r = operando1 - operando2;
        return r;
    }

    public int multiplicar() {
        int r;
        r = operando1 * operando2;
        return r;
    }

    public double dividir() {
        double r;
        
        r= (operando1 *1.0 /operando2);
        return r;
    }
}
