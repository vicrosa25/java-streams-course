package lectures;

import beans.Person;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import mockdata.MockData;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Lecture1 {

  @Test
  public void imperativeApproach() throws IOException {
    List<Person> people = MockData.getPeople();

    // 1. Find people aged less or equal 18
    List<Person> youngPeople = new ArrayList<>();
    List<Person> young10 = Lists.newArrayList();

    for(Person person : people) {
      if (person.getAge() <= 18)
        youngPeople.add(person);
    }

    for(Person person : youngPeople) {
      System.out.println(person.getAge());
    }


    // 2. Then change implementation to find first 10 people
    System.out.println();
    System.out.println("Only the first 10th people");

    for (int i = 0; young10.size() <= 9; i++) {
      if(people.get(i).getAge() <= 18) {
        young10.add(people.get(i));
      }
    }

    for (Person person : young10) {
      System.out.println(person.getAge());
    }


  }

  @Test
  public void declarativeApproachUsingStreams() throws Exception {
    ImmutableList<Person> people = MockData.getPeople();

  }
}
