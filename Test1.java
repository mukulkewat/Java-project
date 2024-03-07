
import java.util.*;
public class Test1 {
    //Test1, main, x, args,and String is identifier.
    public static void main(String[] args) {
//        String name = "Mukul";
//        double Mscper = 73.3;
//        //String formatting by String.format()
//        String student = String.format("Student name: %s\nMsc per : %f ", name,Mscper);
//        System.out.println(student);
        String sentence = ("My name is mukul kewat");
        String []words = sentence.split(" ");
        for(int i=0;i<words.length;i++){
            System.out.println(words[i]);

        }
    }
}

