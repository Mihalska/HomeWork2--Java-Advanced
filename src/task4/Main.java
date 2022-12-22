package task4;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Family f = new Family("Москва");
        Family f1 = new Family("Київ");
        Family f2 = new Family("Лондон");
        HashMap <Family,String > family = new HashMap<>();
         family.put(f, "Іванови");
         family.put(f1 , "Петрови");
         family.put(f2, "Абрамовичі");
         Scanner input = new Scanner(System.in);
        System.out.println("Введіть місто проживання (Москва, Київ чи Лондон)");
        String s = input.next() ;
         if (s.equals(f.name )){
             System.out.println(family.get(f) );
            }
         else if (s.equals(f1.name )) {
             System.out.println(family.get(f1));
         }  else if (s.equals(f2.name )) {
             System.out.println(family.get(f2));
         }  else {
             System.out.println("Ви ввели недопустиме значення");
        }
    }
}
class Family {
    String name;

    public Family(String name) {
        this.name = name;
    }





}
