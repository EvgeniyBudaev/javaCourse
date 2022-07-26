package javaRushUniversity.javaSyntax.level16.lesson05; // task12.task1218;

import java.io.File;
import java.util.*;

/*
Shine bright like a diamond
*/

/* Shine bright like a diamond

В методе main создаются объекты разных типов. В некоторых случаях тип элементов объекта можно опустить и просто
использовать оператор diamond(<>). Замени тип элементов объекта на оператор diamond там, где это возможно, не меняя
левую часть выражений. Порядок следования переменных не должен меняться. */

public class Solution03 {

    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        Map<String, ArrayList<String>> map = new HashMap<>();
        var exceptionsList = new ArrayList<Exception>();
        var filesStack = new Stack<File>();
    }
}
