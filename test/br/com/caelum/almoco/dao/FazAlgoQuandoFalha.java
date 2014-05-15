package br.com.caelum.almoco.dao;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class FazAlgoQuandoFalha extends TestWatcher {
	
	@Override
	protected void failed(Throwable e, Description description) {
		System.out.println("falhou com " + e);
	}
	
	

}
