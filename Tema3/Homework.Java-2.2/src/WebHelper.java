import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebHelper
{
    private static WebHelper instance;
    private String content;

    private static final String PAGE_URL = "https://www.ucv.ro/";

    private WebHelper() {}

    public static WebHelper getInstance() {
        if (instance == null) {
            instance = new WebHelper();
        }
        return instance;
    }

    // Metodă care returnează conținutul paginii web
    public String getWebSiteContent() {
        if (content == null) {
            content = loadWebContent();
        }
        return content;
    }

    // Încarcă efectiv pagina web (doar o dată)
    private String loadWebContent() {
        StringBuilder result = new StringBuilder();
        try {
            URL url = new URL(PAGE_URL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    result.append(line).append("\n");
                }
            }

        } catch (Exception e) {
            result.append("Eroare la încărcarea paginii: ").append(e.getMessage());
        }

        return result.toString();
    }
}
