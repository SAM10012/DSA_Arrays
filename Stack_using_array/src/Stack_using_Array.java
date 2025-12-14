import java.util.*;

 /* ============================ Stack using Array =======================================*/

/*
| Complexity           | Value                         |
| -------------------- | ----------------------------- |
| **Time Complexity**  | O(1) for all stack operations |
| **Space Complexity** | O(n)                          |

*/

public class Stack_using_Array {

    int[] arr;
    int capacity;
    int top;

    public Stack_using_Array(int num)
    {
        arr = new int[num];
        capacity = num;
        top = -1;
    }

    public int size()
    {
        return top + 1;
    }

    public boolean isEmpty()
    {
        return top == -1;
    }

    public int top_element()
    {
        if(top != -1)
        return arr[top];
        else
        {
            System.out.println("No elements to see!");
            return -1;
        }
    }

    public void push(int element)
    {
        if(top == capacity-1)
        {
            System.out.println("Stack Overflow!");
        }
        else {
            arr[++top] = element;
            System.out.println("Pushed: " + element);
        }
    }

    public void pop()
    {
        if(top == -1)
        {
            System.out.println("Stack Underflow!");
        }
        else {
            System.out.println("Popped: " + arr[top]);
            top--;
            System.out.println("Pop successful");
        }
    }

    public static void main(String[] args)
    {
        Stack_using_Array Stack = new Stack_using_Array(3);
        Stack.push(1);
        Stack.push(2);Stack.push(3);Stack.push(4);
        Stack.pop();
        Stack.pop();
        int top_element = Stack.top_element();
        Stack.pop();
        int top = Stack.top_element();
        Stack.pop();
        System.out.println("Stack Empty Status:" + Stack.isEmpty());
        System.out.println("Current Size: " + Stack.size());


    }
}
