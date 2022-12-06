package it.develhope.ifStatement;

public class Start {
    public static void main(String[] args) {

        String myName = "Lorenzo";

        if(myName.length() %2 == 0){
            System.out.println("Your name is even");
        }else if(myName.length() %2 != 0){
            System.out.println("Your name is odd");
        }
    }
}
