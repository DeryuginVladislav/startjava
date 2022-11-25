public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1.Перевод псевдокода на язык Java");
        int age = 33;
        if (age > 20) {
            System.out.println("Молодость прошла");
        } else {
            System.out.println("Ты еще молодой");
        }

        boolean maleGender = true;
        if (!maleGender) {
            System.out.println("Ты женщина");
        } else {
            System.out.println("Ты мужчина");
        }

        double height = 1.73;
        if (height < 1.80) {
            System.out.println("Ты не высокий");
        } else {
            System.out.println("Ты высокий");
        }

        char firstLatterName = "Vlad".charAt(0);
        if (firstLatterName == 'M') {
            System.out.println("Возможно ты Максим");
        } else if (firstLatterName == 'I') {
            System.out.println("Возможно ты Иван");
        } else {
            System.out.println("Ты не Максим и не Иван");
        }

        System.out.println("\n2.Поиск max и min числа");
        int firstInt = 5;
        int secondInt = 6;
        System.out.println("Числа: " + firstInt + " и " + secondInt);
        if (firstInt > secondInt) {
            System.out.println("max = " + firstInt);
            System.out.println("min = " + secondInt);
        } else if (firstInt < secondInt) {
            System.out.println("min = " + firstInt);
            System.out.println("max = " + secondInt);
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n3.Проверка числа");
        int number = -5;
        System.out.println("Число = " + number);
        if (number == 0) {
            System.out.println("Число является нулем");
        } else {
            if (number % 2 == 0) {
                System.out.println("Число является четным");
            } else if (number % 2 != 0) {
                System.out.println("Число является нечетным");
            }
            if (number > 0) {
                System.out.println("Число является положительным");
            } else if (number < 0) {
                System.out.println("Число является отрицательным");
            }
        }

        System.out.println("\n4.Поиск одинаковых цифр в числах");
        int num1 = 123;
        int num2 = 321;
        int hundredsNum1 = num1 / 100;
        int hundredsNum2 = num2 / 100;
        int tensNum1 = (num1 % 100) / 10;
        int tensNum2 = (num2 % 100) / 10;
        int onesNum1 = num1 % 10;
        int onesNum2 = num2 % 10;
        System.out.println("Исходные числа: " + num1 + " и " + num2);
        if (hundredsNum1 == hundredsNum2) {
            System.out.println("Одинаковые цифры в 3 разряде: " + hundredsNum1 + " и " + hundredsNum2);
        } else if (tensNum1 == tensNum2) {
            System.out.println("Одинаковые цифры во 2 разряде: " + tensNum1 + " и " + tensNum2);
        } else if (onesNum1 == onesNum2) {
            System.out.println("Одинаковые цифры в 1 разряде: " + onesNum1 + " и " + onesNum2);
        } else {
            System.out.println("У чисел нет одинаковых цифр");
        }

        System.out.println("\n5.Определение символа по его коду");
        char symbol = '\u0057';
        System.out.println("Символ: " + symbol);
        if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("Символ - маленькая буква");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("Символ - большая буква");
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println("Символ - цифра");
        } else {
            System.out.println("Не буква и не число");
        }

        System.out.println("\n6.Подсчет суммы вклада и начисленных банком %");
        int deposit = 300_000;
        double percent;
        if (deposit < 100_000) {
            percent = 0.05;
        } else if (deposit >= 100_000 && deposit <= 300_000) {
            percent = 0.07;
        } else {
            percent = 0.1;
        }
        System.out.println("Сумма вклада = " + deposit);
        System.out.println("Начисленный процент = " + (deposit * percent));
        System.out.println("Итоговая сумма с % = " + (deposit + deposit * percent));

        System.out.println("\n7.Определение оценки по предметам");
        int percentHistory = 59;
        int percentProgramming = 91;
        int gradeHistory = 2;
        int gradeProgramming = 2;
        if (percentHistory > 60 && percentHistory <= 73) {
            gradeHistory = 3;
        } else if (percentHistory > 73 && percentHistory <= 91) {
            gradeHistory = 4;
        } else if (percentHistory > 91) {
            gradeHistory = 5;
        }

        if (percentProgramming > 60 && percentProgramming <= 73) {
            gradeProgramming = 3;
        } else if (percentProgramming > 73 && percentProgramming <= 91) {
            gradeProgramming = 4;
        } else if (percentProgramming > 91) {
            gradeProgramming = 5;
        }
        System.out.println(gradeHistory + " по Истории");
        System.out.println(gradeProgramming + " по Программированию");
        System.out.println("Средний балл = " + ((gradeProgramming + gradeHistory) / 2));
        System.out.println("Средний % по предметам = " + ((percentHistory + percentProgramming) / 2));

        System.out.println("\n8.Расчет прибыли за год");
        int rent = 5000;
        int productSell = 13000;
        int costPrice = 9000;
        int profitInYear = (-rent + (productSell - costPrice)) * 12;
        if (profitInYear > 0) {
            System.out.println("Прибыль за год = +" + profitInYear);
        } else {
            System.out.println("Прибыль за год = " + profitInYear);
        }

        System.out.println("\n9.Подсчет количества банкнот");
        int sum = 567;
        int usd1 = 50;
        int usd10 = 5;
        int usd100 = 10;
        System.out.println("Номиналы банкнот: 1, 10, 100");
        System.out.println("Снятие 567$:");
        int usdOut100 = sum / 100;
        if (usdOut100 <= usd100) {
            System.out.println((usdOut100) + " Банкнот по 100$");
        } else {
            System.out.println("Недостаточно банкнот в банкомате");
        }
        int usdOut10 = (sum % 100) / 10;
        int ostatok = 0;
        if (usdOut10 <= usd10) {
            System.out.println((usdOut10) + " Банкнот по 10$");
        } else {
            System.out.println((usd10) + " Банкнот по 10$");
            ostatok = (usdOut10 - usd10) * 10;
            usdOut10 = usd10;
        }
        int usdOut1 = sum % 10 + ostatok;
        if (usdOut1 <= usd1) {
            System.out.println((usdOut1) + " Банкнот по 1$");
        } else {
            System.out.println("Недостаточно банкнот в банкомате");
        }
        if ((usdOut1 + usdOut10 * 10 + usdOut100 * 100) == sum) {
            System.out.println("Проверка...   ->   Успешно!");
        }
    }

}