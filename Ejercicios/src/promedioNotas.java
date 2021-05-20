public class promedioNotas {
    public static void main(String[] args) {
        System.out.println(getPromedio(2.5,3.8,4.6,3.3));

    }
    public static double getPromedio(double notaA, double notaB, double notaC, double notaD){

        double promedioGeneral = notaA * 0.2 + notaB * 0.2 + notaC * 0.3 + notaD * 0.3;
        return promedioGeneral;
    }
}
