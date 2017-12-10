/**
 * Created by Naveen Pantra on 01-08-2017.
 */
import java.util.*;
public class Flag_Byte_Stuffing {
    static String data1="",data2="",data3="";
    static int i=0,count=0;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("\nENTER THE DATA WANT TO SEND BY FLAG_BYTE_STUFFING : ");
        data1 = s.nextLine();
        System.out.printf("\n\nTHE DATA ON THE SENDER SIDE : %s",data1);
        encode_byte_stuffing();
        decode_byte_stuffing();
    }

    public static void encode_byte_stuffing() {
        while (i < data1.length()) {
            if (data1.charAt(i) == '$' ) {
                data2 = data2 + "$$";
                i++;
            }
            else {
                data2 = data2 + String.valueOf(data1.charAt(i));
                i++;
            }
        }
        System.out.printf("\n\nTHE ENCODED DATA IS : %s ",data2);
    }

    public static void decode_byte_stuffing() {
        i=0;
        while (i < data2.length()) {
            if (data2.charAt(i) == '*') {
                count++;
                if (count == 2) {
                    count = 0;
                    i++;
                    continue;
                }
                else {
                    data3 = data3 + String.valueOf(data2.charAt(i));
                    i++;
                }
            }
            else {
                data3 = data3 + String.valueOf(data2.charAt(i));
                i++;
            }
        }
        System.out.printf("\n\nTHE DECODED DATA AT THE RECEIVER : %s",data3);
    }
}

//output

    /*
        ENTER THE DATA WANT TO SEND BY FLAG_BYTE_STUFFING : a$b$$c


        THE DATA ON THE SENDER SIDE : a$b$$c

        THE ENCODED DATA IS : a$$b$$$$c

        THE DECODED DATA AT THE RECEIVER : a$$b$$c

    */
