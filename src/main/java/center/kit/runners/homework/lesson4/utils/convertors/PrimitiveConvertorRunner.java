package center.kit.runners.homework.lesson4.utils.convertors;

import center.kit.app.homework.lesson4.utils.convertors.PrimitiveConvertor;

public class PrimitiveConvertorRunner {
    public static void main(String[] args) {
        PrimitiveConvertor primitiveConvertor =
                new PrimitiveConvertor();
        primitiveConvertor.floatToChar(45.8f);
        primitiveConvertor.intToChar(128);
        primitiveConvertor.charToInt('N');
    }
}
