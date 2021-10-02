package com.example.conference.repository;

import java.util.List;

import com.example.conference.model.Speaker;

public interface SpeakerRepositoryInterface {

	List<Speaker> findAll();

}