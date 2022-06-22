public class Variables {
       int a = 9;//global or instance variable, can be access in any class
       static int b= 5;//static variable

    public static void main(String[] args) {
        System.out.println(5+b); // static variable can call in main method
       // System.out.println(5+a); //global variable can not be call in main method
        Variables variables=new Variables();
        System.out.println(variables.a);//create object for call global variable
        variables.add();

    }public void add() {
        int c = 6;//local variable
        int d = 7;
        System.out.println(c + d);
        System.out.println(a);

    }

}
