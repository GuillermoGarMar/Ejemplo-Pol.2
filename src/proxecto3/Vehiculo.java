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
public abstract class Vehiculo {
    String matricula,marca;
    int potencia;

    public Vehiculo(String vehiculo, String marca, int potencia) {
        this.matricula = vehiculo;
        this.marca = marca;
        this.potencia = potencia;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String vehiculo) {
        this.matricula = vehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    public abstract float calcularPrezo();
}
