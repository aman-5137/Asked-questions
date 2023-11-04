// Different ways of initializtion ways:(reference, method and constructor)

class Student {
//    variables
    int age;
    String name;
    String rollNo;
    String emailId;
    char gender;

    public Student(int age, String name, String rollNo, String emailId, char gender){ //Constructor
        this.name=name;
        this.age=age;
        this.rollNo=rollNo;
        this.emailId=emailId;
        this.gender=gender;

    }

//    Getter method
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    public String getRollNo(){
        return this.rollNo;
    }
    public String getEmailId(){
        return this.emailId;
    }
    public char getGender(){
        return this.gender;
    }

//    Setter method
    public void setEmailId(String newEmail){
        this.emailId=newEmail;
    }
    public void setAge(int newAge){
        this.age=newAge;
    }

    public static  void main(String [] args){
//            Reference variable
        Student s1 = new Student(21, "Aman","22SCSE1180007", "amankkumaryadav5137@gmail.com",'M');
        Student s2 = new Student(21, "Prince","22SCSE1180070", "prince2144@gmail.com",'M');

        s1.setEmailId("aky123@gmail.com");
        s2.setEmailId("pr2222@gmail.com");
        System.out.println("Age is : "+s1.age+"\nName is : "+s1.name+"\nRoll number: "+s1.rollNo+"\nEmail is: "+s1.emailId+"\nGender is: "+s1.gender+"\n\n");
        System.out.println("Age is : "+s2.age+"\nName is : "+s2.name+"\nRoll number: "+s2.rollNo+"\nEmail is: "+s2.emailId+"\nGender is: "+s2.gender);

        s1.setAge(20);  //set method call
        s2.setAge(19);  //set method call
        System.out.println();
        System.out.println("Age is : "+s1.age+"\nName is : "+s1.name+"\nRoll number: "+s1.rollNo+"\nEmail is: "+s1.emailId+"\nGender is: "+s1.gender+"\n\n");
        System.out.println("Age is : "+s2.age+"\nName is : "+s2.name+"\nRoll number: "+s2.rollNo+"\nEmail is: "+s2.emailId+"\nGender is: "+s2.gender);

    }
}
