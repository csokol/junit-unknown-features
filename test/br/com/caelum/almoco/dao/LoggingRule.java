package br.com.caelum.almoco.dao;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class LoggingRule implements TestRule {

	@Override
	public Statement apply(Statement base, Description description) {
		return new Statement() {
			@Override
			public void evaluate() throws Throwable {
				System.out.println("começando teste: " + description.getMethodName());
				try {
					base.evaluate();
				} finally {
					System.out.println("fim do teste\n\n");
				}
			}
		};
	}

}
