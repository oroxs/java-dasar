public class OprasiBoolean {
    public static void main(String[] args) {
        Integer absen = 75;
        Integer nilaiakhir = 80;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilai = nilaiakhir >=75;

        boolean lulus = lulusAbsen && lulusNilai;

        System.out.println(lulus);
    }
}
