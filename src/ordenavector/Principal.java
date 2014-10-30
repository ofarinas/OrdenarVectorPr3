/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenavector;

/**
 *
 * @author usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalculadorEstadisticas calculadorEstadisticas = new CalculadorEstadisticas();
        DatosEstadisticos[] datosEstadisticos = calculadorEstadisticas.estadisticaOrdenaVector(new OrdenaVector(), 100);
       int i=10;

    float f=(float) 3.1415;

   System.out.printf("%6d %5.2f\n",i,f);
            
    }
    }
