package instances;

import Main.Universal;
import Main.InstancesParent;

public class Human extends InstancesParent implements Universal {

int jump;

    public Human(int jump, int run, String name)
    {
        super(run, name);
        this.jump = jump;
    }

    @Override
    public void jump() {

    }

    @Override
    public void run() {

    }
}