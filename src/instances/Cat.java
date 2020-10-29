package instances;

import Main.Universal;
import Main.InstancesParent;

public class Cat extends InstancesParent implements Universal {
int jump;

    public Cat(int jump, int run, String name)
    {
        super(run, name);
        this.jump = jump;
    }

    @Override
    public void jump()
    {
        System.out.println(" cat jump");
    }

    @Override
    public void run()
    {
    }
}