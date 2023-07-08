/*ques 15)Write a program to check whether a file or directory exists or not.
ForExample
Input
Enter a file or directory Path : C:\temp
Enter a file or directory Path : C:\temp\sample.txt
Ouput
This(C:\temp) is a directory.
This(C:\temp\sample.txt) is a file. */
 
import java.io.File;
import java.util.Scanner;

public class FileExistenceCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a file or directory Path: ");
        String path = scanner.nextLine();

        File file = new File(path);

        if (file.exists()) {
            if (file.isDirectory()) {
                System.out.println("This(" + path + ") is a directory.");
            } else {
                System.out.println("This(" + path + ") is a file.");
            }
        } else {
            System.out.println("This(" + path + ") does not exist.");
        }

        scanner.close();
    }
}