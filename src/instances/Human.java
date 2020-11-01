package instances;

import Main.Main;
import Main.Universal;

public class Human implements Universal
{
    final String name = "Человечешка";
    protected int height;
    protected int length;

    public Human(int height, int length)
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