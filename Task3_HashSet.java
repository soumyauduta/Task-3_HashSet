import java.util.HashSet;
import java.util.Set;

public class Task3_HashSet {
    public static void main(String[] args) {
        Set<Integer> hSetNumbers = new HashSet<Integer>();

        hSetNumbers.add(1);
        hSetNumbers.add(13);
        hSetNumbers.add(2);
        hSetNumbers.add(4);

        for (Integer number : hSetNumbers) {
            System.out.print(number+" ");
        }
    }
}
