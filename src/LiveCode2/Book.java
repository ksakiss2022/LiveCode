package LiveCode2;

import java.util.Objects;

public class Book {

    private int yearOfPublicationOfTheBook;

    public Book(String seeYouSoon, int yearOfPublicationOfTheBook) {
    }


    public int getYearOfPublicationOfTheBook() {
        return this.yearOfPublicationOfTheBook;

    }

    public void setYearOfPublicationOfTheBook(int yearOfPublicationOfTheBook) throws NewException {
        if (yearOfPublicationOfTheBook <= 0) {

            {
                throw new NewException("ОПИСАНИЕ ОШИБКИ, год издания не может быть равен 0, или отрицательным числом.");
            }

        }
    }
}
