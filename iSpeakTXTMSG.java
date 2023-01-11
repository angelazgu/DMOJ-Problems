import java.util.*;

public class iSpeakTXTMSG {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    
    String text = sc.nextLine();
    
    if (text.equals("CU")) {
        System.out.println("see you");
    }
    
    else if (text.equals(":-)")){
        System.out.println("I'm happy");
    }
    
    else if (text.equals(":-(")){
        System.out.println("I'm unhappy");
    }
    
    else if (text.equals(";-)")){
        System.out.println("wink");
    }
    
    else if (text.equals(":-P")){
        System.out.println("stick out my tongue");
    }
    
    else if (text.equals("(~.~)")){
        System.out.println("sleepy");
    }
    
    else if (text.equals("TA")){
        System.out.println("totally awesome");
    }
    
    else if (text.equals("CCC")){
        System.out.println("Canadian Computing Contest");
    }
    
    else if (text.equals("CUZ")){
        System.out.println("because");
    }
    
    else if (text.equals("TY")){
        System.out.println("thank-you");
    }
    
    else if (text.equals("YW")){
        System.out.println("you're welcome");
    }
    
    else if (text.equals("TTYL")){
        System.out.println("talk to you later");
    }
    
    else {
        System.out.println(text);
    }
    }
}