package pojos;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class BookingDetails {
	private Integer bookId;
	private Date bookedDate;
	private String trainName;
	private String sourcLoc;
	private String destLoc;
    static Integer auto_numbers;
	
	public Integer getBookId() {
		if(auto_numbers==null){
			auto_numbers=1;
		}
			else
				++auto_numbers;
		setBookId(auto_numbers);
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public Date getBookedDate() {
		return bookedDate;
	}
	public void setBookedDate(Date bookedDate) {
		this.bookedDate = bookedDate;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getSourcLoc() {
		return sourcLoc;
	}
	public void setSourcLoc(String sourcLoc) {
		this.sourcLoc = sourcLoc;
	}
	public String getDestLoc() {
		return destLoc;
	}
	public void setDestLoc(String destLoc) {
		this.destLoc = destLoc;
	}
	@Override
	public String toString() {
		return "BookingDetails [bookId=" + bookId + ", bookedDate="
				+ bookedDate + ", trainName=" + trainName + ", sourcLoc="
				+ sourcLoc + ", destLoc=" + destLoc + "]";
	}
}
	