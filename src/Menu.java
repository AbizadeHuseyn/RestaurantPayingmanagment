public class Menu {
    private String meal;
    private String category;
    private float price;


    public Menu(String meal, String category, float price) {
        this.meal = meal;
        this.category = category;
        this.price = price;
    }

    public String getMeal() {
        return meal;
    }

    public String getCategory() {
        return category;
    }

    public float getPrice() {
        return price;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public void setPrice(float price) {
        this.price = price;
        System.out.println("This meal's price is " + price);
    }
}
