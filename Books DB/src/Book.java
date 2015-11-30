/**
 * Created by User on 29.11.2015.
 */
public class Book {
    private String name, author, pOffice, cover;
    private int pYear, pages, price, id;

    Book (String name, String author, String pOffice, String cover,
          int pYear, int pages, int price, int count) {
        this.name = name;
        this.author = author;
        this.pOffice = pOffice;
        this.cover = cover;

        this.pYear = pYear;
        this.pages = pages;
        this.price = price;
        this.id = count;
    }

    Book () {

    }

    String getName () {
        return name;
    }
    String getAuthor () {
        return author;
    }
    String getPOffice () {
        return pOffice;
    }
    String getCover() {
        return cover;
    }
    int getPYear () {
        return pYear;
    }
    int getPages () {
        return pages;
    }
    int getPrice () {
        return price;
    }
    void setPrice (int p) {
        price = p;
    }
    int getId () {
        return id;
    }
}
