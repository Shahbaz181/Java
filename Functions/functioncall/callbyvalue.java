package functioncall;
// Call by Value means:  When you pass a variable to a method, Java sends a copy of its value, not the original variable.
public class callbyvalue {
     static void change(int x) {
        x = 100;
        System.out.println("Inside method: " + x);
    }

    public static void main(String[] args) {

        int a = 10;
        change(a);

        System.out.println("Outside method: " + a);
    }
}
