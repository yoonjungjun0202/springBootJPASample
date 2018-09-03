package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.BoardRepository;
import com.example.demo.repository.model.Board;

@Service
public class BoardBO {
	
	@Autowired
	private BoardRepository boardRepository;
	
	public long getContentCount() {
		return boardRepository.count();
	}
	
	public List<Board> getAllBoardContent() {
		return boardRepository.findAll();
	}
}
