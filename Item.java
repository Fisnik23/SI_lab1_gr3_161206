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

class Receipt{
	List<Item> items;

	class Receipt(){
		this.items = new ArrayList<Item>();
	}

	public void dodadiItem(Item item){
		items.add(item);
	}
	public void brisiItem(Item item){
		items.remove(item);
	}
	public double vkupenIznos(){
		int sum=0;
		for(int i=0;i<items.size();i++){
			sum+=items.get(i).price;
		}
		return sum;
	}
	public void DDVPovrat(Item item){
		return item.taxReturn();
	}
}
