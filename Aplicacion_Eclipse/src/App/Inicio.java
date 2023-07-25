package App;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Inicio {
    public static void main(String[] args) {
        int Num_Car, i = 0;
        double Tim1, Tim2, Tim3, Total, Conv, Promedio;
        Scanner Entrada = new Scanner(System.in);
        List<Double> promediosCarros = new ArrayList<>(); 

        System.out.println("Bienvenido al calculador de la velocidad promedio");
        System.out.println("Datos: ");
        System.out.println("Pista de carrera es de 30km ");
        System.out.println("Numero de vueltas son 3");
        System.out.println(" ");
        System.out.println("Ingrese la cantidad de carros que compitieron");
        Num_Car = Entrada.nextInt();
        Entrada.nextLine(); 

        if (Num_Car > 0) {
            while (i < Num_Car) {
                System.out.println("El tiempo es en minutos y se ingresa (2.00)");
                System.out.println(" ");
                System.out.println("Ingrese el tiempo de la primera vuelta");
                Tim1 = Entrada.nextDouble();
                System.out.println("Ingrese el tiempo de la segunda vuelta");
                Tim2 = Entrada.nextDouble();
                System.out.println("Ingrese el tiempo de la tercera vuelta");
                Tim3 = Entrada.nextDouble();

                Total = Tim1 + Tim2 + Tim3;
                Conv = 90 / Total;
                Promedio = Conv * 60;

                promediosCarros.add(Promedio); 

                System.out.println("El carro " + (i + 1) + " tiene promedio de: " + Promedio + " km/h");
                i++;
            }
        }

        
        System.out.println("\nValores promedio almacenados:");
        for (Double promedio : promediosCarros) {
            System.out.println("Promedio de velocidad: " + promedio + " km/h");
        }
    }
}
