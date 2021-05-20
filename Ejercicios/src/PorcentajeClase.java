public class PorcentajeClase {
    public static void main(String[] args) {
        int mujeres,hombres,totalEstudiantes,porcentajeMujeres,porcentajeHombres;

        mujeres = 50;
        hombres = 18;
        totalEstudiantes = hombres + mujeres;
        porcentajeHombres = (hombres * 100) / totalEstudiantes;
        porcentajeMujeres = (mujeres * 100) / totalEstudiantes;
        System.out.println("El porcentaje de estudiantes hombres es de: " + porcentajeHombres + "%");
        System.out.println("El porcentaje de estudiantes mujeres es de: " + porcentajeMujeres + "%");



    }
}
