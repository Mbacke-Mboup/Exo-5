package org.mboup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            int element = Integer.parseInt(args[i]);
            list.add(element);
        }
        TriComparator(list);
    }

    public static void TriComparator(List<Integer> list){
        List<Integer> newList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++){
            String element = list.get(i).toString();
            List<Integer> chiffres = new ArrayList<>();
            for (int j = 0; j < element.length() ; j++) {
                int chiffre = Character.getNumericValue(element.charAt(j));
                chiffres.add(chiffre);
            }

           int index = Nombre7(chiffres);
            if(index == 0){
                newList.add(0,list.get(i));
            }else if(index == 1){
                newList.add(0,list.get(i));

            }else if(index == 2){
                newList.add(0,list.get(i));

            }

            System.out.println(newList);

        }
    }

    public static int Nombre7(List<Integer> list){
       int nombre = Collections.frequency(list, 7);
       return nombre;
    }


}

