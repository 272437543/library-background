package com.drake.entity;

public class RoomPeople {
	private Integer total;
	private Integer left;
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Integer getLeft() {
		return left;
	}
	public void setLeft(Integer left) {
		this.left = left;
	}
	@Override
	public String toString() {
		return "People [total=" + total + ", left=" + left + "]";
	}
	
}
