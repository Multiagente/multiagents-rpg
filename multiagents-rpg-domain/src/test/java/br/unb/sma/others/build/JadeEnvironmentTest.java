package br.unb.sma.others.build;

import static org.hamcrest.Matchers.isA;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;
import jade.core.Runtime;

import org.junit.Ignore;
import org.junit.Test;

public class JadeEnvironmentTest {

	/*
	 * Run this tests to evaluate the JadeVM integrity
	 * 
	 * Remove @Ignore and run as JUnit Test
	 */

	@Ignore
	@Test
	public void shouldInitializeAnInstanceOfJadeVM() {
		Runtime environment = Runtime.instance();
		assertThat(environment, is(not(nullValue())));
		assertThat(environment, isA(Runtime.class));
	}

}
