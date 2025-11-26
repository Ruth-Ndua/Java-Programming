import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //BILL TO
        System.out.println("Enter Bill To - Name: ");
        String billName = sc.nextLine();

        System.out.println("Enter Bill To - Address Line 1: ");
        String billAddr1 = sc.nextLine();

        System.out.println("Enter Bill To - Address Line 2: ");
        String billAddr2 = sc.nextLine();

        System.out.println("Enter Bill To - GSTIN: ");
        String billGST = sc.nextLine();

        System.out.println("Enter Bill To - Contact: ");
        String billContact = sc.nextLine();

        System.out.println("Enter Bill To - Email: ");
        String billEmail = sc.nextLine();

        //SHIP TO
        System.out.println("Enter Ship To - Name: ");
        String shipName = sc.nextLine();

        System.out.println("Enter Ship To - Address Line 1: ");
        String shipAddr1 = sc.nextLine();

        System.out.println("Enter Ship To - Address Line 2: ");
        String shipAddr2 = sc.nextLine();

        System.out.println("Enter Ship To - GSTIN: ");
        String shipGST = sc.nextLine();

        System.out.println("Enter Ship To - Contact: ");
        String shipContact = sc.nextLine();

        System.out.println("Enter Ship To - Email: ");
        String shipEmail = sc.nextLine();


        // PRODUCT INFORMATION
        System.out.println("This is the 1st Product");
        System.out.println("Enter S.No: ");
        int SNo1 = sc.nextInt();

        System.out.println("Enter Product Code: ");
        int Product_Code1 = sc.nextInt();

        sc.nextLine(); // fix
        System.out.println("Enter Product 1 Name: ");
        String p1 = sc.nextLine();

        System.out.println("Enter HSN Code: ");
        int HSN_Code1 = sc.nextInt();

        System.out.println("Enter Product 1 Quantity: ");
        int q1 = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter Units: ");
        String units1 = sc.nextLine();

        System.out.println("Enter Product 1 Rate: ");
        double r1 = sc.nextDouble();

        System.out.println("Enter Product 1 Tax %: ");
        double t1 = sc.nextDouble();


        // PRODUCT 2
        sc.nextLine();
        System.out.println("This is the 2nd Product");
        System.out.println("Enter S.No: ");
        int SNo2 = sc.nextInt();

        System.out.println("Enter Product Code: ");
        int Product_Code2 = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter Product 2 Name: ");
        String p2 = sc.nextLine();

        System.out.println("Enter HSN Code: ");
        int HSN_Code2 = sc.nextInt();

        System.out.println("Enter Product 2 Quantity: ");
        int q2 = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter Units: ");
        String units2 = sc.nextLine();

        System.out.println("Enter Product 2 Rate: ");
        double r2 = sc.nextDouble();

        System.out.println("Enter Product 2 Tax %: ");
        double t2 = sc.nextDouble();


        // PRODUCT 3
        sc.nextLine();
        System.out.println("This is the 3rd Product");
        System.out.println("Enter S.No: ");
        int SNo3 = sc.nextInt();

        System.out.println("Enter Product Code: ");
        int Product_Code3 = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter Product 3 Name: ");
        String p3 = sc.nextLine();

        System.out.println("Enter HSN Code: ");
        int HSN_Code3 = sc.nextInt();

        System.out.println("Enter Product 3 Quantity: ");
        int q3 = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter Units: ");
        String units3 = sc.nextLine();

        System.out.println("Enter Product 3 Rate: ");
        double r3 = sc.nextDouble();

        System.out.println("Enter Product 3 Tax %: ");
        double t3 = sc.nextDouble();


        // PRODUCT 4
        sc.nextLine();
        System.out.println("This is the 4th Product");
        System.out.println("Enter S.No: ");
        int SNo4 = sc.nextInt();

        System.out.println("Enter Product Code: ");
        int Product_Code4 = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter Product 4 Name: ");
        String p4 = sc.nextLine();

        System.out.println("Enter HSN Code: ");
        int HSN_Code4 = sc.nextInt();

        System.out.println("Enter Product 4 Quantity: ");
        int q4 = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter Units: ");
        String units4 = sc.nextLine();

        System.out.println("Enter Product 4 Rate: ");
        double r4 = sc.nextDouble();

        System.out.println("Enter Product 4 Tax %: ");
        double t4 = sc.nextDouble();


        // PRODUCT 5
        sc.nextLine();
        System.out.println("This is the 5th Product");
        System.out.println("Enter S.No: ");
        int SNo5 = sc.nextInt();

        System.out.println("Enter Product Code: ");
        int Product_Code5 = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter Product 5 Name: ");
        String p5 = sc.nextLine();

        System.out.println("Enter HSN Code: ");
        int HSN_Code5 = sc.nextInt();

        System.out.println("Enter Product 5 Quantity: ");
        int q5 = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter Units: ");
        String units5 = sc.nextLine();

        System.out.println("Enter Product 5 Rate: ");
        double r5 = sc.nextDouble();

        System.out.println("Enter Product 5 Tax %: ");
        double t5 = sc.nextDouble();


        // PRODUCT 6
        sc.nextLine();
        System.out.println("This is the 6th Product");
        System.out.println("Enter S.No: ");
        int SNo6 = sc.nextInt();

        System.out.println("Enter Product Code: ");
        int Product_Code6 = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter Product 6 Name: ");
        String p6 = sc.nextLine();

        System.out.println("Enter HSN Code: ");
        int HSN_Code6 = sc.nextInt();

        System.out.println("Enter Product 6 Quantity: ");
        int q6 = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter Units: ");
        String units6 = sc.nextLine();

        System.out.println("Enter Product 6 Rate: ");
        double r6 = sc.nextDouble();

        System.out.println("Enter Product 6 Tax %: ");
        double t6 = sc.nextDouble();


        // PRODUCT 7
        sc.nextLine();
        System.out.println("This is the 7th Product");
        System.out.println("Enter S.No: ");
        int SNo7 = sc.nextInt();

        System.out.println("Enter Product Code: ");
        int Product_Code7 = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter Product 7 Name: ");
        String p7 = sc.nextLine();

        System.out.println("Enter HSN Code: ");
        int HSN_Code7 = sc.nextInt();

        System.out.println("Enter Product 7 Quantity: ");
        int q7 = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter Units: ");
        String units7 = sc.nextLine();

        System.out.println("Enter Product 7 Rate: ");
        double r7 = sc.nextDouble();

        System.out.println("Enter Product 7 Tax %: ");
        double t7 = sc.nextDouble();


        // CALCULATIONS
        double a1 = q1 * r1 + (q1 * r1 * t1 / 100);
        double a2 = q2 * r2 + (q2 * r2 * t2 / 100);
        double a3 = q3 * r3 + (q3 * r3 * t3 / 100);
        double a4 = q4 * r4 + (q4 * r4 * t4 / 100);
        double a5 = q5 * r5 + (q5 * r5 * t5 / 100);
        double a6 = q6 * r6 + (q6 * r6 * t6 / 100);
        double a7 = q7 * r7 + (q7 * r7 * t7 / 100);

        double Total = a1 + a2 + a3 + a4 + a5 + a6 + a7;
        double discountRate = 0.6368 / 100;
        double discountAmount = Total * discountRate;
        double GrandTotal = Total - discountAmount;


        // PRINT
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Bill To:                                                                    Ship To:");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(billName + "                                                         " + shipName);
        System.out.println(billAddr1 + "                                                       " + shipAddr1);
        System.out.println(billAddr2 + "                                                   " + shipAddr2);
        System.out.println("GSTIN: " + billGST + "                                                   GSTIN: " + shipGST);
        System.out.println("Contact: " + billContact + "                                             Contact: " + shipContact);
        System.out.println("Email: " + billEmail + "                                                      Email: " + shipEmail);

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                  Payment Date: 7 days from date of delivery                           Payment Terms:100% against invoice");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");

        System.out.printf("%-5s %-15s %-25s %-10s %-10s %-8s %-10s %-8s %-12s%n",
                "S.No", "Product_Code", "Product Name", "HSN_Code", "Quantity", "Units", "Rate", "Tax", "Amount");

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

        System.out.printf("%-5d %-15d %-25s %-10d %-10d %-8s %-10.2f %-8s %-12.2f%n",
                SNo1, Product_Code1, p1, HSN_Code1, q1, units1, r1, t1 + "%", a1);

        System.out.printf("%-5d %-15d %-25s %-10d %-10d %-8s %-10.2f %-8s %-12.2f%n",
                SNo2, Product_Code2, p2, HSN_Code2, q2, units2, r2, t2 + "%", a2);

        System.out.printf("%-5d %-15d %-25s %-10d %-10d %-8s %-10.2f %-8s %-12.2f%n",
                SNo3, Product_Code3, p3, HSN_Code3, q3, units3, r3, t3 + "%", a3);

        System.out.printf("%-5d %-15d %-25s %-10d %-10d %-8s %-10.2f %-8s %-12.2f%n",
                SNo4, Product_Code4, p4, HSN_Code4, q4, units4, r4, t4 + "%", a4);

        System.out.printf("%-5d %-15d %-25s %-10d %-10d %-8s %-10.2f %-8s %-12.2f%n",
                SNo5, Product_Code5, p5, HSN_Code5, q5, units5, r5, t5 + "%", a5);

        System.out.printf("%-5d %-15d %-25s %-10d %-10d %-8s %-10.2f %-8s %-12.2f%n",
                SNo6, Product_Code6, p6, HSN_Code6, q6, units6, r6, t6 + "%", a6);

        System.out.printf("%-5d %-15d %-25s %-10d %-10d %-8s %-10.2f %-8s %-12.2f%n",
                SNo7, Product_Code7, p7, HSN_Code7, q7, units7, r7, t7 + "%", a7);


        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %80s %-10.2f |\n", "Total:", Total);
        System.out.printf("| %80s %-10.2f |\n", "Discount:", discountAmount);
        System.out.printf("| %80s %-10.2f |\n", "Grand Total:", GrandTotal);
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
    }
}
