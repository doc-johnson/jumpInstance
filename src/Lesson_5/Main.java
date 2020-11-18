package Lesson_5;

import java.util.Arrays;

public class Main {

    static final int SIZE = 10000000;
    static final int H = SIZE / 2;

    public static void main(String[] args)
    {
        slowMethod(initArr());
        fastThreadMethod(initArr());
    }

    private static float[] initArr ()
    {
        float[] arr = new float[SIZE];
        Arrays.fill(arr, 1);
        return arr;
    }

    private static void slowMethod(float[] arr)
    {
        long a = System.currentTimeMillis();

        Calculate t0 = new Calculate(arr);

        t0.start();

        try {
            t0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.currentTimeMillis();
        System.out.println("slowMethod: " + (System.currentTimeMillis() - a));
    }

    private static void fastThreadMethod(float[] arr)
    {
        float[] a1 = new float[H];
        float[] a2 = new float[H];

        long b = System.currentTimeMillis();

//    System.arraycopy(массив-источник, откуда начинаем брать данные из массива-источника,
//    массив-назначение, откуда начинаем записывать данные в массив-назначение,
//    сколько ячеек копируем)

        System.arraycopy(arr, 0, a1, 0, H);
        System.arraycopy(arr, H, a2, 0, H);

        Calculate t1 = new Calculate(a1);
        Calculate t2 = new Calculate(a2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(a1, 0, arr, 0, H);
        System.arraycopy(a2, 0, arr, H, H);

        System.currentTimeMillis();
        System.out.println("fastThreadsMethod: " + (System.currentTimeMillis() - b));
    }
}