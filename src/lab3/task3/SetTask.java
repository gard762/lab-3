package lab3.task3;

import java.util.*;

public class SetTask {
     public static void main(String[] args){
         List<Human> humans = new ArrayList<>();
         humans.add(new Human("Ivan", "Ivanov", 30));
         humans.add(new Human("Petr", "Petrov", 25));
         humans.add(new Human("Anna", "Ivanova", 30));
         humans.add(new Human("Ivan", "Ivanov", 30));
         humans.add(new Human("Oleg", "Sidorov", 40));

         System.out.println("1. Исходный список: " + humans);

         Set<Human> hashSet = new HashSet<>(humans);
         System.out.println("\n2. HashSet:");
         System.out.println(hashSet);

         Set<Human> linkedHashSet = new LinkedHashSet<>(humans);
         System.out.println("\n3. LinkedHashSet:");
         System.out.println(linkedHashSet);

         Set<Human> treeSet = new TreeSet<>(humans);
         System.out.println("\n4. TreeSet:");
         System.out.println(treeSet);

         Set<Human> treeSetByLastName = new TreeSet<>(new HumanComparatorByLastName());
         treeSetByLastName.addAll(humans);
         System.out.println("\n5. TreeSet с компаратором:");
         System.out.println(treeSetByLastName);

         Set<Human> treeSetByAgeAnon = new TreeSet<>(new Comparator<Human>() {
             @Override
             public int compare(Human h1, Human h2) {
                 return Integer.compare(h1.getAge(), h2.getAge());
             }
         });
         treeSetByAgeAnon.addAll(humans);
         System.out.println("\n6. TreeSet с анонимным компаратором:");
         System.out.println(treeSetByAgeAnon);
     }
}