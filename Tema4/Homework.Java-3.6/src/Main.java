import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        SimpleCoffeMachine simpleCoffeMachine = new SimpleCoffeMachine();
        ComplexCoffeMachine complexCoffeMachine = new ComplexCoffeMachine();

        List <CoffeMachine> coffeMachineList = new ArrayList<>();
        coffeMachineList.add(complexCoffeMachine);
        coffeMachineList.add(simpleCoffeMachine);

        CoffeLover coffeLover = new CoffeLover(coffeMachineList);
        coffeLover.makeCoffe();
    }
}