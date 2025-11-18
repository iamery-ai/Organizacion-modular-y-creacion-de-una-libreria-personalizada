package ui;

import data.GestorDatos;
import model.Centro;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Cargar centros de cultivo
        List<Centro> centrosCultivo = GestorDatos.cargarCentrosCultivo();
        Scanner scanner = new Scanner(System.in);
        //mostrar menu
        mostrarMenu();
        int opcion = scanner.nextInt();

        int cantidad = 0;

        while(opcion != 8){
            switch(opcion){
                case 1:
                    mostrarCentrosCultivo(centrosCultivo);
                    mostrarMenu();
                    opcion = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("Ingrese el producto:");
                    String producto = scanner.next();
                    buscarPorProducto(centrosCultivo, producto);
                    mostrarMenu();
                    opcion = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("Ingrese el centro:");
                    String nombreCentro = scanner.next();
                    buscarPorCentro(centrosCultivo, nombreCentro);
                    mostrarMenu();
                    opcion = scanner.nextInt();
                    break;
                case 4:
                    System.out.println("Ingrese el tour:");
                    String tour = scanner.next();
                    buscarPorTour(centrosCultivo, tour);
                    mostrarMenu();
                    opcion = scanner.nextInt();
                    break;
                case 5:
                    System.out.println("Ingrese la cantidad:");
                    cantidad = scanner.nextInt();
                    buscarPorCantidad(centrosCultivo, cantidad);
                    mostrarMenu();
                    opcion = scanner.nextInt();
                    break;
                case 6:
                    System.out.println("Ingrese la cantidad mayor a:");
                    cantidad = scanner.nextInt();
                    buscarPorCantidadMayor(centrosCultivo, cantidad);
                    mostrarMenu();
                    opcion = scanner.nextInt();
                    break;
                case 7:
                    System.out.println("Ingrese la cantidad menor a:");
                    cantidad = scanner.nextInt();
                    buscarPorCantidadMenor(centrosCultivo, cantidad);
                    mostrarMenu();
                    opcion = scanner.nextInt();
                    break;
                case 8:
                    System.out.println("Gracias.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    mostrarMenu();
                    opcion = scanner.nextInt();
                    break;
            }
        }
    }
    public static void mostrarMenu(){
        System.out.println("/////////////////////////////");
        System.out.println("Bienvenido a Salmontt.");
        System.out.println("Escoja una opcion:");
        System.out.println("1. Mostrar centros de cultivo");
        System.out.println("2. Buscar por producto");
        System.out.println("3. Buscar por centro");
        System.out.println("4. Buscar por tour");
        System.out.println("5. Buscar por cantidad");
        System.out.println("6. Buscar por cantidad mayor a");
        System.out.println("7. Buscar por cantidad menor a");
        System.out.println("8. Salir");
        System.out.println("/////////////////////////////");
    }
    //mostrar todos los centros
    public static void mostrarCentrosCultivo(List<Centro> centrosCultivo){
        for(Centro c: centrosCultivo){
            System.out.println(c.toString());
        }
    }
    //buscar por producto
    public static void buscarPorProducto(List<Centro> centrosCultivo, String producto){
        for(Centro c: centrosCultivo){
            if(c.getProducto().contains(producto)){
                System.out.println(c.toString());
            }
        }
    }
    //buscar por centro
    public static void buscarPorCentro(List<Centro> centrosCultivo, String nombreCentro){
        for(Centro c: centrosCultivo){
            if(c.getCentroCultivo().contains(nombreCentro)){
                System.out.println(c.toString());
            }
        }
    }
    //buscar por tour
    public static void buscarPorTour(List<Centro> centrosCultivo, String tour){
        for(Centro c: centrosCultivo){
            if(c.getTour().contains(tour)){
                System.out.println(c.toString());
            }
        }
    }
    //buscar por cantidad
    public static void buscarPorCantidad(List<Centro> centrosCultivo, int cantidad){
        for(Centro c: centrosCultivo){
            if(c.getCantidad() == cantidad){
                System.out.println(c.toString());
            }
        }
    }
    public static void buscarPorCantidadMayor(List<Centro> centrosCultivo, int cantidad){
        for(Centro c: centrosCultivo){
            if(c.getCantidad() > cantidad){
                System.out.println(c.toString());
            }
        }
    }
    public static void buscarPorCantidadMenor(List<Centro> centrosCultivo, int cantidad){
        for(Centro c: centrosCultivo){
            if(c.getCantidad() < cantidad){
                System.out.println(c.toString());
            }
        }
    }
}