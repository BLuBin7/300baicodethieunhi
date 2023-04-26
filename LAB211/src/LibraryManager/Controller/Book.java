package LibraryManager.Controller;

/**
 * Created by Binh
 * Date : 4/26/2023 - 8:35 PM
 * Description :
 */
public class Book {
    private  String id;
    private String nameBook;
    private float price;
    private int publishingYear;

    public Book(String id, String nameBook, float price, int publishingYear) {
        this.id = id;
        this.nameBook = nameBook;
        this.price = price;
        this.publishingYear = publishingYear;
    }

    public Book(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
