package Lesson_2;

public class MyArrayDataException extends ParentException {

    public MyArrayDataException(int row, int col) {
        super(String.format("В массиве найдена буква - [%d, %d]", row, col));
    }
}