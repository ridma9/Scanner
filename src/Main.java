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

        boolean found=true;
        int index;
        //System.out.println(word+"     "+text);

        //System.out.println(arr[0].toString().equals(word));
        while (found){
            for (int i = 0; i < arr.length; i++) {

                if (arr[i].toString().equals(word)){
                    index=i;
                    found=false;
                }
            }
            System.out.println(found);

            if (found){
                System.out.println("The word is is not found.");
                replaceWord = new Scanner(System.in);
                System.out.print("Please Enter a Word to Replace : ");
                word = replaceWord.nextLine();
            }



        }


        Scanner newWord = new Scanner(System.in);
        System.out.print("Please Enter a Word to Replace with : ");
        String neww = replaceWord.nextLine();


        for (int i = 0; i < arr.length; i++) {

            if (arr[i].toString().equals(word)){
                arr[i]=neww;
            }
        }
        String editedText="";
        for (String val:arr) {
            editedText=editedText.concat(val);
        }
        System.out.println(editedText);





    




        
    }
}