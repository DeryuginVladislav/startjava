public class VariablesTheme{
    public static void main(String[] args) {
        System.out.println("Вывод значений переменных на консоль");
        byte numberOfCores = 2;
        System.out.println("Число ядер процессора = " + numberOfCores);
        short numberOfDisks = 2;
        System.out.println("Количество дисков на пк = " + numberOfDisks);
        int numberOfUsers = 1;
        System.out.println("Количество пользователей = " + numberOfUsers);
        long numberOfPrograms = 20;
        System.out.println("Количество установленных программ = " + numberOfPrograms);
        float cpuFrequency = 2.5f;
        System.out.println("Частота процессора = " + cpuFrequency);
        double frequencyTurboBoost = 2.8;
        System.out.println("Частота процессора в турбобусте = " + frequencyTurboBoost);
        char firstLetterOfMyName = 'V';
        System.out.println("Первая буква моего имени = " + firstLetterOfMyName);
        boolean myNameIsVlad = true;
        System.out.println("Моё имя Влад?" + myNameIsVlad);

        System.out.println("\nРасчет стоимости товара со скидкой");
        byte penCost = 100;
        short bookCost = 200;
        System.out.println("Сумма скидки = " + (penCost+bookCost)*0.11);
        System.out.println("Общая стоимость товаров со скидкой = " + 
            ((penCost+bookCost)-(penCost+bookCost)*0.11));

        System.out.println("\nВывод слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");
        
        System.out.println("\nВывод min и max значений целых числовых типов");
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("Максимальное значение типа byte = " + maxByte);
        short maxShort = Short.MAX_VALUE;
        System.out.println("Максимальное значение типа short = " + maxShort);
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Максимальное значение типа int = " + maxInt);
        long maxLong = Long.MAX_VALUE;
        System.out.println("Максимальное значение типа long = " + maxLong);
        maxByte=++maxByte;
        System.out.println("Максимальное значение типа byte после инкремента = " + maxByte);
        maxShort=++maxShort;
        System.out.println("Максимальное значение типа short после инкремента = " + maxShort);
        maxInt=++maxInt;
        System.out.println("Максимальное значение типа int после инкремента = " + maxInt);
        maxLong=++maxLong;
        System.out.println("Максимальное значение типа long после инкремента = " + maxLong);
        System.out.println("Максимальное значение типа byte после декремента = " + (--maxByte));
        System.out.println("Максимальное значение типа short после декремента = "+ (--maxShort));
        System.out.println("Максимальное значение типа int после декремента = " + (--maxInt));
        System.out.println("Максимальное значение типа long после декремента = " + (--maxLong));

        System.out.println("\nПерестановка значений переменных");
        int number1 = 2;
        int number2 = 5;
        System.out.println("Перестановка c помощью третьей переменной");
        System.out.println("Исходные значения = " + number1 + " и " + number2);
        int number3 = number2;
        number2 = number1;
        number1 = number3;
        System.out.println("Новые значения = " + number1 + " и " + number2);
        System.out.println("Перестановка c помощью арифметических операций");
        number1 += number2;
        number2 = number1 - number2;
        number1 -= number2;
        System.out.println("Новые значения = " + number1 + " и " + number2);
        System.out.println("Перестановка c помощью побитовой операции ^");
        number1 ^= number2;
        number2 = number1 ^ number2;
        number1 ^= number2;
        System.out.println("Новые значения = " + number1 + " и " + number2);

        System.out.println("\nВывод символов и их кодов");
        char char1 = '#';
        char char2 = '&';
        char char3 = '@';
        char char4 = '^';
        char char5 = '_';
        System.out.println("Код символа 35 = " + char1);
        System.out.println("Код символа 38 = " + char2);
        System.out.println("Код символа 64 = " + char3);
        System.out.println("Код символа 94 = " + char4);
        System.out.println("Код символа 95 = " + char5);

        System.out.println("\nВывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char bracket = '(';
        char backBracket = ')';
        char underscore = '_';
        System.out.println("     "+slash + "" + backSlash);
        System.out.println("    "+slash + "  " + backSlash);
        System.out.println("   "+slash +""+ underscore +""+ bracket + " " + backBracket + "" +
                backSlash);
        System.out.println("  "+slash + "      " + backSlash);
        System.out.println(" "+slash +""+ underscore +""+ underscore +""+ underscore +""+ underscore +
                "" +slash +""+ backSlash +""+ underscore +""+ underscore +""+ backSlash);

        System.out.println("\nВывод количества сотен, десятков и единиц числа");
        int dataTask = 123;
        int hundred = dataTask/100;
        int ten = (dataTask - hundred * 100) / 10;
        int units = dataTask % 10;
        System.out.println("Число" + dataTask + "содержит: ");
        System.out.println("" + hundred + " сотня");
        System.out.println("" + ten + " десятка");
        System.out.println("" + units + " единицы");
        System.out.println("Сумма его цифр = " + (hundred + ten + units));
        System.out.println("А произведение его цифр = " + (hundred * ten * units));

        System.out.println("\nВывод времени");
        int second = 86399;
        int minute = 86399 / 60;
        int hour = minute / 60;
        System.out.println(hour + ":" + minute + ":" + second);
    }
}   