package learn;

import java.util.*;

public class InterviewProblems {







    /*
        1. Find the First Non-Repeating Character in a String

        Write a method that takes a string as input and returns the first non-repeating character. If all characters are repeating, return
        a special value such as null.

        Ex:
            firstNonRepeatingCharacter("swiss");
            // Output: "w"
    */
    public Character firstNonRepeatingCharacter(String value) {

        if(value == null || value.isEmpty()) {
            return null;
        }

        HashMap<Character, Integer> map = new HashMap<>();


        for(Character c : value.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }


        for(Character c : value.toCharArray()) {
            if(map.get(c) == 1) {
                return c;
            }
        }


        return null;
    }

    /*
        2. Merge Two Sorted Arrays

        Write a method that takes two sorted arrays of integers and merges them into one sorted array.

        Ex:
            mergeArrays(new int[]{1, 3, 5}, new int[]{2, 4, 6});
            // Output: [1, 2, 3, 4, 5, 6]
    */
    public int[] mergeArrays(int[] array1, int[] array2) {
        int resultSize = array1.length + array2.length;
        int[] resultArray = new int[resultSize];
        int left = 0;
        int right = 0;
        int index = 0;

        while(left < array1.length && right < array2.length) {
            if(array1[left] < array2[right]) {
                resultArray[index++] = array1[left++];
            } else {
                resultArray[index++] = array2[right++];
            }
        }

        while(left < array1.length) {
            resultArray[index++] = array1[left++];
        }

        while(right < array2.length) {
            resultArray[index++] = array2[right++];
        }

        return resultArray;
    }

    /*
        3. Count Occurrences of a Character in a String

        Write a method that counts how many times a given character appears in a string.

        Ex:
            countOccurrences("hello world", 'o');
            // Output: 2
    */
    public int countOccurrences(String word, Character c) {
        int count = 0;
        for(Character k : word.toCharArray()) {
            if(k == c) {
                count++;
            }
        }

        return count;
    }

    /*
        4. Find the Intersection of Two Arrays

        Given two arrays of integers, write a method to find the intersection (common elements) of both arrays.
        Return the result as a new array.

        Ex:
            intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2});
            // Output: [2, 2]
    */
    public int[] findIntersection(int[] array1, int[] array2) {
       Set<Integer> set = new HashSet<>();

       for(Integer i : array1) {
           set.add(i);
       }

       List<Integer> list = new ArrayList<>();

       for(Integer i : array2) {
           if(!set.add(i)) {
               list.add(i);
           }
       }

       return list.stream().mapToInt(Integer::intValue).toArray();
    }

    /*
        5. Fibonacci Series Using Recursion

        Write a method that prints the first n numbers in the Fibonacci series using recursion.

        Ex:
            fibonacci(5);
            // Output: 0 1 1 2 3
    */
    public void fibonacci(int n) {
        for(int i = 0; i <= n; i++) {
            System.out.println(fibonacciNumber(i));
        }
    }

    public int fibonacciNumber(int n) {
        if(n <= 1) {
            return n;
        }

        return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
    }

    /*
        6. Check If a String Is Anagram

        Write a method that checks if two strings are anagrams of each other.
        Anagrams are words that can be formed by rearranging the letters of another word.

        Ex:
            areAnagrams("listen", "silent");
            // Output: true
    */
    public boolean isAnagram(String word1, String word2) {
        char[] array1 = word1.toCharArray();
        char[] array2 = word2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }

    /*
        7. Find the Largest Element in an Array

        Write a method that finds the largest element in an array of integers.

        Ex:
            findLargest(new int[]{1, 2, 3, 4, 5});
            // Output: 5
    */
    public int largestElement(int[] numbers) {

        int max = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }

    /*
        8. Reverse an Array

        Write a method that reverses an array in-place, without using additional arrays or collections.

        Ex:
            reverseArray(new int[]{1, 2, 3, 4});
            // Output: [4, 3, 2, 1]
    */
    public int[] reverseArray(int[] array) {

        int start = 0;
        int end  = array.length - 1;

        while(start < end) {
            int temp = array[end];
            array[end] = array[start];
            array[start] = temp;
            start++;
            end--;
        }

        return array;
    }

    /*
        9. Check for Balanced Parentheses

        Write a method that checks if a given string has balanced parentheses. A string has balanced parentheses if every opening parenthesis
        has a corresponding closing parenthesis, and they are correctly nested.

        Ex:
            isBalanced("(()())");
            // Output: true

            isBalanced("(()");
            // Output: false


            (()())



            stack: ((
    */
    public boolean validParentheses(String input) {

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == '(') {
                stack.add(input.charAt(i));
            }

            if(input.charAt(i) == ')') {
                if(stack.peek() == '(') {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }

    /*
        10. Find the Missing Number in a Range

        Given an array of n-1 integers ranging from 1 to n, write a method to find the missing number.
        The array does not contain duplicates.

        Ex:
            findMissingNumber(new int[]{1, 2, 4, 6, 3});
            // Output: 5
    */
    public int findMissingNumber(int[] array) {

        // [1, 2, 3, 4, 6]
        // sum = 16
        // size = 6, actualSize = 7
        // 7 * 6 = 42 / 2 = 21


        int sum = 0;
        for(Integer i : array) {
            sum += i;
        }

        int size = array.length + 1;
        int n = size + 1;

        int missingNum = ((size * n) / 2) - sum;

        return missingNum;
    }

    /*
        11. Implement a Thread to Print Even Numbers

        Write a program that creates a thread to print even numbers between 1 and 10,
        and another thread to print odd numbers between 1 and 10. Use Runnable and Thread.

        Ex:
            // Even Thread: 2
            // Odd Thread: 1
            // Even Thread: 4
            // Odd Thread: 3
    */
    public void oddEvenThread() {

    }

    // 12. Queue Implementation
    // Queue queue = new Queue();
    // queue.enqueue(1);
    // queue.enqueue(2);
    // System.out.println(queue.dequeue()); // Output: 1

    /*
        13. Find the Longest Substring Without Repeating Characters

        Write a method that takes a string as input and returns the length of the longest substring without repeating characters.

        Ex:
            longestSubstring("abcabcbb");
            // Output: 3 ("abc")
    */
    public int longestSubString(String value) {

        Set<Character> seen = new HashSet<>();
        int left = 0;
        int max = 0;

        for(int i = 0; i < value.length(); i++) {
            while(seen.contains(value.charAt(i))) {
                seen.remove(value.charAt(left));
                left++;
            }

            seen.add(value.charAt(i));
            max = Math.max(max, i - left + 1);
        }

        return max;
    }

    // 14. Implement Binary Search Tree
    // BinarySearchTree bst = new BinarySearchTree();
    // bst.insert(10);
    // bst.insert(5);
    // bst.insert(15);
    // System.out.println(bst.search(10)); // Output: true


    /*
        15. Is a Palindrome

        Write a method that checks whether a given number is a palindrome.

        Ex:
            isPalindrome(121);
            // Output: true

            isPalindrome(1213);
            // Output: false
    */
    public boolean isPalindrome(int num) {

        // 121
        // digit = number % 10
        // digit = 1;
        // result = (result * 10) + digit;
        // number /= 10;



        int number = num;
        int result = 0;

        while (number > 0) {
            int digit = number % 10;
            result = (result * 10) + digit;
            number /= 10;
        }

        return result == num;
    }

    // 16. Implement a Stack using an array
    // Stack stack = new Stack(5);
    // stack.push(10);
    // stack.push(20);
    // System.out.println(stack.pop()); // Output: 20


    /*
        16. Find Duplicates

        Given an array of integers, find duplicates using a HashSet.

        Ex:
            findDuplicates(new int[]{1, 2, 4, 1, 2});
            // Output: [1, 2]
     */
    public int[] findDuplicates(int[] numbers) {

        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(Integer i : numbers) {
            if(!set.add(i)){
                list.add(i);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }      //                 k         i
    // int[] array = {0,1,2,3,4,2,2,3,3,4};
    public int removeDuplicates(int[] nums) {


        return 0;
    }

    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if(!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
                continue;
            }

            if(!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
                continue;
            }

            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

}
