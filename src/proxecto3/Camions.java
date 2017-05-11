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
public class Camions extends Vehiculo {
    private boolean remolque;

public Camions(boolean remolque, String matricula, String marca, int potencia) {
        super(matricula, marca, potencia);
        this.remolque = remolque;
    }

    @Override
    public float calcularPrezo() {
       ICalculabe ico = ()->remolque?super.getPotencia()*120+10000:super.getPotencia()*120;
       return ico.calcularPrezo();
    }
}
