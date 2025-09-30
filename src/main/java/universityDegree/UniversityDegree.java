package universityDegree;

import java.util.Scanner;

public class UniversityDegree {
    String type;
    int yearsToComplete;

    public UniversityDegree(String type) {
        this.type = type;
    }
    public void CalculateYears() {

        if (this.type.equals("BSc")) {
            yearsToComplete = 4;
            System.out.println("Years Complete is " + yearsToComplete);
        }
        else if (this.type.equals("MSc")) {
            yearsToComplete = 2;
            System.out.println("Years Complete is " + yearsToComplete);
        }
        else if (this.type.equals("PhD")) {
            yearsToComplete = 5;
            System.out.println("Years Complete is " + yearsToComplete);
        }
        else {
            System.out.println("Not a valid usiversity degree");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        UniversityDegree us = new UniversityDegree(type);
        us.CalculateYears();
    }
}

