package corejava.throwandthrows;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedUnchecked {
    public static void main(String[] args) throws FileNotFoundException {

        FileReader fileReader = new FileReader("test.doc");
    }
}
