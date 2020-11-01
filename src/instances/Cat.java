package instances;

import Main.Universal;
import Main.Main;

public class Cat implements Universal { // допустим у нас 30 интерфейсов
    final String name = "Кот";
    protected int height;
    protected int length;

    public Cat(int height, int length)
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

