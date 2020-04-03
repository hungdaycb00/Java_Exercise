package Exception;

public class MethodCallStackDemo {
    public static void main(String[] args) {
        System.out.println("Enter main()");
        methodA();
        System.out.println("Exit Main");

    }
    public static void methodA(){
        System.out.println("Enter methodA()");
        methodB();
        System.out.println("Exit methodA()");
    }

    public static void methodB(){
        System.out.println("Enter methodB()");
        methodC();
        System.out.println("Exit methodB()");
    }
    public static void methodC(){
        System.out.println("enter methodC()");
        System.out.println(1/0);
        System.out.println("Exit methodC");
    }
}
