package com.first.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first.model.FirstModel;
import com.first.repository.FirstRepository;
import com.first.service.FirstService;

@Service
public class FirstServiceImpl implements FirstService {

	@Autowired
	FirstRepository firstRepository;

	@Override
	public FirstModel insertEmployee(FirstModel first) {

		FirstModel response = firstRepository.save(first);

		return response;
	}

}
