import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.concurrent.CompletableFuture;

public class HttpClientFeatures {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();
		URI uri = new URI("https://www.google.com.br");
		HttpRequest request = HttpRequest.newBuilder(uri).GET().build();
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		System.out.println("Status code: "+response.statusCode());
		System.out.println("Body: "+response.body());
		
		System.out.println("------------------Request Async------------------\n");
		CompletableFuture<HttpResponse<String>> sendAsync = client.sendAsync(request, BodyHandlers.ofString());
		sendAsync.whenComplete((s, t) -> System.out.println("----------------------------Resposta da request. \nBody: " + s.body()));
		System.out.println("\nExecutando Instrucoes seguintes...");
		System.out.println("\nExecutando outra instrução...");
		Thread.sleep(10000);
	}
}
