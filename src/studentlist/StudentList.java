 /*
        Name:  [your name here]
        Assignment:  [assignment name]
        Program: [your program name here]
        Date:  [assignment due date here]
    
        Description:
        [program description in your own words]
    */
package studentlist;

import java.util.Scanner;

/**
 *
 * @author Katrina
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //first we reverse
        
        System.out.println("Please enter a word");
        
        Scanner input = new Scanner(System.in);
        
        String word=input.nextLine();
        
        char[] letters = new char[word.length()];
        
        for (int i=0; i<word.length();i++){
            letters[i]=word.charAt(i);
        }
        
        System.out.println("\n Here is the word from the array");
        
        //print out the array
        for(char letter:letters){
            System.out.print(letter);
        }
        System.out.println("Here is the word reverse");
        //print out the word in reverse
        for(int i=letters.length-1;i>=0;i--){
            System.out.print(letters[i]);
            
        }
        //print a blank line
        System.out.println();
        
        System.out.println("Now we do the Student object");
        
        Student[] students = new Student[3];
        
        for(int i =0; i<students.length;i++){
            System.out.println("Enter the student name");
            String name = input.nextLine();
            Student student = new Student(name);
            students[i]=student; //put student in the array
        }
        
        System.out.println("Now we print them out");
        
        for (Student student: students){
            System.out.println(student.getName());
        }
    }

}
