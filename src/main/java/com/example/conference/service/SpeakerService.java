package com.example.conference.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.conference.model.Speaker;
import com.example.conference.repository.SpeakerRepositoryInterface;

public class SpeakerService implements SpeakerServiceInterface {
	
	private SpeakerRepositoryInterface repository;
	
	public SpeakerService()
	{
		System.out.println("in no args constructor");
	}
	
	public SpeakerService(SpeakerRepositoryInterface repository) {
		super();
		this.repository = repository;
		System.out.println("in single args constructor");
	}

	@Autowired
	public void setSpeakerRepository(SpeakerRepositoryInterface repository) {
		this.repository = repository;
		System.out.println("setter");
	}
	
	@Override
	public List<Speaker> findAll(){
		return repository.findAll();
	}
}
