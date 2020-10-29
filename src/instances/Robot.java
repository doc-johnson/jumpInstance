package instances;

import Main.Universal;
import Main.InstancesParent;

public class Robot extends InstancesParent implements Universal {
    int jump;

    public Robot(int jump, int run, String name)
    {
        super(run, name);
        this.jump = jump;
    }

    @Override
    public void jump()
    {
        System.out.println("robot jumping");
    }

    @Override
    public void run()
    {
    }
}
