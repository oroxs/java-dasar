public class MethodeVariableArgument {
    public static void main(String[] args) {
     //   int[] values ={50,60,70,80};
        sayCongrats("Vedy",80,70,60);

    }

    static void  sayCongrats(String name, int... values){
        int total =0;
        for (int value: values) {
        total += value;
        }
        int finalValue = total /values.length;

        if (finalValue >=70){
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Gagal");
        }
    }
}
