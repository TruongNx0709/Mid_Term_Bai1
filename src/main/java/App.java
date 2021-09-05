import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        System.out.println("Mid term examination");
        System.out.println("Câu 1");
        String chuoi = "You Only Live Once. But if You do it right. once is Enough";
        int numberUpperCase = 0;
        String space = " ";
        //In ra số ký tự
        for (int i = 0; i < chuoi.length(); i++) {
            if (Character.isUpperCase(chuoi.charAt(i))) {
                numberUpperCase++;
            }
        }
        System.out.println("Số ký tự viết hoa là: " + numberUpperCase);
        System.out.println("----------------------------------");
        System.out.println("Viết in hoa: ");
        String newchuoi = "";
        for (int y = 0; y < chuoi.length(); y++) {
            if (y == 0) {
                newchuoi += chuoi.toUpperCase().charAt(y);
                y++;
            }
            newchuoi += chuoi.charAt(y);
            if (Character.isSpaceChar(chuoi.charAt(y))) {
                newchuoi += Character.toUpperCase(chuoi.charAt(y + 1));
                y++;
            }
        }
        System.out.println(newchuoi);
        System.out.println("----------------------------------");
        System.out.println("Chỉ có ký tự sau dấu chấm là viết hoa: ");
        String lowercase = chuoi.toLowerCase();
        String[] cutString = lowercase.split("\\. ");
        String doan1 = cutString[0];
        String doan2 = cutString[1];
        String doan3 = cutString[2];
        String viethoasaudauchamDoan1 = "";
        String viethoasaudauchamDoan2 = "";
        String viethoasaudauchamDoan3 = "";
        for (int f = 0; f < doan1.length(); f++) {
            if (f == 0) {
                viethoasaudauchamDoan1 += doan1.toUpperCase().charAt(f);
                f++;
            }
            viethoasaudauchamDoan1 += doan1.charAt(f);
            //System.out.println(viethoasaudauchamDoan1);
        }
        for (int g = 0; g < doan2.length(); g++) {
            if (g == 0) {
                viethoasaudauchamDoan2 += doan2.toUpperCase().charAt(g);
                g++;
            }
            viethoasaudauchamDoan2 += doan2.charAt(g);
            //System.out.println(viethoasaudauchamDoan2);
        }
        for (int h = 0; h < doan3.length(); h++) {
            if (h == 0) {
                viethoasaudauchamDoan3 += doan3.toUpperCase().charAt(h);
                h++;
            }
            viethoasaudauchamDoan3 += doan3.charAt(h);
            //System.out.println(viethoasaudauchamDoan3);
        }
        System.out.println(viethoasaudauchamDoan1 + ". " + viethoasaudauchamDoan2 + ". " + viethoasaudauchamDoan3);
    }
}

