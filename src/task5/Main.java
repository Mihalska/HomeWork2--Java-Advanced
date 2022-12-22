package task5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in );
        System.out.println("Введіть з клавіатури рядки. Коли введете рядок 'end', отримаєте результат.");
         ArrayList <String > list = new ArrayList<>() ;
        while (list.size() < 100) {
            String s = input.next();
            if (s.equals("end") ) break;
            list.add(s);
        }
        for ( String  s : list  ) {
            System.out.println( s + "" );
        }
    }
}




