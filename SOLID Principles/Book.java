import org.jetbrains.annotations.NotNull;

//single responsibility principle
public class Book {
    private String bookName;
    private String author;
    private String text;


    //constructors
     public String getBookName(){
         return this.bookName;
     }

    public String getAuthor(){
        return this.author;
    }

    public String getText(){
        return this.text;
    }


     void InitializeVariables(String bookName,String author,String text){
         this.bookName=bookName;
         this.author=author;
         this.text=text;
     }


    public boolean findByAuthor(String authName){
//         System.out.println("findByAuthor name is ,"+author);
        return author.contains(authName);
    }

    public boolean findByName(String bookName){
        return bookName.contains(bookName);
    }

    //invalid because it not support principle
    //move to separate class
//    void printToConsole(){
//        System.out.println("auth name "+author+" bookname "+bookName+" text" +text);
//    }
}


 class BookPrinter {

    // methods for outputting text



    void printTextToConsole(String text){
        //our code for formatting and printing the text//
         System.out.println(" Book name in BookPrinter " +text);
    }

}
