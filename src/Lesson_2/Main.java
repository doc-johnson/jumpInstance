package Lesson_2;

public class Main
{
        public static void main(String[] args)
        {
String[][] array = {{"9", "2", "1", "3"}, {"9", "2", "1", "3"}, {"9", "2", "1", "3"}, {"9", "2", "1", "3"}};
String[][] badSizeArr = {{"9", "2", "1", "3"}, {"9", "2"}, {"9", "2", "1", "3"}, {"9", "2", "1", "3"}};
String[][] charArray = {{"9", "2", "1", "3"}, {"9", "2", "1", "3"}, {"9", "A", "1", "3"}, {"9", "2", "1", "3"}};

            try {
                checkArr(badSizeArr);
            }catch (ParentException e)
            {
                System.err.println(e.getMessage());
            }
            try {
                checkArr(charArray);
            }catch (ParentException e)
            {
                System.err.println(e.getMessage());
            }
            try {
                System.out.println("Сумма чисел массива: " + checkArr(array));
            } catch (ParentException e) {
                e.printStackTrace();
            }

        }

    public static int checkArr(String[][] array) throws MyArraySizeException, MyArrayDataException
    {
        int sum = 0;
        if (array.length != 4) throw new MyArraySizeException();
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) throw new MyArraySizeException();
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException a) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }return sum;
    }
}