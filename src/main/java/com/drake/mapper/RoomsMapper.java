package com.drake.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.drake.entity.RoomsEntity;

public interface RoomsMapper {
	@Select("SELECT * FROM rooms WHERE floor = #{floor}")
	public List<RoomsEntity> getRoomsByFloor(
			@Param("floor") Integer floor);
	
	@Select("SELECT * FROM rooms WHERE floor = #{floor} and room = #{room}")
	public RoomsEntity getRoom(
			@Param("floor") Integer floor,
			@Param("room") Integer room);
	
	@Insert("INSERT INTO rooms(room,floor) "
			+ "VALUES (#{room},#{floor})")
	public int addRooms(
			@Param("room") String room,
			@Param("floor") String floor);

}
