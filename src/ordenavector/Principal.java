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
        int[] test = {4, 5, 68, 8, 1};
        int[] test3 = GeneraCaso.generaVector(1000, true);

        OrdenaVector ordenaVector = new OrdenaVector();
        DatosEstadisticos datosEstadisticos=new DatosEstadisticos();
        ordenaVector.ordena(test3, datosEstadisticos);
        for (int i = 0; i < test3.length; i++) {
            System.out.println(test3[i]);

        }
        System.out.println(datosEstadisticos.dameTiempo()); 
    }

}
