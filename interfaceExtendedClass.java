

interface A{
    int n=20;
    public void ak();
}
interface B{
    int m=30;
    public void sk();
}
interface C{
    int o=22;
    public void dk();
}

class CheckInterface implements A,B,C{

    @Override
    public void ak() {
        System.out.println("Interface A: "+n);
    }

    @Override
    public void sk() {
System.out.println("Interface B: "+m);
    }

    @Override
    public void dk() {
System.out.println("Interface C: "+o);
    }
}
class abc extends CheckInterface{

     void zxcv(){
        System.out.println("Extended class");
    }
}


public class interfaceExtendedClass {
    public static void main(String[] args) {

        abc obj = new abc();

        obj.ak();
        obj.sk();
        obj.dk();

        obj.zxcv();

    }
}
