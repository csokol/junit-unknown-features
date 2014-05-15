package br.com.caelum.almoco.dao;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.internal.runners.statements.ExpectException;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.Timeout;

public class PerguntaDaoTest extends DaoTest {
	
	@Rule
	public Timeout timeout = new Timeout(10000);
	
	@Rule
	public TemporaryFolder temp = new TemporaryFolder(new File("/tmp"));
	
	@Rule
	public ExpectedException expected = ExpectedException.none();
	
	@Rule
	public CronometroRule log = new CronometroRule();
	
	@Rule
	public FazAlgoQuandoFalha algo = new FazAlgoQuandoFalha();

	@Test
	public void testeComTimeout() {
		System.out.println("faço umas queries aqui");
		queryLenta();
	}
	
	@Test
	public void testeComTemp() throws IOException {
		System.out.println("mexo em uns arquivos");
		File file = temp.newFile("um_arquivo_para_teste");
		file.mkdir();
		System.out.println(file.getAbsolutePath());
		queryLenta();
	}
	
	@Test()
	public void testeComException() throws IOException {
		seila();
		
		expected.expect(IllegalArgumentException.class);
		throw new IllegalArgumentException(); // esperava esse
	}
	
	

	private void seila() {
		throw new IllegalArgumentException();
	}

	private void queryLenta() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

}
