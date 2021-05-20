public class RecursiveMethode {
    public static void main(String[] args) {
        System.out.println(factorial(3));
        System.out.println(factorialRecursive(3));
        loop(10000);
    }
    static int factorial (int value){
        int result = 1;
        for (int counter = 1; counter<=value; counter++){
            result*=counter;
        }
        return result;
    }

    static int factorialRecursive (int value){
        if (value == 1){
            return 1;
        } else {
            return value *factorialRecursive(value -1);
        }
    }

    static void loop (int value){
        if (value==0) {
            System.out.println("Selesai");
        }else {
            System.out.println("Loop " + value);
            loop(value - 1);

        }
    }
}
