public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
    }
    {
        System.out.println(a);
        System.out.println(b);

        // here we can see that a and b wont  called since they are being called outside the scope
    }
}
