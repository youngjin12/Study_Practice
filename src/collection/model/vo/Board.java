package collection.model.vo;

import java.util.Date;

public class Board {

	private int BoardNo;
	private String boardTitle;
	private String boardWriter;
	private Date boardDate;
	private String boardContent;
	private int readCount;
	
	
	public Board() {
		// TODO Auto-generated constructor stub
	}


	public Board(int boardNo, String boardTitle, String boardWriter, Date boardDate, String boardContent) {
		super();
		BoardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardWriter = boardWriter;
		this.boardDate = boardDate;
		this.boardContent = boardContent;
	}


	/**
	 * @return the boardNo
	 */
	public int getBoardNo() {
		return BoardNo;
	}


	/**
	 * @param boardNo the boardNo to set
	 */
	public void setBoardNo(int boardNo) {
		BoardNo = boardNo;
	}


	/**
	 * @return the boardTitle
	 */
	public String getBoardTitle() {
		return boardTitle;
	}


	/**
	 * @param boardTitle the boardTitle to set
	 */
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}


	/**
	 * @return the boardWriter
	 */
	public String getBoardWriter() {
		return boardWriter;
	}


	/**
	 * @param boardWriter the boardWriter to set
	 */
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}


	/**
	 * @return the boardDate
	 */
	public Date getBoardDate() {
		return boardDate;
	}


	/**
	 * @param boardDate the boardDate to set
	 */
	public void setBoardDate(Date boardDate) {
		this.boardDate = boardDate;
	}


	/**
	 * @return the boardContent
	 */
	public String getBoardContent() {
		return boardContent;
	}


	/**
	 * @param boardContent the boardContent to set
	 */
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}


	/**
	 * @return the readCount
	 */
	public int getReadCount() {
		return readCount;
	}


	/**
	 * @param readCount the readCount to set
	 */
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}


	@Override
	public String toString() {
		return "Board [BoardNo=" + BoardNo + ", boardTitle=" + boardTitle + ", boardWriter=" + boardWriter
				+ ", boardDate=" + boardDate + ", boardContent=" + boardContent + ", readCount=" + readCount + "]";
	}
	
	
}
