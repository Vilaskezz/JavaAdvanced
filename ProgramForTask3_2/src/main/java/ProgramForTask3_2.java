import Gift.Gift;
import Sweetness.Candy;
import Sweetness.ChocolateBar;
import Sweetness.Jellybean;
import Sweetness.Sweetness;

/**
 * Created on 22.08.2024
 *
 * @author VSAfanasev
 */
public class ProgramForTask3_2 {
    /**
     * основной метод класса реализует заполнение информации о сладостях, подарке и вывод данных
     * в консоль
     * @param args параметры командной строки, указанные при запуске программы
     */
    public static void main(String[] args) {
        // ниже заполняется информация о сладостях:
        Candy candy = new Candy(
                "Чупа-чупс",
                10f,
                50f,
                "леденец");
        ChocolateBar chocolateBar1 = new ChocolateBar(
                "Милка",
                80,
                80,
                25f);

        ChocolateBar chocolateBar2 = new ChocolateBar(
                "Аленка",
                85,
                90,
                25f);

        ChocolateBar chocolateBar3 = new ChocolateBar(
                "Бабаевский горький",
                90f,
                190f,
                050f);

        Jellybean jellybean1 = new Jellybean(
                "Желейный торт",
                1000f,
                1300f,
                "клубника");

        Jellybean jellybean2 = new Jellybean(
                "Желейный торт",
                1050f,
                1500f,
                "мультифрукт");

        // ниже заполняется информация о двух подарках Иванушке и Алёнушке:
        Sweetness[] box1 = {candy, chocolateBar1, chocolateBar3, jellybean1};
        Sweetness[] box2 = {candy, chocolateBar2, chocolateBar3, jellybean2};
        Gift giftI = new Gift(box1, "Иванушке");
        Gift giftA = new Gift(box2, "Алёнушке");

        // ниже выводятся характеристики и состав подарков деткам
        giftI.printGiftInfo();
        System.out.println();
        giftA.printGiftInfo();
    }
}

/*
Формируется сладкий подарок.
- Он может включать в себя разные сладости (Candy, Jellybean, etc.)
- У каждой сладости есть название, вес, цена и свой уникальный параметр
- Необходимо собрать подарок из сладостей
- Найти общий вес подарка, общую стоимость подарка
- Вывести на консоль информацию о всех сладостях в подарке
 */

