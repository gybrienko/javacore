package center.kit.app.homework.lesson4.utils.convertors;

public class PrimitiveConvertor {

    public void floatToChar(float float1) {
        char charfromfloat = (char) float1;
        System.out.println("Input float value is: " + float1 + " Output char value is: " + charfromfloat);
    }

    public void intToChar(int int1) {
        char charfromint = (char) int1;
        System.out.println("Input int value is: " + int1 + " Output char value is: " + charfromint);
    }

    public void charToInt(char char1) {
        int intfromchar = (int) char1;
        System.out.println("Input char value is: " + char1 + " Output int value is: " + intfromchar);
    }
}
