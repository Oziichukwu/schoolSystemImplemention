package schoolSystemApp;

public class SchoolSystemApp {
    public static void main(String[] args) {

        methodC();
    }

    public static void methodA(){
        System.out.println("This is data in method A");
    }
    public static void methodB(){
        methodA();
        System.out.println("This is data in method B");
    }
    public static void methodC(){
        methodB();
        System.out.println("This is data in method C");
    }

}

