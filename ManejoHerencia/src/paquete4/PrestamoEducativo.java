package paquete4;

import paquete2.InstitucionEducativa;
import paquete2.Persona;
import paquete2.Prestamo;

public class PrestamoEducativo extends Prestamo {
    public String nivelEstudio;
    public InstitucionEducativa centroEducativo;
    public double valorCarrera;
    public double valorMensual;

    public PrestamoEducativo(Persona beneficiario, double tiempoPrestamo, String ciudadPrestamo, String nivelEstudio
            , InstitucionEducativa centroEducativo, double valorCarrera) {
        super(beneficiario, tiempoPrestamo, ciudadPrestamo);
        this.nivelEstudio = nivelEstudio;
        this.centroEducativo = centroEducativo;
        this.valorCarrera = valorCarrera;
        
        
    }
    public double calcularValorMensual() {
    valorMensual = (valorCarrera / tiempoPrestamo) - (0.1 * (valorCarrera / tiempoPrestamo));  
    return valorMensual; 
}
    
    @Override
public String toString() {
    return super.toString() +
           "\nINSTITUCION EDUCATIVA: " + centroEducativo +
           "\nNivel de estudio: " + nivelEstudio +
           String.format("\nValor de la Carrera: %.2f", valorCarrera) +
           "\nValor Mensual: " + valorMensual;
}
   
}
