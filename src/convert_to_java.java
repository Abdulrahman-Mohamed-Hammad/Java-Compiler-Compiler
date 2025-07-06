import java.sql.Array;

public class convert_to_java {

    String[] arr = new String[100];
    int count = 0;

    void checker(String[] Line, int LENGTH) {
        if (LENGTH == 4) {
            arr[count] = "int " + Line[1] + " = " + Line[3] + " ; ";
            count++;

        } else if (LENGTH == 5) {
            arr[count] = "if ( " + Line[1] + " == " + Line[3] + " ) { " + Line[4] + " }";

        } else if (LENGTH == 6) {
            arr[count] = "int " + Line[1] + " = " + Line[3] + " " + Line[4] + " " + Line[5] + ";";

        }
        count++;

    }

    void checker1(String[] Line) {
        arr[count] = "String " + Line[1] + " = " + Line[3] + " ; ";
        count++;
    }

    void printArray() {
        System.out.println("CONVERT TO JAVA :");
        for (int i = 0; i < count; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i]);
            }
        }
    }
}
