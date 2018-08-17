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

    public double valor;

    //metodos de  longitud
    public double MetrosCm() {
        double unidad;
        unidad = valor * 100;
        return unidad;
    }

   public  double MetrosKm() {
        double unidad;
        unidad = valor / 1000;
        return unidad;
    }

    public double Metrosft() {
        double unidad;
        unidad = valor * 3.280839895;
        return unidad;
    }

    public double MetroIn() {
        double unidad;
        unidad = valor * 39.3700787402;
        return unidad;
    }

   public  double MetrosYd() {
        double unidad;
        unidad = valor * 1.093612983;
        return unidad;
    }

    //cm  
  public   double CmMetros() {
        double unidad;
        unidad = valor / 100;
        return unidad;
    }

 public    double CmKm() {
        double unidad;
        unidad = valor * 0.0001;
        return unidad;
    }

  public   double CmIn() {
        double unidad;
        unidad = valor * 0.39370078;
        return unidad;
    }

  public   double CmFt() {
        double unidad;
        unidad = valor * 0.0328084;
        return unidad;
    }

  public   double CmYd() {
        double unidad;
        unidad = valor * 0.0109361;
        return unidad;
    }
    //km

  public   double KmCm() {
        double unidad;
        unidad = valor * 100000;
        return unidad;
    }

  public   double KmMetro() {
        double unidad;
        unidad = valor * 1000;
        return unidad;
    }

  public   double KmIn() {
        double unidad;
        unidad = valor * 39370.078;
        return unidad;
    }

 public    double Kmft() {
        double unidad;
        unidad = valor * 3280.841666667;
        return unidad;
    }

  public   double KmYd() {
        double unidad;
        unidad = valor * 1093.61;
        return unidad;
    }

    //In
   public  double Incm() {
        double unidad;
        unidad = valor * 2.54;
        return unidad;
    }

   public  double InMeTros() {
        double unidad;
        unidad = valor * 0.0254;
        return unidad;
    }

  public   double InKm() {
        double unidad;
        unidad = valor * 0.0000254;
        return unidad;
    }

   public  double InFt() {
        double unidad;
        unidad = valor * 0.0833333;
        return unidad;
    }

  public   double InYd() {
        double unidad;
        unidad = valor * 0.02777;
        return unidad;
    }

    //ft
 public    double FtCm() {
        double unidad;
        unidad = valor * 30.48;
        return unidad;
    }

  public   double FtMetro() {
        double unidad;
        unidad = valor * 0.3048;
        return unidad;
    }

  public   double FtKm() {
        double unidad;
        unidad = valor * 0.0003048;
        return unidad;
    }

  public   double Ftin() {
        double unidad;
        unidad = valor * 12;
        return unidad;
    }

 public    double FtYd() {
        double unidad;
        unidad = valor * 0.333333;
        return unidad;
    }

    //yardas
 public    double YdCm() {
        double unidad;
        unidad = valor * 91.44;
        return unidad;
    }

public     double YdMetros() {
        double unidad;
        unidad = valor * 0.9144;
        return unidad;
    }

  public   double YdKm() {
        double unidad;
        unidad = valor * 0.0009144;
        return unidad;
    }

  public   double YdIn() {
        double unidad;
        unidad = valor * 36;
        return unidad;
    }

  public   double YdFt() {
        double unidad;
        unidad = valor * 3;
        return unidad;
    }
    //volumen 

   public  double KgG() {
        double unidad;
        unidad = valor * 1000;
        return unidad;
    }

   public  double KgLb() {
        double unidad;
        unidad = valor * 2.20462;
        return unidad;
    }

   public  double KgT() {
        double unidad;
        unidad = valor * 0.001;
        return unidad;
    }

  public   double GKg() {
        double unidad;
        unidad = valor / 1000;
        return unidad;
    }

  public   double GLb() {
        double unidad;
        unidad = valor * 0.00220462;
        return unidad;
    }

 public    double Gt() {
        double unidad;
        unidad = valor * 0.000001;
        return unidad;
    }

  public   double TKg() {
        double unidad;
        unidad = valor * 1000;
        return unidad;
    }

   public  double TG() {
        double unidad;
        unidad = valor * 1000000;
        return unidad;
    }

   public  double Tlb() {
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
