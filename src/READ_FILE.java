import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class READ_FILE extends CHECK_TYPE {

    public READ_FILE()
    {

    }
    void Read() throws FileNotFoundException {
        File file =new File("TEST.txt");
        Scanner s =new Scanner(file);

        CHECK_TYPE B =new CHECK_TYPE();

        while(s.hasNextLine())
        {
            String Line =s.nextLine();
            String [] Words= Line.split("\\s+");
//            System.out.println("LENGTH = "+Words.length);
//            for(String i :Words)
//            {
//                System.out.print(i);
//                System.out.print(" ");
//
//            }
//            System.out.println();
            B.CHECK(Words,Words.length);
            B.CHECK_OPERETOR(Words, Words.length);

        }
      B.printHashMap();
    }
}
