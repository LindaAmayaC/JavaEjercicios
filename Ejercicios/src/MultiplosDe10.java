public class MultiplosDe10 {
    public static void main(String[] args) {

        System.out.println(getMultiplo(10,58));

    }
    public static boolean getMultiplo(int x , int multiplo){

        if( x % multiplo == 0){
            return true;
        }
    return false;
    }
}
