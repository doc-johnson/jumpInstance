package jumpInstance;

import instances.Cat;
import instances.Human;
import instances.Robot;
import interfaces.Jumping;
import interfaces.Running;
import obstacles.Track;
import obstacles.Wall;

public class Main {

    public static void main(String[] args) {

        Human human = new Human(1, 100, "Ibragim");
        Cat cat = new Cat(2, 90, "Vaska");
        Robot robot = new Robot(20, 500, "BigDog");
        Wall wall = new Wall(2);
        Track track = new Track(100);

//        Universal universal = new Universal() {
//            @Override
//            public void jump() {
//
//            }
//
//            @Override
//            public void run() {
//
//            }
//        };
        Object[] instances = {human, cat, robot};
        Object[] obstacles = {wall, track};

        for (Object instance : instances)
        {
            boolean check;
            for (Object obstacle : obstacles)
            {
                if (obstacle instanceof Wall)
                {
                    check = Jumping(instance) == obstacle;
                }
                else
                {
                    check = ((Running) instance).run(obstacle);
                }
                if(!check){break;}
            }
        }
        





    }
}
