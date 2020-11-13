package education.cursor.homework1;

public class OperationsWithPrimitives {
    public static void main(String[] args) {
        byte firstByteNumber = 11;
        byte secondByteNumber = 5;
        byte sumForByte = (byte)(firstByteNumber + secondByteNumber);
        byte differenceForByte = (byte)(firstByteNumber - secondByteNumber);
        byte productForByte = (byte)(firstByteNumber * secondByteNumber);
        double quotientForByte = (double)firstByteNumber / (double)secondByteNumber;
        System.out.println("Math operations with BYTE data type:");
        System.out.println(firstByteNumber + " + " + secondByteNumber + " = " + sumForByte);
        System.out.println(firstByteNumber + " - " + secondByteNumber + " = " + differenceForByte);
        System.out.println(firstByteNumber + " * " + secondByteNumber + " = " + productForByte);
        System.out.println(firstByteNumber + " / " + secondByteNumber + " = " + quotientForByte);
        System.out.println("-------------------------------------------");

        short firstShortNumber = 30000;
        short secondShortNumber = 503;
        short sumForShort = (short)(firstShortNumber + secondShortNumber);
        short differenceForShort = (short)(firstShortNumber - secondShortNumber);
        short productForShort = (short)(firstShortNumber * secondShortNumber);
        double quotientForShort = (double)firstShortNumber / (double)secondShortNumber;
        System.out.println("Math operations with SHORT data type:");
        System.out.println(firstShortNumber + " + " + secondShortNumber + " = " + sumForShort);
        System.out.println(firstShortNumber + " - " + secondShortNumber + " = " + differenceForShort);
        System.out.println(firstShortNumber + " * " + secondShortNumber + " = " + productForShort);
        System.out.println(firstShortNumber + " / " + secondShortNumber + " = " + quotientForShort);
        System.out.println("-------------------------------------------");

        long firstLongNumber = 54032100L;
        long secondLongNumber = 9258L;
        long sumForLong = firstLongNumber + secondLongNumber;
        long differenceForLong = firstLongNumber - secondLongNumber;
        long productForLong = firstLongNumber * secondLongNumber;
        double quotientForLong = (double)firstLongNumber / (double)secondLongNumber;
        System.out.println("Math operations with LONG data type:");
        System.out.println(firstLongNumber + " + " + secondLongNumber + " = " + sumForLong);
        System.out.println(firstLongNumber + " - " + secondLongNumber + " = " + differenceForLong);
        System.out.println(firstLongNumber + " * " + secondLongNumber + " = " + productForLong);
        System.out.println(firstLongNumber + " / " + secondLongNumber + " = " + quotientForLong);
        System.out.println("-------------------------------------------");

        double firstDoubleNumber = 5.53;
        double secondDoubleNumber = 1.12;
        double sumForDouble = firstDoubleNumber + secondDoubleNumber;
        double differenceForDouble = firstDoubleNumber - secondDoubleNumber;
        double productForDouble = firstDoubleNumber * secondDoubleNumber;
        double quotientForDouble = firstDoubleNumber / secondDoubleNumber;
        System.out.println("Math operations with DOUBLE data type:");
        System.out.println(firstDoubleNumber + " + " + secondDoubleNumber + " = " + sumForDouble);
        System.out.println(firstDoubleNumber + " - " + secondDoubleNumber + " = " + differenceForDouble);
        System.out.println(firstDoubleNumber + " * " + secondDoubleNumber + " = " + productForDouble);
        System.out.println(firstDoubleNumber + " / " + secondDoubleNumber + " = " + quotientForDouble);
        System.out.println("-------------------------------------------");

        float firstFloatNumber = 5.53F;
        float secondFloatNumber = 1.12F;
        float sumForFloat = firstFloatNumber + secondFloatNumber;
        float differenceForFloat = firstFloatNumber - secondFloatNumber;
        float productForFloat = firstFloatNumber * secondFloatNumber;
        float quotientForFloat = firstFloatNumber / secondFloatNumber;
        double moreAccurateDivisionResult = (double)firstFloatNumber / (double)secondFloatNumber;
        System.out.println("Math operations with FLOAT data type:");
        System.out.println(firstFloatNumber + " + " + secondFloatNumber + " = " + sumForFloat);
        System.out.println(firstFloatNumber + " - " + secondFloatNumber + " = " + differenceForFloat);
        System.out.println(firstFloatNumber + " * " + secondFloatNumber + " = " + productForFloat);
        System.out.println(firstFloatNumber + " / " + secondFloatNumber + " = " + quotientForFloat);
        System.out.println(firstFloatNumber + " / " + secondFloatNumber + " = " + moreAccurateDivisionResult + " (More accurate result of division because of doing type casting to Double type)");
        System.out.println("-------------------------------------------");
    }
}
