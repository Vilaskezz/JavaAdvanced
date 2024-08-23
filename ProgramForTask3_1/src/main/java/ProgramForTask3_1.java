import java.util.Random;

/**
 * Created on 22.08.2024
 *
 * @author VSAfanasev
 */
public class ProgramForTask3_1 {
	int maxNegativeValue;
	int minPositiveValue;
	boolean noNegativeNumber;
	boolean noPositiveNumber;
	int jMaxNegative;
	int jMinPositive;
	int[] arrayInt;

	/**
	 * конструктор класса ProgramForTask3_1
	 * - инициализирует поля класса значениями по умолчанию;
	 */
	public ProgramForTask3_1(){
		maxNegativeValue = -10;
		minPositiveValue = 10;
		noNegativeNumber = true;
		noPositiveNumber = true;
		jMaxNegative = 0;
		jMinPositive = 0;
		arrayInt = new int[20];
	}

	/**
	 * главный метод программы
	 * @param args параметры командной строки, указанные при запуске программы
	 */
	public static void main(String[] args) {
		ProgramForTask3_1 arrayObj = new ProgramForTask3_1();
		arrayObj.prepareArray();
		arrayObj.analyzeArray();
		arrayObj.changeArrayElementsPositions();
		arrayObj.printResults();
	}

	/**
	 * метод заполняет массв arrayInt размерностью 20 рандомными числами от -11 до 11
	 */
	public void prepareArray() {
		Random randomObj = new Random();
		System.out.print("Сформирован массив из следующих чисел: { ");
		for (int i = 0; i < arrayInt.length; i++) {
			arrayInt[i] = randomObj.nextInt(11) - randomObj.nextInt(11);
			if (i + 1 != arrayInt.length) {
				System.out.print(arrayInt[i] + ", ");
			} else {
				System.out.println(arrayInt[i] + " }");
			}
		}
	}

	/**
	 * в методе анализируется массив:
	 * - определяется максимальное целое отрицательное число;
	 * - определяется позиция в массиве максимального целого отрицательного числа;
	 * - определяется минимальное целое положительное число;
	 * - определяется позиция в массиве минимального целого положительного числа;
	 * - сбрасывается флаг "нет отрицательных чисел" в false, если есть хоть одно отрицательное число;
	 * - сбрасывается флаг "нет положительных чисел" в false, если есть хоть одно положительное число
	 */
	public void analyzeArray() {
		int j = 0;
		for (int arrayItem : arrayInt) {
			if (arrayItem < 0) {
				noNegativeNumber = false;
				if (maxNegativeValue < arrayItem) {
					maxNegativeValue = arrayItem;
					jMaxNegative = j;
				}
			} else if (arrayItem > 0) {
				noPositiveNumber = false;
				if (minPositiveValue > arrayItem) {
					minPositiveValue = arrayItem;
					jMinPositive = j;
				}
			}
			j++;
		}
	}

	/**
	 * метод
	 * - меняет местами в массиве максимальное целое отрицательное число и минимальное целое положительное число;
	 * - выводит на печать в консоль обновленный массив.
	 */
	public void changeArrayElementsPositions() {
		if (!noNegativeNumber && !noPositiveNumber) {
			arrayInt[jMaxNegative] = minPositiveValue;
			arrayInt[jMinPositive] = maxNegativeValue;
			System.out.println("Поменяны местами максимальный отрицательный и минимальный положительный элементы массива:");
			for (int i = 0; i < arrayInt.length; i++) {
				if (i + 1 != arrayInt.length) {
					System.out.print(arrayInt[i] + ", ");
				} else {
					System.out.println(arrayInt[i] + " }");
				}
			}
		}
	}

	/**
	 * метод печатает требуемые результаты задачи
	 */
	public void printResults() {
		if(noNegativeNumber){
			System.out.println("В массиве отсутствуют отрицательные элементы.");
		} else {
			System.out.printf("Максимальное отрицательное значение в массиве: %d%n", maxNegativeValue);
		}
		if(noPositiveNumber){
			System.out.println("В массиве отсутствуют положительные элементы.");
		} else {
			System.out.printf("Минимальное положительное значение в массиве: %d%n", minPositiveValue);
		}
	}
}

/*
- Массив размерностью 20
- Он заполняется случайными целыми числами от -10 до 10
- Нужно найти максимальный отрицательный и минимальный положительный элементы массива
- Поменять их местами.
*/