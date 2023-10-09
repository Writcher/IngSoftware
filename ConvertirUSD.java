import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.*;

public class ConvertirUSD {
    private final String apiKey;
    private final OkHttpClient httpClient;

    public ConvertirUSD() {
        this.apiKey = "534e43e8cef843db9a23f2a40451d68b";
        this.httpClient = new OkHttpClient();
    }

    public double convertirARSaUSD(double amountInARS) throws Exception {
        String url = "https://openexchangerates.org/api/latest.json?app_id=" + apiKey;

        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = httpClient.newCall(request).execute()) {
            if (response.isSuccessful()) {
                String responseBody = response.body().string();
                System.out.println(responseBody);
                JSONObject jsonResponse = new JSONObject(responseBody);
                double exchangeRate = jsonResponse.getJSONObject("rates").getDouble("ARS");
                return amountInARS / exchangeRate;
            } else {
                throw new Exception("Error al realizar la solicitud a la API de Open Exchange Rates");
            }
        }
    }
}
