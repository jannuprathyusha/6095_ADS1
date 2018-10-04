import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        while (sc.hasNext()) {
            String[] input = sc.nextLine().split(" ");
            switch(input[0]) {
                case "insertAt" :
                try {
                    ll.insertAt(Integer.parseInt(input[1]), input[2]);
                    ll.display();   
                }
                catch(Exception e) {
                    System.out.println("Can't insert at this position.");
                }
                break;
                case "reverse":
                try {
                ll.reverse();
                ll.display();
                }
                catch(Exception e) {
                    System.out.println("No elements to reverse.");
                }
                break;
            }
        }
    }
}
