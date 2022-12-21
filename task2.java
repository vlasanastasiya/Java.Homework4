import java.util.LinkedList;
public class task2 {

    public static void main(String[] args) {

        int[] list = { 55, 6, 3, 56, 89 };

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (Integer temp : list) {
            linkedList.add(temp);
        }

        System.out.printf("Первоначальный Список -> %s\n",linkedList);

        enqueue(linkedList, 66);
        System.out.printf( "Список с методом enqueue -> %s\n",linkedList);

    
        System.out.println(dequeue(linkedList));
        System.out.printf("Список с методом dequeue -> %s\n", linkedList);
        

        System.out.println(first(linkedList));
        System.out.printf("Список с методом first -> %s\n", linkedList);
    }

    public static void enqueue(LinkedList<Integer> list, int lastnum) {
        list.addLast(lastnum);
    }

    public static int dequeue(LinkedList<Integer> list) {
        int delnum = 0;
        delnum = list.get(0);
        list.remove(0);
        return delnum;
    }

    public static int first(LinkedList<Integer> list) {
        int firstnum = 0;
        firstnum = list.get(0);
        return firstnum;
    }
}