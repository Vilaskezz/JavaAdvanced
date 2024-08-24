import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.TreeMap;
import java.util.Scanner;

/**
 * Created on 22.08.2024
 * @author VSAfanasev
 */
public class ProgramForTask5 {

    /**
     * основной метод класса реализует вызов 3х основных методов для пятого задания
     * @param args параметры командной строки, указанные при запуске программы
     */
    public static void main(String[] args) {
        TreeMap<String, Integer> wordsAndCounters;
        String fileDirectory = System.getProperty("user.dir");
        String fileName = fileDirectory + "\\test_file.txt";
        wordsAndCounters = readAndAnalyseFileRows(fileName);
        String wordWithMaxCounter = findMaxFrequencyWord(wordsAndCounters);
        printTaskResults(wordsAndCounters, wordWithMaxCounter);
    }

    /**
     * в методоте реализовано построчное чтение файла и вызов метода
     *   prepareWordsAndCountersMap для каждой строки
     * @param fileName - в параметр передается полное имя файла
     * @return - метод возвращает карту вида слово: количество повторений
     */
    public static TreeMap<String, Integer> readAndAnalyseFileRows(String fileName) {
        String[] wordArray;
        TreeMap<String, Integer> wordsAndCounters = new TreeMap<>();
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            String wordRow;
            while (scanner.hasNextLine()) {
                wordRow = scanner.nextLine();
                wordRow = wordRow.trim();
                wordArray = wordRow.split(" ");
                wordsAndCounters = prepareWordsAndCountersMap(
                        wordArray,
                        wordsAndCounters);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return wordsAndCounters;
    }

    /**
     * метод формирует карту вида слово: количество повторений
     * @param wordArray - параметр содержит массив слов
     * @param wordsAndCounters - параметр содержаит карту вида слово: количество повторений
     * @return - метод возвращает обогащенную карту  вида слово: количество повторений
     */
    public static TreeMap<String, Integer> prepareWordsAndCountersMap(
            String[] wordArray,
            TreeMap<String, Integer> wordsAndCounters) {
        for (String word : wordArray) {
            if (Objects.equals(word, "")) {
                continue;
            }
            if (wordsAndCounters.containsKey(word)) {
                int counter = wordsAndCounters.get(word) + 1;
                wordsAndCounters.put(word, counter);
            }  else {
                wordsAndCounters.put(word, 1);
            }
        }
        return wordsAndCounters;
    }

    /**
     * метод возвращает слово с наибольшим количеством повторений в карте wordsAndCounters
     * @param wordsAndCounters -  параметр содержаит карту вида слово: количество повторений
     * @return - слово с наибольшим количеством повторений
     */
    public static String findMaxFrequencyWord(
            TreeMap<String, Integer> wordsAndCounters){
        int maxCounter = 0;
        int counter;
        String wordWithMaxCounter = "";
        for (String word : wordsAndCounters.keySet()){
            counter = wordsAndCounters.get(word);
            if(maxCounter < counter) {
                maxCounter = counter;
                wordWithMaxCounter = word;
            }
        }
        return wordWithMaxCounter;

    }

    /**
     * Метод выводит на печать требуемые результаты по заданию №5
     * @param wordsAndCounters - в параметр передается карта вида слово: количество повторений
     * @param wordWithMaxCounter - в параметр передается слово с максимальным количеством повторений
     */
    public static void printTaskResults(
            TreeMap<String, Integer> wordsAndCounters,
            String wordWithMaxCounter){
        int maxCounter;
        if (Objects.equals(wordWithMaxCounter, "")) {
            System.out.println("Вы что-то напутали с словами!");
        } else {
            System.out.println(wordsAndCounters);
            if (wordsAndCounters.containsKey(wordWithMaxCounter)) {
                maxCounter = wordsAndCounters.get(wordWithMaxCounter);
                System.out.println("Слово: '" + wordWithMaxCounter
                        + "' имеет наибольшее количество повторов: " + maxCounter + ";");
            }
        }
    }
}