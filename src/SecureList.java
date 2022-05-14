import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SecureList {

    private ArrayList<Integer> sList = new ArrayList<>();

    public SecureList(int[] arr) {

        if (arr == null) {
            throw new NullPointerException("Int array parameter must not be null");
        }
        sList = Arrays.stream(arr).boxed().collect(Collectors.toCollection(ArrayList::new));
    }

    public int get(int index) {
        int r = 0;
        if (index < sList.size()) {
            r = sList.get(index);
            sList.remove(index);
            return r;
        }
        else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public int size() {
        return sList.size();
    }

    public String toString() {
        String s = sList.toString().strip().replaceAll("\\s", "");
        sList = new ArrayList<>();
        return s;
    }
}
