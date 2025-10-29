public class attendanceApp {
      public void main(){

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
      }
}
