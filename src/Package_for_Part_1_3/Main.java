package Package_for_Part_1_3;
import soundmakers.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<SoundMaker> list = new ArrayList<>();
        list.add(new Cat());
        list.add(new Dog());
        list.add(new Cow());
        list.add(new Pig());
        list.add(new Bee());
        list.add(new Cricket());
        list.add(new Frog());
        for (SoundMaker soundMaker : list)
        {
            soundMaker.makeSound();
        }
    }
}
