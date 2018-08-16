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

    double MetrosYd() {
        double unidad;
        unidad = valor * 1.093612983;
        return unidad;
    }

    //cm  
    double CmMetros() {
        double unidad;
        unidad = valor / 100;
        return unidad;
    }

    double CmKm() {
        double unidad;
        unidad = valor * 0.0001;
        return unidad;
    }

    double CmIn() {
        double unidad;
        unidad = valor * 0.39370078;
        return unidad;
    }

    double CmFt() {
        double unidad;
        unidad = valor * 0.0328084;
        return unidad;
    }

    double CmYd() {
        double unidad;
        unidad = valor * 0.0109361;
        return unidad;
    }
    //km

    double KmCm() {
        double unidad;
        unidad = valor * 100000;
        return unidad;
    }

    double KmMetro() {
        double unidad;
        unidad = valor * 1000;
        return unidad;
    }

    double KmIn() {
        double unidad;
        unidad = valor * 39370.078;
        return unidad;
    }

    double Kmft() {
        double unidad;
        unidad = valor * 3280.841666667;
        return unidad;
    }

    double KmYd() {
        double unidad;
        unidad = valor * 1093.61;
        return unidad;
    }

    //In
    double Incm() {
        double unidad;
        unidad = valor * 2.54;
        return unidad;
    }

    double InMeTros() {
        double unidad;
        unidad = valor * 0.0254;
        return unidad;
    }

    double InKm() {
        double unidad;
        unidad = valor * 0.0000254;
        return unidad;
    }

    double InFt() {
        double unidad;
        unidad = valor * 0.0833333;
        return unidad;
    }

    double InYd() {
        double unidad;
        unidad = valor * 0.02777;
        return unidad;
    }

    //ft
    double FtCm() {
        double unidad;
        unidad = valor * 30.48;
        return unidad;
    }

    double FtMetro() {
        double unidad;
        unidad = valor * 0.3048;
        return unidad;
    }

    double FtKm() {
        double unidad;
        unidad = valor * 0.0003048;
        return unidad;
    }

    double Ftin() {
        double unidad;
        unidad = valor * 12;
        return unidad;
    }

    double FtYd() {
        double unidad;
        unidad = valor * 0.333333;
        return unidad;
    }

    //yardas
    double YdCm() {
        double unidad;
        unidad = valor * 91.44;
        return unidad;
    }

    double YdMetros() {
        double unidad;
        unidad = valor * 0.9144;
        return unidad;
    }

    double YdKm() {
        double unidad;
        unidad = valor * 0.0009144;
        return unidad;
    }

    double YdIn() {
        double unidad;
        unidad = valor * 36;
        return unidad;
    }

    double YdFt() {
        double unidad;
        unidad = valor * 3;
        return unidad;
    }
    //volumen 

    double KgG() {
        double unidad;
        unidad = valor * 1000;
        return unidad;
    }

    double KgLb() {
        double unidad;
        unidad = valor * 2.20462;
        return unidad;
    }

    double KgT() {
        double unidad;
        unidad = valor * 0.001;
        return unidad;
    }

    double GKg() {
        double unidad;
        unidad = valor / 1000;
        return unidad;
    }

    double GLb() {
        double unidad;
        unidad = valor * 0.00220462;
        return unidad;
    }

    double Gt() {
        double unidad;
        unidad = valor * 0.000001;
        return unidad;
    }

    double TKg() {
        double unidad;
        unidad = valor * 1000;
        return unidad;
    }

    double TG() {
        double unidad;
        unidad = valor * 1000000;
        return unidad;
    }

    double Tlb() {
        double unidad;
        unidad = valor * 2204.62;
        return unidad;
    }

    //Temperatura 
    double Celciusfahrenheit() {
        double unidad;
        unidad = (valor * 1.8) + 32;
        return unidad;
    }

    double CelciusKelvin() {
        double unidad;
        unidad = valor + 273.15;
        return unidad;
    }

    double KelvinCelcius() {
        double unidad;
        unidad = valor - 273.15;
        return unidad;
    }

    double KelvinFahrenheit() {
        double unidad;
        unidad = (valor * 1.8) - 459.67;
        return unidad;
    }

    double Fahrenheitkelvin() {
        double unidad;
        unidad = (valor * 0.551) + 255.377;
        return unidad;
    }

    double FahrenheiCelcius() {
        double unidad;
        unidad = (valor * 0.5556) - 17.7778;
        return unidad;
    }

}
