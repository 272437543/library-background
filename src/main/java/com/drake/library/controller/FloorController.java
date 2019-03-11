package com.drake.library.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.drake.config.ConstantConfig;
import com.drake.entity.RoomPeople;
import com.drake.entity.RoomsEntity;
import com.drake.entity.SeatsEntity;
import com.drake.mapper.RoomsMapper;
import com.drake.mapper.SeatsMapper;

@RequestMapping("/room")
@RestController
public class FloorController {

	@Autowired
	protected RoomsMapper roomsMapper;
	
	@Autowired
	protected SeatsMapper seatsMapper;
	
	@RequestMapping("/{floor}")
	public List<RoomsEntity> getRooms(@PathVariable("floor") Integer floor)
	{
		return roomsMapper.getRoomsByFloor(floor);
	}
	
	@RequestMapping("/{floor}/{room}")
	public List<SeatsEntity> getSeats(@PathVariable("floor") Integer floor, @PathVariable("room") Integer room)
	{
		System.out.println(floor + " " + room);
		RoomsEntity theRoom = roomsMapper.getRoom(floor, room);
		if (theRoom == null) return new ArrayList<SeatsEntity>();
		// TODO 得到结果
		// Seats seat = new Seats(room, exist, position);
		return seatsMapper.getSeatsByRoom(theRoom.getRoom());
	}
	
	@RequestMapping("/{floor}/{room}/people")
	public RoomPeople getRoomTotal(@PathVariable("floor") Integer floor, @PathVariable("room") Integer room)
	{
		RoomPeople people = new RoomPeople();
		people.setTotal(seatsMapper.getPeopleTotal(room, ConstantConfig.EXIST));
		people.setLeft(seatsMapper.getPeopleTotal(room, ConstantConfig.EMPTY));
		return people;
	}
	
	
}
