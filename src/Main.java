import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str1 = scanner.nextLine();
        String[] strings = str1.split(" ");
        int index = 0;
        int length = 0;
        for (int i = 0; i < strings.length; i++) {
            if(strings[i].length() > length){
                index = i;
                length = strings[i].length();
            }
        }
        System.out.println(strings[index]);
    }
}
