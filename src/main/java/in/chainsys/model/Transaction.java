package in.chainsys.model;

import java.time.LocalDate;

public class Transaction {
	private  int transcationId;
	private int memberId;
	private int bookId;
	private String bookName;
	private LocalDate bookTakenDate;
	private LocalDate bookDueDate;
	private String bookreturnDate;
	private String bookStatus;
	public int getTranscationId() {
		return transcationId;
	}
	public void setTranscationId(int transcationId) {
		this.transcationId = transcationId;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public LocalDate getBookTakenDate() {
		return bookTakenDate;
	}
	public void setBookTakenDate(LocalDate bookTakenDate) {
		this.bookTakenDate = bookTakenDate;
	}
	public LocalDate getBookDueDate() {
		return bookDueDate;
	}
	public void setBookDueDate(LocalDate bookDueDate) {
		this.bookDueDate = bookDueDate;
	}
	public String getBookreturnDate() {
		return bookreturnDate;
	}
	public void setBookreturnDate(String bookreturnDate) {
		this.bookreturnDate = bookreturnDate;
	}
	public String getBookStatus() {
		return bookStatus;
	}
	public void setBookStatus(String bookStatus) {
		this.bookStatus = bookStatus;
	}
	public Transaction(int transcationId, int memberId, int bookId, String bookName, LocalDate bookTakenDate,
			LocalDate bookDueDate, String bookReturnedDate, String bookStatus) {
		super();
		this.transcationId = transcationId;
		this.memberId = memberId;
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookTakenDate = bookTakenDate;
		this.bookDueDate = bookDueDate;
		this.bookreturnDate = bookReturnedDate;
		this.bookStatus = bookStatus;
	}
	@Override
	public String toString() {
		return "Transaction [transcationId=" + transcationId + ", memberId=" + memberId + ", bookId=" + bookId
				+ ", bookName=" + bookName + ", bookTakenDate=" + bookTakenDate + ", bookDueDate=" + bookDueDate
				+ ", bookreturnDate=" + bookreturnDate + ", bookStatus=" + bookStatus + "]";
	}
	
	
}
