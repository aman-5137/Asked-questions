public class ExceptionDemo {
    public static void main(String[] args) {

        int i=0, j=10;

        try{
           int div = j/i;
            System.out.println(div);
        }
        catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Inside finally");
        }
        System.out.println("Inside main function");
    }
}
