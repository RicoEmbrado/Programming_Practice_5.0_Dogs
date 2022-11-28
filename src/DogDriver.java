public class DogDriver
{
    public static void main(String[] args)
    {
        //Instantiation
        Dog dog1 = new Dog("Fang", 5, "Husky", 80);
        Dog dog2 = new Dog("Piper", 3, "Australian Shepherd", 45);
        Dog dog3 = new Dog("Lily", 4, "Teacup Pomeranian", 7);

        //Regular Output
        System.out.println("\nFang's breed: " + dog1.getBreed() + ", Fang's age: " + dog1.getAge());
        System.out.println("Piper's weight: " + dog2.getWeight());
        System.out.println("\n" + dog3.toString());

        //Outputting toKilograms
        System.out.println("\nFang's weight in kilograms: " + dog1.toKilograms());
        System.out.println("Piper's weight in kilograms: " + dog2.toKilograms());
        System.out.println("Lily's weight in kilograms: " + dog3.toKilograms());

        //Outputting the number of dogs
        System.out.println("\nThere are " + Dog.getNumDogs() + " dogs.");
    }
}