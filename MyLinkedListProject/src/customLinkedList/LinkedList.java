package customLinkedList;

public class LinkedList <T>
{
  private Node<T> head;
  private Node<T> tail;

  public void add(T element)
  {
    Node<T> newNode = new Node<T>(element, null);
    
    // if the linkedlist is empty
    if (head == null)
    {
      head = newNode;
      tail = newNode;
    }
    else
    {
      tail.setNext(newNode);
      tail = newNode;
    }
  }

  public T get(T element)
  {
    if (head.getElement().equals(element))
    {
      return head.getElement();
    }
    else
    {
      Node<T> current = head.getNext();
      while (current.getNext() != null)
      {
        if (current.getElement().equals(element))
        {
          return current.getElement();
        }
        
        current = current.getNext();
      }
      
      if (current.getElement().equals(element))
      {
        return current.getElement();
      }
    }
    return null;
  }

  public void remove(T element)
  {
    if (head.getElement().equals(element))
    {
      head = head.getNext();
    }
    else
    {
      Node<T> current = head;
      Node<T> next = head.getNext();
      
      while (next != null)
      {
        if (next.getElement().equals(element))
        {
          current.setNext(next.getNext());
          // we're removing the tail
          if (next.getNext() == null)
          {
            tail = current;
          }
          return;
        }
        
        current = next;
        next = next.getNext();
      }
    }
    
  }
}
