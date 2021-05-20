import java.util.Scanner;

public class CalcularValoresFarmacia {

    public static void main(String[] args) {
        int formadepago;
        double valorCompra, totalCompra;
        int contado = 5, tarjeta = 3;

        Scanner pago = new Scanner(System.in);
        System.out.println("Ingrese el Valor a Pagar");
        valorCompra = pago.nextInt();
        System.out.println("Formas de pago: ");
        System.out.println("Escoja 1 para contado ");
        System.out.println("Escoja 2 para tarjeta ");
        formadepago = pago.nextInt();
        double calcularDescuento = (valorCompra / 100) * contado;
        double calcularIncremento = (valorCompra / 100) * tarjeta;

        if(formadepago==1){
            System.out.println("El costo del descuento es de " + calcularDescuento);
            totalCompra = valorCompra - calcularDescuento;
            System.out.println("Total de la compra es de: " + totalCompra);
        }
        else{
            System.out.println("El costo del incremento es de " + calcularIncremento);
            totalCompra = valorCompra + calcularIncremento;
            System.out.println("Total de la compra es de: "+ totalCompra);
            }
    }




}
