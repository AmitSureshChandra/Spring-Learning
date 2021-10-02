package com.example.conference.service;

import java.util.List;

import com.example.conference.model.Speaker;
import com.example.conference.repository.SpeakerRepository;

public class SpeakerService implements SpeakerServiceInterface {
	
	private SpeakerRepository repository = new SpeakerRepository();
	
	@Override
	public List<Speaker> findAll(){
		return repository.findAll();
	}
}
