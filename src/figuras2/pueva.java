package figuras2;

import java.util.Scanner;

public class pueva {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        boolean Cerrar= false;
        int opcion;


//* empezamos con el menu
        while(!Cerrar){
//! definimos las opciones a elegir 1 hacer un triangulo ,2 hacer un cuadrado ,3 salir
            System.out.println("1- Triangulo");
            System.out.println("2- Cuadrado");

            System.out.println("Escoge la opcion");
            //? pedimos el imput del usuario para eerlo y hacer la opion
            opcion = Leer.nextInt();

            switch(opcion){
                case 1://= en este caso se hace la opcion del triangulo se piden los datos y se hacen las operaciones
                    System.out.println("aras un triangulo: ");
                    System.out.print("Lado 1: ");
                    double lado1 = Leer.nextDouble();
                    System.out.print("Lado 2: ");
                    double lado2= Leer.nextDouble();
                    System.out.print("Lado 3: ");
                    double lado3= Leer.nextDouble();
                    triangulo t1= new triangulo(lado1,lado2,lado3);
                    System.out.println(t1.toString());

                    break;
                case 2://= en este se hacen las operaciones del cuadrado y se solicita el lado
                    System.out.println("Has seleccionado cuadrado:");
                    System.out.println("Ingrese el lado");
                    double cuadrado1= Leer.nextDouble();
                    cuadrado c1 = new cuadrado(cuadrado1);
                    System.out.println(c1.toString());
                    break;

                case 3://= se muestra el resultado final respectivamente de cada To String
                    System.out.println("Imprimir datos: "+"\n");
                    System.out.println("Datos de area:");
                    System.out.println();
                case 4:
                    Cerrar=true;
                    break;
                default:
                    System.out.println("Opcion incorrecta por favor escoja una opcion del 1 al 3");
            }

        }
    }
}