package Lesson_2;

public class Main
{
        public static void main(String[] args)
        {
String[][] array = {{"9", "2", "1", "3"}, {"9", "2", "1", "3"}, {"9", "2", "1", "3"}, {"9", "2", "1", "3"}};
String[][] badArraySize = {{"9", "2", "1", "3"}, {"9", "2"}, {"9", "2", "1", "3"}, {"9", "2", "1", "3"}};
String[][] notIntArray = {{"9", "2", "1", "3"}, {"9", "2", "1", "3"}, {"9", "A", "1", "3"}, {"9", "2", "1", "3"}};

            try {
                checkArr(badArraySize);
            }catch (ParentException e)
            {
                System.err.println(e.getMessage());
            }
            try {
                checkArr(notIntArray);
            }catch (ParentException e)
            {
                System.err.println(e.getMessage());
            }
            try {
                System.out.println("Сумма значений массива: " + checkArr(array));
            } catch (ParentException e) {
                e.printStackTrace();
            }
         }

    public static int checkArr(String[][] arr) throws MyArraySizeException, MyArrayDataException
    {
        int sum = 0;
        if (arr.length != 4) throw new MyArraySizeException();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) throw new MyArraySizeException();
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException a) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }return sum;
    }
}
