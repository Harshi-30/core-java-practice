class LibrarySystem{
static int totalNoOfBook;
String title;
String author;
String isbn;
boolean isBorrowed;
static{
    totalNoOfBook = 0;  //Static block or class initializing
}
{
    totalNoOfBook++;   //instance block on object initializing
}
LibrarySystem(String isbn,String title,String author){
    this.isbn = isbn;
    this.title = title;
    this.author = author;
}
LibrarySystem(String isbn){  // inforcemenr
    this.isbn = isbn;
    this.title = "Unknown";
    this.author = "Unknown";
}
static int getTotalBook(){
    return totalNoOfBook;
}
void borrowBook(){
    if(isBorrowed){
        System.out.println("Book is already borrowed");
    }else{
        this.isBorrowed = true;
        System.out.println("Enjoy the book  "+this.title);
    }
}
void returnBook(){
    if(isBorrowed){
        this.isBorrowed = false;
        System.out.println("Hope you enjoyed, Please leave a review");
    }else{
        System.out.println("This book is already in the library.");
 
   }
   
}
public static void main(String[] args) {
    LibrarySystem DesignOfThings = new LibrarySystem("1","Attitude is every thing" ,"Jeff Keller");
    LibrarySystem Maths = new LibrarySystem("103");
    System.out.println(LibrarySystem.getTotalBook());
    DesignOfThings.borrowBook();
    Maths.borrowBook();
    DesignOfThings.borrowBook();
    Maths.returnBook();
    DesignOfThings.returnBook();
}
}
