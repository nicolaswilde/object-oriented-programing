
public class Librarian {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

	int librarian_id;
	int max_student;
	int student_count;
	int max_book;
	int book_count;
	
	Book book[] = new Book[max_book];
	Student student[] = new Student[max_student];
	
	public int GetLibrarianId() {
		return librarian_id;
	}
	
	public int GetStudentCount() {
		return student_count;
	}
	
	public int GetBookCount() {
		return book_count;
	}
	
	public Student GetStudentInfo(int id) {
		//...
		return student[0];
	}
	
	public Book GetBookInfo(int id) {
		//...
		return book[0];
	}
	
	public void AddStudent(Student student) {
		//...
	}
	
	public void AddBook(Book book) {
		//...
	}
	
	public void BorrowBook(int sid, int bid) {
		//...
	}
	
	public void ReturnBook(int sid, int bid) {
		//...
	}
}
