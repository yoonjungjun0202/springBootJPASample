package com.example.demo.repository.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="board")
public class Board {
	@Id
	@Column(name="board_no", nullable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long boardNo;
	
	@Column(name="board_title", nullable=false)
	private String boardTitle;
	
	@Column(name="board_content", columnDefinition="TEXT", nullable=false)
	private String boardContent;
	
	@Column(name="username", nullable=false)
	private String username;

	@Column(name="create_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTime;
	
	@Column(name="board_hits")
	private int boardHits;

	public Board() {}
	public Board(String boardTitle, String boardContent, String username, Date createTime, int boardHits) {
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.username = username;
		this.createTime = createTime;
		this.boardHits = boardHits;
	}
	
	public Long getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(Long boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getBoardHits() {
		return boardHits;
	}

	public void setBoardHits(int boardHits) {
		this.boardHits = boardHits;
	}
}
