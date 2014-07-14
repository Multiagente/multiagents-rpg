package br.unb.sma.rpg.map;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class MapTest {

	@Test
	public void givenAnInexistentMapShouldRetrieveANewMap() {
		Map map = Map.getMap();

		assertThat(map, is(not(nullValue())));
		assertThat(map, isA(Map.class));
	}

	@Test
	public void givenAnExistentMapShouldRetrieveTheSameMap() {
		Map map = Map.getMap();
		Map anotherMap = Map.getMap();

		assertThat(map, is(sameInstance(anotherMap)));
	}

	@Test
	public void shouldInitializeAMapWithFourSquares() {
		Map map = Map.getMap();
		map.initialize();

		int quantityOfSquares = map.getArrayMap().size();

		assertThat(quantityOfSquares, is(equalTo(4)));
	}
}
