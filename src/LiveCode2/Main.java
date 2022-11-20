package LiveCode2;

//import LiveCode2.Author;
import LiveCode2.Book;

public  class Main {
    public static void main(String[] args) throws NewException {

        Book myBookSecond = new Book(null, 2000);



        myBookSecond.setYearOfPublicationOfTheBook(-2022);
        System.out.println("myBookSecond.yearOfPublicationOfTheBook = " + myBookSecond.getYearOfPublicationOfTheBook());


    }

}