package ru.prog;

import java.util.ArrayList;
import java.util.*;

/**
 * Created by Вася on 12.03.2017.
 */
public class Collections {
    public static void main(String[] args){
        String [] langs = {"Java", "C#", "Python", "PHP" };
                /* new String [4];
        langs [0] = "Java";
        langs [1] = "C#";
        langs [2] = "Python";
        langs [3] = "PHP";
        for (int i = 0; i < langs.length; i++) {
            System.out.println ("Я хочу выучить  " + langs [i]);
        }*/
      //  List<String> languages = new ArrayList<String>();
      //  List<String> languages = Arrays.asList("Java", "C#", "Python", "PHP" );
        // объекты произвольных типов
        List<String> languages = Arrays.asList("Java", "C#", "Python", "PHP" );
        /*languages.add("Java");
        languages.add("C#");
        languages.add("Python");
        languages.add("Python");
        languages.add("PHP");

        for (Object l : languages){
            System.out.println("Я хочу выучить  " + languages.get(i));
        }
*/
        for (int i = 0; i < languages.size(); i++){
            System.out.println("Я хочу выучить  " + languages.get(i));
        }


//        for (String l : languages) {
//            System.out.println("Я хочу выучить  " + l);
//        }
    }
}
