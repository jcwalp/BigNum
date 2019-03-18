import java.util.Scanner;
public class main {

    public static final Scanner kb = new Scanner(System.in);
    public static void main(String[] args){

        String n1 = "281028310";
        String n2 = "257208403";

        int[] num1 = new int[n1.length()];
        int[] num2 = new int[n2.length()];

        for (int i = 0; i < n1.length(); i++){
            num1[i] = Integer.parseInt(n1.substring(i, i+1));
        }

        for (int i = 0; i < n2.length(); i++){
            num2[i] = Integer.parseInt(n2.substring(i, i+1));
        }

        for (int i = 0; i < n1.length(); i++){
            System.out.print(num1[i]);
        }
    }

    public static String add(){
        String answer = "";

        


        return answer;
    }
}
