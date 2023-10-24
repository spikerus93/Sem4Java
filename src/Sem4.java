import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

public class Sem4 {
    public static void main (String[] args){
        task2();

//        MyStack myStack = new MyStack();
//        System.out.println(myStack.size());
//        myStack.push(1);
//        myStack.push(2);
//        myStack.push(3);
//        myStack.push(4);
//        System.out.println(myStack.size());
//        System.out.println(myStack.pop());
//        System.out.println(myStack.peek());
//        System.out.println(myStack.pop());
//        System.out.println(myStack.pop());
//        System.out.println(myStack.empty());
//        System.out.println(myStack.pop());
//        System.out.println(myStack.empty());
//
//        Stack<Integer> stack= new Stack<>();
//        for (int i = 0; i < 100; i++) {
//            myStack.push(i++);

        }





    public static void task1(){

        //    **Текст задачи:**
//1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
//2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
// Сравните с предыдущим.

//    Реализовать консольное приложение, которое:
////        1. Принимает от пользователя строку вида
////        text~num
////        1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//         2. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner =  new Scanner(System.in);
        boolean work = true;
        while (work){
            System.out.println("Input string: ");
            String line = scanner.nextLine();
            if (line.equals("exit")){
                System.out.println("Bye!");
                return;
            }
            String[] arr = line.split("~");
            int num = Integer.parseInt(arr[1]);
            String text = arr[0];
            switch (text) {
                case "print":
                    System.out.println(list.remove(num));
                case "exit":
                    System.out.println("Bye!");
                    work = false;
                    break;
                default:
                    list.add(num, text);
                    System.out.println("String added");
            }

        }
    }
    public static void task2() {
//        Реализовать консольное приложение, которое:
//
//1. Принимает от пользователя и “запоминает” строки.
//2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//3. Если введено revert, удаляет предыдущую введенную строку из памяти.
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner =  new Scanner(System.in);
        boolean work = true;
        while (work){
            System.out.println("Input string: ");
            String line = scanner.nextLine();
            if (line.equals("exit")){
                System.out.println("Bye!");
                return;
            }

            switch (line) {
                case "print":
                    ListIterator iterator = list.listIterator(list.size());
                    while (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                    System.out.println(list.remove(line));
                case "revert":
                    list.removeLast();
                    System.out.println("Element has been deleted");
                    break;
                default:
                    list.add(line);
                    System.out.println("String added");
            }

        }
    }

}
