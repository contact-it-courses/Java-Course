package corejava.throwandthrows;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowAndThrows {
    public static void main(String[] args)  {
        try{
            openFile();
        }catch(FileNotFoundException e){
            System.out.println("Catch our exception here");
        }

    }

    public static void openFile() throws FileNotFoundException {
        throw new FileNotFoundException();
    }
}
