package hw_02;

import hw_02.custom.CustomComparator;

import java.io.*;
import java.nio.file.Path;
import java.util.*;

public class FileUtil {

    public void copyContent(String source, String destination, Byte choose) throws IOException {
        switch (choose) {
            case 1:
                copyContentWithUpperCase(source, destination);
                break;
            case 2:
                copyContentWithUpperCase(destination, source);
                break;
        }
    }


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

    public void sortedInFile(Path source) throws IOException {
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

    public void javaCode(String source, String existingModifier, String newModifier) throws IOException {
        Byte choose = null;
        switch (choose) {
            case 1:
                replaiceModification(source, existingModifier, newModifier);
                break;
            case 2:
                replaiceModification(source, newModifier, existingModifier);
                break;
        }
    }

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
