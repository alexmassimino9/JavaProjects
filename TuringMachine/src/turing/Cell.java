package turing;


/**
 * Represents one cell on a Turing Machine tape.
 */
public class Cell {

	public char content;  // The character in this cell.
	public Cell next;     // Pointer to the cell to the right of this one.
	public Cell prev;     // Pointer to the cell to the left of this one.

	// constructor function for Cell class
	public Cell() {
		content = ' ';
		next = null; 
		prev = null;
	}

	// getter method to get the content
	public char getContent() {
		return content; 
	}

	// setter method to set the content
	public void setContent(char content) {
		this.content = content; 
	}
	
	// getter method for moving cell
	public Cell getNext() {
		return next; 
	}
	
	// setter method to set the value of the next cell
	public void setNext(Cell next) {
		this.next = next; 
	}
	
	public Cell getPrev() {
		return prev; 
	}
	
	public void setPrev(Cell prev) {
		this.prev = prev; 
	}

} // end of Cell class 




