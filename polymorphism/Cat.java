package polymorphism;

public class Cat extends Animal{
@Override
public void makeSound(){
    System.out.println("meow");
}

public void scratch(){
    System.out.println("About to tear up your couch");
}
}
