#include <iostream>
#include <map>
#include <string>
using namespace std;

 
class Product {
protected:
    string id;
    string name;
    double price;
public:
    Product(string id, string name, double price) {
        this->setId(id);
        this->setName(name);
        this->setPrice(price);
    }

 
    void setId(string id) {
        this->id = id;
    }

 
    string getId() { 
        return this->id; 
    }

 
    void setName(string name) {
        this->name = name;
    }

 
    string getName() {
        return this->name;
    }

 
    void setPrice(double price) {
        this->price = price;
    }

 
    double getPrice() {
        return this->price;
    }

 
    virtual void display() {
        cout <<"\tID: " << id << endl;
        cout <<"\tName: " << name << endl;
        cout <<"\tPrice: " << price << endl;
    }
};

 
class Book : public Product {
private:
    string title;
    string author;
public:
    Book(string id, string name, double price, string title, string author) 
    : Product(id, name, price) {
        this->setTitle(title);
        this->setAuthor(author);
    }

 
    void setTitle(string title) { 
        this->title = title;
    }

 
    string getTitle() { 
        return title; 
    }

 
    void setAuthor(string author) {
        this->author = author;
    }

 
    string getAuthor() {
        return author;
    }

 
    void display() {
        Product::display();
        cout << "\tTitle: " << title << endl; 
        cout <<"\tAuthor: " << author << endl;
    }

 
};

 
class Pen : public Product {
private:
    string type;
    string color;
public:
    Pen(string id, string name, double price, string type, string color) 
        : Product(id, name, price) {
            this->setType(type);
            this->setColor(color);
        }

 
    void setType(string type) { 
        this->type = type; 
    }

 
    string getType() { 
        return type; 
    }

 
    void setColor(string color) {
        this->color = color;
    }

 
    string getColor() { 
        return color; 
    }

 
    void display() {
        Product::display();
        cout <<"\tType: " << type << endl;
        cout <<"\tColor: " << color << endl;
    }

 
};

 
class Item {
private:
    Product* product;
    int number;
public:
    Item(Product* product, int number) {
        this->setProduct(product);
        this->setNumber(number);
    }

 
    void setProduct(Product* product) {
        this->product = product;
    } 

 
    void setNumber(int number) {
        this->number = number;
    }

 
    void display() {
        product->display();
        cout << "\tNumber: " << number << endl;
        cout << "" <<endl;
    }
};

 
class Cart {
private:
    string id; 
    map<string, Item*> items;
public:
    Cart(string id) {
        this->setId(id);
    }

 
    void addItem(Product* p, int number) {
        items.emplace(p->getId(), new Item(p, number));
    }

 
    string getId() { 
        return id; 
    }

 
    void setId(string id) {
        this->id = id;
    }

 
    void display() {
        cout <<"-------------Shopping Cart-------------"<<endl;
        cout <<"Cart ID: " << id << endl;
        for (auto& p : items) {
            p.second->display();
        }
    }
};

 
int main() {
    Book book("001", "Code", 117.7, "Cracking the Coding Interview", "Gayle Laakmann McDowell");
     
    Pen pen("002", "S-Pen", 150.5, "ballpoint", "white");
     
    Cart cart("001");

 
    cart.addItem(&book, 1);
    cart.addItem(&pen, 2);

 
    cart.display();

 
    return 0;
}