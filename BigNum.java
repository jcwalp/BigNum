import java.util.ArrayList;
import java.util.Scanner;
public class BigNum {
    private Scanner kb = new Scanner(System.in);
    private ArrayList<Integer> arr1 = new ArrayList<>();
    private ArrayList<Integer> arr2 = new ArrayList<>();
    private String num1 = "";
    private String num2 = "";
    public void init(){
        System.out.println("First Num: ");
        num1 = kb.nextLine();
        System.out.println("Second Num: ");
        num2 = kb.nextLine();
        for (int i = 0; i < num1.length(); i++){
            arr1.add(Integer.parseInt(num1.substring(i, i+1)));
        }
        for (int i = 0; i < num2.length(); i++){
            arr2.add(Integer.parseInt(num2.substring(i, i+1)));
        }
        if (arr1.size() < arr2.size()){
            while (arr1.size() != arr2.size()){
                arr1.add(0, 0);
            }
        }
        if (arr2.size() < arr1.size()){
            while (arr2.size() != arr1.size()){
                arr2.add(0, 0);
            }
        }
        System.out.println(arr1);
        System.out.println(arr2);
       System.out.println("Add or Subtract: (A / S): ");
       String temp = kb.nextLine();
       if (temp.equals("A")){
           System.out.println(add());
       }
       else if (temp.equals("S")){
           System.out.println(subtract());
       }
       else if (temp.equals("M")){
         System.out.println(multiply());
       }
       else {
         System.exit(0);
       }
    }
    public ArrayList<Integer> add(){
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = arr1.size() - 1; i >= 0; i--){
            int n1 = arr1.get(i);
            int n2 = arr2.get(i);
            int sum = n1 + n2;
            if (sum > 10 && i > 0){
                answer.add(0, sum % 10);
                arr1.set(i - 1, arr1.get(i-1) + sum/10);
            }
            else if (sum > 10 && i == 0){
                answer.add(0, sum % 10);
                answer.add(0, sum / 10);
            }
            else {
                answer.add(0, sum);
            }
        }
        return answer;
    }
    public ArrayList<Integer> subtract(){
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = arr1.size() - 1; i >= 0; i--){
            int n1 = arr1.get(i);
            int n2 = arr2.get(i);
            if (n1 < n2){
                arr1.set(i-1, arr1.get(i - 1) - 1);
                arr1.set(i, arr1.get(i) + 10);
                n1 = arr1.get(i);
            }
            answer.add(0, n1 - n2);
        }
       return answer;
    }


    public ArrayList<Integer> multiply(){
      ArrayList<Integer> answer = new ArrayList<>();
      int result = 0;
      for (int i = 0; i < arr1.size(); i++){
        for (int j = 0; j < arr2.size(); i++){
          result += (arr1.get(i)) * (arr2.get(j)) * (int) Math.pow(10, arr1.size() + arr2.size() - (i + j + 2));
        }
      }
      answer.add(result);
      return answer;
    }
}
