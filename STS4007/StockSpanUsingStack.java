package STS4007;

import java.util.*;


public class StockSpanUsingStack {


    static void calculateSpan(int price[], int n, int Span[])
    {
        Stack<Integer> st = new Stack<>();
        st.push(0);


        Span[0] = 1;
        for (int i = 1; i < n; i++) {


            while (!st.isEmpty() && price[st.peek()] <= price[i])
                st.pop();
            Span[i] = st.isEmpty() ? (i+1) : (i - st.peek());


            st.push(i);
        }
    }


    static void printArray(int arr[])
    {
        System.out.print(Arrays.toString(arr));
    }


    public static void main(String[] args)
    {
        int price[] = { 10, 4, 5, 90, 120, 80 };
        int n = price.length;
        int Span[] = new int[n];


        calculateSpan(price, n, Span);


        printArray(Span);
    }
}
