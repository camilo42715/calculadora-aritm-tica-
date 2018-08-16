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
public class CalculadoraConversion {

    double valor;

    //metodos de  longitud
    double MetrosCm() {
        double unidad;
        unidad = valor * 100;
        return unidad;
    }

    double MetrosKm() {
        double unidad;
        unidad = valor / 1000;
        return unidad;
    }

    double Metrosft() {
        double unidad;
        unidad = valor * 3.280839895;
        return unidad;
    }

    double MetroIn() {
        double unidad;
        unidad = valor * 39.3700787402;
        return unidad;
    }


    double MetrosYd(){
        double unidad;
        unidad = valor*1.093612983;
        return unidad;
    }
    //cm  
    double CmMetros() {
        double unidad;
        unidad = valor / 100;
        return unidad;
    }
     double CmYd(){
        double unidad;
        unidad = valor*1.093612983;
        return unidad;
    }
}
