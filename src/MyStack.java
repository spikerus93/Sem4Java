public class MyStack {


//        📔 **Текст задачи:**
//Реализовать стэк с помощью массива. Нужно реализовать методы:
//
//size(), empty(), push(), peek(), pop().
    private Integer[] arr = new Integer[16];
    private int size = 0;

    int size(){
        return size;
       }
    boolean empty (){
        return size == 0;
        }
    void push (int item) {
        if ( size == arr.length) {
            Integer[] tempArr = new Integer[arr.length * 2];
            System.arraycopy(arr, 0, tempArr, 0, arr.length);
            arr = tempArr;

        }
        arr[size++] = item;

    }
    int peek () {
        return  arr[size-1];
    }
    int pop (){
        return arr[--size];
    }

}
