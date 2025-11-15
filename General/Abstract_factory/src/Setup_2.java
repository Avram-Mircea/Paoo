public class Setup_2 implements Manager_components
{
    @Override
    public CPU setCPU()
    {
        return new CPU_i5_13th();
    }

    @Override
    public GPU setGPU()
    {
        return new GPU_NVIDIA_4060();
    }
}
