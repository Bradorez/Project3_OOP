package Part1;
import java.util.ArrayList;
import Part1.End;

public class Main
{
    public static void main(String[] args)

    {   //Part1.1
        Start object = new End(9);
        object.theMethod();// its executed method "theMethod" of class End subclass of class start, becouse method was overriden
        //Part1.2
        ArrayList<Animal> list = new ArrayList<>();
        list.add(new Cat());
        list.add(new Dog());
        list.add(new Cow());
        list.add(new Pig());
        for (Animal animal : list)
        {
            animal.makeSound();
        }

    }

}