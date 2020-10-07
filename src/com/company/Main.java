package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, String[]> dictionary = new HashMap<>();
        Map<String, String[]> dictionaryBig = new HashMap<>();
        dictionary.put("сладкий", new String[]{"медовый", "приторный", "вкусный"});
        dictionary.put("позитивный", new String[]{"положительный", "одобрительный", "действующий"});
        dictionary.put("хобби", new String[]{"увлечение", "любимоее занятие", "слабость", "страсть"});

        /*for (Map.Entry<String, String[]> item: dictionary.entrySet()){
            System.out.printf(item.getKey()+""+ Arrays.toString(item.getValue()));
        }*/
        HashMap<String,String[]> bigDictionary = new HashMap<>();
        bigDictionary.putAll(dictionary);
        System.out.println("__________________");

        System.out.println(Arrays.toString(dictionaryBig.get("сладкий")));
        System.out.println("_____________________");
        Set <String> keys = dictionaryBig.keySet();
        Iterator<String> iter = keys.iterator();
        while (iter.hasNext()){
            String k = iter.next();
            for (int i = 0; i <dictionary.get(k).length ; i++) {
                ArrayList<String> strings = new ArrayList<>();
                Collections.addAll(strings, dictionary.get(k));
                String I = strings.get(i);
                strings.set(i, k);
                String[] arr = new String[strings.size()];
                for (int g = 0; g < strings.size(); g++){
                    arr[g] = strings.get(g);
                }
                System.out.println("!____!");
                bigDictionary.put(I, arr);
            }
        }

        dictionary.putAll(dictionaryBig);

        System.out.println("BigDictionary:");
        Set <String> keys1 = bigDictionary.keySet();
        Iterator<String> iter1 = keys1.iterator();
        while (iter1.hasNext()){
            String k = iter1.next();
            System.out.println(Arrays.toString(dictionaryBig.get(k)));
        }
        System.out.println("___________________");










    }
}
