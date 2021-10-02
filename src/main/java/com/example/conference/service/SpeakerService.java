package com.example.conference.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.conference.model.Speaker;
import com.example.conference.repository.SpeakerRepositoryInterface;

@Service
public class SpeakerService implements SpeakerServiceInterface {
	
	@Autowired
	private SpeakerRepositoryInterface repository;
	
	public SpeakerService()
	{
		System.out.println("in no args constructor");
	}
	
	@Override
	public List<Speaker> findAll(){
		return repository.findAll();
	}
}
