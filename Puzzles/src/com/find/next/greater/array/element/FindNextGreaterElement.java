package com.find.next.greater.array.element;

import java.util.Stack;

public class FindNextGreaterElement {

	public static void main(String[] args) {
		// int arr[] = { 11, 13, 21, 3 };
		int arr[] = { 4, 5, 2, 25 };
		Stack stack = new Stack();
		stack.push(arr[0]);
		int i = 1;
		int next = 0;
		int s = 0;
		for (i = 1; i < arr.length; i++) {
			next = arr[i];
			if (!stack.isEmpty()) {
				s = (int) stack.pop();
				while (s < next) {
					System.out.println("Next Greatest elem of " + s + " is "
							+ arr[i]);
					if (stack.isEmpty())
						break;
					s = (int) stack.pop();
				}

				if (s > next)
					stack.push(s);

			}
			stack.push(next);
		}
		while (!stack.isEmpty()) {
			System.out.println("Next Greatest elem of " + stack.pop() + " is "
					+ -1);
		}
	}

}

//push 4 to stack(4)
//pop 4 next 5 4<5 print then push 5 stack(5)
//pop 5 next 2 5>2 push 5 back stack(5) then push next also stack(5,2)
//pop 5 next 25 5<25 true print then stack not empty 
//pop 2 next 25 2<25 true print  -push 25 stack(25)
//loop exists as we reached end of the array

//stack not empty -pop 25 print -1
