package com.drake.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the rooms database table.
 * 
 */
public class RoomsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private int room;

	private int floor;

	public RoomsEntity() {
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getRoom() {
		return room;
	}


	public void setRoom(int room) {
		this.room = room;
	}


	public int getFloor() {
		return this.floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}


	@Override
	public String toString() {
		return "Rooms [id=" + id + ", room=" + room + ", floor=" + floor + "]";
	}

}