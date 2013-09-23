
public class CloneTester
{

    /** @param args  */
    public static void main(String[] args)
    {
        AnimalCloneFactory factory = new AnimalCloneFactory();

        Dog dog = new Dog();
        Dog dogClone = (Dog) factory.getClone(dog);

        Sheep sheep = new Sheep();
        Sheep sheepClone = (Sheep) factory.getClone(sheep);

        System.out.println(dog);
        System.out.println(dogClone);
        System.out.println("dog HashCodes: " + String.valueOf(dog.hashCode()) +
                " " + String.valueOf(dogClone.hashCode()));

        System.out.println(sheep);
        System.out.println(sheepClone);
        System.out.println("sheep HashCodes: " + String.valueOf(sheep.hashCode()) +
                " " + String.valueOf(sheepClone.hashCode()));
    }

}
