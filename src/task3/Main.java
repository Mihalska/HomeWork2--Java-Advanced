package task3;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       LinkedList <Integer  > list = new LinkedList<>() ;
        getMinimum(getIntegerList(list ) )   ;
        }

    private static LinkedList <Integer  > getIntegerList(LinkedList <Integer  > list) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть 5 чисел ");
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
        System.out.print(list + " ");
        System.out.println();
        return list;
        }

    private static void getMinimum(LinkedList <Integer  > list) {
        System.out.println(Collections.min(list));
        }
}
