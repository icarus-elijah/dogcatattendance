import java.util.List;
import java.util.ArrayList;

public class attendanceApp {
      public static void main(String[] args){

            Dog dogs[] = {new Dog("Benny", 3), new Dog("Floof", 1)}
            Cat cats[] = {new Cat("Seth", false), new Cat("Garfield", true)}

            Animal dogsAndCats[] = new dogsAndCats[dogs.length() + cats.length()];

            int i = 0;
            int j = 0;
            for( i < dogsAndCats.length()){
                  if( i < dogs.lenght()){
                        dogsAndCats[i] = dogs[i];
                        i++;
              }
            else{
                dogsAndCats[i] = dogs[j];
                i++;
                j++;
              }
          }

            System.out.println(dogs[]);
            System.out.println(cats[]);
            System.out.println(dogsAndCats[]);

            List<Dog> dogList = new ArrayList<>();

            dogList.add(new Dog("Benny", 3))
            dogList.add(new Dog("Floof", 1))

            List<cat> catList = new ArrayList<>();

            catList.add(new Cat("Seth", false))
            catList.add(new Cat("Garfield", true)))

            List<Animal> dogsAndCatsList = new ArrayList<>();

            dogsAndCats.add(dogList);
            dogsAndCats.add(catList);

            System.out.println(dogsList);
            System.out.println(catList);
            System.out.println(dogsAndCatsList);
      }
}
