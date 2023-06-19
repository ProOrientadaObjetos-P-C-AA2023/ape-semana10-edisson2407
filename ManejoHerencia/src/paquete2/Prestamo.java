package paquete2;
public class Prestamo {
    public Persona beneficiario;
    public double tiempoPrestamo;
    public String ciudadPrestamo;


    public Prestamo(Persona beneficiario, double tiempoPrestamo, String ciudadPrestamo) {
        this.beneficiario = beneficiario;
        this.tiempoPrestamo = tiempoPrestamo;
        this.ciudadPrestamo = ciudadPrestamo;
    }

    public void setBeneficiario(Persona beneficiario) {
        this.beneficiario = beneficiario;
    }

    public void setTiempoPrestamo(double tiempoPrestamo) {
        this.tiempoPrestamo = tiempoPrestamo;
    }

    public void setCiudadPrestamo(String ciudadPrestamo) {
        this.ciudadPrestamo = ciudadPrestamo;
    }

    public Persona getBeneficiario() {
        return beneficiario;
    }

    public double getTiempoPrestamo() {
        return tiempoPrestamo;
    }

    public String getCiudadPrestamo() {
        return ciudadPrestamo;
    }
    
    
    
    @Override
    public String toString() {
        return "PRESTAMO" +
                "\nBeneficiario: " + beneficiario.toString() +
                "\nTiempo de prestamo (meses): " + tiempoPrestamo +
                "\nCiudad: " + ciudadPrestamo
                ;
    }
}
