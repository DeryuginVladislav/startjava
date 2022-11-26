public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1.Подсчет суммы четных и нечетных чисел");
        int i = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (i % 2 == 0) {
                sumEven += i;
                i++;
            } else {
                sumOdd += i;
                i++;
            }
        } while (i >= -10 && i <= 21);
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
        for (int j = --max; j > min; j--) {
            System.out.print(max + " ");
            max--;
        }

        System.out.println("\n\n3.Вывод реверсивного числа и суммы его цифр");
        int srcNum = 1234;
        int partOfSrcNumber;
        int sumOfParts = 0;
        System.out.print("Исходное число в обратном порядке: ");
        while (srcNum >= 1) {
            partOfSrcNumber = srcNum % 10;
            sumOfParts += partOfSrcNumber;
            System.out.print(partOfSrcNumber);
            srcNum /= 10;
        }
        System.out.println("\nСумма цифр = " + sumOfParts);

        System.out.println("\n4.Вывод чисел на консоль в несколько строк");
        int k = 0;
        for (int j = 1; j < 24; j += 2) {
            k++;
            if (k == 5) {
                System.out.printf("%4d%n", j);
                k = 0;
            } else {
                System.out.printf("%4d", j);
            }
        }
        for (int j = 0; j < (5 - k); j++) {
            System.out.printf("%4d", 0);
        }

        System.out.println("\n\n5.Проверка количества двоек на четность/нечетность");
        int srcNumber = 3242592;
        int countTwo = 0;
        int digit;
        int buffer = srcNumber;
        while (buffer > 0) {
            digit = buffer % 10;
            if (digit == 2) {
                countTwo++;
            }
            buffer /= 10;
        }
        if (countTwo % 2 == 0) {
            System.out.println("Число " + srcNumber + " содержит " + countTwo + " четное количество двоек");
        } else {
            System.out.println("Число " + srcNumber + " содержит " + countTwo + " нечетное количество двоек");
        }

        System.out.println("\n6.Отображение фигур в консоли");
        for (int j = 0; j < 5; j++) {
            for (int l = 0; l < 10; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int counter = 5;
        int counter2 = 5;
        while (counter2 > 0) {
            counter = counter2;
            while (counter > 0) {
                System.out.print("#");
                counter--;
            }
            System.out.println();
            counter2--;
        }

        i = 0;
        k = 0;
        int j = 1;
        do {
            do {
                System.out.print("$");
                i++;
            } while (i < j);
            i = 0;
            j++;
            k++;
            System.out.println();
        } while (k < 3);
        j -= 2;
        do {
            do {
                System.out.print("$");
                i++;
            } while (i < j);
            k++;
            i = 0;
            j--;
            System.out.println();
        } while (k < 5);

        System.out.println("\n7.Отображение ASCII-символов");
        System.out.printf("%s%7s", "Dec", "Char");
        System.out.println("\n------------");
        for (int l = 0; l < 48; l++) {
            if (l % 2 != 0) {
                System.out.printf("%3d%7c%n", l, l);
            }
        }
        for (int l = 97; l < 123; l++) {
            if (l % 2 == 0) {
                System.out.printf("%3d%7c%n", l, l);
            }
        }

        System.out.println("\n8.Проверка, является ли число палиндромом");
        int num = 1234321;
        buffer = num;
        int lastNum;
        int rev = 0;
        while (buffer > 0) {
            lastNum = buffer % 10;
            rev = rev * 10 + lastNum;
            buffer /= 10;
        }
        if (num == rev) {
            System.out.println("Число " + num + " является палиндромом");
        } else {
            System.out.println("Число " + num + " не является палиндромом");
        }

        System.out.println("\n9.Определение, является ли число счастливым");
        num = 324351;
        buffer = num;
        i = 0;
        digit = 0;
        int sum1 = 0;
        int sum2 = 0;
        while (buffer > 0) {
            if (i < 3) {
                digit = buffer % 10;
                sum1 += digit;
                i++;
            } else {
                digit = buffer % 10;
                sum2 += digit;
            }
            buffer /= 10;
        }
        System.out.println("Сумма цифр " + (num / 1000) + " = " + sum1);
        System.out.println("Сумма цифр " + (num % 1000) + " = " + sum2);
        if (sum1 == sum2) {
            System.out.println("Число " + num + " является счастливым");
        } else {
            System.out.println("Число " + num + " не является счастливым");
        }

        System.out.println("\n10.Вывод таблицы умножения Пифагора");
        System.out.print("  |");
        for (i = 2; i < 10; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\n--|---------------------------------");
        for (int l = 2; l < 10; l++) {
            System.out.printf("%2d|", l);
            for (int m = 2; m < 10; m++) {
                System.out.printf("%4d", m * l);
            }
            System.out.println();
        }
    }
}