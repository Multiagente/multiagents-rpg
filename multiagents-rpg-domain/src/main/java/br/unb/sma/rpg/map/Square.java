package br.unb.sma.rpg.map;

public class Square {

	/*
	 * Squares definition
	 */
	private String title;
	private String description;

	/*
	 * Define coordinates to another Squares
	 */
	private Square north;
	private Square south;
	private Square east;
	private Square west;

	public Square(String title, String description) {
		this.title = title;
		this.description = description;
		this.north = null;
		this.south = null;
		this.east = null;
		this.west = null;

	}

	public Square getNorth() {
		return north;
	}

	public Square getSouth() {
		return south;
	}

	public Square getEast() {
		return east;
	}

	public Square getWest() {
		return west;
	}

	public void setNorth(Square north) {
		if (north != null) {
			this.north = north;
		}
	}

	public void setSouth(Square south) {
		if (south != null) {
			this.south = south;
		}
	}

	public void setEast(Square east) {
		if (east != null) {
			this.east = east;
		}
	}

	public void setWest(Square west) {
		if (west != null) {
			this.west = west;
		}
	}

	/*
	 * GETTERS AND SETTERS
	 */

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
