import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal() {
        // count for number of customer who buy more drink than the week before
        // need to number after 10 weeks
        int sum = 0;
        for (int i = 0; i <= 10; i++) 
        {
            sum+= i;
        }

        return sum;
    }

    /*
    Given an array of item prices from an order, 
    sum all of the prices in the array and return the total. 
    */
    public double getOrderTotal(double[] prices) {
        double sum = 0;
        for (int i = 0; i < prices.length; i++)
        {
            sum+=prices[i]; 
        }

        return sum;
    }

    /* Given an ArrayList of menu items (strings), print out each index and menu item. 
    Sample output given an  ArrayList with the items "drip coffee",  "cappuccino",  "latte" and  "mocha"
    */
    //public boolean displayMenu(ArrayList<String> menuItems,ArrayList<Double> itemPrices) {
    public boolean displayMenu(ArrayList<String> menuItems) {
       /* if (menuItems.size() != itemPrices.size())
        {
            return false;
        }*/
        for (int i = 0; i < menuItems.size(); i++)
        {
            // get id, ,menu, and prices
            System.out.printf("%s: %s \n", i, menuItems.get(i));
        }

        return true;
    }

    // Add customer
    public void addCustomer(ArrayList<String> customerList) {
        String userName = System.console().readLine();
        System.out.printf("Hello, %s!\n", userName);
        System.out.printf("There are %s people ahead of you.\n", customerList.size());

        // Add customer to list and print the list
        customerList.add(userName);
        System.out.println(customerList);
    }
}