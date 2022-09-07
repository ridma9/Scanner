import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome...");

        Scanner userText = new Scanner(System.in);
        System.out.print("Please Enter a Text : ");
        String text = userText.nextLine();

        Scanner replaceWord = new Scanner(System.in);
        System.out.print("Please Enter a Word to Replace : ");
        String word = replaceWord.nextLine();

        String [] arr=text.split(" ");

        boolean found=false;
        int index;
        System.out.println(word+"     "+text);

        //System.out.println(arr[0].toString().equals(word));
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].toString().equals(word)){
                index=i;
                found=false;
                break;
            }
        }
        if (found){
            System.out.println("The word is is not found.");
        }

        Scanner newWord = new Scanner(System.in);
        System.out.print("Please Enter a Word to Replace with : ");
        String neww = replaceWord.nextLine();


        for (int i = 0; i < arr.length; i++) {

            if (arr[i].toString().equals(word)){
                arr[i]=neww;
            }
        }
        for (String val:arr) {
            System.out.print(val+" ");
        }




    




        
    }
}