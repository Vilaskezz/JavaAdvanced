import java.util.Scanner;

/**
 * Created on 20.08.20241
 *
 * @author VSAfanasev
 */
public class ProgramForTask2 {
    /**
     * основной метод класса реализует 2 части: калькулятор и работу с массивом
     *
     * @param args параметры командной строки, указанные при запуске программы
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер задачи: (1 - калькулятор, 2 - массив строк): ");
        int i = in.nextInt();
        if (i == 1) {
            implementCalculator();
        } else if (i == 2) {
            ProcessWithConsoleForSecondPart();
        } else {
            System.out.println("Вы ввели некорректное значение!");
        }
        in.close();
    }

    /**
     *  метод реализует калькулятор из 4х действий: сложение, вычетание, умножение и деление
     */
    public static void implementCalculator() {
        double result = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число (целое или десятичную дробь): ");
        double x = in.nextDouble();
        System.out.println("Введите второе число (целое или десятичную дробь): ");
        double y = in.nextDouble();
        System.out.println("Введите одно из действий миникалькулятора ‘+’, ‘-’, ‘*’ или ‘/’: ");
        String calcOperator = in.next();
        boolean calculateResult = true;
        switch (calcOperator) {
            case "+": // действие при вводе в коммандной строке символа '+'
                result = x + y;
                break;
            case "-": // действие при вводе в коммандной строке символа '-'
                result = x - y;
                break;
            case "*": // действие при вводе в коммандной строке символа '*'
                result = x * y;
                break;
            case "/":
                result = x / y; // действие при вводе в коммандной строке символа '/'
                break;
            default:
                System.out.println("Вы что-то ввели некорректно");
                calculateResult = false;
        }
        if (calculateResult) {
            System.out.printf("Результат расчета: %.4f%n", result);
        }

    }

    /**
     *  метод реализует вторую часть задания:
     *  - определение размерности массива;
     *  - ввод слов через пробел для заполнения массива;
     *  - обработка ошибочного ввода пользователя;
     *  - поиск самого длинного слова в массиве;
     *  - вывод результата в консоль
     */
    public static void ProcessWithConsoleForSecondPart() {
        Scanner in = new Scanner(System.in);
        String maxArrayElement;
        System.out.println("Введите требуемый размер массива: ");
        int i = in.nextInt();
        System.out.println("Введите слова через пробел для заполнения массива " +
                "в количестве равном заданной длине массива: ");
        in.nextLine();
        String wordRow = in.nextLine();
        wordRow = wordRow.trim();
        in.close();
        String[] wordArray = wordRow.split(" ");
        if(wordRow.isEmpty()) {
            System.out.println("Вы что-то напутали с словами!");
        } else if (i <= 0) {
            System.out.println("Размер массива должен быть больше 0");
        } else if (wordArray.length < i) {
            System.out.println("Вы ввели недостаточно слов, по сравнению с заданным размером массива!");
        } else if (wordArray.length > i) {
            System.out.println("Вы ввели больше, чем нужно слов, по сравнению с заданным размером массива!");
        } else {
            maxArrayElement = findMaxArrayElement(wordArray);
            System.out.println("Вот самое длинное слово: " + maxArrayElement);
        }
    }

    /**
     * Метод возвращает самое длинное слово массива
     * @param arrayStr - массив слов
     * @return - возвращается самое длинное слово
     */
    public static String findMaxArrayElement(String[] arrayStr) {
        String maxElement = "";
        for (String element : arrayStr) {
            if (maxElement.length() < element.length()) {
                maxElement = element;
            }
        }
        return maxElement;
    }
}

/*
Инструкция
1. Реализовать операции сложения, вычитания, умножения и деления для калькулятора из предыдущего задания

2. Поиск максимального элемента в массиве:
- задаем массив слов
- размерность массива произвольна, задается в консоли
- после чего в консоли вводятся слова в количестве равном заданной длине массива
- в полученном массиве необходимо найти самое длинное слово
- результат вывести на консоль

3. Программа должна выполнять одно из заданий на выбор.
- Если в консоли ввести 1 - запуститься выполнение калькулятора
- Если в консоли ввести 2 - поиск максимального слова в массиве

Пример как это может выглядеть в консоли:
Enter number of task: (1 - calculator, 2 - string array)
1
Enter the first number
3
....
 */