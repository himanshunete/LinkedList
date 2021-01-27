package javapractiseuc8;


import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
	@Test
    public void given3Number_WhenAddedToLinkedList_ShouldBeAddedToTop() {
           MyNode<Integer> myFirstNode = new MyNode<>(70);
		   MyNode<Integer> mySecondNode = new MyNode<>(30);
		   MyNode<Integer> myThirdNode = new MyNode<>(56);
           MyLinkedList myLinkedList = new MyLinkedList();
		   myLinkedList.add(myFirstNode);
           myLinkedList.add(mySecondNode);
           myLinkedList.add(myThirdNode);
     
           boolean result = myLinkedList.head.equals(myThirdNode) &&
        		            myLinkedList.head.getNext().equals(mySecondNode) &&
        		            myLinkedList.tail.equals(myFirstNode);
           Assert.assertTrue(result);
	}
	
	@Test
    public void given3Number_WhenAppendedToLinkedListShouldBeAppendedToLast() {
           MyNode<Integer> myFirstNode = new MyNode<>(56);
		   MyNode<Integer> mySecondNode = new MyNode<>(30);
		   MyNode<Integer> myThirdNode = new MyNode<>(70);
           MyLinkedList myLinkedList = new MyLinkedList();
		   myLinkedList.append(myFirstNode);
           myLinkedList.append(mySecondNode);
           myLinkedList.append(myThirdNode);
         
           boolean result = myLinkedList.head.equals(myFirstNode) &&
        		            myLinkedList.head.getNext().equals(mySecondNode) &&
        		            myLinkedList.tail.equals(myThirdNode);
           Assert.assertTrue(result);
	}
	
	@Test
    public void given3Number_WhenInserted_ShouldPassTheLinkedListTest() {
           MyNode<Integer> myFirstNode = new MyNode<>(56);
		   MyNode<Integer> mySecondNode = new MyNode<>(30);
		   MyNode<Integer> myThirdNode = new MyNode<>(70);
           MyLinkedList myLinkedList = new MyLinkedList();
		   myLinkedList.add(myFirstNode);
           myLinkedList.append(myThirdNode);
           myLinkedList.printMyNodes();
           myLinkedList.insert(myFirstNode, mySecondNode);
           myLinkedList.printMyNodes();
           boolean result = myLinkedList.head.equals(myFirstNode) &&
        		            myLinkedList.head.getNext().equals(mySecondNode) &&
        		            myLinkedList.tail.equals(myThirdNode);
           Assert.assertTrue(result);
	}
	
	@Test
    public void given3Number_WhenDeleted_ShouldPassTheLinkedListTest() {
           MyNode<Integer> myFirstNode = new MyNode<>(56);
		   MyNode<Integer> mySecondNode = new MyNode<>(30);
		   MyNode<Integer> myThirdNode = new MyNode<>(70);
           MyLinkedList myLinkedList = new MyLinkedList();
		   myLinkedList.append(myFirstNode);
		   myLinkedList.append(mySecondNode);
           myLinkedList.append(myThirdNode);
           myLinkedList.pop();
           
           boolean result = myLinkedList.head.equals(mySecondNode) &&
		                    myLinkedList.tail.equals(myThirdNode);
           Assert.assertTrue(result);
	}
	
	@Test
    public void given3Number_WhenDeletedLastElement_ShouldPassTheLinkedListTest() {
           MyNode<Integer> myFirstNode = new MyNode<>(56);
		   MyNode<Integer> mySecondNode = new MyNode<>(30);
		   MyNode<Integer> myThirdNode = new MyNode<>(70);
           MyLinkedList myLinkedList = new MyLinkedList();
		   myLinkedList.add(myThirdNode);
		   myLinkedList.add(mySecondNode);
           myLinkedList.add(myFirstNode);
           myLinkedList.popLast();
          
           boolean result = myLinkedList.head.equals(myFirstNode) &&
		                    myLinkedList.tail.equals(mySecondNode);
           Assert.assertTrue(result);
	}
	

	@Test
    public void given3Number_WhenSearched_ShouldPassTheLinkedListTest() {
           MyNode<Integer> myFirstNode = new MyNode<>(56);
		   MyNode<Integer> mySecondNode = new MyNode<>(30);
		   MyNode<Integer> myThirdNode = new MyNode<>(70);
           MyLinkedList myLinkedList = new MyLinkedList();
		   myLinkedList.add(myThirdNode);
		   myLinkedList.add(mySecondNode);
           myLinkedList.add(myFirstNode);
           myLinkedList.search(mySecondNode);
       
           boolean result = myLinkedList.head.equals(myFirstNode) &&
		            myLinkedList.head.getNext().equals(mySecondNode) &&
		            myLinkedList.tail.equals(myThirdNode);
           Assert.assertTrue(result);
	}
	
	@Test
    public void given3Number_ToInsert40After30__ShouldPassTheLinkedListTest() {
           MyNode<Integer> myFirstNode = new MyNode<>(56);
		   MyNode<Integer> mySecondNode = new MyNode<>(30);
		   MyNode<Integer> myThirdNode = new MyNode<>(40);
		   MyNode<Integer> myFourthNode = new MyNode<>(70);
		   
           MyLinkedList myLinkedList = new MyLinkedList();
		   myLinkedList.add(mySecondNode);
		   myLinkedList.add(myFirstNode);
           myLinkedList.append(myFourthNode);           
           myLinkedList.search(mySecondNode);
           myLinkedList.printMyNodes();
           myLinkedList.insert(mySecondNode, myThirdNode);
           myLinkedList.printMyNodes();
           boolean result = myLinkedList.head.equals(myFirstNode) &&
		                    myLinkedList.head.getNext().equals(mySecondNode) &&
		                    myLinkedList.head.getNext().getNext().equals(myThirdNode) &&
		                    myLinkedList.tail.equals(myFourthNode);
           Assert.assertTrue(result);
	}
	
	
	
	
}
