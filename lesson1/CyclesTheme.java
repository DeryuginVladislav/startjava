public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1.Подсчет суммы четных и нечетных чисел");
        int counter = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEven + " , а нечетных = " + sumOdd);

        System.out.println("\n2.Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num1;
        if (max < num2) {
            max = num2;
        }
        if (max < num3) {
            max = num3;
        }
        if (min > num2) {
            min = num2;
        }
        if (min > num3) {
            min = num3;
        }
        for (int i = --max; i > min; i--) {
            System.out.print(i + " ");
            max--;
        }

        System.out.println("\n\n3.Вывод реверсивного числа и суммы его цифр");
        int srcNum = 1234;
        int sumDigits = 0;
        System.out.print("Исходное число в обратном порядке: ");
        while (srcNum > 0) {
            int digit;
            digit = srcNum % 10;
            sumDigits += digit;
            System.out.print(digit);
            srcNum /= 10;
        }
        System.out.println("\nСумма цифр = " + sumDigits);

        System.out.println("\n4.Вывод чисел на консоль в несколько строк");
        int numsInLine = 0;
        for (int i = 1; i < 24; i += 2) {
            numsInLine++;
            System.out.printf("%4d", i);
            if (numsInLine == 5) {
                System.out.println();
                numsInLine = 0;
            }
        }
        for (int i = 0; i < (5 - numsInLine); i++) {
            System.out.printf("%4d", 0);
        }

        System.out.println("\n\n5.Проверка количества двоек на четность/нечетность");
        srcNum = 3242592;
        int countTwos = 0;
        int copySrcNum = srcNum;
        while (copySrcNum > 0) {
            if ((copySrcNum % 10) == 2) {
                countTwos++;
            }
            copySrcNum /= 10;
        }
        if (countTwos % 2 == 0) {
            System.out.println("Число " + srcNum + " содержит " + countTwos + " четное колличество двоек");
        } else {
            System.out.println("Число " + srcNum + " содержит " + countTwos + " нечетное колличество двоек");
        }

        System.out.println("\n6.Отображение фигур в консоли");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int symbolsInLine = 0;
        int symbolsInNextLine = 5;
        int rowNum = 1;
        while (rowNum < 6) {
            while (symbolsInLine < symbolsInNextLine) {
                System.out.print("#");
                symbolsInLine++;
            }
            symbolsInNextLine--;
            symbolsInLine = 0;
            rowNum++;
            System.out.println();
        }

        rowNum = 1;
        symbolsInLine = 0;
        do {
            do {
                System.out.print("$");
                symbolsInLine++;
            } while (symbolsInLine < rowNum);
            symbolsInLine = 0;
            rowNum++;
            System.out.println();
        } while (rowNum < 4);
        symbolsInNextLine = 2;
        do {
            do {
                System.out.print("$");
                symbolsInLine++;
            } while (symbolsInLine < symbolsInNextLine);
            symbolsInNextLine--;
            symbolsInLine = 0;
            rowNum++;
            System.out.println();
        } while (rowNum < 6);

        System.out.println("\n7.Отображение ASCII-символов");
        System.out.printf("%s%7s", "Dec", "Char");
        System.out.println("\n------------");
        for (int i = 0; i < 48; i++) {
            if (i % 2 != 0) {
                System.out.printf("%3d%7c%n", i, i);
            }
        }
        for (int i = 97; i < 123; i++) {
            if (i % 2 == 0) {
                System.out.printf("%3d%7c%n", i, i);
            }
        }

        System.out.println("\n8.Проверка, является ли число палиндромом");
        srcNum = 1234321;
        copySrcNum = srcNum;
        int lastDigit;
        int rev = 0;
        while (copySrcNum > 0) {
            lastDigit = copySrcNum % 10;
            rev = rev * 10 + lastDigit;
            copySrcNum /= 10;
        }
        if (srcNum == rev) {
            System.out.println("Число " + srcNum + " является палиндромом");
        } else {
            System.out.println("Число " + srcNum + " не является палиндромом");
        }

        System.out.println("\n9.Определение, является ли число счастливым");
        srcNum = 324351;
        copySrcNum = srcNum;
        int digitNum = 0;
        int digit = 0;
        int sum1 = 0;
        int sum2 = 0;
        while (copySrcNum > 0) {
            if (digitNum < 3) {
                digit = copySrcNum % 10;
                sum1 += digit;
                digitNum++;
            } else {
                digit = copySrcNum % 10;
                sum2 += digit;
            }
            copySrcNum /= 10;
        }
        System.out.println("Сумма цифр " + (srcNum / 1000) + " = " + sum1);
        System.out.println("Сумма цифр " + (srcNum % 1000) + " = " + sum2);
        if (sum1 == sum2) {
            System.out.println("Число " + srcNum + " является счастливым");
        } else {
            System.out.println("Число " + srcNum + " не является счастливым");
        }

        System.out.println("\n10.Вывод таблицы умножения Пифагора");
        System.out.print("  |");
        for (int i = 2; i < 10; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\n--|---------------------------------");
        for (int i = 2; i < 10; i++) {
            System.out.printf("%2d|", i);
            for (int j = 2; j < 10; j++) {
                System.out.printf("%4d", j * i);
            }
            System.out.println();
        }
    }
}