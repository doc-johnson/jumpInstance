package instances;

import jumpInstance.Universal;
import jumpInstance.Instance;

public class Human extends Instance implements Universal {

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