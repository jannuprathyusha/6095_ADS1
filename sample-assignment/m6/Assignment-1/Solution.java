import java.util.Scanner;
class AddLargeNumbers {
    
    public static LinkedList numberToDigits(String number) {
    	for (int i=0; i<number.length(); i++) {
    		String[] num = new String[number.length()];
    		LinkedList num[i] = Integer.parseInt(num.charAt[i]);
    	}
    	System.out.println(num);
    }
//     class LinkedList {
//     	 private head;
//     	 private next;
//     	 private new_data;
//     	}
//     public static String digitsToNumber(LinkedList list) {
//     	public void push(int new_data) 
// {  
//     Node new_node = new Node(new_data); 
//     new_node.next = head; 
//     head = new_node;
//     if (prev_node == null) 
//     { 
//         System.out.println("The given previous node cannot be null"); 
//         return; 
//     } 
//     Node new_node = new Node(new_data); 
//     new_node.next = prev_node.next; 
//     prev_node.next = new_node;   
// } 

//     }

    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {

    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch(input){
            case "numberToDigits":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            case "addLargeNumbers":
                pDigits = AddLargeNumbers.numberToDigits(p);
                qDigits = AddLargeNumbers.numberToDigits(q);
                LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }
    
}
