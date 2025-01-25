package gr.aueb.cf.ch16.defaul_static;

public interface IWelcome {

    static void staticMethod() {
        System.out.println("Hello from IWelcome static method");
    }

    default void defaultMethod() {
        System.out.println("Default method from IWelcome");
    }
}
