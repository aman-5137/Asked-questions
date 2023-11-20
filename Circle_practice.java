class Circles {
    float radius;
    public Circles(){  //default radius setting in no-arg constructor
        radius=1;
    }


    public Circles(float radius){
        this.radius=radius;
    }
    void getArea(){
        System.out.println("Radius: "+ radius);
        float Circle_Area= (float) (3.14*this.radius*this.radius);
        System.out.println("Area of circle: "+ Circle_Area);
    }
}


public class Circle_practice {
    public static void main(String[] args) {
        Circles r1 = new Circles();
        Circles r2 = new Circles(3.2F);
        Circles r3 = new Circles(4.1F);

        r1.getArea();
        r2.getArea();
        r3.getArea();

    }
}
