package streams.reactive;

public class NotaFiscalService {

	public void emitir(NotaFiscal nf) {
		try {
			System.out.println("Emitindo nota fiscal.");
			Thread.sleep(5000);
			System.out.format("Nota fiscal de %s emitida com sucesso em %s.\n", nf.getNome(), nf.getData());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
