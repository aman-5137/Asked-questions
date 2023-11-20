class Student{
    String name;
    String roll_no;
    int marks;
    public Student(String name, String roll_no, int marks){
//        Constructor
        this.name=name;
        this.roll_no=roll_no;
        this.marks=marks;
    }
    void show(){
        System.out.println("Name of student: "+this.name+"\nRoll number of student: "+this.roll_no+"\nMarks of student: "+this.marks);

    }
}
public class NewStudentInfo {
    public static void main(String[] args) {
        //        Reference method
        Student s1 = new Student("Aman","22SCSE1180007",80);
        s1.show();
    }
}
