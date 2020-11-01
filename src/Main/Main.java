package Main;

import instances.Cat;
import instances.Human;
import instances.Robot;
import interfaces.Jumping;
import interfaces.Running;
import obstacles.Track;
import obstacles.Wall;

public class Main
{

    public static void main(String[] args)
    {
        Human human = new Human(1, 100);
        Cat cat = new Cat(2, 90);
        Robot robot = new Robot(20, 500);
        Wall wall = new Wall(2);
        Track track = new Track(100);

        Object[] instances = {human, cat, robot};
        Object[] obstacles = {wall, track};
        toDo(instances, obstacles);
    }

    public static void toDo(Object[] instances, Object[] obstacles)
    {
        for (Object instance : instances) {
            boolean check;
            for (Object obstacle : obstacles) {
                if (obstacle instanceof Wall) {
                    check = ((Jumping) instance).jump(obstacle);
                } else {
                    check = ((Running) instance).run(obstacle);
                }
                if (!check) break;
            }
        }
    }

   public static boolean getRun(Object obstcl, int length, String name)
    {
        int b = ((Track)obstcl).getLength();
        if (length >= b)
        {
            System.out.println(name + " пробежал " + b + "м."); return true;
        }
        else System.out.println(name + " пробежал только на " +length+
                "м. и выбывает из гонки"); return false;
    }
    public static boolean getJump(Object obstcl, int height, String name)
    {
        int a = ((Wall)obstcl).getHeight();
        if (height >= a)
        {
            System.out.println(name + " перепрыгнул стену высотой в " + a + "м"); return true;
        }
        else System.out.println(name + " прыгает только на " +height+ "м. и выбывает из гонки"); return false;
    }
}