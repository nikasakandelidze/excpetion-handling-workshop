package exceptionsWorkshop.level1;

public class ExceptionalFlowExample {
    /*
        Output:
            - Calling method 1
            - Calling method 2
            - Exception in thread "main" java.lang.RuntimeException: Something exceptional happened
     */
    public static void main(String[] args) {
        method1();
    }
    private static void method1(){
        System.out.println("Calling method 1");
        method2();
    }
    private static void method2(){
        System.out.println("Calling method 2");
        method3();  // This method won't be called
    }
    private  static void method3(){
        someExceptionalMethod();
        System.out.println("Calling method 3"); // This will not be printed

    }
    /*
        Method imitating some kind of exceptional mechanism
     */
    private static void someExceptionalMethod(){
        throw new RuntimeException("Something exceptional happened");
    }
}
