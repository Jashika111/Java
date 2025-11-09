//java basic  (constructor overloading)
class Constructt {
    int roll;
    String name;

    Constructt(int roll){    //constructor with parameter
this.roll=roll;
System.out.println("The roll number is "+roll);
}

Constructt(){     //
    name="Jassu";
    System.out.println("The name is" +name);
}

public static void main(String[] args) {
    Constructt cc=new Constructt(14);
    Constructt c1=new Constructt();
}}