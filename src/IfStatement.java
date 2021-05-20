public class IfStatement {
    public static void main(String[] args) {
        int nilai = 50;
        int absem = 80;

        if (nilai >=75 && absem >=75){
            System.out.println("Nilai A");
        } else if(nilai >=70 && absem >=75){
            System.out.println("Nilai B");
        } else {
            System.out.println("Gagal");
        }
    }
}
