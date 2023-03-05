package hw_02;

import hw_02.custom.CustomComparator;

import java.io.*;
import java.util.*;

public class FileUtil {
    /**
     * Task 1.
     * <p /> The method rewrites the contents of one file to another file, but only in UPPERCASE.
     *
     * @param source      path.
     * @param destination path.
     * @throws IOException throws an exception if the file is handled incorrectly.
     *                     in this method, the direction of rewriting is selected
     */
    public void copyContent(String source, String destination) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбери направление перезаписи. Если 1- из первого во второй фаилб если 2-то обратное");
        Byte choose = scanner.nextByte();
        scanner.close();
        switch (choose) {
            case 1:
                copyContentWithUpperCase(source, destination);
                break;
            case 2:
                copyContentWithUpperCase(destination, source);
                break;
        }
    }

    /**
     * Task 1/1.
     * <p /> The method rewrites the contents of one file to another file, but only in UPPERCASE.
     *
     * @param source      path.
     * @param destination path.
     * @throws IOException throws an exception if the file is handled incorrectly.
     *                     This method performs the main task of overwriting
     */
    private void copyContentWithUpperCase(String source, String destination) throws IOException {
        File file = new File(source);
        if (file.isFile()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(source));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(destination))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    writer.write(line.toUpperCase());
                    writer.write('\n');
                }
                System.out.println("Done!");
            }
        } else {
            System.out.println("there is no such file!");
        }
    }

    /**
     * Task 2.
     * <p /> The method returns a list of lines in this file.
     *
     * @param source the path to the file.
     * @return list of lines in this file.
     * @throws IOException throws an exception if the file is handled incorrectly.
     */
    public List<String> stringList(String source) throws IOException {
        List<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(source))) {
            String line;
            while ((line = reader.readLine()) != null) {
                list.add(line);
            }
        }
        return list;
    }

    /**
     * Task 3.
     * <p /> The method returns a list of words starting with a vowel.
     *
     * @param source the path to the file.
     * @return words that begin with a vowel.
     * @throws IOException throws an exception if the file is handled incorrectly.
     */
    public List<String> wordsFromVowelLetter(String source) throws IOException {
        List<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(source))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tempWords = line.split("\\W+");
                for (String word : tempWords) {
                    if (word.toLowerCase().substring(0, 1).matches("[aeiouyаеёиоуэяю]")) {
                        list.add(word);
                    }
                }
            }
        }
        return list;
    }

    /**
     * Task 4.
     * <p /> The method returns a list of words for which the last letter matches the first letter of the word
     * following it.
     *
     * @param source the path to the file.
     * @return list of words for which the last letter matches the first letter of the word following it.
     * @throws IOException throws an exception if the file is handled incorrectly.
     */
    public List<String> wordsWithLastMatches(String source) throws IOException {
        List<String> lastMathesWords = new ArrayList<>();
        String[] tempWord = readFile(source).toString().split(" ");
        for (int i = 0; i < tempWord.length - 1; i++) {
            if (tempWord[i].toLowerCase().charAt(tempWord[i].length() - 1)
                    == tempWord[i + 1].toLowerCase().charAt(0)) {
                lastMathesWords.add(tempWord[i]);
            }
        }
        return lastMathesWords;
    }

    /**
     * Task 6.
     * <p /> The method returns the frequency of occurrence of all letters in the text, ignoring case.
     *
     * @param source the path to the file.
     * @return a collection of letters with their repetition in the text.
     * @throws IOException throws an exception if the file is handled incorrectly.
     */
    public Map<Character, Integer> getFrequencyRepetitionAllLettersText(String source) throws IOException {
        Map<Character, Integer> map = new TreeMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(source))) {
            int character;
            while ((character = reader.read()) != -1) {
                if (!map.containsKey((char) character)) {
                    map.put((char) character, 1);
                } else {
                    int entry = map.get((char) character);
                    map.put((char) character, entry + 1);
                }
            }
        }
        return map;
    }

    /**
     * Task 7.
     * <p /> The method returns the frequency of occurrence of all words in the text in ascending order
     * of frequency of occurrence.
     *
     * @param source the path to the file.
     * @return a collection of words in ascending order of their occurrences.
     * @throws IOException throws an exception if the file is handled incorrectly.
     */
    public Map<String, Integer> getFrequencyAllWords(String source) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        String[] tempWord = readFile(source).toString().split("[ .,!&?]");
        System.out.println(Arrays.toString(tempWord));
        String world = "";
        for (String s : tempWord) {
            world = s;
            if (!map.containsKey(world)) {
                map.put(world, 1);
            } else {
                int entry = map.get(world);
                map.put(world, entry + 1);
            }
        }
        Comparator<String> comparator = new CustomComparator(map);
        Map<String, Integer> sortedMap = new TreeMap<>(comparator);
        sortedMap.putAll(map);
        return sortedMap;
    }

    /**
     * Task 8.
     * <p />The method returns the overwritten information from the file along the source path to
     * the file ${origin_filepath}_. The overwritten information is a list of rows with numbers sorted
     * in ascending order.
     *
     * @param source the path to the file.
     * @throws IOException throws an exception if the file is handled incorrectly.
     */
    public void sortedInFile(String source) throws IOException {
        StringBuilder builder = new StringBuilder();
        String[] strings = readFile(String.valueOf(source)).toString().split("\\W");
        int[] integers = new int[strings.length];

        for (int i = 0; i < strings.length; i++) {
            integers[i] = Integer.parseInt(strings[i]);
        }

        Arrays.sort(integers);

        for (int integer : integers) {
            builder.append(integer).append(" ");
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(source + "_"))) {
            writer.write(builder.toString().trim());
        }
    }

    /**
     * Task 9.
     * <p />The method returns students' academic performance based on the data in the file
     *
     * @param source the path to the file.
     * @return map with student's surname and his avarageMark
     * @throws IOException throws an exception if the file is handled incorrectly.
     */
    public Map<String, Double> averageScore(String source) throws IOException {
        Map<String, Double> map = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(source))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] splitedString = line.trim().split("\\W");
                Double mark = 0.0;
                Double avgMark;
                int count = 0;
                for (int i = 0; i < splitedString.length; i++) {
                    if (splitedString[i].matches("[0-9]")) {
                        count++;
                        mark = mark + Double.parseDouble(splitedString[i]);
                    }
                    avgMark = mark / count;
                    map.put(splitedString[0], avgMark);
                }
            }
        }
        return map;
    }

    /**
     * Task 10.
     * <p /> The method replaces modifiers in java code from X to Y and saves the result to the file ${origin_filepath}_.
     *
     * @param source           path.
     * @param existingModifier Java modification.
     * @param newModifier      Java modification.
     * @throws IOException throws an exception if the file is handled incorrectly.
     *                     And this method selects which modifier is to be replaced with
     */
    public void javaReplaiceModificator(String source, String existingModifier, String newModifier) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбери направление перезаписи модификатора. Если 1- 1 на 2ой, если 2-обратное");
        Byte choose = scanner.nextByte();
        scanner.close();
        switch (choose) {
            case 1:
                replaiceModification(source, existingModifier, newModifier);
                break;
            case 2:
                replaiceModification(source, newModifier, existingModifier);
                break;
        }
    }

    /**
     * Task 10/1.
     * <p /> The method replaces modifiers in java code from X to Y and saves the result to the file ${origin_filepath}_.
     *
     * @param source           path.
     * @param existingModifier Java modification.
     * @param newModifier      Java modification.
     * @throws IOException throws an exception if the file is handled incorrectly.
     *                     This method performs the main task of overwriting
     */
    private void replaiceModification(String source, String existingModifier, String newModifier) throws IOException {
        String[] strings = readFile(source).toString().split("\n");

        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].replaceAll(existingModifier, newModifier);
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(source + "_"))) {
            for (String string : strings) {
                writer.write(string + "\n");
            }
        }
    }

    /**
     * Custom method to read file and parthing in String
     *
     * @param source
     * @return StringBuilder with line from file
     * @throws IOException
     */
    private StringBuilder readFile(String source) throws IOException {
        StringBuilder builder = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(source))) {
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line).append("\n");
            }
            return builder;
        }
    }
}
