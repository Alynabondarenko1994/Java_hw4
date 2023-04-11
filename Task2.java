// 2) Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.


import java.util.*;

public class Task2 {
    public static void main(String[] args)  {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < new Random().nextInt(2,10); i++) {
            list.add(new Random().nextInt(-100,100));
            
        }
        System.out.printf("Исходный список имеет следующий вид:\n%s\n", list);
        // Scanner iScanner = new Scanner(System.in);
        // System.out.println("Вводите элемент, который добавится в конец очереди:");
        // int  n = iScanner.nextInt();
        // iScanner.close();
        int  n = new Random().nextInt(-100,100);
        System.out.printf("Метод, который помещает элемент %s в конец очереди.\n",enqueue(list,n));
        System.out.printf("Очередь имеет следующий вид:\n%s\n", list);
        System.out.printf("Метод, который возвращает первый элемент из очереди и удаляет его:\n%s\n", dequeue(list));
        System.out.printf("Очередь имеет следующий вид:\n%s\n", list);
        System.out.printf("Метод, который возвращает первый элемент из очереди, не удаляя:\n%s\n", first(list));
        System.out.printf("Очередь имеет следующий вид:\n%s\n", list);
    }
       
    public static int enqueue(LinkedList<Integer> list, int element){
        list.addLast(element);
        return element;
    }
    public static int dequeue(LinkedList<Integer> list){
        int first=list.getFirst();
        list.removeFirst();
        return first;
    }
    public static int first(LinkedList<Integer> list){
        return list.getFirst();
    }
       
      
}