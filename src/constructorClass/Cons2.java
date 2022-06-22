package constructorClass;

public class Cons2 {
    int a;
    char p;
    boolean s;
    float c;
    public Cons2(){
        a=5;
        p='s';
        System.out.println(a);
        System.out.println(p);
        System.out.println(c);
    }

    public static void main(String[] args) {
        Cons2 cons2=new Cons2();
    }


}
