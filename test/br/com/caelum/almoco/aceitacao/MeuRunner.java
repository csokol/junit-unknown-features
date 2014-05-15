package br.com.caelum.almoco.aceitacao;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;

public class MeuRunner extends BlockJUnit4ClassRunner {

	private Thread t1;
	private ExecutorService pool;

	public MeuRunner(Class<?> klass) throws InitializationError {
		super(klass);
	}
	
	@Override
	public void run(RunNotifier notifier) {
		notifier.addListener(new Listener());
		super.run(notifier);
	}
	
}
