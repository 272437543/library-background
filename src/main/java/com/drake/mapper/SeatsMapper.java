package com.drake.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.drake.entity.SeatsEntity;

public interface SeatsMapper {

	@Select("SELECT * FROM seats WHERE room = ${room}")
	public List<SeatsEntity> getSeatsByRoom(
			@Param("room") Integer room);
	
	@Update("UPDATE seats SET exist = #{exist} WHERE position = #{position} AND room = ${room}")
	public int updateSeats(
			@Param("exist") String exist,
			@Param("position") String position,
			@Param("room") Integer room);
	
	@Insert("INSERT INTO seats (room,position) "
			+ "VALUES (#{room},#{position})")
	public int addSeats(
			@Param("room") Integer room,
			@Param("position") String position);
	
	@Select("SELECT count(exist) total FROM seats WHERE room = #{room} GROUP BY exist HAVING exist = #{exist}")
	public int getPeopleTotal(@Param("room") Integer room, @Param("exist") String exist);
	
}
