import java.util.Scanner;

public class Showroom implements utility{

    String showroom_name;
    String showroom_address;
    int total_employees;
    int total_cars_in_stocks = 0;
    String manager_name;


    @Override
    public void get_details() {
        System.out.println("Showroon Name " + showroom_name);
        System.out.println("Showroon Address " + showroom_address);
        System.out.println("Showroom Manager " + manager_name);
        System.out.println("Total Employees " + total_employees);
        System.out.println("Total Cars In Stocks " + total_cars_in_stocks);
    }

    @Override
    public void set_details() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===================================**** Enter Showroom Details ****===================================");
        System.out.println();
        System.out.println("SHOWROOM NAME: ");
        showroom_name = scanner.nextLine();
        System.out.println("SHOWROOM ADDRESS: ");
        showroom_address = scanner.nextLine();
        System.out.println("MANAGER NAME: ");
        manager_name = scanner.nextLine();
        System.out.println("TOTAL EMPLOYEES: ");
        total_employees = scanner.nextInt();
        System.out.println("TOTAL CARS IN STOCKS: ");
        total_cars_in_stocks = scanner.nextInt();
    }
}
