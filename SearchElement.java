public class SearchElement {
    public static void main(String[] args) {
        

        int arr[]= {43,23,12,55,41,2,9,17};


        for(int i=0; i<arr.length;i++){
            if(arr[i]==55){
                System.out.println("Element found at array index:["+i+"]");
                break;
            }
            else{
                 System.out.println("Element not found at array index:["+i+"]");
                
            }
        }
    }
}
