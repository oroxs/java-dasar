public class Scoop {
    public static void main(String[] args) {
        sayHello("Vedy");
        sayHello("");
    }
    static void sayHello(String name){
        String hello = "hello" +name;

        if(!name.isEmpty()){
            String hi = "Hi " + name;
            System.out.println(hi);
        }
        System.out.println(hello);
    }
}
