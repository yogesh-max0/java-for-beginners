import java.util.Scanner;
import java.io.File;

// always use file handling in try exception handling block to prevent errors

class file_reading{
  public static void main(String[] args) {
    
    try{
    File f = new File("file.txt");
    Scanner read = new Scanner(f);

    while(read.hasNextLine()){
        System.out.println(read.nextLine());
    }
    read.close();
    }
    catch(Exception e){
        System.out.println("no file exisits at that name");
    }
    System.out.println("file readed successfully");       
  }
}