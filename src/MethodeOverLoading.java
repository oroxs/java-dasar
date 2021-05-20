public class MethodeOverLoading {
    public static void main(String[] args) {
    sayHello();
    sayHello("Vedy");
    }
    static void sayHello(){
        System.out.println("Hello");
    }
    static void sayHello(String name){
        System.out.println("Hello " + name);
    }
}
