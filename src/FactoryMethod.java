import java.util.List;
import java.util.Map;
import java.util.Set;

public class FactoryMethod {

	// Novidade Java 9 - Factory Method para collections
	public static void main(String[] args) {
		
		/**
		 * Agora eh possivel declarar uma lista, set ou map de dados utilizando o metodo
		 * of dessas classes, retornando uma lista imutavel com os dados passados. Para
		 * listas, por exemplo, eh bem parecido ao que faziamos com Arrays.asList(item1,
		 * item2, ite3, ...) nas versoes antigas do Java, porem com a restricao de 
		 * imutabilidade.
		 */
		List<String> times = List.of("Sao Paulo", "Santos", "Fluminense", "Flamengo");
		Set<String> nomes = Set.of("primeiro nome", "segundo nome");
		Map.of("nome", "joao");
	}
	
	
}
