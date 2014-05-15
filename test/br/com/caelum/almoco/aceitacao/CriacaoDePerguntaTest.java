package br.com.caelum.almoco.aceitacao;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(MeuRunner.class)
public class CriacaoDePerguntaTest extends TesteDeAceitacao {

	@Test
	public void deveCriarUmaPergunta() {
		System.out.println("teste de criar uma pergunta");
	}
	
	@Test
	public void deveFazerOutraCoisa() throws Exception {
		System.out.println("deve fazer outra coisa");
		Assert.fail();
	}
	
}
