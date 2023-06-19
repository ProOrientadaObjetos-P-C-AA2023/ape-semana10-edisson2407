package paquete1;

import java.util.ArrayList;
import java.util.Scanner;
import paquete2.InstitucionEducativa;
import paquete2.Persona;
import paquete2.Prestamo;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;

public class Ejecutor {
    public static void main(String[] args) {
        int op;
        metodos lista = new metodos(); 
       do {
        op = lista.menu();
        switch(op) {  
            case 1:
                lista.insertarAutomovil();
                break;
            case 2:
                lista.insertarEducativo();
                break;
            case 3:
                lista.listar();
                break;    
            default:
                break;
        }
    } while(op != 0);
    
}
    public static class metodos{
    ArrayList <Prestamo> listaPrestamos = new ArrayList<>();
    //------------------------------------------------------
  Scanner sc = new Scanner(System.in);  
    public int menu(){
        System.out.println("Ingrese el tipo de préstamo: ");
            System.out.println("1. Préstamo de Automóvil");
            System.out.println("2. Préstamo Educativo");
            System.out.println("3. Listar Prestamos");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            int op = sc.nextInt();
            
            sc.nextLine();
            
        return op;
    }
    
    public void insertarAutomovil(){
        System.out.println("Ingrese nombre del Beneficiario: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese Apellido:");
        String apellido = sc.nextLine();
        System.out.println("Ingrese id:");
        String id = sc.nextLine();

        Persona personas = new Persona(nombre, apellido, id);
        //--
        System.out.println("Ingrese nombre del Garante: ");
        String nombreGarante = sc.nextLine();
        System.out.println("Ingrese Apellido:");
        String apellidoGarante = sc.nextLine();
        System.out.println("Ingrese id:");
        String idGarante = sc.nextLine();

        Persona garantes = new Persona(nombreGarante,apellidoGarante,idGarante  );

        System.out.println("Ingrese el tiempo del prestamo en MESES: ");
        double tiempoPres = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingrese ciudad: ");
        String ciudad = sc.nextLine();
 
        System.out.println("Tipo de Automovil: ");
        String tipoAut = sc.nextLine();
        System.out.println("Marca: ");
        String marca = sc.nextLine();
        System.out.println("Ingrese el valor del automovil: ");
        double valor = sc.nextDouble();
        PrestamoAutomovil prestamos = new PrestamoAutomovil(personas,tiempoPres,ciudad,tipoAut,marca,garantes,valor);
        prestamos.calcularValorMensual();
        this.listaPrestamos.add(prestamos);
    }
    
    //-----------------------------------------------------
    
    public void insertarEducativo(){
        System.out.println("Ingrese nombre del Beneficiario: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese Apellido:");
        String apellido = sc.nextLine();
        System.out.println("Ingrese id:");
        String id = sc.nextLine();
        Persona personas = new Persona(nombre, apellido, id);
        //--
        System.out.println("Ingrese nombre del Centro Educativo: ");
        String centroEd = sc.nextLine();
        System.out.println("Ingrse SIGLAS: ");
        String siglas = sc.nextLine();
        InstitucionEducativa inst = new InstitucionEducativa(centroEd, siglas);
        //---------
        System.out.println("Ingrese el tiempo del prestamo en MESES: ");
        double tiempoPres = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingrese ciudad: ");
        String ciudad = sc.nextLine();
        //---------
        System.out.println("Nivel de Esrtudio: ");
        String nivel = sc.nextLine();
        System.out.println("Ingrese el valor de la Carrera: ");
        double valor = sc.nextDouble();
        PrestamoEducativo prestamos = new PrestamoEducativo(personas,tiempoPres, ciudad,nivel,inst,valor );
        prestamos.calcularValorMensual();
        this.listaPrestamos.add(prestamos);
    }
    
    public void listar() {
        
    if (!listaPrestamos.isEmpty()) {
        for (Prestamo prestamo : listaPrestamos) {
            System.out.println(prestamo.toString());
        }
    } else {
        System.out.println("NO SE ENCUENTRAN DATOS");
    }
}

    
    }
    
}
