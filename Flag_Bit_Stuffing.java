/**
 * Created by Naveen Pantra on 01-08-2017.
 */
import java.util.*;

public class Flag_Bit_Stuffing {
    static String data1 = "",data2 = "",data3 = "";
    static int i = 0, count = 0;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("\nENTER THE DATA WANT TO SEND BY FLAG_BIT_STUFFING : ");
        data1 = s.nextLine();
        System.out.printf("\n\nTHE DATA ON THE SENDER SIDE : %s",data1);
        encode_bit_stuffing();
        decode_bit_stuffing();
    }

    public static void encode_bit_stuffing() {
        while (i < data1.length()) {
            if (data1.charAt(i) == '1') {
                count++;
                if(count == 5) {
                    count = 0;
                    data2 = data2 + String.valueOf(data1.charAt(i)) + "0";
                    i++;
                }
                else {
                    data2 = data2 + String.valueOf(data1.charAt(i));
                    i++;
                }
            }
            else {
                count = 0;
                data2 = data2 + String.valueOf(data1.charAt(i));
                i++;
            }
        }
        System.out.printf("\n\nTHE ENCODED DATA AT THE SENDER IS : %s", data2);
    }

    public static void decode_bit_stuffing() {
        i=count=0;
        while (i < data2.length()) {
            if (data2.charAt(i) == '1') {
                count++;
                if (count == 5) {
                    count = 0;
                    data3 = data3 + String.valueOf(data2.charAt(i));
                    i=i+2;
                }
                else {
                    data3 = data3 + String.valueOf(data2.charAt(i));
                    i++;
                }
            }
            else {
                count = 0;
                data3 = data3 + String.valueOf(data2.charAt(i));
                i++;
            }
        }
        System.out.printf("\n\nTHE DECODED DATA ON THE RECEIVER SIDE : %s",data3);
    }
}

//output

    /*
        ENTER THE DATA WANT TO SEND BY FLAG_BIT_STUFFING : 011111011111


        THE DATA ON THE SENDER SIDE : 011111011111

        THE ENCODED DATA AT THE SENDER IS : 01111100111110

        THE DECODED DATA ON THE RECEIVER SIDE : 011111011111
    */
