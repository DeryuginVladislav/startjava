package com.startjava.lesson4;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1.Реверс значений массива");
        int[] intArray = {1, 5, 3, 2, 6, 4, 7};
        getIntArray(intArray);
        int lenght = intArray.length;
        for (int i = 0; i < lenght / 2; i++) {
            intArray[i] = intArray[i] + intArray[lenght - 1 - i];
            intArray[lenght - 1 - i] = intArray[i] - intArray[lenght - 1 - i];
            intArray[i] -= intArray[lenght - 1 - i];
        }
        getIntArray(intArray);

        System.out.println("\n2.Вывод произведения элементов массива");
        intArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int product = 1;
        for (int i = 1; i < intArray.length - 1; i++) {
            product *= intArray[i];
            System.out.print(i == 8 ? (intArray[i] + " = " + product) : (intArray[i] + " * "));
        }

        System.out.println("\n3.Удаление элементов массива");
        double[] doubleArray = new double[15];
        lenght = doubleArray.length;
        for (int i = 0; i < lenght; i++) {
            doubleArray[i] = Math.random();
            System.out.printf("%.3f ", doubleArray[i]);
            if (i == lenght / 2) {
                System.out.println();
            }
        }
        System.out.println();
        int zeroCounter = 0;
        for (int i = 0; i < lenght; i++) {
            if (doubleArray[i] > doubleArray[lenght / 2]) {
                doubleArray[i] = 0;
                zeroCounter++;
            }
        }
        for (int i = 0; i < lenght; i++) {
            System.out.printf("%.3f ", doubleArray[i]);
            if (i == lenght / 2) {
                System.out.println();
            }
        }
        System.out.println("\nКоличество обнуленных ячеек = " + zeroCounter);

        System.out.println("\n4.Вывод элементов массива лесенкой в обратном порядке");
        char[] charArray = new char[26];
        char letter = 64;
        for (int i = 0; i < 26; i++) {
            charArray[i] = ++letter;
        }
        int lettersInLine = 0;
        for (int i = 0; i < 26; i++) {
            for (int j = 25; j >= 0; j--) {
                System.out.print(charArray[j]);
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
        lenght = intArray.length;
        for (int i = 0; i < lenght; i++) {
            intArray[i] = (int) (60 + Math.random() * 40);
            for (int j = i - 1; j >= 0; j--) {
                if (intArray[i] == intArray[j]) {
                    intArray[i] = (int) (60 + Math.random() * 40);
                    j = i;
                }
            }
        }
        int buffer;
        int numsInLine = 0;
        for (int i = 0; i < lenght; i++) {
            for (int j = i + 1; j < lenght; j++) {
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
        String[] stringArray = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};

        int lenghtStringArrayCopy = 0;
        for (int i = 0; i < stringArray.length; i++) {
            int j = 0;
            if (!stringArray[i].isBlank()) {
                lenghtStringArrayCopy++;
            }
        }
        getStringArray(stringArray);

        String[] stringArrayCopy = new String[lenghtStringArrayCopy];
        int start = 0;
        int end = 0;
        int stringsInLine = 0;
        int insertionIndex = 0;
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].isBlank()) {
                end = i;
            } else {
                if (start > 0) {
                    continue;
                } else {
                    start = i;
                }
            }
            stringsInLine = end - start;
            if (stringsInLine > 0) {
                System.arraycopy(stringArray, start, stringArrayCopy, insertionIndex, stringsInLine);
                insertionIndex += stringsInLine;
                start = 0;
                end = 0;
            }
        }
        getStringArray(stringArrayCopy);
    }

    private static void getIntArray(int[] intArray) {
        for (int num : intArray) {
            System.out.print(num + " ");
            System.out.println();
        }
    }

    private static void getStringArray(String[] stringArray) {
        for (String string : stringArray) {
            System.out.print(string);
        }
        System.out.println();
    }

}
