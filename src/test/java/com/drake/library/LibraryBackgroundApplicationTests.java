package com.drake.library;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.drake.entity.RoomsEntity;
import com.drake.mapper.RoomsMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LibraryBackgroundApplicationTests {

	@Autowired
	private RoomsMapper roomsMapper;
	@Test
	public void contextLoads() {
		System.out.println("Start testing");
		List<RoomsEntity> rooms = roomsMapper.getRoomsByFloor(0);
		System.out.println(rooms);
	}

}
