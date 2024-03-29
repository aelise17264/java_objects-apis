package polymorphism;

public class Zoo {
    public static void main(String[] args){
        Dog dinah = new Dog();
        dinah.fetch();
        dinah.makeSound();

        Animal sasha = new Dog();
        sasha.makeSound();

        sasha = new Cat();
        //we can morph sasha in to any type of animal
        sasha.makeSound();

        ((Cat)sasha).scratch();
        //does not change the overall type but allows us to call a method that
        // our object would otherwise not have access to
    }
    
}
