import java.util.Scanner;

public class MayorEntreDosNumeros {
    public static void main(String[] args) {


        System.out.println(getNumeroMayor(3,5));

    }

    public static int getNumeroMayor(int numA, int numB){

        System.out.println("Primer numero: "+numA);
        System.out.println("Segundo numero: "+numB);

        if (numA > numB) {
            return numA;
        }
        return numB;
    }
}
