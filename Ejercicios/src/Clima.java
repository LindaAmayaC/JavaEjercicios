import java.util.Scanner;

public class Clima {
    public static void main(String[] args) {
        double temperatura;
        Scanner temperaturaDia = new Scanner(System.in);

        System.out.println("Escriba la temperatura en centigrados de hoy");
        temperatura = temperaturaDia.nextDouble();

        if(temperatura <= 10){
            System.out.println("El tipo de clima es Frío");
        }
        else if(10 < temperatura && temperatura <= 20){
            System.out.println("El tipo de clima es Nublado");
        }
        else if(20 < temperatura && temperatura <= 30){
            System.out.println("El tipo de clima es Caluroso");
        }
        else if(temperatura > 30){
            System.out.println("El tipo de clima es Tropical");
        }
        else{
            System.out.println("Ingrese un valor");
        }
        
    }
}
