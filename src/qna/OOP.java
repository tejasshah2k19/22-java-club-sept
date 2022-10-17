package qna;

public class OOP {

	public static void main(String[] args) {

	}
}

class A {

}

class B {
	A obj;
}


//class A and class B represent ___________ concept? 
//ans:- containership , has a relation , composition* 



class P{
	
}
class Q extends P{
	
}

//class P and Q represent ________ concept and _____ relationship? 
//inheritance , is a 


//1 java file contains only  1 public class?
//true false ? 
//true 


/*
 * 
 * pacakge pkgA;
 * 
 * public class Foo{
 * 
 *  public 	int a=10;
 * }
 * 
 * 
 * package pkgB;
 * 
 * public class Baz{
 * 	
 * 		public static void main(String args[]){
 * 			
 * 			Baz b = new Baz();
 * 			System.out.println(b.a);
 * 	
 * 		}
 * 
 * }
 * 
 * Wrong ans : 10 , 0 
 * Correct ans : compilation fails we can't access a variable using Baz object 
 * 				 we need to create object of Foo or we need inheritance Baz extends Foo. 
 *
 * 
 * 
 * 
 * pacakge pkgA;
 * 
 * public class Foo{
 * 
 *  	int a=10;
 * }
 * 
 * 
 * package pkgB;
 * 
 * public class Baz{
 * 	
 * 		public static void main(String args[]){
 * 			
 * 			Foo b = new Foo();
 * 			System.out.println(b.a);
 * 	
 * 		}
 * 
 * }
 * 
 * Wrong ans: 10 
 * Correct ans : compilation error , we can't access default variable out side package. 
 * 				in above question a is default variable and that can't access outside package pkgA. 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *  * 
 * pacakge pkgA;
 * 
 * public class Foo{
 * 
 *  	private int a=10;
 * }
 * 
 * 
 * package pkgB;
 * 
 * public class Baz extends Foo{
 * 	
 * 		public static void main(String args[]){
 * 			
 * 			Foo b = new Foo();
 * 			System.out.println(b.a);
 * 	
 * 		}
 * 
 * }
 * Wrong ans : 10 
 * correct ans : compilation error , we can't access private variable outside class. 
 * 					in above question a is private. 
 * 
 *
 * 
 * 
 * 
 * 
 * 
 *  --insert some code --- 
 * class StatTest{
 * 		public static void main(String args[]){
 * 			System.out.println(Integer.MAX_VALUES);// this works fine 
 * 		}
 * }
 * 
 * which line we can insert  on line 132 "insert some code " so code compiles ! 
 * 
 * 1) import java.lang.Integer;
 * 2) import java.lang.*; 
 * 3) static import java.lang.Integer.*;
 * 4) import java.util.Integer; 
 * 5) none of the above 
 * 
 * ans: on line 123 we don't require any import statement because Integer class is auto imported 
 * 		but we can write 1) 2) and 3) all are correct and can compile your class. 
 * 
 * 
 * class Parent{
 * 	
 * 		Parent(int a){
 * 				S.o.p("Parent(int)");	
 * 		}
 * }
 * 
 * class Child extends Parent{
 * 
 * 		Child(){
 * 			S.o.p("Child()");
 * 		}
 * }
 * 
 * class ParentChild{
 * 	public static void main(String args[]){
 * 
 * 		Child c = new Child();
 * 	}
 * 
 * }
 * 
 * what will be the output of above code? 
 * ans: compilation error , Child class need Default constructor of parent which is missin here .
 * 
 * 
 * 
 * 
 * 
 * class Parent{
 * 	
 * 		Parent(int a){
 * 				S.o.p("Parent(int)");	
 * 		}
 * }
 * 
 * class Child extends Parent{
 * 
 * 		Child(){
 * 			super(9);
 * 			S.o.p("Child()");
 * 		}
 * }
 * 
 * class ParentChild{
 * 	public static void main(String args[]){
 * 
 * 		Child c = new Child();
 * 	}
 * 
 * }
 * what will be the output of above code?
 * ans : Parent(int) 
 *        Child() 
 *        
 *        
 *        
 *        
 * class Parent{
 * 	
 * 		Parent(int a){
 * 				S.o.p("Parent(int)");	
 * 		}
 * 		void add(){
 * 			S.o.p("Parent::add()");
 * 		}
 * }
 * 
 * class Child extends Parent{
 * 
 * 		Child(){
 * 			super(9);
 * 			S.o.p("Child()");
 * 		}
 * }
 * 
 * class ParentChild{
 * 	public static void main(String args[]){
 * 
 * 		Child c = new Child();
 * 		c.add();	
 * }
 * 
 * }
 * what will be the output of above code ? 
 * ans: Parent(int) 
 *      Child() 
 *      Parent::add()  
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * *        
 * class Parent{
 * 	
 * 		Parent(int a){
 * 				S.o.p("Parent(int)");	
 * 		}
 * 		void add(){
 * 			S.o.p("Parent::add()");
 * 		}
 * }
 * 
 * class Child extends Parent{
 * 
 * 		Child(){
 * 			super(9);
 * 			S.o.p("Child()");
 * 		}
 * }
 * 
 * class ParentChild{
 * 	public static void main(String args[]){
 * 
 * 		Child c = new Parent(); 
 * 		c.add();	
 * }
 * 
 * }
 * what will be the output of above code ? 
 * ans : compilation error 
 * */










