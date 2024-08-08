/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fashion.shop.using.oop;

import java.util.*;

/**
 *
 * @author Prasad
 */
class Customer {

    private String orderId;
    private String phoenumber;
    private String size1;
    private int qty;
    private double amount;
    private String Orderstatus;

    public Customer(String id, String pnumber, String size, int qty1, double amount1, String oderstatus1) {

        this.orderId = id;
        this.phoenumber = pnumber;
        this.qty = qty1;
        this.size1 = size;
        this.amount = amount1;
        this.Orderstatus = oderstatus1;

    }

    public void showoder(int i) {

        System.out.println("");
        System.out.printf("%-16s%2s%n", "Phone number", ": " + phoenumber);
        System.out.printf("%-16s%2s%n", "Size", ": " + size1);
        System.out.printf("%-16s%2s%n", "QTY", ": " + qty);
        System.out.printf("%-16s%2s%n", "Amount", ": " + amount);
        System.out.printf("%-16s%2s%n", "Status", ": " + Orderstatus + "\n");

    }

    public void setstatus(String status) {

        this.Orderstatus = status;

    }

    public String getid() {
        return orderId;
    }

    public String getphonenumber() {
        return phoenumber;
    }

    public String getsize() {
        return size1;
    }

    public int getqty() {
        return qty;
    }

    public Double getamount() {
        return amount;
    }

    public String getstatus() {
        return Orderstatus;
    }

}

public class FashionShopUsingOOP {

    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            e.printStackTrace();
// Handle any exceptions.
        }
    }

    public static void clearline(int i) {
        // Move the cursor up five lines
        System.out.print("\033[" + i + "A");
// Clear the lines
        System.out.print("\033[0J");

    }

    public static Scanner input = new Scanner(System.in);

    public final static String[] finalStatus = {"PROCESSING", "DELIVERING", "DELIVERED"};

    public static int count = 0;

    static Customer[] Customers = new Customer[0];

    public static Customer[] extendIntArrays(Customer[] arr) {
        Customer temp[] = new Customer[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        return arr;
    }

    public static void home() {

        do {
            System.out.println("\t\t\t /$$$$$$$$                 /$$       /$$                            /$$$$$$  /$$                          ");
            System.out.println("\t\t\t| $$_____/                | $$      |__/                           /$$__  $$| $$                          ");
            System.out.println("\t\t\t| $$    /$$$$$$   /$$$$$$$| $$$$$$$  /$$  /$$$$$$  /$$$$$$$       | $$  \\__/| $$$$$$$   /$$$$$$   /$$$$$$ ");
            System.out.println("\t\t\t| $$$$$|____  $$ /$$_____/| $$__  $$| $$ /$$__  $$| $$__  $$      |  $$$$$$ | $$__  $$ /$$__  $$ /$$__  $$");
            System.out.println("\t\t\t| $$__/ /$$$$$$$|  $$$$$$ | $$  \\ $$| $$| $$  \\ $$| $$  \\ $$       \\____  $$| $$  \\ $$| $$  \\ $$| $$  \\ $$");
            System.out.println("\t\t\t| $$   /$$__  $$ \\____  $$| $$  | $$| $$| $$  | $$| $$  | $$       /$$  \\ $$| $$  | $$| $$  | $$| $$  | $$");
            System.out.println("\t\t\t| $$  |  $$$$$$$ /$$$$$$$/| $$  | $$| $$|  $$$$$$/| $$  | $$      |  $$$$$$/| $$  | $$|  $$$$$$/| $$$$$$$/");
            System.out.println("\t\t\t|__/   \\_______/|_______/ |__/  |__/|__/ \\______/ |__/  |__/       \\______/ |__/  |__/ \\______/ | $$____/ ");
            System.out.println("\t\t\t                                                                                                | $$      ");
            System.out.println("\t\t\t                                                                                                | $$      ");
            System.out.println("\t\t\t                                                                                                |__/      ");

            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");

            System.out.println("");

            System.out.println("\t\t\t\t[1] place Order \t\t\t\t[2] Search Customer");
            System.out.println("\t\t\t\t[3] Search Order \t\t\t\t[4] View Reports");
            System.out.println("\t\t\t\t[5] Set Order Status \t\t\t[6] Delete Order");
            System.out.println("");
            System.out.print("\t\t\t\tInout Option : ");

            Scanner input = new Scanner(System.in);
            int homenum = input.nextInt();
            System.out.println("\n");
            switch (homenum) {
                case 1:
                    PlaceOder();
                    break;
                case 2:
                    searchCustomer();
                    break;
                case 3:
                    searchOrder();
                    break;
                case 4:
                    Report();
                    break;
                case 5:
                    setOrderStatus();
                    break;
                case 6:
                    DeleteOrder();
                    break;
                default:
                    System.out.println("\t\tEnter correct Number....\n\n");

            }

        } while (true);

    }

    public static void PlaceOder() {

        LPLACEORDER:
        do {
            count++;
            System.out.println("""
                       \t  _____  _                   ____          _           
                       \t |  __ \\| |                 / __ \\        | |          
                       \t | |__) | | __ _  ___ ___  | |  | |_ __ __| | ___ _ __ 
                       \t |  ___/| |/ _` |/ __/ _ \\ | |  | | '__/ _` |/ _ \\ '__|
                       \t | |    | | (_| | (_|  __/ | |__| | | | (_| |  __/ |   
                       \t |_|    |_|\\__,_|\\___\\___|  \\____/|_|  \\__,_|\\___|_|   """);

            System.out.println("---------------------------------------------------------------------");
            System.out.println("");
//            OderID();

            System.out.print("Oder ID : ");
            String nowID = String.format("ORD#%05d", count);
            System.out.println(nowID);

            System.out.println("");

            String PN = "null";

            LPN:
            do {
                System.out.print("Enter Customer Phone Number : ");

                PN = input.next();

                if (PN.charAt(0) != '0' || PN.length() != 10) {
                    System.out.println("Invalid Phone Number... Try Again ");

                    LAGAIN:
                    do {
                        System.out.print("Do you want to enter Phone Number Again? (Y/N) : ");
                        String want = input.next();
                        if (want.charAt(0) == 'Y' || want.charAt(0) == 'y') {
                            continue LPN;
                        } else if (want.charAt(0) == 'N' || want.charAt(0) == 'n') {
                            count--;
                            System.out.println("IF you want Place Oder you want to Enter correct Phone Number ! \n");
                            home();

                        } else {
                            System.out.println("Please Enter (Y/N) \n");
                            continue LAGAIN;
                        }

                    } while (true);

                }
                if (PN.charAt(0) == '0' && PN.length() == 10) {

                    /*-------------------------------------*/
                    String size = "null";
                    double qamount = 0;
                    System.out.print("Enter T-Shirt Size (XS/S/M/L/XL/XXL) : ");
                    size = input.next().toUpperCase();

                    if ("XS".equals(size) || "S".equals(size) || "M".equals(size) || "L".equals(size) || "XL".equals(size) || "XXL".equals(size)) {

                        /*-------------------------------------------*/
                        int qty1 = 0;
                        System.out.print("Enter QTY : ");
                        qty1 = input.nextInt();

                        if (qty1 < 0) {

                            System.out.println("Invalid Input....! ");
                        } /*------------------------------------------------*/ //            System.out.print("Amount");
                        else if (qty1 > 0) {

                            switch (size) {
                                case "XS":
                                    qamount = 600 * qty1;
                                    break;
                                case "S":
                                    qamount = 800 * qty1;
                                    break;
                                case "M":
                                    qamount = 900 * qty1;
                                    break;
                                case "L":
                                    qamount = 1000 * qty1;
                                    break;
                                case "XL":
                                    qamount = 1100 * qty1;
                                    break;
                                case "XXL":
                                    qamount = 1200 * qty1;
                                    break;

                            }
                            System.out.println("Amount : " + qamount);

                        } else {
                            System.out.println("Invalid Input...");
                            count--;
                            clearConsole();
                            continue LPLACEORDER;
                        }

                        /*-----------------------------------------------------------------------------*/
                        System.out.print("Do you want to place this order? (Y/N) : ");
                        String placeyn = input.next().toUpperCase();
                        char place = placeyn.charAt(0);

                        switch (place) {
                            case 'Y':
                                Customers = extendIntArrays(Customers);
                                Customers[Customers.length - 1] = new Customer(nowID, PN, size, qty1, qamount, finalStatus[0]);
                                System.out.println("Order placeed..!");

                                break;

                            case 'N':
                                count--;
                                home();
                                break;

                        }

                    } else {
                        System.out.println("Invalid Input...");
                        count--;
                        continue LPLACEORDER;
                    }

                    /*---------------------------------------------------------------------------*/
                    System.out.print("Do you want to place another order? (Y/N) : ");
                    String another = input.next().toUpperCase();
                    switch (another) {
                        case "Y":
                            continue LPLACEORDER;
                        case "N":
                            home();

                            break;
                    }
                } else {
                    System.out.println("Invalid number ...");
                    home();

                }
            } while (true);

        } while (true);

    }

    public static void searchCustomer() {

        System.out.println("""
                           \t   _____                     _        _____          _                            
                           \t  / ____|                   | |      / ____|        | |                           
                           \t | (___   ___  __ _ _ __ ___| |__   | |    _   _ ___| |_ ___  _ __ ___   ___ _ __ 
                           \t  \\___ \\ / _ \\/ _` | '__/ __| '_ \\  | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__|
                           \t  ____) |  __/ (_| | | | (__| | | | | |___| |_| \\__ \\ || (_) | | | | | |  __/ |   
                           \t |_____/ \\___|\\__,_|_|  \\___|_| |_|  \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|   """);

        System.out.println("");
        System.out.println("---------------------------------------------------------------------------------------------\n");

        System.out.print("Enter Customer Phone Number : ");
        String searchnum = input.next();
        int searchcount = 0;
        int xscount = 0;
        int scount = 0;
        int mcount = 0;
        int lcount = 0;
        int xlcount = 0;
        int xxlcount = 0;
//        int tem[] = new int[phoenumber.length];
        for (int j = 0; j < Customers.length; j++) {

            if (Customers[j].getphonenumber().equals(searchnum)) {

                switch (Customers[j].getsize()) {
                    case "XS":
                        xscount += Customers[j].getqty();
                        break;
                    case "S":
                        scount += Customers[j].getqty();
                        break;
                    case "M":
                        mcount += Customers[j].getqty();
                        break;
                    case "L":
                        lcount += Customers[j].getqty();
                        break;
                    case "XL":
                        xlcount += Customers[j].getqty();
                        break;
                    case "XXL":
                        xxlcount += Customers[j].getqty();
                        break;

                }
            }

        }
        String[] size = {"XS", "S", "M", "L", "XL", "XXL"};
        int qtytem[] = {xscount, scount, mcount, lcount, xlcount, xxlcount};
        double amounttem[] = {xscount * 600, scount * 800, mcount * 900, lcount * 1000, xlcount * 1100, xxlcount * 1200};
        double Amount = 0;
        for (double x : amounttem) {
            Amount += x;
        }
        for (int i = 0; i < size.length; i++) {
            for (int j = 0; j < size.length - 1; j++) {
                if (qtytem[j] < qtytem[j + 1]) {
                    int qtytem1 = qtytem[j + 1];
                    qtytem[j + 1] = qtytem[j];
                    qtytem[j] = qtytem1;

                    double amounttem1 = amounttem[j + 1];
                    amounttem[j + 1] = amounttem[j];
                    amounttem[j] = amounttem1;

                    String sizetem = size[j + 1];
                    size[j + 1] = size[j];
                    size[j] = sizetem;
                }
            }
        }
        System.out.print("""
                           \t\t+--------------+----------------+-----------------+                                         
                           \t\t|     Size     |       QTY      |      Amount     |
                           \t\t+--------------+----------------+-----------------+ 
                           """);
        for (int i = 0; i < size.length; i++) {
            System.out.printf("\t\t|  %-12s|       %7d  |     %10.2f  |%n", size[i], qtytem[i], amounttem[i]);

        }

        System.out.println("\t\t+--------------+----------------+-----------------+");
        System.out.printf("\t\t|%23s        |     %10.2f  |%n", "Total Amount", Amount);
        System.out.println("\t\t+-------------------------------+-----------------+");

    }

    public static void searchOrder() {

        clearConsole();
        Lsearchorder:
        do {
            System.out.println("""
                               \t   _____                     _        ____          _           
                               \t  / ____|                   | |      / __ \\        | |          
                               \t | (___   ___  __ _ _ __ ___| |__   | |  | |_ __ __| | ___ _ __ 
                               \t  \\___ \\ / _ \\/ _` | '__/ __| '_ \\  | |  | | '__/ _` |/ _ \\ '__|
                               \t  ____) |  __/ (_| | | | (__| | | | | |__| | | | (_| |  __/ |   
                               \t |_____/ \\___|\\__,_|_|  \\___|_| |_|  \\____/|_|  \\__,_|\\___|_|   """);

            System.out.println("--------------------------------------------------------------------------\n");

            System.out.print("Enter order ID : ");
            String EnterID = input.next();
            boolean found = false;
            int x = 0;

            for (int i = 0; i < Customers.length; i++) {
                if (Customers[i].getid().equals(EnterID)) {
                    x = i;
//                    System.out.println(i);
                    Customers[i].showoder(i);
                    found = true;
                    break;
                }

            }

            if (found) {

                LDOwANTSEaRCHO:
                do {
                    System.out.print("Do you want to search another order? (y/N) : ");
                    String searchAnotherO = input.next().toUpperCase();

                    if (searchAnotherO.equals("Y")) {
                        searchOrder();
                    } else if (searchAnotherO.equals("N")) {
                        home();
                    } else {
                        System.out.println("Enter valid input...");
                        continue LDOwANTSEaRCHO;
                    }

                } while (true);

            }
            if (!found) {
                System.out.println("Invalid ID...");
                LDOwANTSEaRCHOo:
                do {
                    System.out.print("Do you want to search another order? (y/N) : ");
                    String searchAnotherO = input.next().toUpperCase();

                    if (searchAnotherO.equals("Y")) {
                        continue Lsearchorder;
                    } else if (searchAnotherO.equals("N")) {
                        home();
                    } else {
                        System.out.println("Enter valid input...");
                        continue LDOwANTSEaRCHOo;
                    }

                } while (true);

            }

        } while (true);

    }

    public static void Report() {
        clearConsole();
        Lreport:
        do {
            System.out.println("	  _____                       _       \n"
                    + "	 |  __ \\                     | |      \n"
                    + "	 | |__) |___ _ __   ___  _ __| |_ ___ \n"
                    + "	 |  _  // _ \\ '_ \\ / _ \\| '__| __/ __|\n"
                    + "	 | | \\ \\  __/ |_) | (_) | |  | |_\\__ \\\n"
                    + "	 |_|  \\_\\___| .__/ \\___/|_|   \\__|___/\n"
                    + "	            | |                       \n"
                    + "	            |_|                       ");
            System.out.println("");
            System.out.println("-----------------------------------------------------\n");

            System.out.printf("\t%-19s\n\t%-19s\n\n%20s", "[1] Best in customers ", "[2] All Orders", "Enter Option : ");

            int whatreport = input.nextInt();

            switch (whatreport) {
                case 1:
                    BestInCustomers();
                    break;
                case 2:
                    AllOrders();
                    break;
                case 3:

                    break;
                default:
                    System.out.println("Enter correct Number....");
                    continue Lreport;
            }
        } while (true);
    }

    public static void BestInCustomers() {
        clearConsole();
        System.out.println("	  ____            _     _____          _____          _                                \n"
                + "	 |  _ \\          | |   |_   _|        / ____|        | |                               \n"
                + "	 | |_) | ___  ___| |_    | |  _ __   | |    _   _ ___| |_ ___  _ __ ___   ___ _ __ ___ \n"
                + "	 |  _ < / _ \\/ __| __|   | | | '_ \\  | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__/ __|\n"
                + "	 | |_) |  __/\\__ \\ |_   _| |_| | | | | |___| |_| \\__ \\ || (_) | | | | | |  __/ |  \\__ \\\n"
                + "	 |____/ \\___||___/\\__| |_____|_| |_|  \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|  |___/\n"
                + "                                                                                       ");

        System.out.println("");
        System.out.println("----------------------------------------------------------------------------------------------------\n");
        System.out.println("");
        System.out.print("""
                           \t\t+---------------------+--------------------+-----------------------+                                         
                           \t\t|     Customer ID     |       ALL QTY      |      Total Amount     |
                           \t\t+---------------------+--------------------+-----------------------+ 
                           """);

        String phone[] = new String[0];
        int qtys[] = new int[0];
        double total[] = new double[0];

        l1:
        for (int i = 0; i < Customers.length; i++) {
            for (int j = 0; j < phone.length; j++) {
                if (Customers[i].getphonenumber().equalsIgnoreCase(phone[j])) {
                    qtys[j] += Customers[i].getqty();
                    total[j] += Customers[i].getamount();
                    continue l1;
                }
            }
            phone = extendStringArrays(phone);
            qtys = extendIntArrays(qtys);
            total = extendDoubleArrays(total);
            phone[phone.length - 1] = Customers[i].getphonenumber();
            qtys[qtys.length - 1] = Customers[i].getqty();
            total[total.length - 1] = Customers[i].getamount();
        }
        for (int i = 0; i < qtys.length - 1; i++) {
            for (int j = i + 1; j < qtys.length; j++) {
                if (qtys[i] < qtys[j]) {
                    double temp = total[i];
                    total[i] = total[j];
                    total[j] = temp;

                    int temp1 = qtys[i];
                    qtys[i] = qtys[j];
                    qtys[j] = temp1;

                    String temp2 = phone[i];
                    phone[i] = phone[j];
                    phone[j] = temp2;
                }
            }
        }

        for (int i = 0; i < Customers.length; i++) {
            System.out.printf("\t\t|  %-19s|       %11d  |     %16.2f  |%n", phone[i], qtys[i], total[i]);

        }
        System.out.println(" \t\t+---------------------+--------------------+-----------------------+\n\n");

    }

    public static void AllOrders() {
        clearConsole();
        System.out.println("\t\t  _        __                       ____          _                          ");
        System.out.println("\t\t  \\ \\    / (_)                     / __ \\        | |                         ");
        System.out.println("\t\t   \\ \\  / / _  _____        __    | |  | |_ __ __| | ____ _ __               ");
        System.out.println("\t\t    \\ \\/ / | |/ _ \\ \\  /\\  / /    | |  | | '__/ _' |/  _ \\ '__|              ");
        System.out.println("\t\t     \\  /  | |  __/\\ \\/  \\/ /     | |__| | | | (_| |   __/ |                 ");
        System.out.println("\t\t      \\/   |_|\\___| \\__/\\__/       \\____/|_|  \\__,_|\\____|_|                 ");
        System.out.println("\t\t________________________________________________________________________");
        System.out.printf("\n\n\t\t+%-12s+%-13s+%-7s+%-7s+%-13s+%-15s+\n", "------------", "---------------", "-------", "-------", "--------------", "---------------");
        System.out.printf("\t\t|  %-10s| %-14s| %-6s|  %-5s|   %-11s| %-14s|\n", "Order ID", "Phone Number", "Size", "QTY", " Amount", "    Status");
        System.out.printf("\t\t+%-12s+%-13s+%-7s+%-7s+%-13s+%-15s+\n", "------------", "---------------", "-------", "-------", "--------------", "---------------");

        String tempOrders[] = new String[Customers.length];
        String tempphoneNumbers[] = new String[Customers.length];
        String tempsizes[] = new String[Customers.length];
        int tempqtys[] = new int[Customers.length];
        double tempamounts[] = new double[Customers.length];
        String tempstatuss[] = new String[Customers.length];

        for (int i = Customers.length - 1; i >= 0; i--) {
            tempOrders[Customers.length - 1 - i] = Customers[i].getid();
            tempphoneNumbers[Customers.length - 1 - i] = Customers[i].getphonenumber();
            tempsizes[Customers.length - 1 - i] = Customers[i].getsize();
            tempqtys[Customers.length - 1 - i] = Customers[i].getqty();
            tempamounts[Customers.length - 1 - i] = Customers[i].getamount();
            tempstatuss[Customers.length - 1 - i] = Customers[i].getstatus();
        }
        for (int i = 0; i < Customers.length; i++) {
            System.out.printf("\t\t|  %-10s| %-14s|  %-5s|  %-5s|   %-11.2f| %-14s|\n", tempOrders[i], tempphoneNumbers[i], tempsizes[i], tempqtys[i], tempamounts[i], tempstatuss[i]);
        }
        System.out.printf("\t\t+%-12s+%-13s+%-7s+%-7s+%-13s+%-15s+\n", "------------", "---------------", "-------", "-------", "--------------", "---------------");
        while (true) {
            System.out.print("\n\n\tTo access the Main, please enter 0 : ");
            char op = input.next().charAt(0);
            if (op == '0') {
                home();
                break;
            }
            clearline(3);
        }
    }

    public static void setOrderStatus() {
        clearConsole();
        System.out.println("\t\t      ___           _                   ______ _        _                         ");
        System.out.println("\t\t    / __ \\        | |                 / _____| |      | |                        ");
        System.out.println("\t\t   | |  | |_ __ __| | ____ _ __      | (____ | |_ __ _| |_ _   _ ____                         ");
        System.out.println("\t\t   | |  | | '__/ _' |/  _ \\ '__|      \\___  \\| __/ _` |  _| | | / ___|                  ");
        System.out.println("\t\t   | |__| | | | (_| |   __/ |         ____)  | || (_| | |_| |_| \\___ \\                  ");
        System.out.println("\t\t    \\____/|_|  \\__,_|\\____|_|        |______/ \\__\\__,_|\\__|\\__,_|____/                        ");
        System.out.println("\t\t________________________________________________________________________\n\n");
        System.out.print("\t\tEnter order ID : ");
        String searchId = input.next();
        boolean isvalid = false;
        for (int i = 0; i < Customers.length; i++) {
            if (searchId.equalsIgnoreCase(Customers[i].getid())) {
                showOrderDetails(i);
                isvalid = true;
                System.out.print("\n\n\tDo you want to change this status? (y/n) : ");
                char op = input.next().charAt(0);
                if (op == 'y' || op == 'Y') {
                    if (Customers[i].getstatus().equalsIgnoreCase("Processing")) {
                        System.out.printf("\n\t\t[1]  Order Delivering  \n\t\t[2] Order Delivered ");
                        int option = 1;
                        System.out.println("");
                        do {
                            System.out.print("\n\tEnter option : ");
                            option = input.nextInt();
                            if (option == 1 || option == 2) {
                                break;
                            }
                            System.out.println("\n\t\tInvalid Input..");
                        } while (true);
                        switch (option) {
                            case 1:
                                Customers[i].setstatus(finalStatus[1]);
                                System.out.println("\n\t\tStatus Updated..!");
                                break;
                            case 2:
                                Customers[i].setstatus(finalStatus[2]);
                                System.out.println("\n\t\tStatus Updated..!");
                                break;
                        }

                    } else if (Customers[i].getstatus().equalsIgnoreCase("Delivering")) {
                        System.out.printf(" \n\t\t[1] Order Delivered ");
                        int option = 1;
                        do {
                            System.out.print("\n\n\tEnter option : ");
                            option = input.nextInt();
                            if (option == 1) {
                                break;
                            }
                            System.out.println("\n\t\tInvalid Input..");
                        } while (true);
                        if (option == 1) {
                            Customers[i].setstatus(finalStatus[2]);
                            System.out.println("\n\t\tStatus Updated..!");
                            break;
                        }

                    } else {
                        System.out.println("\n\t\tCan't change this order status, Order already delivered...!!");
                        break;
                    }
                }
                break;
            }
        }
        if (!isvalid) {
            System.out.println("\n\t\tInvalid ID..");
        }
        System.out.print("\n\tDo you want to change another Order status? (y/n)  : ");
        char op = input.next().charAt(0);
        if (op == 'y' || op == 'Y') {
            setOrderStatus();
        } else {
            home();
        }
    }

    public static void showOrderDetails(int i) {
        System.out.print("\n\tPhone Number : " + Customers[i].getphonenumber());
        System.out.print("\n\tSize         : " + Customers[i].getsize());
        System.out.print("\n\tQTY          : " + Customers[i].getqty());
        System.out.print("\n\tAmount       : " + Customers[i].getamount());
        System.out.print("\n\tStatus       : " + Customers[i].getstatus());
    }

    public static void DeleteOrder() {
        clearConsole();
        System.out.println("""
                           \t  _____       _      _          ____          _           
                           \t |  __ \\     | |    | |        / __ \\        | |          
                           \t | |  | | ___| | ___| |_ ___  | |  | |_ __ __| | ___ _ __ 
                           \t | |  | |/ _ \\ |/ _ \\ __/ _ \\ | |  | | '__/ _` |/ _ \\ '__|
                           \t | |__| |  __/ |  __/ ||  __/ | |__| | | | (_| |  __/ |   
                           \t |_____/ \\___|_|\\___|\\__\\___|  \\____/|_|  \\__,_|\\___|_|   
                                  ____________________________________________________________    """);

        System.out.printf("\n\n\t%-20s%2s", "Enter Order ID", ": ");
        String inputId = input.next();
        int s = 0;
        Customer[] temp = new Customer[Customers.length - 1];
        boolean found = false;

        for (int i = 0; Customers.length < 10; i++) {

            if (inputId.equalsIgnoreCase(Customers[i].getid())) {
                Customers[i].showoder(i);
                System.out.print("\n\nDo You want to delete this order? (Y/N) : ");
                char op = input.next().toUpperCase().charAt(0);

                if (op == 'Y') {
                    for (int j = 0; j < Customers.length - 1; j++) {
                        temp[j] = Customers[j + 1];
                    }
                    Customers = temp;
                }
                found = true;
                break;
            } else if (i < Customers.length - 1) {
                temp[i] = Customers[i];
            }

        }

        if (!found) {
            System.out.println("\n\t\tInvalid ID...");
        }
        System.out.print("\n\nDo You want to delete another order? (Y/N) : ");
        char opt = input.next().toUpperCase().charAt(0);
        if (opt == 'Y') {

            DeleteOrder();

        } else if (opt == 'N') {
            home();
        }

    }

    public static void deleteOption() {
        while (true) {
            System.out.printf("\t%-30s%2s", "Do you want to delete another order (Y/N) ?", ": ");
            char op = input.next().charAt(0);
            switch (op) {
                case 'y', 'Y' ->
                    DeleteOrder();
                case 'n', 'N' ->
                    home();
                default -> {

                    continue;
                }
            }
        }
    }

    public static String[] extendStringArrays(String[] arr) {
        String temp[] = new String[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        return arr;
    }

    public static int[] extendIntArrays(int[] arr) {
        int temp[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        return arr;
    }

    public static double[] extendDoubleArrays(double[] arr) {
        double temp[] = new double[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        return arr;
    }

    public static void main(String[] args) {
        home();
    }

}
