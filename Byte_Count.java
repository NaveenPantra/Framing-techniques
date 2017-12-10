/**
 * Created by Naveen Pantra on 01-08-2017.
 */
import java.util.*;

class Byte_Count {
    static int frame=1,k=0,i=0,j=0;
    static String c;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("\nENTER THE DATA WANT TO SEND BY BYTE_COUNT : ");
        String data = s.nextLine();
        System.out.printf("\nTHE DATA ON THE SENDER SIDE : %s",data);
        frame_count(data);

    }

    public static void frame_count(String data) {
        System.out.printf("\n\nTHE DATA ON THE RECEIVER SIDE : ");
        while( i < data.length() ) {
            System.out.printf("\nFRAME : %d = ", frame);
            c= String.valueOf(data.charAt(i));
            j=Integer.parseInt(c);
            k=0;
            while(k < j && i < data.length()) {
                System.out.printf(" " + data.charAt(i));
                i++;
                k++;
            }
            frame++;
        }
    }
}

//output
    /*

    ENTER THE DATA WANT TO SEND BY BYTE_COUNT : 2132154321654321

        THE DATA ON THE SENDER SIDE : 2132154321654321
        THE DATA ON THE RECEIVER SIDE :
        FRAME : 1 =  2 1
        FRAME : 2 =  3 2 1
        FRAME : 3 =  5 4 3 2 1
        FRAME : 4 =  6 5 4 3 2 1

    */