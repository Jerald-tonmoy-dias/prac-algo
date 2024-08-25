package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo {
    public static  void  show() {
//       sayHello("wow kaj kore shei shei");

        try {
            var reader = new FileReader("file.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public  static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }
}
