package javaRushUniversity.javaSyntax.level16.lesson00; // task12.task1202;

/*
Распаковка
*/

/* В классе Solution представлены 8 объектов-оберток примитивных типов с именами вида типValueBox. Для каждого из этих
объектов-оберток необходимо создать переменные соответствующего примитивного типа и присвоить им имена вида типValue.
Для создания переменной используй метод объекта-обертки типValueBox.примитивValue(). */

public class Solution02 {
    Byte byteValueBox;
    Short shortValueBox;
    Integer integerValueBox;
    Long longValueBox;

    Float floatValueBox;
    Double doubleValueBox;

    Character characterValueBox;
    Boolean booleanValueBox;

    //напишите тут ваш код
    byte byteValue = byteValueBox.byteValue();
    short shortValue = shortValueBox.shortValue();
    int intValue = integerValueBox.intValue();
    long longValue = longValueBox.longValue();
    float floatValue = floatValueBox.floatValue();
    double doubleValue = doubleValueBox.doubleValue();
    char charValue = characterValueBox.charValue();
    boolean booleanValue = booleanValueBox.booleanValue();
}
