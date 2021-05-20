public class Array {
    public static void main(String[] args) {
        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Vedy";
        stringArray[1] = "Aditya";
        stringArray[2] = "Nugraha";

        System.out.println(stringArray[2]);

        String[] namaNama ={
                "Vedy", "Aditya", "Nugraha"
        };
        int[] arrayInt = new int[]{
            1,2,3,4,5,6
        };
        System.out.println(arrayInt.length);

        String [][] members = {
                {"vedy", "aditya,'Nugraha"},
                {"andri", "instagram"}
        };

        System.out.println(members[1][1]);
    }
}
