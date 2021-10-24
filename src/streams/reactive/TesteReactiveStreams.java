package streams.reactive;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SubmissionPublisher;

//Java 9
public class TesteReactiveStreams {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService threadPool = Executors.newFixedThreadPool(3);
		System.out.println("Iniciando processamento de notas...");
		System.out.println("Nome da thread: "+Thread.currentThread().getName());
		NotaFiscal nota1 = new NotaFiscal("Joao", BigDecimal.valueOf(20), LocalDate.now());
		NotaFiscal nota2 = new NotaFiscal("Pedro", BigDecimal.valueOf(30), LocalDate.now());
		SubmissionPublisher<NotaFiscal> publisher = new SubmissionPublisher<NotaFiscal>(threadPool,1);
		NotaFiscalService nfs = new NotaFiscalService();
		publisher.consume(nfs::emitir);
		publisher.submit(nota1);
		publisher.submit(nota2);
		publisher.close();
		System.out.println("Processo seguinte a emissão...");
		Thread.sleep(20000);
	}
}
