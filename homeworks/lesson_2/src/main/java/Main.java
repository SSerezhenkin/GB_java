import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        String json = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        JSONObject filter = new JSONObject(json);
        StringBuilder whereClause = new StringBuilder();
        for (String key : filter.keySet()) {
            String value = filter.getString(key);
            if (value != null && !value.equals("null")) {
                whereClause.append(key).append("='").append(value).append("' AND ");
            }
        }
        String whereClauseStr = whereClause.substring(0, whereClause.length() - 5);
        String sql = "SELECT * FROM students WHERE " + whereClauseStr;
    }
}
