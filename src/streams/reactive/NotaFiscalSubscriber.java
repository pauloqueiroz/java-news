package streams.reactive;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class NotaFiscalSubscriber implements Subscriber<NotaFiscal>{

	private Subscription subscription;
	
	@Override
	public void onSubscribe(Subscription subscription) {
		System.out.println("Calling Onsubscribe");
		this.subscription = subscription;
		this.subscription.request(1);
		
	}

	@Override
	public void onNext(NotaFiscal nf) {
		NotaFiscalService service = new NotaFiscalService();
		service.emitir(nf);
		this.subscription.request(1);
		
	}

	@Override
	public void onError(Throwable throwable) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onComplete() {
		System.out.println("Notas emitidas com sucesso.");
		
	}

}
