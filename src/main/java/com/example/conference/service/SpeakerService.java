package com.example.conference.service;

import java.util.List;

import com.example.conference.model.Speaker;
import com.example.conference.repository.SpeakerRepositoryInterface;

public class SpeakerService implements SpeakerServiceInterface {
	
	private SpeakerRepositoryInterface repository;
	
	public SpeakerService(SpeakerRepositoryInterface repository) {
		super();
		this.repository = repository;
	}

	public void setSpeakerRepository(SpeakerRepositoryInterface repository) {
		this.repository = repository;
	}
	
	@Override
	public List<Speaker> findAll(){
		return repository.findAll();
	}
}
