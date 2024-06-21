//using builder

public class RevStr{
    public static String revstr(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
    public static void main(String args[]){
        System.out.print(revstr("my name is"));        
    }
}