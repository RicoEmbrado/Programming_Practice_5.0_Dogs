import java.text.DecimalFormat;

public class Dog
{
    //variables
    private String name;
    private int age;
    private String breed;
    private int weight;
    private static int numDogs;

    //constructors
    public Dog(String name, int age, String breed, int weight)
    {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;

        numDogs++;
    }

    //getters
    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getBreed()
    {
        return breed;
    }

    public int getWeight()
    {
        return weight;
    }

    //setters
    public void setName(String myName)
    {
        name = myName;
    }

    public void setAge(int myAge)
    {
        age = myAge;
    }

    public void setBreed(String myBreed)
    {
        breed = myBreed;
    }

    public void setWeight(int myWeight)
    {
        weight = myWeight;
    }

    //Counting

    public static int getNumDogs()
    {
        return numDogs;
    }

    //Brain Methods
    public double toKilograms()
    {
        DecimalFormat fmt = new DecimalFormat("0.##");

        double kilograms = weight * 0.45359237;

        return Double.parseDouble((fmt.format(kilograms)));
    }

    //to string
    public String toString()
    {
        String output = name + " " +
                        "\nAge: " + age +
                        "\nBreed: " + breed +
                        "\nWeight: " + weight;
        return output;
    }
}
