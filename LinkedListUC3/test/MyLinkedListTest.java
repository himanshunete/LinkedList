package javapractiseuc3;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
	@Test
    public void given3NumberWhenAddedToLinkedListShouldBeAddedToTop() {
           MyNode<Integer> myFirstNode = new MyNode<>(70);
		   MyNode<Integer> mySecondNode = new MyNode<>(30);
		   MyNode<Integer> myThirdNode = new MyNode<>(56);
           MyLinkedList myLinkedList = new MyLinkedList();
		   myLinkedList.add(myFirstNode);
           myLinkedList.add(mySecondNode);
           myLinkedList.add(myThirdNode);
           myLinkedList.printMyNodes();
           boolean result = myLinkedList.head.equals(myThirdNode) &&
        		            myLinkedList.head.getNext().equals(mySecondNode) &&
        		            myLinkedList.tail.equals(myFirstNode);
           Assert.assertTrue(result);
	}
	
	@Test
    public void given3NumberWhenAppendedToLinkedListShouldBeAppendedToLast() {
           MyNode<Integer> myFirstNode = new MyNode<>(56);
		   MyNode<Integer> mySecondNode = new MyNode<>(30);
		   MyNode<Integer> myThirdNode = new MyNode<>(70);
           MyLinkedList myLinkedList = new MyLinkedList();
		   myLinkedList.append(myFirstNode);
           myLinkedList.append(mySecondNode);
           myLinkedList.append(myThirdNode);
           myLinkedList.printMyNodes();
           boolean result = myLinkedList.head.equals(myFirstNode) &&
        		            myLinkedList.head.getNext().equals(mySecondNode) &&
        		            myLinkedList.tail.equals(myThirdNode);
           Assert.assertTrue(result);
	}
	
	
}