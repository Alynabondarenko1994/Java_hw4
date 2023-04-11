
// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.


import java.util.*;

public class Task1 {
    public static void main(String[] args)  {

        LinkedList<Integer> list = new LinkedList<Integer>();
     
        for (int i = 0; i < new Random().nextInt(1,10); i++) {
            list.add(new Random().nextInt(-100,100));
            
        }
        System.out.printf("Исходный список имеет следующий вид:\n%s\n", list);
        System.out.printf("Перевернутый список имеет следующий вид:\n%s\n", invertedList(list));

    }
       
       public static LinkedList<Integer> invertedList(LinkedList<Integer> list ) {
        LinkedList<Integer> invertedList = new LinkedList<Integer>();
        for(int i = 0;i <= list.size() - 1; i++){
            invertedList.add(list.get(list.size() - 1 - i));
        }
        return invertedList;      
    } 
       
      
}