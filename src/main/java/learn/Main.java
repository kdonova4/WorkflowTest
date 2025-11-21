package learn;

public class Main {
    public static void main(String[] args) {

//        Thread evenThread = new Thread(new PrintTask(2), "Even Thread");
//        Thread oddThread = new Thread(new PrintTask(1), "Odd Thread");
//
//        evenThread.start();
//        oddThread.start();
//
        InterviewProblems func = new InterviewProblems();
        func.fibonacci(9);

//        func.oddEvenThread();

//        Queue queue = new Queue();
//
//        queue.enqueue(5);
//        queue.enqueue(6);
//        queue.enqueue(7);
//
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//
//        queue.enqueue(8);
//        System.out.println(queue.dequeue());
//        queue.enqueue(9);
//        queue.enqueue(10);
//        System.out.println("size: " + queue.getSize());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());

//        int[] array = {1,1,2};
//        int i = func.removeDuplicates(array);
//
//        System.out.println(i);

        int num = func.longestSubString("abcdabcbb");
        System.out.println("Longest substring is: " + num);

    }


    // Recursively Reverse a String
    public static String reverseString(String s) {
        /*


            "Hello"
            reverse("hello")((((o + "") + l) + l) + e) + h
            1. s isnt blank
            2. char = h | reversed = ello
            3. call reverse("ello")(((o + "") + l) + l) + e
                1. s isnt blank
                2. char = e | reversed = llo
                3. call reverse("llo)((o + "") + l) + l
                    1. s isnt blank
                    2. char = l | reversed = lo
                    3. call reverse("lo") (o + "") + l
                        1. s isnt blank
                        2. char = l | reversed = o
                        3. call reverse("o") <-- o + ""
                            1. s isnt blank
                            2. char = o | reversed = ""
                            3. call reverse("") <-- return blank
                                1. s is blank
                                2. return blank
         */

        if(s.isEmpty()){
            return s;
        }
        else{
            return reverseString(s.substring(1)) + s.charAt(0);
        }
    }
}