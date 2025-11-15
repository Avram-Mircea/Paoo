public class Main {
    CPU cpu;
    GPU gpu;

    public Main(Manager_components manager)
    {
        cpu = manager.setCPU();
        gpu = manager.setGPU();
    }

    public void show()
    {
        cpu.specifications();
        gpu.specifications();
    }

    public static void main(String[] args)
    {
        Manager_components manager = new Setup_1();
        Main m = new Main(manager);
        m.show();

        manager = new Setup_2();
        m = new Main(manager);
        m.show();
    }
}