package instances;

import Main.Main;
import Main.Universal;

public class Robot implements Universal
{
    final String name = "Робот";
    protected int height;
    protected int length;

    public Robot(int height, int length)
    {
        this.height = height;
        this.length = length;
    }

    @Override
    public boolean run(Object obstacle)
    {
        return Main.getRun(obstacle, length, name);
    }

    @Override
    public boolean jump(Object obstacle)
    {
        return Main.getJump(obstacle, height, name);
    }
}
