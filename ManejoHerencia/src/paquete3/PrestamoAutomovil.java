package paquete3;

import paquete2.Persona;
import paquete2.Prestamo;

public class PrestamoAutomovil extends Prestamo {
    public String tipoAutomovil;
    public String marca;
    public Persona garante;
    public double valorAutomovil;
    public double valorMensual;

    public PrestamoAutomovil(Persona beneficiario, double tiempoPrestamo,String ciudadPrestamo, String tipoAutomovil, String marca, Persona garante, double valorAutomovil) {
        super(beneficiario,tiempoPrestamo,ciudadPrestamo);
        this.tipoAutomovil = tipoAutomovil;
        this.marca = marca;
        this.garante = garante;
        this.valorAutomovil = valorAutomovil;
    }
    
    public double calcularValorMensual(){
        this.valorMensual = valorAutomovil / tiempoPrestamo;
        return this.valorMensual;
    }
    
    @Override
public String toString() {
    return "\n============================\n"+
            super.toString() +
           "\nGarante: " + garante +
           "\nTipo de Automóvil: " + tipoAutomovil +
           "\nMarca: " + marca +
           "\nValor del Automóvil: " + valorAutomovil +
           String.format("\nValor Mensual: %.2f", valorMensual)+"\n=============================\n";
}



    
}


