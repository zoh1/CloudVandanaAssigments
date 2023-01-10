import java.util.Scanner;

public class assignment3 {
    String string;
    char letter;
    public void sentenceAfterLetter(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the sentence");
        string= scanner.nextLine();
        System.out.println("Enter the letter");
        letter = scanner.next().charAt(0);
        int index =string.indexOf(letter);
        if(index==-1){
            System.out.println("The letter does not exist in the sentence");
        }
        else {
            System.out.println(string.substring(index+ 1));
        }
    }

    public static void main(String[] args) {
        assignment3 assignment3= new assignment3();
        assignment3.sentenceAfterLetter();
    }
}
