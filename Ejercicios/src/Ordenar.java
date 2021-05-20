public class Ordenar {
    public static void main(String[] args) {

        int x = 8;
        int y = 20;
        int z = 4;

        if(x > y && x > z ){
            System.out.println(x+ " " +y + " " +z);
        }
        else if(y > x && y > z){
            System.out.println(y+ " " + x + " " + z);
        }
        else if(z > y && z > x){
            System.out.println(z + " " + y +" "+ x);
        }
        else if(z > x && z > y){
            System.out.println(z + " " + x + " " + y);
        }
        else if(x > z && x > y){
            System.out.println(x + " " + z + " " + y);
        }
        else if(y > z && y > x){
            System.out.println(y + " " + z + " " + x);
        }
        else {
            System.out.println("ingrese numeros validos");
        }

    }
}
