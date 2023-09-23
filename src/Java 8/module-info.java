/**
 * an Interface can have a static method with body(defined static method),but does not visible in subclass,
 * it can only be accessed through Interface name only.
 * as main method is also static that is why main method can be written inside an interface,and we execute
 * it through command prompt
 * 
 * lambda expression only applicable if functional interface is there
 * it is introduced to enable functional programming
 * lambda expression is method with no name,no access modifier,no return type
 * 
 * Interface containing only one abstract method is called as functional interface
 * 
 * using functional interface we can invoke lambda expression
 * 
 * if method contains only one parameter then writing paranthesis is optional in lambda expression
 * writing data type of the parameter is optional
 * if method body contains only one statement,then writing curly brace is optional
 * if method is returning any value then writing return keyword is optional
 * 
 * @FunctionalInterface annotation also introduced from java 1.8
 * 
 * collections are mainly used to store the data and retrieve the data in effective and efficient manner
 * 
 * While defining our own sorting, JVM is always going to call Comparator to compare() method.

	returns negative value(-1), if and only if obj1 has to come before obj2.
	returns positive value(+1), if and only if obj1 has to come after obj2.
	returns zero(0), if and only if obj1 and obj2 are equal
 * 
 */
