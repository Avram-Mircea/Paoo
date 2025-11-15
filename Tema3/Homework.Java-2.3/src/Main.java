public class Main {
    public static void main(String[] args)
    {
        Complex a = new Complex(3,4);
        Complex b = new Complex(1,2);

        double c = 6.0;
        double d = 9.0;

        System.out.println("Complex + complex: " + Adaptor.sum(a,b));
        System.out.println("Double + double: " + Adaptor.sum(c,d));
        System.out.println("Complex + double: " + Adaptor.sum(a,c));
        System.out.println("Double + complex: " + Adaptor.sum(c,a));
    }
}