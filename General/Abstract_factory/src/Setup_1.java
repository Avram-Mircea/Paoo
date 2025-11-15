public class Setup_1 implements Manager_components
{
    @Override
    public CPU setCPU()
    {
        return new CPU_i7_10th();
    }

    @Override
    public GPU setGPU()
    {
        return new GPU_NVIDIA_3050();
    }
}
