package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1.Реверс значений массива");
        int[] intArray = {1, 5, 3, 2, 6, 4, 7};
        printIntArray(intArray);
        int lenght = intArray.length;
        for (int i = 0; i < lenght; i++) {
            lenght--;
            if (i == intArray.length / 2) {
                continue;
            }
            intArray[i] = intArray[i] + intArray[lenght];
            intArray[lenght] = intArray[i] - intArray[lenght];
            intArray[i] -= intArray[lenght];
        }
        printIntArray(intArray);

        System.out.println("\n2.Вывод произведения элементов массива");
        intArray = new int[10];
        int product = 1;
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
            if (i == 0 || i == 9) {
                System.out.printf("intArray[%d] = %d%n", i, intArray[i]);
                continue;
            }
            product *= intArray[i];
            System.out.print(intArray[i] + (i != 8 ? " * " : (" = " + product + "\n")));
        }

        System.out.println("\n3.Удаление элементов массива");
        double[] doubleArray = new double[15];
        lenght = doubleArray.length;
        for (int i = 0; i < lenght; i++) {
            doubleArray[i] = Math.random();
        }
        printDoubleArray(doubleArray);
        int zeroCounter = 0;
        double middleSlot = doubleArray[lenght / 2];
        for (int i = 0; i < lenght; i++) {
            if (doubleArray[i] > middleSlot) {
                doubleArray[i] = 0;
                zeroCounter++;
            }
        }
        printDoubleArray(doubleArray);
        System.out.println("Количество обнуленных ячеек = " + zeroCounter);

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
        printStringArray(stringArray);

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
        printStringArray(stringArrayCopy);
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
