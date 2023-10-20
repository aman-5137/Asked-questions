class array_sum{

    public static void main(String args[]){
        System.out.println("\033c");
        int array[]={1,2,3,4,5,6,6,7,8,9,8,10};

        int sum=0;

        for(int i=0;i<array.length;i++){
            sum=sum+array[i];


        }
        System.out.println("The sum of the given array is : "+sum);

    }
}