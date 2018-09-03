package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.repository.model.Board;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardBOTest {

	@Autowired
	private BoardBO boardBO;
	
	@Test
	@Ignore
	public void getBoardCount() {
		System.out.println("getBoardCount: " + boardBO.getContentCount());
	}
	
	@Test
	public void getAllBoardContent() {
		List<Board> boardList = boardBO.getAllBoardContent();
		boardList.forEach(board -> {
			String title = board.getBoardTitle();
			String content = board.getBoardContent();
			String username = board.getUsername();
			Date createTime = board.getCreateTime();
			int hits = board.getBoardHits();
			
			System.out.println("####################");
			System.out.println(title);
			System.out.println(username);
			System.out.println(createTime);
			System.out.println(hits);
			System.out.println(content);
		});
	}
}
