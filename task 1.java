import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class task1 {
    public static <T> List<T> FunctionReverse(List<T> list) {
        List<T> reverse = new ArrayList<>(list);
        Collections.reverse(reverse);
        return reverse;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(55, 3, 6, 78);
        List<Integer> reverse = FunctionReverse(list);
        System.out.printf("Список -> %s\n", list);
        System.out.printf("Перевернутый Список -> %s\n",reverse);
    }
}