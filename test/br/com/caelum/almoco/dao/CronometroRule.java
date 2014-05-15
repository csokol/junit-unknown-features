package br.com.caelum.almoco.dao;

import java.util.logging.Logger;

import org.junit.rules.ExternalResource;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class CronometroRule extends ExternalResource {
	
	private long t0;
	private Description description;

	@Override
	protected void after() {
		long t1 = System.currentTimeMillis();
		System.out.println(description.getDisplayName() + " demorou: " + (t1-t0));
	}
	
	@Override
	public Statement apply(Statement base, Description description) {
		this.description = description;
		return super.apply(base, description);
	}
	
	@Override
	protected void before() throws Throwable {
		t0 = System.currentTimeMillis();
	}

}
