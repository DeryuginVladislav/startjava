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
        int num1 = 5;
        int num2 = 6;
        System.out.println("Числа: " + num1 + " и " + num2);
        if (num1 > num2) {
            System.out.println("max = " + num1 + " min = " + num2);
        } else if (num1 < num2) {
            System.out.println("max = " + num2 + " min = " + num1);
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n3.Проверка числа");
        int num = -5;
        System.out.println("Число = " + num);
        if (num == 0) {
            System.out.println("Число является нулем");
        } else {
            if (num % 2 == 0) {
                System.out.print("Число является четным");
            } else {
                System.out.print("Число является нечетным");
            }
            if (num > 0) {
                System.out.println(" и положительным");
            } else {
                System.out.println(" и отрицательным");
            }
        }

        System.out.println("\n4.Поиск одинаковых цифр в числах");
        num1 = 123;
        num2 = 321;
        int hundreds1 = num1 / 100;
        int hundreds2 = num2 / 100;
        int tens1 = (num1 % 100) / 10;
        int tens2 = (num2 % 100) / 10;
        int ones1 = num1 % 10;
        int ones2 = num2 % 10;
        System.out.println("Исходные числа: " + num1 + " и " + num2);
        if (hundreds1 == hundreds2) {
            System.out.println("Одинаковые цифры в 3 разряде: " + hundreds1 + " и " + hundreds2);
        }
        if (tens1 == tens2) {
            System.out.println("Одинаковые цифры во 2 разряде: " + tens1 + " и " + tens2);
        }
        if (ones1 == ones2) {
            System.out.println("Одинаковые цифры в 1 разряде: " + ones1 + " и " + ones2);
        }
        if (hundreds1 != hundreds2 && tens1 != tens2 && ones1 != ones2) {
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
        double percent = 0.1;
        if (deposit < 100_000) {
            percent = 0.05;
        } else if (deposit >= 100_000 && deposit <= 300_000) {
            percent = 0.07;
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
        int cost = 9000;
        int profitInYear = 12 * (productSell - rent - cost);
        if (profitInYear > 0) {
            System.out.println("Прибыль за год = +" + profitInYear);
        } else {
            System.out.println("Прибыль за год = " + profitInYear);
        }

        System.out.println("\n9.Подсчет количества банкнот");
        int sum = 567;
        int oneDollarBillsInAtm = 50;
        int tenDollarBillsInAtm = 5;
        int hundredDollarBillsInAtm = 10;
        int rest = 0;
        if (sum <= (oneDollarBillsInAtm + tenDollarBillsInAtm * 10 + hundredDollarBillsInAtm * 100)) {
            System.out.println("Номиналы банкнот: 1, 10, 100");
            System.out.println("Снятие 567$:");
            int hundredDollarBillsOut = sum / 100;
            if (hundredDollarBillsOut <= hundredDollarBillsInAtm) {
                System.out.println(hundredDollarBillsOut + " Банкнот по 100$");
            } else {
                System.out.println(hundredDollarBillsInAtm + " Банкнот по 100$");
                rest = (hundredDollarBillsOut - hundredDollarBillsInAtm) * 10;
            }
            int tenDollarBillsOut = (sum % 100) / 10 + rest;
            if (tenDollarBillsOut <= tenDollarBillsInAtm) {
                System.out.println(tenDollarBillsOut + " Банкнот по 10$");
            } else {
                System.out.println(tenDollarBillsInAtm + " Банкнот по 10$");
                rest = (tenDollarBillsOut - tenDollarBillsInAtm) * 10;
                tenDollarBillsOut = tenDollarBillsInAtm;
            }
            int oneDollarBillsOut = sum % 10 + rest;
            System.out.println(oneDollarBillsOut + " Банкнот по 1$");
            if ((oneDollarBillsOut + tenDollarBillsOut * 10 + hundredDollarBillsOut * 100) == sum) {
                System.out.println("Проверка...   ->   Успешно!");
            }
        } else {
            System.out.println("Недостаточно банкнот в банкомате");
        }
    }
}