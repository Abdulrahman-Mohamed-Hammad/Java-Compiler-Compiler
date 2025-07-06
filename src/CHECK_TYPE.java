import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CHECK_TYPE {


    HashMap<String,Integer> map=new HashMap<>();
    HashMap<String,String>mapC=new HashMap<>();
    convert_to_java conv = new convert_to_java();
    String[] arr = new String[100]; // Initialize arr with a maximum size
    static int count = 0;

    void CHECK(String[] Line, int LENGTH) {

        if (LENGTH == 4) {
            if ("CHAR".equals(Line[0]) && "==".equals(Line[2]) ) {
                System.out.println(Line[1] + " TYPE OF CHAR");
                arr[count]=Line[1];
                count++;

                conv.checker1(Line);
              add_STRING_TO_HASHMAP(Line,CANADD(Line));

            }
            else if ("INTEGER".equals(Line[0]) && "==".equals(Line[2])) {
                System.out.println(Line[1] + " TYPE OF INTEGER");
                arr[count]=Line[1];
                count++;

                conv.checker(Line,LENGTH);
                add_INteger_TO_HASHMAP(Line,CANADD(Line));

            }

            else {
                System.out.println(Line[1] + " SYNTEXT ERROR");

            }


            }
        else if (LENGTH == 5)
        {
            IF_CONDITION(Line,LENGTH);
        }
    }
    boolean CANADD(String[] Line)
    {
        int i=0;
        while(i<count)
        {
            if(arr[i].equals(Line[1]))
            {
                return true;
            }
            i++;
        }
        return false;

    }

    void add_INteger_TO_HASHMAP(String[] Line,boolean X)
    {

        if(X)
        {
            map.put(Line[1],Integer.parseInt(Line[3]));


        }
    }
    void add_STRING_TO_HASHMAP(String[] Line,boolean X)
    {
        if(X)
        {
            mapC.put(Line[1],Line[3]);

        }
    }

    void CHECK_OPERETOR(String[] Line, int LENGTH)
    {
        if ("INTEGER".equals(Line[0]) && LENGTH == 6 && map.containsKey(Line[3]) && map.containsKey(Line[5]) &&  "==".equals(Line[2])) {
            conv.checker(Line,LENGTH);
            if ("*".equals(Line[4])) {
                System.out.println(Line[1]+" = "+(map.get(Line[3])-map.get(Line[5])));
                Line[3]= String.valueOf((map.get(Line[3])*map.get(Line[5])));
                add_INteger_TO_HASHMAP(Line,true);

            }
            else if ("/".equals(Line[4]))
            {
                System.out.println(Line[1]+" = "+(map.get(Line[3])-map.get(Line[5])));
                Line[3]= String.valueOf((map.get(Line[3])/map.get(Line[5])));
                add_INteger_TO_HASHMAP(Line,true);

            }
            else if ("+".equals(Line[4]))
            {
                System.out.println(Line[1]+" = "+(map.get(Line[3])-map.get(Line[5])));
                Line[3]= String.valueOf((map.get(Line[3])+map.get(Line[5])));
                add_INteger_TO_HASHMAP(Line,true);

            }
            else if ("-".equals(Line[4]))
            {
                System.out.println(Line[1]+" = "+(map.get(Line[3])-map.get(Line[5])));
                Line[3]= String.valueOf((map.get(Line[3])+map.get(Line[5])));
                add_INteger_TO_HASHMAP(Line,true);

            }

        }
    }
void IF_CONDITION(String[]Line,int LENGTH)
{
    if("IF".equals(Line[0]) && "=".equals(Line[2]))
    {
        conv.checker(Line,LENGTH);
        if(map.containsKey(Line[1]) && map.containsKey(Line[3]))
        {
            if(map.get(Line[1]) == map.get(Line[3]))
            {
                System.out.println("IF CONDITION EQUAL  "+Line[4]);
            }
            else {
                System.out.println("FALSE IF CONDITION ");
            }
        }
        else if(map.containsKey(Line[1]))
        {
            Integer value = map.get(Line[1]);
            if(value.equals(Integer.parseInt(Line[3])))
            {
                System.out.println("IF CONDITION EQUAL  "+Line[4]);
            }
            else {
                System.out.println("FALSE IF CONDITION ");
            }
        }
        else if(map.containsKey(Line[3]))
        {
            Integer value = map.get(Line[3]);
            if(value.equals(Integer.parseInt(Line[1])))
            {
                System.out.println("IF CONDITION EQUAL  "+Line[4]);
            }
            else {
                System.out.println("FALSE IF CONDITION ");
            }
        }
        else
        {
            if(Line[1].equals(Line[3]))
            {
                System.out.println("IF CONDITION EQUAL  "+Line[4]);
            }
            else {
                System.out.println("FALSE IF CONDITION ");
            }
        }

    }
    else
    {
        System.out.println("IF CONDITION SYNTEX ERROR ");
    }
}

    void printHashMap() {
        System.out.println("HashMap Contents:");
        if (this.map.isEmpty()) {
            System.out.println("HashMap is empty");
        } else {
            for (HashMap.Entry<String, Integer> entry : this.map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

            System.out.println("HashMap Contents:");
            if (this.mapC.isEmpty()) {
                System.out.println("HashMap is empty");
            } else {
                for (HashMap.Entry<String, String> entry : this.mapC.entrySet()) {
                    System.out.println(entry.getKey() + " : " + entry.getValue());
                }
            }
        }
        conv.printArray();
    }
}
