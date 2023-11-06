import java.util.StringTokenizer;

public class stringTokenizer{
    public static void main(String[] args) {

//        StringTokenizer st = new StringTokenizer("Welcome to Galgotias.");
        StringTokenizer st = new StringTokenizer("Welcome:to:Galgotias",":");
        System.out.println(st.countTokens());
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}