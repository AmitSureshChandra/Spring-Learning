package com.example.conference.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.conference.model.Speaker;

@Repository
public class SpeakerRepository implements SpeakerRepositoryInterface {
	@Override
	public List<Speaker> findAll(){
		List<Speaker> speakers = new ArrayList<>();
		
		Speaker speaker = new Speaker();
		speaker.setFirstName("Amit");
		speaker.setLastName("Kumar");
		
		speakers.add(speaker);
		return speakers;
	}
}
