package streams.reactive;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.concurrent.SubmissionPublisher;

//Java 9
public class TesteReactiveStreams {

	public static void main(String[] args) throws InterruptedException {
		NotaFiscal nota1 = new NotaFiscal("Joao", BigDecimal.valueOf(20), LocalDate.now());
		SubmissionPublisher<NotaFiscal> publisher = new SubmissionPublisher<NotaFiscal>();
		NotaFiscalService nfs = new NotaFiscalService();
		publisher.consume(nfs::emitir);
		publisher.submit(nota1);
		publisher.close();
		System.out.println("Processo seguinte a emissão...");
		Thread.sleep(10000);
	}
}
