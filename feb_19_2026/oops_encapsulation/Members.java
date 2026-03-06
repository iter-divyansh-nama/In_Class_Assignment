package feb_19_2026.oops_encapsulation;

public class Members {

    public static int sv;

    // Static Method
    public static void sm() {
        System.out.println("Static Method sm()");
    }

    // Static Block
    static {
        System.out.println("Static Block Executed");
    }

    // Non-static variable
    public String nsv = "Non Static Variable";

    // Non-static Method
    public void nsm() {
        System.out.println("Non Static Method nsm()");
    }

    // Non-static block
    {
        System.out.println("Non Static Block Executed");
    }

    // Constructor
    Members() {
        System.out.println("Members Constructor Executed");
    }
}