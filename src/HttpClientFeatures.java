import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class HttpClientFeatures {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder(new URI("https://www.google.com.br")).GET().build();
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		System.out.println("Status code: "+response.statusCode());
		System.out.println("Body: "+response.body());
	}
}
