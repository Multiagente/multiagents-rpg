package br.unb.sma.others.build;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class MavenBuildTest {

	/*
	 * Run this tests to evaluate the Maven build process
	 * 
	 * Uncomment @Ignore annotation and run "maven install"
	 */

	@Ignore
	@Test
	public void givenAGreenTestMavenShouldBuildAndResultInSuccess() {
		assertTrue(true);
	}

	@Ignore
	@Test
	public void givenARedTestMavenShouldStopBuildAndResultInError() {
		assertTrue(false);
	}

}
