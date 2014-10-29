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
public class OrdenaVector implements OrdenarVector {

  
    @Override
    public String nombreMetodo() {
        return "El método de la burbuja";
    }

    @Override
    public void ordena(int[] v, DatosEstadisticos de) {
        int aux = 0;
        de.estableceTiempo(0);
        double timpo=(double)System.currentTimeMillis();
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length; j++) {
                if (v[i] < v[j]) {
                    aux = v[i];
                    v[i]=v[j];
                    v[j]=aux;
                }
            }
            
        }
        double temp=System.currentTimeMillis()-timpo;
        de.estableceTiempo(temp);
    }

}
