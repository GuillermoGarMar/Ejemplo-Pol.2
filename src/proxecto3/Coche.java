/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxecto3;

/**
 *
 * @author ggarciamartinez
 */
public class Coche extends Vehiculo{
     private int numPortas;


    public Coche(String matricula, String marca, int potencia,int portas) {
        super(matricula, marca, potencia);
        this.numPortas=portas;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    @Override
    public String toString(){
        return "coche";
    }
    
    
    public float calcularPrezo() {
       ICalculabe ico = ()->95*super.getPotencia();
       return ico.calcularPrezo();
    }
}
