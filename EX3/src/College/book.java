// Java Program to Illustrate book Class that takes Input from the books and related information

package College;
import java.util.Scanner;      // Importing required classes

// Class
public class book {

	// Class data members

	public int sNo;
	public String bookName;
	public String authorName;
	public int bookQty;
	public int bookQtyCopy;

	Scanner input = new Scanner(System.in);

	// Method To add book details
	public book()
	{
		System.out.print("Enter Serial No. of the Book : ");
		this.sNo = input.nextInt();
		input.nextLine();

		System.out.print("Enter Book Name : ");
		this.bookName = input.nextLine();

		System.out.print("Enter Author Name : ");
		this.authorName = input.nextLine();

		System.out.print("Enter Quantity of Books : ");
		this.bookQty = input.nextInt();
		bookQtyCopy = this.bookQty;
	}
}
