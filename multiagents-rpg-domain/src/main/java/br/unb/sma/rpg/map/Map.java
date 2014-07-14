package br.unb.sma.rpg.map;

import java.util.ArrayList;
import java.util.List;

public class Map {
	private static Map instance = null;
	private List<Square> arrayMap;

	private Map() {
		this.arrayMap = new ArrayList<Square>();
	}

	public synchronized List<Square> getArrayMap() {
		return arrayMap;
	}

	public static Map getMap() {
		if (instance == null) {
			instance = new Map();
		}

		return instance;
	}

	public void addSquare(Square square) {
		getArrayMap().add(square);
	}

	public void initialize() {
		Square firstRoom = new Square("The Start Place",
				"This is where our hero starts, the central park.");

		Square secondRoom = new Square("Starting the adventure",
				"You are now at a store.");

		Square thirdRoom = new Square("Third place you can go.",
				"You are at the edge of the world.");

		Square fourthRoom = new Square("ocean.",
				"You are at the final destination.");

		addSquare(firstRoom);
		addSquare(secondRoom);
		addSquare(thirdRoom);
		addSquare(fourthRoom);

		firstRoom.setNorth(secondRoom);
		firstRoom.setSouth(fourthRoom);

		secondRoom.setSouth(firstRoom);
		secondRoom.setEast(thirdRoom);

		thirdRoom.setSouth(fourthRoom);
		thirdRoom.setWest(secondRoom);

		fourthRoom.setNorth(firstRoom);
	}
}
