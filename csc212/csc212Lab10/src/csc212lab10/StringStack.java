/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab10;

/**
 * The StringStack class represents a stack of String objects. StringStacks have
 * a set max size which is set when the object is constructed.
 *
 * @author Christopher Wells <cwellsny@nycap.rr.com>
 */
public class StringStack {

	String[] stack;	// The array holding the elements contained in the stack
	int top;	// The current top index of the stack

	/**
	 * The method used to construct a StringStack with a given max size.
	 *
	 * @param maxSize The maximum size of the stack
	 */
	public StringStack(int maxSize) {
		stack = new String[maxSize];
		top = -1;
	}

	/**
	 * The method used to determine if the StringStack is empty or not.
	 *
	 * @return Whether the StringStack is empty or not
	 */
	public boolean isEmpty() {
		return top == -1;
	}

	/**
	 * The method used to determine if the StringStack is full or not.
	 *
	 * @return Whether the StringStack is full or not
	 */
	public boolean isFull() {
		return top == stack.length - 1;
	}

	/**
	 * The method used to push a String into the StringStack.
	 *
	 * @param s The String to push to the stack
	 */
	public void push(String s) {
		if (!this.isFull()) {
			top++;
			stack[top] = s;
		}
	}

	/**
	 * The method used to peek at the top element of the StringStack.
	 *
	 * @return The top element of the stack
	 */
	public String peek() {
		if (!this.isEmpty()) {
			return stack[top];
		} else {
			return null;
		}
	}

	/**
	 * The method used to pop the top element of the StringStack off of the
	 * stack.
	 *
	 * @return The top element popped off of the StringStack
	 */
	public String pop() {
		if (!this.isEmpty()) {
			String temp = stack[top];
			top--;
			return temp;
		} else {
			return null;
		}
	}

}
