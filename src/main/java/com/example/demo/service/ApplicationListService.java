package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ApplicationList;
import com.example.demo.repository.ApplicationListRepository;

@Service
@Transactional(rollbackOn = Exception.class)
public class ApplicationListService {
	
	@Autowired
	private ApplicationListRepository applicationListRepository;
	
	public List<ApplicationList> searchAll(){
		return applicationListRepository.findAll();
	}

}
