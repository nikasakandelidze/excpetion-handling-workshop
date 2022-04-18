package exceptionsWorkshop.level0;

public class NormalFlowExample {
    /*
        Output:
        - Calling method 1
        - Calling method 2
        - Calling method 3
     */
    public static void main(String[] args) {
        method1();
    }

    static void method1(){
        System.out.println("Calling method 1");
        method2();
    }

    static void method2(){
        System.out.println("Calling method 2");
        method3();
    }

    static void method3(){
        System.out.println("Calling method 3");
    }
}
