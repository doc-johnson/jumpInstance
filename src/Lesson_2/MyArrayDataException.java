package Lesson_2;

public class MyArrayDataException extends ParentException {

    public MyArrayDataException(int row, int col) {
        super(String.format("Найдена буква в массиве[%d, %d]", row, col));
    }
}