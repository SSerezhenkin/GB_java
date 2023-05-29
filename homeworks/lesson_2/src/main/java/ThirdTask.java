import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.*;

public class ThirdTask {

    public static void main(String[] args) {
        String fileName = "students.json";
        try {
          String jsonString = new String(
              Files.readAllBytes(Paths.get(fileName)), StandardCharsets.UTF_8);
          JSONArray jsonArray = new JSONArray(jsonString);
          StringBuilder result = new StringBuilder();
          for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject student = jsonArray.getJSONObject(i);
            String surname = student.getString("фамилия");
            String grade = student.getString("оценка");
            String subject = student.getString("предмет");
            result.append(surname).append(" получил(а) ").append(grade)
                  .append(" в предмете \"").append(subject).append("\"\n");
          }
          System.out.println(result);
        } catch (IOException | JSONException e) {
          e.printStackTrace();
        }
      }
}
