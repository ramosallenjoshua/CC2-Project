/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uccourses;
import java.util.Scanner;
/**
 *
 * @author MAX
 */
public class UCCourses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter College:");
        String a = in.next();
        System.out.println("Enter Course");
        String b = in.next();
        
        //CITCS
        if (a.equalsIgnoreCase("CITCS")||a.equalsIgnoreCase("College of Information Technology and Computer Science")) {
            System.out.println("Course:");
            System.out.println("College of Information Technology and Computer Science");
            if (b.equalsIgnoreCase("BSCS")||b.equalsIgnoreCase("Bachelor of Science in Computer Science")) {
                System.out.println("Program:");
                System.out.println("Bachelor of Science in Computer Science");
            }else if (b.equalsIgnoreCase("BSIT")||b.equalsIgnoreCase("Bachelor of Science in Information Technology")) {
                System.out.println("Program:");
                System.out.println("Bachelor of Science in Information Technology");
            }else if (b.equalsIgnoreCase("BSDA")||b.equalsIgnoreCase("Bachelor of Science in Data Analytics")) {
                System.out.println("Program:");
                System.out.println("Bachelor of Science in Data Analytics");
            }else if (b.equalsIgnoreCase("Associate in Computer Technology")||b.equalsIgnoreCase("ACT")) {
                System.out.println("Program:");
                System.out.println("Associate in Computer Technology");
            }else
                    System.out.println("Invalid Program");
            
        //CAS
        }else{
            if (a.equalsIgnoreCase("CAS")||a.equalsIgnoreCase("College of Arts and Sciences")) {
            System.out.println("Course:");
            System.out.println("College of Arts and Sciences");
            if (b.equalsIgnoreCase("Bachelor of Arts in English Language Studies")||b.equalsIgnoreCase("BAELS")) {
                System.out.println("Program:");
                System.out.println("Bachelor of Arts in English Language Studies");
            }else if (b.equalsIgnoreCase("Bachelor of Arts in Political Science")||b.equalsIgnoreCase("BAPS")) {
                System.out.println("Program:");
                System.out.println("Bachelor of Arts in Political Science");
            }else if (b.equalsIgnoreCase("Bachelor of Arts in Communication")||b.equalsIgnoreCase("BAC")) {
                System.out.println("Program:");
                System.out.println("Bachelor of Arts in English Language Studies");
            }else if (b.equalsIgnoreCase("Bachelor of Science in Psychology")||b.equalsIgnoreCase("BSP")) {
                System.out.println("Program:");
                System.out.println("Bachelor of Science in Psychology");
            }else if (b.equalsIgnoreCase("Bachelor of Science in Behavioral Science")||b.equalsIgnoreCase("BSBS")) {
                System.out.println("Program:");
                System.out.println("Bachelor of Science in Behavioral Science");
            }else
                    System.out.println("Invalid Program");
            
        //COA    
        }else{
            if (a.equalsIgnoreCase("COA")||a.equalsIgnoreCase("College of Accountancy")) {
            System.out.println("Course:");
            System.out.println("College of Accountancy");
            if (b.equalsIgnoreCase("BSAIS")||b.equalsIgnoreCase("Bachelor of Science in Accounting Information System")) {
                System.out.println("Program:");
                System.out.println("Bachelor of Science in Accounting Information System");
            }else if (b.equalsIgnoreCase("BSMA")||b.equalsIgnoreCase("Bachelor of Science in Management Accounting")) {
                System.out.println("Program:");
                System.out.println("Bachelor of Science in Management Accounting");
            }else if (b.equalsIgnoreCase("BSA")||b.equalsIgnoreCase("Bachelor of Science in Accountancy")) {
                System.out.println("Program:");
                System.out.println("Bachelor of Science in Accountancy");
            }else if (b.equalsIgnoreCase("BSFA")||b.equalsIgnoreCase("Bachelor of Science in Forensic Accounting")) {
                System.out.println("Program:");
                System.out.println("Bachelor of Science in Forensic Accounting");
            }else
                    System.out.println("Invalid Program");
            
        //CBA
        }else{
            if (a.equalsIgnoreCase("CBA")||a.equalsIgnoreCase("College of Business Administration")) {
            System.out.println("Course:");
            System.out.println("College of Business Administration");
            if (b.equalsIgnoreCase("BSBA")||b.equalsIgnoreCase("Bachelor of Science in Business Administration")) {
                System.out.println("Program:");
                System.out.println("Bachelor of Science in Business Administration");
            }else if (b.equalsIgnoreCase("BSE")||b.equalsIgnoreCase("Bachelor of Science in Entrepreneurship")) {
                System.out.println("Program:");
                System.out.println("Bachelor of Science in Bachelor of Science in Entrepreneurship");
            }else if (b.equalsIgnoreCase("BSOA")||b.equalsIgnoreCase("Bachelor of Science in Office Administration")) {
                System.out.println("Program:");
                System.out.println("Bachelor of Science in Office Administration");
            }else if (b.equalsIgnoreCase("BSRSM")||b.equalsIgnoreCase("Bachelor of Science in Real State Management")) {
                System.out.println("Program:");
                System.out.println("Bachelor of Science in Real State Management");
            }else if (b.equalsIgnoreCase("BSDM")||b.equalsIgnoreCase("Bachelor of Science in Digital Marketing")) {
                System.out.println("Program:");
                System.out.println("Bachelor of Science in Digital Marketing");
            }else
                    System.out.println("Invalid Program");
            
        //CEA    
        }else{
            if (a.equalsIgnoreCase("CEA")||a.equalsIgnoreCase("College of Engineering and Architechture")) {
            System.out.println("Course:");
            System.out.println("College of Engineering and Architechture");
            if (b.equalsIgnoreCase("BS Arch")||b.equalsIgnoreCase("Bachelor of Science in Architecture")) {
                System.out.println("Program:");
                System.out.println("Bachelor of Science in Architecture");
            }else if (b.equalsIgnoreCase("BSCE")||b.equalsIgnoreCase("Bachelor of Science in Civil Engineering")) {
                System.out.println("Program:");
                System.out.println("Bachelor of Science in Civil Engineering");
            }else if (b.equalsIgnoreCase("BSCpE")||b.equalsIgnoreCase("Bachelor of Science in Computer Engineering")) {
                System.out.println("Program:");
                System.out.println("Bachelor of Science in Computer Engineering");
            }else if (b.equalsIgnoreCase("BSEE")||b.equalsIgnoreCase("Bachelor of Science in Electronics Engineering")) {
                System.out.println("Program:");
                System.out.println("Bachelor of Science in Electronics Engineering");
            }else if (b.equalsIgnoreCase("BSESE")||b.equalsIgnoreCase("Bachelor of Science in Environmental & Sanitary Engineering")) {
                System.out.println("Program:");
                System.out.println("Bachelor of Science in Environmental & Sanitary Engineering");
            }else
                    System.out.println("Invalid Program");
            
        //CTE
        }else{
            if (a.equalsIgnoreCase("CTE")||a.equalsIgnoreCase("College of Teacher Education")) {
            System.out.println("Course:");
            System.out.println("College of Teacher Education");
            if (b.equalsIgnoreCase("BEEd")||b.equalsIgnoreCase("Bachelor of Science in Elementary Education - General")) {
                System.out.println("Program:");
                System.out.println("Bachelor of Science in Elementary Education - General");
            }else if (b.equalsIgnoreCase("BEEd")||b.equalsIgnoreCase("Bachelor of Science in Elementary Education")) {
                System.out.println("Program:");
                System.out.println("Bachelor of Science in Elementary Education");
            }else if (b.equalsIgnoreCase("BSEd")||b.equalsIgnoreCase("Bachelor of Science in Secondary Education")) {
                System.out.println("Program:");
                System.out.println("Bachelor of Science in Secondary Education");
            }else
                    System.out.println("Invalid Program");
        }else{
                    System.out.println("Invalid Course");
            }
                        }
                    }
                }
            }
        }
        
    }
    
}
