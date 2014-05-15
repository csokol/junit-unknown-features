package br.com.caelum.almoco.dao;

import org.junit.experimental.theories.PotentialAssignment;

public class IntAssignment extends PotentialAssignment {

	private int n;

	public IntAssignment(int n) {
		this.n = n;
	}

	@Override
	public String getDescription() throws CouldNotGenerateValueException {
		return "oi";
	}

	@Override
	public Object getValue() throws CouldNotGenerateValueException {
		return n;
	}

}
