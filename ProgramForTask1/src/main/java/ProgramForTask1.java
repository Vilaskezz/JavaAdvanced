import java.util.Scanner;

/**
 * Created on 19.08.2024
 * @author VSAfanasev
 */
public class ProgramForTask1 {
	/**
	 *  основной метод класса реализует 4 простых арифметических операции калькулятора
	 * @param args параметры командной строки, указанные при запуске программы
	 */
    public static void main(String[] args) {
		double result = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Введите первое число (целое или десятичную дробь): ");
		double x = in.nextDouble();
		System.out.println("Введите второе число (целое или десятичную дробь): ");
		double y = in.nextDouble();
		System.out.println("Введите одно из действий миникалькулятора ‘+’, ‘-’, ‘*’ или ‘/’: ");
		String calcOperator = in.next();
		boolean calculateResult = true;
				switch (calcOperator){
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
}

/*
Инструкция
- Реализовать сложение дробных чисел, которые пользователь вводит в консоль.
- Использовать комментарии и JavaDoc при описании метода.
- Использовать форматирование при выводе результата в консоль.
Полученный результат округлять до 4-х знаков после запятой.
Запушить проект в свой репозиторий на GitHub и прикрепить ссылку на него в ответе на задание
* Доп задание по желание: добавить возможность выбора другой операции (сложение, вычитание, деление, умножение)
*/