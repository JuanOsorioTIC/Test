package com.JuanOsorio.MINTIC.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JuanOsorio.MINTIC.model.Room;
import com.JuanOsorio.MINTIC.repository.RoomRepository;

@Service
public class RoomService {

	@Autowired
	private RoomRepository roomRepository;
	
	public List<Room> getAll(){
		return (List<Room>)roomRepository.getAll();
	}
	
	public Optional<Room> getRoom(Integer id){
		return roomRepository.getRoom(id);
	}
	
	public Room save (Room room) {
		if(room.getId() == null) {
			return roomRepository.save(room);
		}
		else {
			Optional<Room> roomExists = roomRepository.getRoom(room.getId());
			if(roomExists.isEmpty()) {
				return roomRepository.save(room);
			}else {
				return room;
			}
		}
	}
	
}
