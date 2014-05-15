package br.com.caelum.almoco.aceitacao;

import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class Listener extends RunListener {

	private Gravador gravador;

	@Override
	public void testStarted(Description description) throws Exception {
		gravador = new Gravador();
		gravador.comeca();
	}
	
	@Override
	public void testFinished(Description description) throws Exception {
		gravador.termina();
		System.out.println("-----");
	}
	
	@Override
	public void testFailure(Failure failure) throws Exception {
		System.out.println("remove arquivo");
	}
}
