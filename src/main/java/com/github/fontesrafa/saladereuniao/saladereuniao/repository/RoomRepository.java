package com.github.fontesrafa.saladereuniao.saladereuniao.repository;

import com.github.fontesrafa.saladereuniao.saladereuniao.model.Room;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
    
}
