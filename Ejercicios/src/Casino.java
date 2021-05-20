public class Casino {
    public static void main(String[] args) {
        int dado1 = 6;
        int dado2 = 9;
        int dado3 = 2;
        int numGanador = 6;


        if(dado1 == numGanador && dado2 == numGanador && dado3 == numGanador){
            System.out.println("Excelente");
        }
        else if((dado1 == numGanador && dado2 == numGanador) || (dado1 ==numGanador && dado3 == numGanador)||(dado2 == numGanador && dado3 == numGanador)){
            System.out.println("Muy bien");
        }
        else if((dado1 == numGanador) || (dado2 == numGanador) || (dado3 == numGanador)){
            System.out.println("Regular");
        }
        else{
            System.out.println("Pésimo");
        }
    }

}
