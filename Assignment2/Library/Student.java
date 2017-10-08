
public class Student {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

	int student_id;
	String student_name;
	int max_book;
	int book_count;
	BookInfo book_info[] = new BookInfo[max_book];
	
	Student(int id, String name, int max) {
		student_id = id;
		student_name = name;
		max_book = max;
		book_count = 0;
	}
	
	public int GetStudentId() {
		return student_id;
	}
	
	public String GetStudentName() {
		return student_name;
	}
	
	public int GetMaxBook() {
		return max_book;
	}
	
	public int GetBookCount() {
		return book_count;
	}
	
	public String[] GetBookList() {
		String result[] = new String[book_count];
		//...
		return result;
	}
	
	public void SetMaxBook(int max) {
		max_book = max;
	}
	
	public int BorrowBook(BookInfo info) {
		if(book_count==max_book)
			return -1;
		book_info[book_count].SetBookNumber(info.GetBookNumber());
		book_info[book_count].SetBookName(info.GetBookName());
		book_info[book_count].SetBookAuthor(info.GetBookAuthor());
		book_info[book_count].SetBorrowTime(info.GetBorrowTime());
		book_info[book_count].SetReturnTime(info.GetReturnTime());
		book_count++;
		return 0;
	}
	
	public void ReturnBook(int num) {
		//...
	}
}
