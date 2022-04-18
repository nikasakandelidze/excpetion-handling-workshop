package exceptionsWorkshop.level2;

public class HandlingExceptions {
    /*
        Output:
            - Calling method 1
            - Calling method 2
            - Caught an exception with trace: java.lang.RuntimeException: Something exceptional happened
     */
    public static void main(String[] args) {
        try{
            method1();
        }catch (RuntimeException e){
            System.out.printf("Caught an exception with trace: %s%n", e);
        }
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
        someExceptionalMethod();
        System.out.println("Calling method 3");
    }
    private static void someExceptionalMethod(){
        throw new RuntimeException("Something exceptional happened");
    }

}
