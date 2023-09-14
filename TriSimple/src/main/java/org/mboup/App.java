package org.mboup;

import java.util.ArrayList;
import java.util.Collection;
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
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            double element = Double.parseDouble(args[i]);
            list.add(element);
        }

        System.out.println(TriSimple(list));
    }

    public static List<Double> TriSimple(List<Double> list){
        Collections.sort(list);
        return list;
    }

}
