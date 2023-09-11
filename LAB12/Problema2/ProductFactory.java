package LAB12;

public class ProductFactory {

    public Product1 factory(String type, String nameProduct, float productPrice) {
        if (type == "Book") {
            Book book = new Book(productPrice, nameProduct);
            return book;
        }

        if (type == "Food") {
            Food food = new Food(productPrice, nameProduct);
            return food;
        }

        if (type == "Beverage") {
            Beverage beverage = new Beverage (productPrice, nameProduct);
            return beverage;
        }

        if (type == "Computer") {
            Computer computer = new Computer(productPrice, nameProduct);
            return computer;
        }
        return null;
    }
}
