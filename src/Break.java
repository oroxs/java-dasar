public class Break {
    public static void main(String[] args) {
        int counter = 1;
        while (true){
            System.out.println("perulangan" + counter);
            counter++;

            if (counter >10){
                break;
            }
        }
        System.out.println("berenti");
    }
}
