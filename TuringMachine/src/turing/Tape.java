package turing;
/** 
 * 
 * @author Alexander Massimino
 * The objective of this class to provide a tape for a very simple turing machine.
 *
 */
public class Tape {
	
	public Cell currentCell; 
	
	// constructor method that creates a new blank tape 
	public Tape() {
		this.currentCell = new Cell();
//		
	} // end of tape constructor 
	
	
	// method to get the current cell
	public Cell getCurrentCell() {
		// returns the pointer that points to the current cell.
		return currentCell; 
	}

	public char getContent() {
		// returns the char from the current cell.
		return currentCell.getContent();
	}

	public void setContent(char ch) {
		// changes the char in the current cell to the specified value.
		currentCell.setContent(ch);
	}
	
	
	
	//  moves the cell to the left of the tape
	public void moveLeft() {
		
		 if (currentCell.getPrev() == null) {
			 Cell newCell = new Cell();
			 newCell.setNext(currentCell);
			 currentCell.setPrev(newCell); 
		 }
		 currentCell = currentCell.getPrev();
	} // end of moveLeft method 
	
	
	// this method moves the cell to the right of the tape 
	public void moveRight() {
		if (currentCell.getNext() == null) {
			Cell newCell = new Cell(); 
			newCell.setPrev(currentCell);
			currentCell.setNext(newCell);
		}
		currentCell = currentCell.getNext();
	}
	
	public String getTapeContents() {
		
		// this uses a pointer to get the contents of tape
		Cell pointer = currentCell;
		
		// go to the first spot on tape
		while (pointer.getPrev() != null) {
			pointer = pointer.getPrev(); 
			}
		
		// container for tape content
		String stringContent = "";
		
		// container for temporary string for spaces
		String tempSpace = "";
		
			
		// moving from left to right 	
		while (pointer != null) {
			
			if (pointer.getContent() != ' ') {
				
			stringContent += tempSpace + pointer.getContent();
			tempSpace = "";
			} else {
				tempSpace += pointer.getContent();
			}
			pointer = pointer.getNext();
			
		}
		return stringContent;
		
	}
}
