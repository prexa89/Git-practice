package constructorClass;

public class Cons1 {
    int a;
        public Cons1(int b){
        int a = b;
            System.out.println(b);
        }

    public static void main(String[] args) {
            Cons1 cons1=new Cons1(8);
    }

}
