package br.com.caelum.almoco.dao;

import java.util.ArrayList;
import java.util.List;

import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;

public class RandomSupplier extends ParameterSupplier {

	@Override
	public List<PotentialAssignment> getValueSources(ParameterSignature sig) {
		Random annotation = sig.getAnnotation(Random.class);
		int value = annotation.value();
		ArrayList<PotentialAssignment> values = new ArrayList<>();
		java.util.Random r = new java.util.Random();
		for (int i = 0; i < value; i++) {
			values.add(new IntAssignment(r.nextInt()));
		}
		return values;
	}

}
