import java.util.ArrayList;
import java.util.List;

public class task02 {
    public static void main(String[] args) {
        int maxNum = 1000;
        boolean isSimpleNum = true;
        List<Integer> simpleNums = new ArrayList<>();

        for (int i = 2; i <= maxNum; i++) {
            isSimpleNum = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isSimpleNum = false;
                    break;
                }
            }
            if (isSimpleNum) {
                simpleNums.add(i);
            }
        }
        System.out.println(simpleNums);
    }
}
