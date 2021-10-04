
public class TextBlock {

	//	Novidade Java 13 - Text Blocks
	//  detalhes em https://www.baeldung.com/java-text-blocks
	public static void main(String[] args) {
		String text = "Lorem Ipsum is simply dummy text of the printing and typesetting \n"
				+ "industry. Lorem Ipsum has been the industry's standard dummy \n"
				+ "text ever since the 1500s, when an unknown printer took a galley \n"
				+ "of type and scrambled it to make a type specimen book. It has \n"
				+ "survived not only five centuries, but also the leap into electronic \n"
				+ "typesetting, remaining essentially unchanged. It was popularised in \n"
				+ "the 1960s with the release of Letraset sheets containing Lorem \n"
				+ "Ipsum passages, and more recently with desktop publishing \n"
				+ "software like Aldus PageMaker including versions of Lorem Ipsum.";
		// System.out.println(text);
		
		
		/**
		 * Agora eh possivel formatar um texto de maneira mais facil, colocando-o da 
		 * forma desejada entre 3 aspas duplas. Muito util por exemplo, em projetos 
		 * com query sqls muito grandes escritas dentro do codigo java. O Programador 
		 * tinha que sair estruturando a sql de forma manual para facilitar a leitura 
		 * do codigo na manutencao.
		 */
		String formatedText = """
				Lorem Ipsum is simply dummy text of the printing and typesetting 
				industry. Lorem Ipsum has been the industry's standard dummy 
				text ever since the 1500s, when an unknown printer took a galley 
				of type and scrambled it to make a type specimen book. It has 
				survived not only five centuries, but also the leap into electronic 
				typesetting, remaining essentially unchanged. It was popularised in 
				the 1960s with the release of Letraset sheets containing Lorem 
				Ipsum passages, and more recently with desktop publishing 
				software like Aldus PageMaker including versions of Lorem Ipsum.
				""";
		
		System.out.println(formatedText);
	}
}
