package exception_handling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadWrite  {
    void readFile() throws FileNotFoundException {
            FileInputStream fis = new FileInputStream("");
    }

    public static void main(String[] args) {
        ReadWrite rw =new ReadWrite();
        try{
            rw.readFile();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}
