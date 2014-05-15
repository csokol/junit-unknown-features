package br.com.caelum.almoco.dao;

import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FixedOrderedTests {
	
	@Rule
	public TestName testName = new TestName();
	
	@Test
	public void a() throws Exception {
		System.out.println(testName.getMethodName());
	}
	
	@Test
	public void b() throws Exception {
		System.out.println(testName.getMethodName());
	}
	
	@Test
	public void d() throws Exception {
		System.out.println(testName.getMethodName());
	}
	
	@Test
	public void c() throws Exception {
		System.out.println(testName.getMethodName());
	}
	

}
