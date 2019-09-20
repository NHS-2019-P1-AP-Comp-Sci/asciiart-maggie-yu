/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	
	public static void textBox(){
		System.out.println("                         /************\\");
		System.out.println("                       <     \"Yum!\"   |");
		System.out.println("                         \\___________ /");
	}
	 public static void catHead(){
		System.out.println("     /\\-------/\\");
		System.out.println("    (  ^  w  ^   )");
		
	}
	public static void catBody(){
		System.out.println("     )----------(_______");
		System.out.println("    |                   )");
		System.out.println("    |_|--|_|---------|_|");
	
	}
	public static void boxEdge(){
		System.out.println("+------------------------------+");
	}
	public static void boxSide(){
		System.out.println("|                              |");
	}
	public static void theBox(){
		boxEdge();
		boxSide();
		System.out.println("|                  <9))))<     |");
		System.out.println("|    <9))))<                   |");
		boxSide();
		boxEdge();
	}
	public static void theBreak(){
		System.out.println(" ");
	}
	public static void main (String[] args) {
		textBox();
		theBreak();
		catHead();
		catBody();
		theBox();
		theBreak();
		System.out.println("A tail-less cat stands on top of a fish tank, hoping to snag a fish later for lunch.");
	
	
	}



}
