package br.com.caelum.almoco.dao;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

@RunWith(Theories.class)
public class WtfTheories {
	
	@Theory
	public void testName(@TestedOn(ints={1,2,3}) int x, @TestedOn(ints={1,2,3}) int y) throws Exception {
		System.out.println(x + "," + y);
	}
	
	@Theory
	public void seila(@TestedOn(ints={1,2,3}) int n) throws Exception {
		Conta conta = new Conta();
		conta.deposita(n);
		conta.saca(n);
		assertEquals(1, conta.getSaldo());
	}
	
	
	
	
	
	
	
	
	
	
	@Theory
	public void comMeuGenerator(@Random(10) int n) throws Exception {
		Assume.assumeTrue(n > 0);
		Conta conta = new Conta();
		conta.deposita(n);
		conta.saca(n);
		System.out.println(n);
		assertEquals(0, conta.getSaldo());
	}

}
