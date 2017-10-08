
public class Book {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

	BookInfo book_info = new BookInfo();
	int state;
	int owner_number;
	
	Book(int num, String name, String author) {
		book_info.SetBookNumber(num);
		book_info.SetBookName(name);
		book_info.SetBookAuthor(author);
		state = 0; //available
		owner_number = 0;
	}
	
	public int GetState() {
		return state;
	}
	
	public int GetOwnerNumber() {
		return owner_number;
	}
	
	public int GetBookNumber() {
		return book_info.GetBookNumber();
	}
	
	public String GetBookName() {
		return book_info.GetBookName();
	}
	
	public String GetBookAuthor() {
		return book_info.GetBookAuthor();
	}
	
	public int GetBorrowTime() {
		return book_info.GetBorrowTime();
	}
	
	public int GetReturnTime() {
		return book_info.GetReturnTime();
	}
	
	public void Borrow(int num, int btime, int rtime) {
		owner_number = num;
		book_info.SetBorrowTime(btime);
		book_info.SetReturnTime(rtime);
		state = 1;
	}
	
	public void Return() {
		state = 0;
	}
}
