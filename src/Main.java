import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static  List<Menu> menu = new ArrayList<>();
    private static  List<Order> table_1 = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main objectForCallingMethods = new Main();
        boolean condition1 = false;

        while(condition1 != true){
            objectForCallingMethods.opening();
            int option = objectForCallingMethods.takeAnIntegerInput();
            switch(option){
                case 1:
                    boolean condition2 = false;
                    while (condition2 != true){
                          System.out.println("[1] add meal\n [2] Exit");
                             int opt = objectForCallingMethods.takeAnIntegerInput();
                             float summ = 0;
                             switch (opt){
                                 case 1:
                                     objectForCallingMethods.mealLister();
                                     System.out.println("Please choose one of them: ");
                                     int chosen_meal = objectForCallingMethods.takeAnIntegerInput() - 1;
                                     System.out.println("PLease choose number of this meal: ");
                                     int num = objectForCallingMethods.takeAnIntegerInput();
                                     System.out.println("you have chosen " + num + " " + menu.get(chosen_meal).getMeal() );
                                     Order newOrder = new Order(menu.get(chosen_meal), num);
                                     table_1.add(newOrder);
                                     summ = summ + num* menu.get(chosen_meal).getPrice();
                                     System.out.println("total Price is: " + summ);
                                     break;



                                 case 2:
                                     System.out.println("Exit...");
                                     condition2 = true;
                                     break;
                                 default:
                                     System.out.println("Invalid entrance!");
                                     break;

                             }

                         }

                    break;

                case 2:
                    System.out.println("Orders are cleaning");
                    table_1.clear();
                    break;

                case 3:
                    System.out.println("Please enter following data precisely");
                    System.out.println("meal name: ");
                    String meal =  objectForCallingMethods.takeAnStringInput();

                    System.out.println("Category: ");
                    String category = objectForCallingMethods.takeAnStringInput();

                    System.out.println("Price: ");
                    float price = objectForCallingMethods.takeAnFloatInput();

                    Menu newMenu = new Menu (meal, category, price);
                    menu.add(newMenu);
                    break;
                case 4:
                    objectForCallingMethods.mealLister();
                    System.out.println("Please choose meal for changing in Price");

                    int choosen_meal = objectForCallingMethods.takeAnIntegerInput() - 1;

                    System.out.println("you have chosen: " + menu.get(choosen_meal));
                    System.out.println("How much you make it?");
                    menu.get(choosen_meal).setPrice(objectForCallingMethods.takeAnFloatInput());
                    break;
                case 5:
                    System.out.println("Name: " + restaurant.getName());
                    System.out.println("Location: " + restaurant.getLocation());
                    System.out.println("Contact: " + restaurant.getContact());
                    System.out.println("Short History: " + restaurant.getShortHistory());
                    break;
                case 6:
                    condition1 = true;
                    break;
                default:
                    System.out.println("Invalid entrance!");
                    break;


            }



            }


        }



    static Restaurant restaurant = new Restaurant(
            "McDonalds",
            "Azerbaijan, Baku, Nizami street 20",
            "+994-50-998-45-75",
            "The first McDonald's restaurant was started in 1948 by brothers Maurice (“Mac”) and Richard\n " +
                    "McDonald in San Bernardino, California. They bought appliances for their small hamburger restaurant\n"+
                    " from salesman Ray Kroc, who was intrigued by their need for eight malt and shake mixers.");





    private void opening(){
        System.out.println("Welcome to System ");
        System.out.println("Please choose Operation number!");
        System.out.println("[1] Get Order ");
        System.out.println("[2] Delete Order");
        System.out.println("[3] add meal to menu");
        System.out.println("[4] Change prices");
        System.out.println("[5] Information about Restaurant");
        System.out.println("[6] Exit system");
    }

    private String takeAnStringInput() {
        String input = scanner.nextLine();
        return input;
    }

    private float takeAnFloatInput(){
        float f = Float.parseFloat(takeAnStringInput());
        return f;
    }

    private int takeAnIntegerInput(){
        int n = Integer.parseInt(takeAnStringInput());
        return n;
    }

    private void mealLister(){
            for(int i = 0; i < menu.size() ; i++) {
                System.out.print(i+1);
                System.out.print(". " + menu.get(i).getMeal() + " " + menu.get(i).getPrice() + " $");
                System.out.println();
            }




}
}

