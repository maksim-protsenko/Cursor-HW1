package education.cursor.homework1;

public class OperationsWithPrimitives {
    public static void main(String[] args) {
        byte firstByteNumber = 0xf;
        byte secondByteNumber = 0x11;
        double correctDivisionResultForByte = (double)firstByteNumber / (double)secondByteNumber;
        System.out.println("Math operations with BYTE data type:");
        System.out.println(firstByteNumber + " + " + secondByteNumber + " = " + (firstByteNumber + secondByteNumber));
        System.out.println(firstByteNumber + " - " + secondByteNumber + " = " + (firstByteNumber - secondByteNumber));
        System.out.println(firstByteNumber + " * " + secondByteNumber + " = " + (firstByteNumber * secondByteNumber));
        System.out.println(firstByteNumber + " / " + secondByteNumber + " = " + (firstByteNumber / secondByteNumber) + " (Wrong result because of not doing type casting)");
        System.out.println(firstByteNumber + " / " + secondByteNumber + " = " + correctDivisionResultForByte + " (Correct result of division)");
        System.out.println("-------------------------------------------");

        short firstShortNumber = 30000;
        short secondShortNumber = 503;
        double correctDivisionResultForShort = (double)firstShortNumber / (double)secondShortNumber;
        System.out.println("Math operations with SHORT data type:");
        System.out.println(firstShortNumber + " + " + secondShortNumber + " = " + (firstShortNumber + secondShortNumber));
        System.out.println(firstShortNumber + " - " + secondShortNumber + " = " + (firstShortNumber - secondShortNumber));
        System.out.println(firstShortNumber + " * " + secondShortNumber + " = " + (firstShortNumber * secondShortNumber));
        System.out.println(firstShortNumber + " / " + secondShortNumber + " = " + (firstShortNumber / secondShortNumber)+ " (Wrong result because of not doing type casting)");
        System.out.println(firstShortNumber + " / " + secondShortNumber + " = " + correctDivisionResultForShort + " (Correct result of division)");
        System.out.println("-------------------------------------------");

        long firstLongNumber = 54032100L;
        long secondLongNumber = 9258L;
        double correctDivisionResultForLong = (double)firstLongNumber / (double)secondLongNumber;
        System.out.println("Math operations with LONG data type:");
        System.out.println(firstLongNumber + " + " + secondLongNumber + " = " + (firstLongNumber + secondLongNumber));
        System.out.println(firstLongNumber + " - " + secondLongNumber + " = " + (firstLongNumber - secondLongNumber));
        System.out.println(firstLongNumber + " * " + secondLongNumber + " = " + (firstLongNumber * secondLongNumber));
        System.out.println(firstLongNumber + " / " + secondLongNumber + " = " + (firstLongNumber / secondLongNumber)+ " (Wrong result because of not doing type casting)");
        System.out.println(firstLongNumber + " / " + secondLongNumber + " = " + correctDivisionResultForLong + " (Correct result of division)");
        System.out.println("-------------------------------------------");

        double firstDoubleNumber = 5.53;
        double secondDoubleNumber = 1.12;
        System.out.println("Math operations with DOUBLE data type:");
        System.out.println(firstDoubleNumber + " + " + secondDoubleNumber + " = " + (firstDoubleNumber + secondDoubleNumber));
        System.out.println(firstDoubleNumber + " - " + secondDoubleNumber + " = " + (firstDoubleNumber - secondDoubleNumber));
        System.out.println(firstDoubleNumber + " * " + secondDoubleNumber + " = " + (firstDoubleNumber * secondDoubleNumber));
        System.out.println(firstDoubleNumber + " / " + secondDoubleNumber + " = " + (firstDoubleNumber / secondDoubleNumber));
        System.out.println("-------------------------------------------");

        float firstFloatNumber = 5.53F;
        float secondFloatNumber = 1.12F;
        double moreAccurateDivisionResult = (double)firstFloatNumber / (double)secondFloatNumber;
        System.out.println("Math operations with FLOAT data type:");
        System.out.println(firstFloatNumber + " + " + secondFloatNumber + " = " + (firstFloatNumber + secondFloatNumber));
        System.out.println(firstFloatNumber + " - " + secondFloatNumber + " = " + (firstFloatNumber - secondFloatNumber));
        System.out.println(firstFloatNumber + " * " + secondFloatNumber + " = " + (firstFloatNumber * secondFloatNumber));
        System.out.println(firstFloatNumber + " / " + secondFloatNumber + " = " + (firstFloatNumber / secondFloatNumber));
        System.out.println(firstFloatNumber + " / " + secondFloatNumber + " = " + moreAccurateDivisionResult + " (More accurate result of division because of doing type casting to Double type)");
        System.out.println("-------------------------------------------");
    }
}
