package br.com.caelum.almoco.dao;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.junit.experimental.theories.ParametersSuppliedBy;


@Retention(RetentionPolicy.RUNTIME)
@ParametersSuppliedBy(RandomSupplier.class)
public @interface Random {

	int value();

}
