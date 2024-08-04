/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fashion.shop;

import java.util.Scanner;

/**
 *
 * @author Prasad
 */
public class FashionShop {

    public static Scanner input = new Scanner(System.in);

    public static String[] orderId = {"ORD#00001", "ORD#00002", "ORD#00003", "ORD#00004"};
    public static String[] phoenumber = {"0741741744", "0741741741", "0852852852", "0760684578"};
    public static String size1[] = {"S", "M", "XL", "xs"};
    public static int qty[] = {4, 6, 5, 10};
    public static double amount[] = {2400.00, 7000.00, 5500.00, 6000.00};
    public static String[] Orderstatus = {"PROCESSING", "DELIVERING", "DELIVERED", "DELIVERING"};
    public final static String[] Status = {"PROCESSING", "DELIVERING", "DELIVERED"};
    
    static final String[] finalStatus = {"Processing", "Delivering", "Delivered"};

//    public static String[] orderId = new String[0];
//    public static String[] phoenumber = new String[0];
//    public static int qty[] = new int[0];
//    public static double amount[] = new double[0];
//    public static String size1[] = new String[0];
//    public static String[] Orderstatus = new String[0];
    public static int count = orderId.length;
    
    
    
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

    public static void declement() {

        String[] tempPhoneN = new String[phoenumber.length - 1];
        int[] tempqty = new int[qty.length - 1];
        double[] tempamount = new double[amount.length - 1];
        String[] tempsize = new String[size1.length - 1];
        String[] temporderid = new String[orderId.length - 1];
        String[] tempstatus = new String[Orderstatus.length - 1];

        for (int i = 0; i < tempPhoneN.length; i++) {
            tempPhoneN[i] = phoenumber[i];
            tempqty[i] = qty[i];
            tempamount[i] = amount[i];
            tempsize[i] = size1[i];
            temporderid[i] = orderId[i];
            tempstatus[i] = Orderstatus[i];
        }

        phoenumber = tempPhoneN;
        qty = tempqty;
        amount = tempamount;
        size1 = tempsize;
        orderId = temporderid;
        Orderstatus = tempstatus;

    }

    public static void extend() {

        String[] tempPhoneN = new String[phoenumber.length + 1];
        int[] tempqty = new int[qty.length + 1];
        double[] tempamount = new double[amount.length + 1];
        String[] tempsize = new String[size1.length + 1];
        String[] temporderid = new String[orderId.length + 1];
        String[] tempstatus = new String[Orderstatus.length + 1];

        for (int i = 0; i < phoenumber.length; i++) {
            tempPhoneN[i] = phoenumber[i];
            tempqty[i] = qty[i];
            tempamount[i] = amount[i];
            tempsize[i] = size1[i];
            temporderid[i] = orderId[i];
            tempstatus[i] = Orderstatus[i];
        }

        phoenumber = tempPhoneN;
        qty = tempqty;
        amount = tempamount;
        size1 = tempsize;
        orderId = temporderid;
        Orderstatus = tempstatus;

    }

    /**
     *
     */
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
//                            clearConsole();
                            continue LPLACEORDER;
                        }

                        /*-----------------------------------------------------------------------------*/
                        System.out.print("Do you want to place this order? (Y/N) : ");
                        String placeyn = input.next().toUpperCase();
                        char place = placeyn.charAt(0);

                        switch (place) {
                            case 'Y':
                                extend();
                                orderId[orderId.length - 1] = nowID;
                                phoenumber[orderId.length - 1] = PN;
                                size1[orderId.length - 1] = size;
                                qty[orderId.length - 1] = qty1;
                                amount[orderId.length - 1] = qamount;
                                Orderstatus[orderId.length - 1] = Status[0];
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
        for (int j = 0; j < phoenumber.length; j++) {

            if (phoenumber[j].equals(searchnum)) {

                switch (size1[j]) {
                    case "XS":
                        xscount += qty[j];
                        break;
                    case "S":
                        scount += qty[j];
                        break;
                    case "M":
                        mcount += qty[j];
                        break;
                    case "L":
                        lcount += qty[j];
                        break;
                    case "XL":
                        xlcount += qty[j];
                        break;
                    case "XXL":
                        xxlcount += qty[j];
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

//     clearConsole();
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

            for (int i = 0; i < orderId.length; i++) {
                if (orderId[i].equals(EnterID)) {
                    x = i;
//                    System.out.println(i);
                    found = true;
                    break;
                }

            }

            if (found) {
                System.out.println("");
                System.out.printf("%-16s%2s%n", "Phone number", ": " + phoenumber[x]);
                System.out.printf("%-16s%2s%n", "Size", ": " + size1[x]);
                System.out.printf("%-16s%2s%n", "QTY", ": " + qty[x]);
                System.out.printf("%-16s%2s%n", "Amount", ": " + amount[x]);
                System.out.printf("%-16s%2s%n", "Status", ": " + Orderstatus[x] + "\n");

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
//        clearConsole();
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
//        clearConsole();
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
        for (int i = 0; i < phoenumber.length; i++) {
            for (int j = 0; j < phone.length; j++) {
                if (phoenumber[i].equalsIgnoreCase(phone[j])) {
                    qtys[j] += qty[i];
                    total[j] += amount[i];
                    continue l1;
                }
            }
            phone = extendStringArrays(phone);
            qtys = extendIntArrays(qtys);
            total = extendDoubleArrays(total);
            phone[phone.length - 1] = phoenumber[i];
            qtys[qtys.length - 1] = qty[i];
            total[total.length - 1] = amount[i];
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
        
         

        for (int i = 0; i < phoenumber.length; i++) {
            System.out.printf("\t\t|  %-19s|       %11d  |     %16.2f  |%n", phone[i], qtys[i], total[i]);

        }
        System.out.println(" \t\t+---------------------+--------------------+-----------------------+\n\n");

    }
       
       
       
      public static void AllOrders() {
//        clearConsole();
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

        String tempOrders[] = new String[orderId.length];
        String tempphoneNumbers[] = new String[phoenumber.length];
        String tempsizes[] = new String[size1.length];
        int tempqtys[] = new int[qty.length];
        double tempamounts[] = new double[amount.length];
        String tempstatuss[] = new String[Orderstatus.length];
        
        for (int i = orderId.length - 1; i >= 0; i--) {
            tempOrders[orderId.length - 1 - i] = orderId[i];
            tempphoneNumbers[orderId.length - 1 - i] = phoenumber[i];
            tempsizes[orderId.length - 1 - i] = size1[i];
            tempqtys[orderId.length - 1 - i] = qty[i];
            tempamounts[orderId.length - 1 - i] = amount[i];
            tempstatuss[orderId.length - 1 - i] = Orderstatus[i];
        }
        for (int i = 0; i < orderId.length; i++) {
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
//            clearLinesAbove(3);
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
        for (int i = 0; i < orderId.length; i++) {
            if (searchId.equalsIgnoreCase(orderId[i])) {
                showOrderDetails(i);
                isvalid = true;
                System.out.print("\n\n\tDo you want to change this status? (y/n) : ");
                char op = input.next().charAt(0);
                if (op == 'y' || op == 'Y') {
                    if (Orderstatus[i].equalsIgnoreCase("Processing")) {
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
                                Orderstatus[i] = finalStatus[1];
                                System.out.println("\n\t\tStatus Updated..!");
                                break;
                            case 2:
                                Orderstatus[i] = finalStatus[2];
                                System.out.println("\n\t\tStatus Updated..!");
                                break;
                        }

                    } else if (Orderstatus[i].equalsIgnoreCase("Delivering")) {
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
                            Orderstatus[i] = finalStatus[2];
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
        System.out.print("\n\tPhone Number : " + phoenumber[i]);
        System.out.print("\n\tSize         : " + size1[i]);
        System.out.print("\n\tQTY          : " + qty[i]);
        System.out.print("\n\tAmount       : " + amount[i]);
        System.out.print("\n\tStatus       : " + Orderstatus[i]);
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
        boolean found = false;

        for (String id : orderId) {
            if (id.equals(inputId)) {
                for (int i = 0; i < orderId.length; i++) {
                    if (id == orderId[i]) {
                        s = i;
                    }
                }
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("");
            System.out.printf("%-16s%2s%n", "Phone number", ": " + phoenumber[s]);
            System.out.printf("%-16s%2s%n", "Size", ": " + size1[s]);
            System.out.printf("%-16s%2s%n", "QTY", ": " + qty[s]);
            System.out.printf("%-16s%2s%n", "Amount", ": " + amount[s]);
            System.out.printf("%-16s%2s%n", "Status", ": " + Orderstatus[s] + "\n");

            if (Orderstatus[s].equalsIgnoreCase(Status[0])) {
                System.out.println("\n\n");
                L0:
                while (true) {
                    System.out.printf("\t%-30s%2s", "Do you want to delete this order (Y/N) ?", ": ");
                    char op = input.next().charAt(0);
                    switch (op) {
                        case 'y', 'Y' -> {
                            System.out.println("\n\t\tOrder Deleted..!");
                            for (int i = s; i < orderId.length - 1; i++) {
                                phoenumber[i] = phoenumber[i + 1];
                                size1[i] = size1[i + 1];
                                qty[i] = qty[i + 1];
                                amount[i] = amount[i + 1];
                                orderId[i] = orderId[i + 1];
                                orderId[i] = orderId[i + 1];

                            }   //                        index--;
                            declement();
                            System.out.println("\n");
                            deleteOption();
                        }
                        case 'n', 'N' ->
                            home();
                        default -> {

                            continue L0;
                        }
                    }
                }
            } else if (Orderstatus[s].equalsIgnoreCase(Status[1])) {
                System.out.println("\n\n\t\tCan't delete this order , Order already delivering..! \n\n");
                deleteOption();
            } else {
                System.out.println("\n\n\t\tCan't delete this order , Order already deliverd..! \n\n");
                deleteOption();
            }
        }
        if (!found) {
            System.out.println("\n\t\tInvalid ID..\n\n");
            deleteOption();
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
//        PlaceOder();
//        searchCustomer();
//        searchOrder();
//Report();
//BestInCustomers();
//AllOrders();
    }

}
