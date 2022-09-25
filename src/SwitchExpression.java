
public class SwitchExpression {

	// Novidade Java 14 - Switch expressions
	public static void main(String[] args) {
		String option = "1";
		switch (option) {
		case "1":
			System.out.println("opcao 1");
			break;
		case "2":
			System.out.println("opcao 2");
			break;
		case "3":
			System.out.println("opcao 3");
			break;
		default:
			System.out.println("opcao padrao");
			break;
		}

		/**
		 * A partir do Java 14 eh possivel reescrever o switch case acima de forma menos
		 * verbosa, utilzando lambda expressions, da seguinte forma:
		 */

		switch (option) {
		case "1" -> System.out.println("opcao 1");
		case "2" -> System.out.println("opcao 2");
		case "3" -> System.out.println("opcao 3");
		default -> System.out.println("opcao padrao");
		}
		
		System.out.println(getDiaSemana(DiaSemana.DOMINGO));

	}

	private static String getDiaSemana(DiaSemana dia) {
		return switch (dia) {
			case SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA -> "Dia Útil";
			case SABADO, DOMINGO -> "Fim de Semana";
			default -> "Dia inválido";
		
	
		};
	}

	private enum DiaSemana {
		SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;
	}
}
