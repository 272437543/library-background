package com.drake.entity;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the seats database table.
 * 
 */
public class SeatsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private int room;

	private String exist;

	private String position;

	public SeatsEntity(int room, String exist, String position) {
		super();
		this.room = room;
		this.exist = exist;
		this.position = position;
	}

	public SeatsEntity() {
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


	public String getExist() {
		return this.exist;
	}

	public void setExist(String exist) {
		this.exist = exist;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}


	@Override
	public String toString() {
		return "Seats [id=" + id + ", room=" + room + ", exist=" + exist
				+ ", position=" + position + "]";
	}

}