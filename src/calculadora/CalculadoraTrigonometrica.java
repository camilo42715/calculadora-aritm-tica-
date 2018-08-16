/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import static java.lang.Math.*;

public class CalculadoraTrigonometrica {

    double call;

    void convertir(double Unangulo) {
        call = Math.toRadians(Unangulo);
    }

    double seno() {
        return sin(call);

    }

    double coseno() {

        return cos(call);

    }

    double tangente() {
        return tan(call);
    }

}
