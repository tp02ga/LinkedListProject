package customLinkedList;

import org.junit.Test;
import static org.junit.Assert.*;

import static org.hamcrest.core.Is.*;

public class LinkedListTests
{
  @Test
  public void should_add_new_element_to_linkedlist()
  {
    // arrange
    LinkedList<String> sut = new LinkedList<String>();

    // act
    sut.add("My First String");

    // assert
    assertThat(sut.get("My First String"), is("My First String"));
  }

  @Test
  public void should_add_multiple_elements_to_linkedlist()
  {
    // arrange
    LinkedList<String> sut = new LinkedList<String>();

    // act
    sut.add("My First String");
    sut.add("My Second String");
    sut.add("My Third String");
    sut.add("My Fourth String");

    // assert
    assertThat(sut.get("My First String"), is("My First String"));
    assertThat(sut.get("My Second String"), is("My Second String"));
    assertThat(sut.get("My Third String"), is("My Third String"));
    assertThat(sut.get("My Fourth String"), is("My Fourth String"));
  }

  @Test
  public void should_remove_first_element_from_linkedlist()
  {
    // arrange
    LinkedList<String> sut = new LinkedList<String>();

    // act
    sut.add("My First String");
    sut.add("My Second String");
    sut.add("My Third String");
    sut.add("My Fourth String");

    sut.remove("My First String");

    // assert
    assertNull(sut.get("My First String"));
    assertThat(sut.get("My Second String"), is("My Second String"));
    assertThat(sut.get("My Third String"), is("My Third String"));
    assertThat(sut.get("My Fourth String"), is("My Fourth String"));
  }

  @Test
  public void should_remove_middle_element_from_linkedlist()
  {
    // arrange
    LinkedList<String> sut = new LinkedList<String>();

    // act
    sut.add("My First String");
    sut.add("My Second String");
    sut.add("My Third String");
    sut.add("My Fourth String");

    sut.remove("My Third String");

    // assert
    assertThat(sut.get("My First String"), is("My First String"));
    assertThat(sut.get("My Second String"), is("My Second String"));
    assertNull(sut.get("My Third String"));
    assertThat(sut.get("My Fourth String"), is("My Fourth String"));
  }

  @Test
  public void should_remove_last_element_from_linkedlist()
  {
    // arrange
    LinkedList<String> sut = new LinkedList<String>();

    // act
    sut.add("My First String");
    sut.add("My Second String");
    sut.add("My Third String");
    sut.add("My Fourth String");

    sut.remove("My Fourth String");

    // assert
    assertThat(sut.get("My First String"), is("My First String"));
    assertThat(sut.get("My Second String"), is("My Second String"));
    assertThat(sut.get("My Third String"), is("My Third String"));
    assertNull(sut.get("My Fourth String"));
  }

  @Test
  public void should_remove_last_element_from_linkedlist_and_successfully_add_new_element()
  {
    // arrange
    LinkedList<String> sut = new LinkedList<String>();

    // act
    sut.add("My First String");
    sut.add("My Second String");
    sut.add("My Third String");
    sut.add("My Fourth String");

    sut.remove("My Fourth String");

    sut.add("My Fifth String");
    sut.add("My Sixth String");
    
    // assert
    assertThat(sut.get("My First String"), is("My First String"));
    assertThat(sut.get("My Second String"), is("My Second String"));
    assertThat(sut.get("My Third String"), is("My Third String"));
    assertNull(sut.get("My Fourth String"));
    assertThat(sut.get("My Fifth String"), is("My Fifth String"));
    assertThat(sut.get("My Sixth String"), is("My Sixth String"));
  }
}
