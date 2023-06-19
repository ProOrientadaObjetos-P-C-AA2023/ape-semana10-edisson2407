package paquete2;
public class InstitucionEducativa {
    public String nombre;
    public String siglas;

    public InstitucionEducativa(String nombre, String siglas) {
        this.nombre = nombre;
        this.siglas = siglas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }
    
    @Override
    public String toString(){
        return String.format("\nNombre: %s" 
                + "\nSiglas: %s", nombre, siglas);
    }
}
