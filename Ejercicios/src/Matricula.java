public class Matricula {
    public static void main(String[] args) {
        String facultad = "administracion";
        String nombreEstudiante = "Linda";
        double importe, mensualidad , totalMatricula , totalIgv , igv = 18;

        if(facultad.equalsIgnoreCase("ingenieria de sistemas")){
            importe = 350;
            mensualidad = 650;
            totalIgv= ((importe + mensualidad) * igv) / 100;
            totalMatricula = importe + mensualidad + totalIgv;

            System.out.println("Para la facultad de " + facultad + " el importe es de: " + importe + " la mensualidad es de: " + mensualidad + " el IGV es de: " + totalIgv);
            System.out.println("El valor total de la matricula es: " + totalMatricula);
        }
        if(facultad.equalsIgnoreCase("derecho")){
            importe = 300;
            mensualidad = 550;
            totalIgv= ((importe + mensualidad) * igv) / 100;
            totalMatricula = importe + mensualidad + totalIgv;

            System.out.println("Para la facultad de " + facultad + " el importe es de: " + importe + " la mensualidad es de: " + mensualidad + " el IGV es de: " + totalIgv);
            System.out.println("El valor total de la matricula es: " + totalMatricula);
        }
        if(facultad.equalsIgnoreCase("ingenieria naviera")){
            importe = 300;
            mensualidad = 500;
            totalIgv= ((importe + mensualidad) * igv) / 100;
            totalMatricula = importe + mensualidad + totalIgv;

            System.out.println("Para la facultad de " + facultad + " el importe es de: " + importe + " la mensualidad es de: " + mensualidad + " el IGV es de: " + totalIgv);
            System.out.println("El valor total de la matricula es: " + totalMatricula);
        }
        if(facultad.equalsIgnoreCase("ingenieria pesquera")){
            importe = 310;
            mensualidad = 460;
            totalIgv= ((importe + mensualidad) * igv) / 100;
            totalMatricula = importe + mensualidad + totalIgv;

            System.out.println("Para la facultad de " + facultad + " el importe es de: " + importe + " la mensualidad es de: " + mensualidad + " el IGV es de: " + totalIgv);
            System.out.println("El valor total de la matricula es: " + totalMatricula);
        }
        if(facultad.equalsIgnoreCase("contabilidad")){
            importe = 280;
            mensualidad = 490;
            totalIgv= ((importe + mensualidad) * igv) / 100;
            totalMatricula = importe + mensualidad + totalIgv;

            System.out.println("Para la facultad de " + facultad + " el importe es de: " + importe + " la mensualidad es de: " + mensualidad + " el IGV es de: " + totalIgv);
            System.out.println("El valor total de la matricula es: " + totalMatricula);
        }
        if(facultad.equalsIgnoreCase("administracion")){
            importe = 360;
            mensualidad = 520;
            totalIgv= ((importe + mensualidad) * igv) / 100;
            totalMatricula = importe + mensualidad + totalIgv;

            System.out.println("Para la facultad de " + facultad + " el importe es de: " + importe + " la mensualidad es de: " + mensualidad + " el IGV es de: " + totalIgv);
            System.out.println("El valor total de la matricula es: " + totalMatricula);
        }
    }
}
