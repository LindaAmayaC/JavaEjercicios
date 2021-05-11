public class Aprobado {
    public static void main(String[] args) {
        double creditoNotaA,creditoNotaB,creditoNotaC,mediaDeNotas;
        double notaA = .8;
        double notaB = 1.3;
        double notaC = .6;

        mediaDeNotas = 10.5;
        creditoNotaA = 3;
        creditoNotaB = 4;
        creditoNotaC = 2;

        double totalCreditos = creditoNotaA + creditoNotaB + creditoNotaC;

        double promedio = (notaA * creditoNotaA + notaB * creditoNotaB + notaC * creditoNotaC) / totalCreditos;
        System.out.println(promedio);

        if(promedio >= mediaDeNotas){
            System.out.println("Aprobado");
        }
        else {
            System.out.println("Desaprobado");
        }
    }
}