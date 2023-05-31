import java.util.logging.FileHandler; 
import java.util.logging.Level; 
import java.util.logging.Logger; 
import java.util.logging.SimpleFormatter;
import java.util.Arrays;

public class SecondTask {
    
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        Logger logger = Logger.getLogger("BubbleSortLog"); 
        FileHandler fh;  

        try {
            fh = new FileHandler("BubbleSortLog.log");  
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();  
            fh.setFormatter(formatter);  

            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
                logger.log(Level.INFO, "Iteration {0}: {1}", new Object[] {i+1, Arrays.toString(arr)});
            }
        } catch (Exception e) {  
            logger.log(Level.SEVERE, "error", e);  
        }  
    }
}