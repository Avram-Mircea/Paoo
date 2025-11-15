public class Main {
    public static void main(String[] args)
    {
        C2Nr c2Nr = new C2Nr(1,2);
        C3Nr c3Nr = new C3Nr(9,8,7);

        System.out.println("Suma C2Nr: " + c2Nr.getSum());
        System.out.println("Suma C3Nr: " + c3Nr.getSum());

        C2Nr a = Adaptor.toC2Nr(c3Nr);
        System.out.println("Suma C2Nr din C3Nr: " + a.getSum());

        C3Nr b = Adaptor.toC3Nr(c2Nr);
        System.out.println("Suma C3Nr din C2Nr: " + b.getSum());
    }
}