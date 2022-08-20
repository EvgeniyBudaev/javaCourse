package javaRushUniversity.javaSyntax.level23.lesson03; // com.javarush.task.pro.task13.task1322;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getShapeNameByCountOfCorners(3));
        System.out.println(getShapeNameByCountOfCorners(5));
        System.out.println(getShapeNameByCountOfCorners(1));
    }

    public static String getShapeNameByCountOfCorners(int countOfCorner) {
        String shape;

        var result = switch(countOfCorner) {
            case 3 -> shape = "Треугольник";
            case 4 -> shape = "Четырехугольник";
            case 5 -> shape = "Пятиугольник";
            case 6 -> shape = "Шестиугольник";
            case 7 -> shape = "Семиугольник";
            case 8 -> shape = "Восьмиугольник";
            default -> shape = "Другая фигура";
        };

        return shape;
    }
}