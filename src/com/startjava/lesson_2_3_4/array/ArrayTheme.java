package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1.Реверс значений массива");
        int[] intArray = {1, 5, 3, 2, 6, 4, 7};
        printIntArray(intArray);
        int length = intArray.length;
        int buffer;
        for (int i = 0; i < intArray.length / 2; i++) {
            length--;
            buffer = intArray[i];
            intArray[i] = intArray[length];
            intArray[length] = buffer;
        }
        printIntArray(intArray);

        System.out.println("\n2.Вывод произведения элементов массива");
        intArray = new int[10];
        length = intArray.length;
        int product = 1;
        for (int i = 0; i < length; i++) {
            intArray[i] = i;
            if (i == 0 || i == 9) {
                System.out.printf("intArray[%d] = %d%n", i, intArray[i]);
                continue;
            }
            product *= intArray[i];
            System.out.print(intArray[i] + (i != length - 2 ? " * " : (" = " + product + "\n")));
        }

        System.out.println("\n3.Удаление элементов массива");
        double[] doubleArray = new double[15];
        length = doubleArray.length;
        for (int i = 0; i < length; i++) {
            doubleArray[i] = Math.random();
        }
        printDoubleArray(doubleArray);
        int zeroCounter = 0;
        double middleNum = doubleArray[length / 2];
        for (int i = 0; i < length; i++) {
            if (doubleArray[i] > middleNum) {
                doubleArray[i] = 0;
                zeroCounter++;
            }
        }
        printDoubleArray(doubleArray);
        System.out.println("Количество обнуленных ячеек = " + zeroCounter);

        System.out.println("\n4.Вывод элементов массива лесенкой в обратном порядке");
        char[] alphabet = new char[26];
        length = alphabet.length;
        for (int i = 0; i < length; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        int lettersInLine = 0;
        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j >= 0; j--) {
                System.out.print(alphabet[j]);
                if (i == lettersInLine) {
                    lettersInLine++;
                    break;
                }
                lettersInLine++;
            }
            System.out.println();
            lettersInLine = 0;
        }

        System.out.println("\n5.Генерация уникальных чисел");
        intArray = new int[30];
        length = intArray.length;
        boolean isSame = false;
        for (int i = 0; i < length; i++) {
            buffer = (int) (60 + Math.random() * 40);
            isSame = false;
            for (int j = i - 1; j >= 0; j--) {
                if (buffer == intArray[j]) {
                    isSame = true;
                    i--;
                    break;
                }
            }
            if (!isSame) {
                intArray[i] = buffer;
            }
        }
        int numsInLine = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (intArray[i] > intArray[j]) {
                    buffer = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = buffer;
                }
            }
            System.out.print(intArray[i] + " ");
            numsInLine++;
            if (numsInLine == 10) {
                System.out.println();
                numsInLine = 0;
            }
        }

        System.out.println("\n6.Сдвиг элементов массива");
        String[] srcArray = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};

        int countStrings = 0;
        length = srcArray.length;
        for (int i = 0; i < length; i++) {
            int j = 0;
            if (!srcArray[i].isBlank()) {
                countStrings++;
            }
        }
        printStringArray(srcArray);

        String[] destArray = new String[countStrings];
        int srcPos = 0;
        int srcPosEnd = 0;
        int insertionLength = 0;
        int destPos = 0;
        for (int i = 0; i < length; i++) {
            if (srcArray[i].isBlank()) {
                srcPosEnd = i;
            } else {
                if (srcPos > 0) {
                    continue;
                } else {
                    srcPos = i;
                }
            }
            insertionLength = srcPosEnd - srcPos;
            if (insertionLength > 0) {
                System.arraycopy(srcArray, srcPos, destArray, destPos, insertionLength);
                destPos += insertionLength;
                srcPos = 0;
                srcPosEnd = 0;
            }
        }
        printStringArray(destArray);
    }

    private static void printIntArray(int[] intArray) {
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void printDoubleArray(double[] doubleArray) {
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.printf("%.3f ", doubleArray[i]);
            if (i == doubleArray.length / 2) {
                System.out.println();
            }
        }
        System.out.println();
    }

    private static void printStringArray(String[] stringArray) {
        for (String string : stringArray) {
            System.out.print(string);
        }
        System.out.println();
    }
}
