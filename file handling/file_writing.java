import java.io.File;
import java.io.FileWriter;

// we dont need to scanner to write a file in java

public class file_writing {
    public static void main(String[] args) {
        
        try{
            File f = new File("file.txt");
            FileWriter fw = new FileWriter(f);
            fw.write("hi guys find whats the answer of");
            fw.write("found it?");
            fw.close();
        }
        catch(Exception e){
            System.out.println("check properly");
        }
        System.out.println("file created successfully");

    }
}
