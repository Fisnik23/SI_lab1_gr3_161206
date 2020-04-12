class Item {
	int id;
	String name;
	double price;

	//TODO add variable.
	char c;

	//TODO constructor
    public Item(int id, String name, double price, char c) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.c = c;
    }

    //TODO setters and getters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    double taxReturn () {
        return price * 0.15;
    }
}
