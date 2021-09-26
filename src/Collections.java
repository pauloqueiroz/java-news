import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {

	// Novidade Java 9 - Factory Method para collections
	public static void main(String[] args) {
		
		List<String> times = List.of("Sao Paulo", "Santos", "Fluminense", "Flamengo");
		Set<String> nomes = Set.of("primeiro nome", "segundo nome");
		Map.of("nome", "joao");
	}
	
	
}
