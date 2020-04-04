public class Order {

    private Menu menu;
    private int num;

    public Order(Menu menu, int num) {
        this.menu = menu;
        this.num = num;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
