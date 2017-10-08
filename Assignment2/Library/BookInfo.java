
public class BookInfo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
	
	int book_number;
	String book_name;
	String book_author;
	int borrow_time;
	int return_time;
	
	public int GetBookNumber() {
		return book_number;
	}
	
	public String GetBookName() {
		return book_name;
	}
	
	public String GetBookAuthor() {
		return book_author;
	}
	
	public int GetBorrowTime() {
		return borrow_time;
	}
	
	public int GetReturnTime() {
		return return_time;
	}
	
	public void SetBookNumber(int num) {
		book_number = num;
	}
	
	public void SetBookName(String name) {
		book_name = name;
	}
	
	public void SetBookAuthor(String author) {
		book_author = author;
	}
	
	public void SetBorrowTime(int btime) {
		borrow_time = btime;
	}
	
	public void SetReturnTime(int rtime) {
		return_time = rtime;
	}
}
