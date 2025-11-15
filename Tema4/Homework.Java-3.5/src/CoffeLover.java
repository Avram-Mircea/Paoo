public class CoffeLover
{
    private SimpleCoffeMachine simple;
    private ComplexCoffeMachine complex;

    public CoffeLover(){
        this.simple = new SimpleCoffeMachine();
        this.complex = new ComplexCoffeMachine();
    }

    public void makeCoffe() {
        simple.start();
        complex. start();
    }
}
