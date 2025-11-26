import java.util.Scanner;
public class StudentMarksheet {
    public static void main(String[] args) {

        Scanner marks = new Scanner(System.in);

        // Header
        System.out.println("Dedan Kimathi University of Technology");
        System.out.println("School of Computer Science and IT");
        System.out.println("Department of Computer Science");
        System.out.println("Academic Year: 2024/2025");
        System.out.println("STUDENT MARKSHEET (SECOND YEAR RESULTS)");
        System.out.println("--------------------------------------------------------------");

        // STUDENT 1
        System.out.print("Enter Registration Number (Student 1): ");
        String reg1 = marks.nextLine();

        System.out.print("Enter Full Name (Student 1): ");
        String name1 = marks.nextLine();

        System.out.println("Enter 7 unit marks for Student 1");
        int unit1std1 = marks.nextInt();
        int unit2std1 = marks.nextInt();
        int unit3std1 = marks.nextInt();
        int unit4std1 = marks.nextInt();
        int unit5std1 = marks.nextInt();
        int unit6std1 = marks.nextInt();
        int unit7std1 = marks.nextInt();

        int total1 = unit1std1 + unit2std1 + unit3std1 + unit4std1 + unit5std1 + unit6std1 + unit7std1;
        double average1 = total1 / 7.0;

        marks.nextLine();
        //STUDENT 2
        System.out.print("Enter Registration Number (Student 2): ");
        String reg2 = marks.nextLine();

        System.out.print("Enter Full Name (Student 2): ");
        String name2 = marks.nextLine();

        System.out.println("Enter 7 unit marks for Student 2");
        int unit1std2 = marks.nextInt();
        int unit2std2 = marks.nextInt();
        int unit3std2 = marks.nextInt();
        int unit4std2 = marks.nextInt();
        int unit5std2 = marks.nextInt();
        int unit6std2 = marks.nextInt();
        int unit7std2 = marks.nextInt();

        int total2 = unit1std2 + unit2std2 + unit3std2 + unit4std2 + unit5std2 + unit6std2 + unit7std2;
        double average2 = total2 / 7.0;

        marks.nextLine();
        // STUDENT 3
        System.out.print("Enter Registration Number (Student 3): ");
        String reg3 = marks.nextLine();

        System.out.print("Enter Full Name (Student 3): ");
        String name3 = marks.nextLine();

        System.out.println("Enter 7 unit marks for Student 3");
        int unit1std3 = marks.nextInt();
        int unit2std3 = marks.nextInt();
        int unit3std3 = marks.nextInt();
        int unit4std3 = marks.nextInt();
        int unit5std3 = marks.nextInt();
        int unit6std3 = marks.nextInt();
        int unit7std3 = marks.nextInt();

        int total3 = unit1std3 + unit2std3 + unit3std3 + unit4std3 + unit5std3 + unit6std3 + unit7std3;
        double average3 = total3 / 7.0;

        marks.nextLine();

        //STUDENT 4
        System.out.print("Enter Registration Number (Student 4): ");
        String reg4 = marks.nextLine();

        System.out.print("Enter Full Name (Student 4): ");
        String name4 = marks.nextLine();

        System.out.println("Enter 7 unit marks for Student 4");
        int unit1std4 = marks.nextInt();
        int unit2std4 = marks.nextInt();
        int unit3std4 = marks.nextInt();
        int unit4std4 = marks.nextInt();
        int unit5std4 = marks.nextInt();
        int unit6std4 = marks.nextInt();
        int unit7std4 = marks.nextInt();

        int total4 = unit1std4 + unit2std4 + unit3std4 + unit4std4 + unit5std4 + unit6std4 + unit7std4;
        double average4 = total4 / 7.0;

        marks.nextLine();


        // STUDENT 5
        System.out.print("Enter Registration Number (Student 5): ");
        String reg5 = marks.nextLine();

        System.out.print("Enter Full Name (Student 5): ");
        String name5 = marks.nextLine();

        System.out.println("Enter 7 unit marks for Student 5");
        int unit1std5 = marks.nextInt();
        int unit2std5 = marks.nextInt();
        int unit3std5 = marks.nextInt();
        int unit4std5 = marks.nextInt();
        int unit5std5 = marks.nextInt();
        int unit6std5 = marks.nextInt();
        int unit7std5 = marks.nextInt();


        int total5 = unit1std5 + unit2std5 + unit3std5 + unit4std5 + unit5std5 + unit6std5 + unit7std5;
        double average5 = total5 / 7.0;


        // PRINT MARKSHEET
        System.out.println("\nStudent Score Sheet");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("RegNo\t\t\t\t\t"+"FullName\t\t\t"+"CCS 2211\t"+"CCS 2212\t"+"CCS 2213\t"+"CCS 2214\t"+"CCS 2215\t"+"CCS 2216\t"+"CCS 2217\t"+"TOTALS\t"+"AVERAGE\t\t\t\t"+"STATUS\t"+"GRADE\t");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(reg1 +"\t\t\t"+ name1 +"\t\t\t"+ unit1std1 +"\t\t\t"+ unit2std1+"\t\t\t"+ unit3std1 +"\t\t\t"+ unit4std1 +"\t\t\t"+ unit5std1 +"\t\t\t"+ unit6std1 +"\t\t\t"+ unit7std1 +"\t\t"+ total1 +"\t\t"+ average1);
        System.out.println(reg2 +"\t\t"+ name2 +"\t\t\t"+ unit1std2 +"\t\t\t"+ unit2std2 +"\t\t\t"+ unit3std2 +"\t\t\t"+ unit4std2 +"\t\t\t"+ unit5std2 +"\t\t\t"+ unit6std2 +"\t\t\t"+ unit7std2 +"\t\t"+ total2 +"\t\t"+ average2);
        System.out.println(reg3 +"\t\t"+ name3 +"\t\t\t"+ unit1std3 +"\t\t\t"+ unit2std3 +"\t\t\t"+ unit3std3 +"\t\t\t"+ unit4std3 +"\t\t\t"+ unit5std3 +"\t\t\t"+ unit6std3 +"\t\t\t"+ unit7std3 +"\t\t"+ total3 +"\t\t"+ average3);
        System.out.println(reg4 +"\t\t"+ name4 +"\t\t\t"+ unit1std4 +"\t\t\t"+ unit2std4 +"\t\t\t"+ unit3std4 +"\t\t\t"+ unit4std4 +"\t\t\t"+ unit5std4 +"\t\t\t"+ unit6std4 +"\t\t\t"+ unit7std4 +"\t\t"+ total4 +"\t\t"+ average4);
        System.out.println(reg5 +"\t\t"+ name5 +"\t\t\t"+ unit1std5 +"\t\t\t"+ unit2std5 +"\t\t\t"+ unit3std5 +"\t\t\t"+ unit4std5 +"\t\t\t"+ unit5std5 +"\t\t\t"+ unit6std5 +"\t\t\t"+ unit7std5 +"\t\t"+ total5 +"\t\t"+ average5);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

    } // end of main
} // end of class