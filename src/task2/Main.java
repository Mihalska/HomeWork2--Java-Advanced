package task2;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть імя ");
       ArrayList  <String > list = new ArrayList<>() ;
        for (int i = 0; i <5; i++) {
            list .add(input.next());
            }
        Double (list );
    }
   public static void  Double (ArrayList  <String > list ){
       int ind = 0;
       int elem = 0;
       for (int i = 0; i < 5; i++) {
           list.add (ind, list.get(elem));
           ind = ind +2;
           elem= elem +2;
       }
       for ( String  s : list  ) {
           System.out.println( s + "" );
       }
    }






}
