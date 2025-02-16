interface A {
    void A_method();
}

interface B {
    void B_method();
}

interface C extends A, B {
    void C_method();
}

class D implements A, B, C {
    public void A_method() {
        System.out.println("A_method");
    }

    public void B_method() {
        System.out.println("B_method");

    }

    public void C_method() {
        System.out.println("C_method");
    }
}

public class App {
    public static void main(String[] args) {

        D d = new D();
        d.A_method();
        d.B_method();
        d.C_method();

    }
}
