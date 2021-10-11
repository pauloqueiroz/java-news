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
		URI uri = new URI("https://www.google.com.br");
		HttpRequest request = HttpRequest.newBuilder(uri).GET().build();
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		System.out.println("Status code: "+response.statusCode());
		System.out.println("Body: "+response.body());
		
		HttpClient client2 = HttpClient.newHttpClient();
		HttpRequest request2 = HttpRequest.newBuilder(uri).GET().build();
		System.out.println("------------------Request Async------------------\n");
		client2.sendAsync(request2, BodyHandlers.ofString()).whenComplete((s, t) -> System.out.println("----------------------------Resposta da request. \nBody: " + s.body()));
		System.out.println("\nExecutando Instrucoes seguintes...");
		System.out.println("\nExecutando outra instrução...");
		Thread.sleep(10000);
	}
}
