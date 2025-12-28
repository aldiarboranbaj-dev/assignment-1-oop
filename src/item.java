public abstract class item {
    private String name;
    private double price;

    public item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }

    public abstract void printInfo();

    @Override
    public String toString() {
        return "Item{name='" + name + "', price=" + price + "}";
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof item)) return false;
        item item = (item) o;
        return name.equals(item.name) && price == item.price;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + Double.valueOf(price).hashCode();
    }
}

