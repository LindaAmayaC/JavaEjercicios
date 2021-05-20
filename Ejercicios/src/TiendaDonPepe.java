import java.util.Scanner;

public class TiendaDonPepe {
    public static void main(String[] args) {
        int valorCompra,totalCompra,descuento = 15,totalDescuento;
        String diaSemana;
        Scanner calcularTotalCompra = new Scanner(System.in);

        System.out.println("Ingrese dia de la semana");
        diaSemana = calcularTotalCompra.nextLine();
        System.out.println("Escibir valor de la compra");
        valorCompra = calcularTotalCompra.nextInt();

        if(diaSemana.equalsIgnoreCase("jueves") || diaSemana.equalsIgnoreCase("martes")){
            totalDescuento = (valorCompra /100 ) * descuento;
            totalCompra = totalDescuento + valorCompra;
            System.out.println("Su descuento fue de: " + totalDescuento);
            System.out.println("El total de su compra fue de: " + totalCompra);
        }
        else{
            System.out.println("El total de su compra fue de: " + valorCompra);
        }

    }
}
