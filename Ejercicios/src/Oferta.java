public class Oferta {
    public static void main(String[] args) {
        double cantidad, precioDeProducto,descuento,parcialCompra,totalCompra,totalDescuento,mediaDeCompra;
        mediaDeCompra = 50;
        cantidad = 2;
        precioDeProducto = 20;
        parcialCompra = cantidad * precioDeProducto;
        if (parcialCompra <= mediaDeCompra){
            descuento = 0.08;
            totalDescuento = parcialCompra * descuento;
            totalCompra = parcialCompra - totalDescuento;
            System.out.println("El descuento de su compra fue de: " + totalDescuento + " Soles, y el total a pagar por su compra es de: " +totalCompra + " Soles");
        }
        else{
            descuento = 0.1;
            totalDescuento = parcialCompra * descuento;
            totalCompra = parcialCompra - totalDescuento;
            System.out.println("El descuento de su compra fue de: " + totalDescuento + " Soles, y el total a pagar por su compra es de: " +totalCompra + " Soles");
        }

    }
}
