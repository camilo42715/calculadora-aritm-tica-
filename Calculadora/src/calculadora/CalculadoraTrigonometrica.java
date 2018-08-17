/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import static java.lang.Math.*;

public class CalculadoraTrigonometrica {

    public double call;
   public double inversa;

   public void convertir(double Unangulo) {
        call = Math.toRadians(Unangulo);
    }

    public double seno() {
        return sin(call);

    }

     public double coseno() {

        return cos(call);

    }

     public double tangente() {
        return tan(call);
    }
    public double arccos(){
        return Math.acos(inversa);
    }
    public double arcsin(){
        return Math.asin(inversa);
    }
    

}
