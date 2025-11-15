import java.util.List;

public class CoffeLover
{
    private List<CoffeMachine> coffeMachines;

    public void setcoffeMachines(List<CoffeMachine> coffeMachines){
        this.coffeMachines = coffeMachines;
    }

    public void makeCoffe() {
        coffeMachines.forEach(cm->cm.start());
    }
}
