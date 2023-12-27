import javax.sound.sampled.Line;
import java.io.*;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class WestMinisterShoppingManger implements ShoppingManger {

    static Scanner scanner = new Scanner(System.in);

    static List<Electronics> electronics = new ArrayList<Electronics>();

    static List<Clothing> clothing = new ArrayList<Clothing>();

    static List <Product>product_Array = new ArrayList<>();


    public static void main(String[] args) {

        mainMenu();


    }

    private static void mainMenu() {
        WestMinisterShoppingManger WSMS = new WestMinisterShoppingManger();

        System.out.println("electronicsArray :" + electronics.size());
        System.out.println("productArray :" + product_Array.size());

        boolean flag = true;

        do {

            System.out.println("\n==========================================================================================================================");
            System.out.println("|                                        Westminster Shopping Manger                              version 1.0                 |");
            System.out.println("============================================================================================================================");
            System.out.println("|                                                                                                                            |");
            System.out.println("|                                                    MAIN MENU                                                               |");
            System.out.println("=============================================================================================================================");
            System.out.println("|                                                                                                                            |");
            System.out.println("|                                        1). Add a New Product.                                                              |");
            System.out.println("|                                        2). Delete a Procuct                                                                |");
            System.out.println("|                                        3). Print the List of Products.                                                     |");
            System.out.println("|                                        4). Save in a File                                                                  |");
            System.out.println("|                                        7). Open GUI.                                                                       |");
            System.out.println("|                                        8). Exit.                                                                           |");
            System.out.println("|                                                                                                                            |");
            System.out.println("==============================================================================================================================");
            System.out.print("\nEnter Your Option :  ");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    WSMS.addProduct();


                case 2:
                    WSMS.deleteProduct();


                case 3:
                    WSMS.print_product_list();


                case 4:
                    WSMS.Save_in_a_file();


                case 5:
                    new GUI();


                case 6:
                    flag = false;
            }

        } while (true);
    }


    @Override
    public void addProduct() {


        if (product_Array.size() < 50) {
            System.out.println("\n==========================================================================================================================");
            System.out.println("|                                        Add a product                                                        |");
            System.out.println("=============================================================================================================================");
            System.out.println("|                                                                                                                           |");
            System.out.println("|                                        1).  Electronics                                                                   |");
            System.out.println("|                                        2).  Clothing                                                                      |");
            System.out.println("|                                        3). Back                                                                           |");
            System.out.println("=============================================================================================================================");
            System.out.print("\nEnter Your Option :  ");

            int option1 = scanner.nextInt();

            System.out.println();
            System.out.println(

            );

            switch (option1) {

                case 1:
                    addElectronic();


                case 2:
                    addClothing();

                case 3:
                    mainMenu();


            }

        }

    }

    private void addClothing() {

        while (true) {
            System.out.println("Add  a Clothing Product");
      /*  System.out.print("Enter Product Id : " );
        String id = scanner.next();

        for (Electronics elec: electronics) {
            if(elec.getProductId().equals(id)) {
                System.out.println("Product Id already exists try adding a new Id");
                addElectronic();
            }

        }*/

            System.out.println("Enter Product Id :  C00" + (clothing.size() + 1));
            String id = ("C00" + (clothing.size() + 1));
            System.out.print("Enter Product Name : ");
            String name = scanner.next();
            System.out.print("Enter Available No : ");
            String availableNo = scanner.next();
            System.out.print("Enter Price : Rs.");
            Double price = scanner.nextDouble();
            System.out.print("Enter size:");
            String size = scanner.next();
            System.out.print("Enter colour:");
            String colour = scanner.next();

            System.out.print("Do you want to save this product (Y/N):");
            char confirm = scanner.next().charAt(0);

            if ((confirm == 'Y' || confirm == 'y') || (confirm == 'N' || confirm == 'n')) {


                if (confirm == 'Y' || confirm == 'y') {

                    clothing.add(new Clothing(id, name, availableNo, price, size, colour));
                    product_Array.add(new Clothing(id, name, availableNo, price, size, colour));

                    System.out.println("Product added successfully");

                }
                if (confirm == 'N' || confirm == 'n') {
                    System.out.println("Ok try another time");

                }

                    System.out.println();

                    System.out.println("Do you want to add another Product(Y/N)?");
                    char ch = scanner.next().charAt(0);

                    System.out.println();
                    System.out.println();


                    if (ch == 'Y' || ch == 'y') {
                        addClothing();
                    }

                    if (ch == 'N' || ch == 'n') {

                        addProduct();
                        break;

                    }
                    System.out.println();


                }

        else {
                System.out.println("Invalid input");
            }
        }
    }

    private void addElectronic() {


        while (true) {
            System.out.println("Add  a Electronic Product");
      /*  System.out.print("Enter Product Id : " );
        String id = scanner.next();

        for (Electronics elec: electronics) {
            if(elec.getProductId().equals(id)) {
                System.out.println("Product Id already exists try adding a new Id");
                addElectronic();
            }

        }*/

            System.out.println("Enter Product Id :  P00" + (electronics.size() + 1));
            String id = ("P00" + (electronics.size() + 1));
            System.out.print("Enter Product Name : ");
            String name = scanner.next();
            System.out.print("Enter Available No : ");
            String availableNo = scanner.next();
            System.out.print("Enter Price : Rs.");
            Double price = scanner.nextDouble();
            System.out.print("Enter the brand:");
            String brand = scanner.next();
            System.out.print("Enter warranty period:");
            String warrenty = scanner.next();

            System.out.print("Do you want to save this product (Y/N):");
            char confirm = scanner.next().charAt(0);

            if ((confirm == 'Y' || confirm == 'y') || (confirm == 'N' || confirm == 'n')) {


                if (confirm == 'Y' || confirm == 'y') {

                    electronics.add(new Electronics(id, name, availableNo, price, brand, warrenty));
                    product_Array.add(new Electronics(id, name, availableNo, price, brand, warrenty));
                    System.out.println("Product added successfully");


                    System.out.println();

                    System.out.println();


                }


                System.out.print("Do you want to add another Product(Y/N)?");
                char ch = scanner.next().charAt(0);
                System.out.println();
                System.out.println();


                if (ch == 'Y' || ch == 'y') {
                    addElectronic();
                }

                if (ch == 'N' || ch == 'n') {

                    addProduct();
                    break;

                }
            } else {
                System.out.println("Invalid input");
            }
        }
    }


    @Override
    public void deleteProduct() {

        System.out.println("\n======================================================================");
        System.out.println("|                           Delete a Product                           |");
        System.out.println("======================================================================\n");
        System.out.println("|                               1).  Electronics                      |");
        System.out.println("|                               2).  Clothing                         |");
        System.out.println("|                               3). Back                              |");
        System.out.println("======================================================================\n");

        System.out.println("Enter your choice : ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                deleteElectronic();
                break;
            case 2:
                deleteClothing();
                break;
            case 3:
                mainMenu();
                break;
            default:
                System.out.println("Invalid Choice");
                deleteProduct();

        }


    }

    private void deleteClothing() {

        System.out.print("Enter the Clothing Product Id that need to be Removed :  ");
        String DeleteProd = scanner.next();
        for (int x = 0; x < clothing.size(); x++) {
            if (DeleteProd.equals(clothing.get(x).getProductId()) && DeleteProd.equals(clothing.get(x).getProductId())) {
                System.out.println("======================================================================");
                System.out.println("|                      Details of Removed Product                    |");
                System.out.println("======================================================================\n");
                System.out.println("ProductId           : " + clothing.get(x).getProductId());
                System.out.println("Name                : " + clothing.get(x).getProductName());
                System.out.println("AvailableNo         : " + clothing.get(x).getAvailabaleNo());
                System.out.println("Price               : " + clothing.get(x).getPrice());
                System.out.println("Size               : " + clothing.get(x).getSize());
                System.out.println("Colour            : " + clothing.get(x).getColour());

                clothing.remove(x);

                for(int i=0;i<product_Array.size();i++){
                    if(DeleteProd.equals(product_Array.get(i).getProductId())){
                        product_Array.remove(i);
                    }
                }

                if (clothing.size() == 1) {
                    System.out.println();
                    System.out.println();
                    System.out.println("\n\n======================================================================");
                    System.out.println("|              Successfully Removed the Product                           |");
                    System.out.println("==========================================================================\n");
                    System.out.println("---------------There is One Clothing Product Remaining on the List---------");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("\n\n======================================================================");
                    System.out.println("|                              Total Products                             |");
                    System.out.println("=========================================================================\n");
                    System.out.println("There are " + product_Array.size() + " Clothing Products Now ");


                } else if (clothing.size() > 1) {
                    System.out.println();
                    System.out.println();
                    System.out.println("\n\n======================================================================");
                    System.out.println("|             Successfully Removed the Product                           |");
                    System.out.println("=========================================================================\n");
                    System.out.println("There are " + clothing.size() + " Clothing Products Now ");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("\n\n======================================================================");
                    System.out.println("|                              Total Products                             |");
                    System.out.println("=========================================================================\n");
                    System.out.println("There are " + product_Array.size() + " Clothing Products Now ");


                } else {
                    System.out.println();
                    System.out.println();
                    System.out.println("\n\n======================================================================");
                    System.out.println("|             Successfully Removed the Product               |");
                    System.out.println("==========================================================================\n");
                    System.out.println();
                    System.out.println("------------------No Clothing Products Available At the Moment--------------");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("\n\n======================================================================");
                    System.out.println("|                              Total Products                             |");
                    System.out.println("=========================================================================\n");
                    System.out.println("There are " + product_Array.size() + " Clothing Products Now ");
                }
            } else {
                System.out.println("-------------Couldn't Find an Clothing Product with this ProductId ------------");
            }
        }
    }

    private void deleteElectronic() {

        System.out.print("Enter the Electronic Product Id that need to be Removed :  ");
        String DeleteProd = scanner.next();
        for (int x = 0; x < electronics.size(); x++) {
            if (DeleteProd.equals(electronics.get(x).getProductId()) && DeleteProd.equals(electronics.get(x).getProductId())) {
                System.out.println("======================================================================");
                System.out.println("|                      Details of Removed Product                    |");
                System.out.println("======================================================================\n");
                System.out.println("ProductId           : " + electronics.get(x).getProductId());
                System.out.println("Name                : " + electronics.get(x).getProductName());
                System.out.println("AvailableNo         : " + electronics.get(x).getAvailabaleNo());
                System.out.println("Price               : " + electronics.get(x).getPrice());
                System.out.println("Brand               : " + electronics.get(x).getBrand());
                System.out.println("Warrenty            : " + electronics.get(x).getWarranty());

                electronics.remove(x);

                for(int i=0;i<product_Array.size();i++){
                    if(DeleteProd.equals(product_Array.get(i).getProductId())){
                        product_Array.remove(i);
                    }
                }



                if (electronics.size() == 1) {
                    System.out.println();
                    System.out.println();
                    System.out.println("\n\n======================================================================");
                    System.out.println("|              Successfully Removed the Product                           |");
                    System.out.println("==========================================================================\n");
                    System.out.println("---------------There is One Electronic Product Remaining on the List-------");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("\n\n======================================================================");
                    System.out.println("|                              Total Products                             |");
                    System.out.println("=========================================================================\n");
                    System.out.println("There are " + product_Array.size() + "  Products Now ");


                } else if (electronics.size() > 1) {
                    System.out.println();
                    System.out.println();
                    System.out.println("\n\n======================================================================");
                    System.out.println("|             Successfully Removed the Product                           |");
                    System.out.println("=========================================================================\n");
                    System.out.println("There are " + electronics.size() + " Electronic Products Now ");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("\n\n======================================================================");
                    System.out.println("|                              Total Products                             |");
                    System.out.println("=========================================================================\n");
                    System.out.println("There are " + product_Array.size() + "  Products Now ");


                } else {
                    System.out.println();
                    System.out.println();
                    System.out.println("\n\n======================================================================");
                    System.out.println("|             Successfully Removed the Product                            |");
                    System.out.println("==========================================================================\n");
                    System.out.println();
                    System.out.println("----------------No Electronic Products Available At the Moment-----------");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("\n\n======================================================================");
                    System.out.println("|                              Total Products                             |");
                    System.out.println("=========================================================================\n");
                    System.out.println("There are " + product_Array.size() + " Clothing Products Now ");
                }
            } else {
                System.out.println("-------------Couldn't Find an Electronic Product with this ProductId --------------");
            }
        }
    }


    @Override
    public void print_product_list() {


        System.out.println("Total amount of clothes : " + clothing.size());
        System.out.println("Total amount of electronics : " + electronics.size());
        System.out.println("Total amount of products : " + product_Array.size());
        System.out.println();


        System.out.println("\n======================================================================");
        System.out.println("|                           Print a Product                            |");
        System.out.println("======================================================================\n");
        System.out.println("|                               1).  Electronics                      |");
        System.out.println("|                               2).  Clothing                         |");
        System.out.println("|                               3). Back                              |");
        System.out.println("======================================================================\n");

        System.out.println("Enter your choice : ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                printElectronic();
                break;
            case 2:
                printClothing();
                break;
            case 3:
                 mainMenu();
                break;
            default:
                System.out.println("Invalid Choice");
                deleteProduct();


        }
    }

    private void printClothing() {

        System.out.println("\n=========================================================================");
        System.out.println("|                              Clothing  Products                       |");
        System.out.println("===========================================================================\n");

        for (int i = 0; i < clothing.size(); i++) {


                System.out.println();
                System.out.println();
                System.out.println("\n============================");
                System.out.println("| Product No: 0" + (i+1) + "|");
                System.out.println("================================\n");

                System.out.println("ProductId           : " + clothing.get(i).getProductId());
                System.out.println("Name                : " + clothing.get(i).getProductName());
                System.out.println("AvailableNo         : " + clothing.get(i).getAvailabaleNo());
                System.out.println("Price               : " + clothing.get(i).getPrice());
                System.out.println("Size               : " + clothing.get(i).getSize());
                System.out.println("Colour            : " + clothing.get(i).getColour());

        }
               print_product_list();
    }




    private void printElectronic() {

        System.out.println("\n=========================================================================");
        System.out.println("|                              Electronic  Products                       |");
        System.out.println("===========================================================================\n");

        for (int i = 0; i < electronics.size(); i++) {


                System.out.println();
                System.out.println();
                System.out.println("\n==========================");
                System.out.println("| Product No: 0" + (i+1)+ "|");
                System.out.println("============================\n");

                System.out.println("ProductId           : " + electronics.get(i).getProductId());
                System.out.println("Name                : " + electronics.get(i).getProductName());
                System.out.println("AvailableNo         : " + electronics.get(i).getAvailabaleNo());
                System.out.println("Price               : " + electronics.get(i).getPrice());
                System.out.println("Brand               : " + electronics.get(i).getBrand());
                System.out.println("Warrenty            : " + electronics.get(i).getWarranty());

        }

         print_product_list();
    }



    @Override
    public void Save_in_a_file() {

        System.out.println("\n======================================================================");
        System.out.println("|                           Save in a File                           |");
        System.out.println("======================================================================\n");
        System.out.println("|                           1).  Electronics                         |");
        System.out.println("|                           2).  Clothing                            |");
        System.out.println("|                           3).  Back                                |");
        System.out.println("======================================================================\n");

        System.out.println("Enter your choice : ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                saveElectronicFile();
                readFile();
                loadFile();
                break;
            case 2:
                //saveClothingFile();
                break;
            case 3:
                Save_in_a_file();
                break;
            default:
                System.out.println("Invalid Choice");
        }

    }


    public void saveElectronicFile() {
        try {
            BufferedWriter TextFILE = new BufferedWriter(new FileWriter("Electronic Product List.txt"));
            for (Electronics electronics1 : electronics) {
                TextFILE.write(electronics1.getProductId() + "\n" + electronics1.getProductName() + "\n" + electronics1.getAvailabaleNo() + "\n" + electronics1.getBrand() + "\n" + electronics1.getWarranty() +  "\n\n");
            }
            System.out.println("Successfully Saved Data to the File...");
            TextFILE.close();
        }catch (IOException e) {
            System.out.println("Error....");
        }
    }

    public void readFile() {
        try {
            String RFL;
            BufferedReader reader = new BufferedReader(new FileReader("Electronic Product List.txt"));
            while ((RFL = reader.readLine()) != null) {
                System.out.println(RFL);
            }reader.close();
        }catch (IOException e) {
            System.out.println("Error....");
        }
    }

    public void loadFile() {
        try {
            String LDdetails;
            ArrayList<String> LDarray = new ArrayList<>();
            BufferedReader temp = new BufferedReader(new FileReader("Electronic Product List.txt"));
            while ((LDdetails = temp.readLine()) != null) {
                if (LDdetails.equals("")) {
                    continue;
                }else {
                    LDarray.add(LDdetails);
                }
            }
            for (int x = 0; x <= (LDarray.size() / 6); x++) {
                if (electronics.size() == 0) {
                    electronics.add(new Electronics(LDarray.get(0), LDarray.get(1), LDarray.get(2), Double.parseDouble(LDarray.get(3)), LDarray.get(4), LDarray.get(5)));
                    LDarray.subList(0, 6).clear();
                }else {
                    if (electronics.size() <= 10) {
                        boolean read = true;
                        for (int y = 0; y <= (LDarray.size() / 6); y++) {
                            for (Electronics electronics : electronics) {
                                if (electronics.getProductId().equals(LDarray.get(0))) {
                                    read = false;
                                    LDarray.subList(0, 6).clear();
                                }else {
                                    read = true;
                                }
                            }
                        }
                        if (read) {
                            electronics.add(new Electronics(LDarray.get(0), LDarray.get(1), LDarray.get(2), Double.parseDouble(LDarray.get(3)), LDarray.get(4), LDarray.get(5)));
                            LDarray.subList(0, 6).clear();
                        }
                    }else {
                        break;
                    }
                }
            }
            System.out.println("Data Loaded Successfully....");
            temp.close();
        }catch (IOException e) {
            System.out.println("No Data Found....");
        }
    }
}








