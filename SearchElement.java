public class SearchElement {
    public static void main(String args[]){

        String a=null;
        int n=9;
        int arr[]= {1,2,3,8,9,22,17};
        for(int i=0; i<arr.length;i++){

            if(arr[i]==n){
                a=" exist";
                break;
            }
            else {
                a=" does not exist.";
        }}
        System.out.println("Element "+n+a);
    }
}
