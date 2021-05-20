public class NumeroCifras {
    public static void main(String[] args) {

        int x = 3522;

        if(x / 10 == 0){
            System.out.println("El número tiene 1 cifra.");
        }
        else if(x / 100 == 0){
            System.out.println("El número tiene 2 cifras.");
        }
        else if(x / 1000 == 0){
            System.out.println("El número tiene 3 cifras.");
        }
        else if(x / 10000 == 0){
            System.out.println("El número tiene 4 cifras.");
        }
        else if(x / 100000 == 0){
            System.out.println("El número tiene 5 cifras.");
        }
        else{
            System.out.println("Ingrese un número entre el 0 y el 99999");
        }
    }
}
