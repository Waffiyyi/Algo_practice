package org.example;

public class Dna {
    static String dna(String input){
        if(input.isEmpty()){
            return input;
        }
        String returner = "";
       for (int i = 0; i < input.length(); i++){
           if(input.charAt(i) == 'A'){
               returner += "T";
           }
           if(input.charAt(i) == 'T'){
               returner += "A";
           }
           if(input.charAt(i) == 'C'){
               returner += "G";
           }
           if(input.charAt(i) == 'G'){
               returner += "C";
           }
       }
        System.out.println(returner);
       return returner;
    }

    public static void main(String[] args) {
        dna("ATTTTCCGGGG");
    }
}
