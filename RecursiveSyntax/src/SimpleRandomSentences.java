/**
 * @author: Alexander Massimino
 * 
 * 	ReadMe: 
 * 		This is a random sentence generator that follows a specific format,
 * 		All that is required is to run the code and random sentences will be generated in the console.
 *  **/
   public class SimpleRandomSentences {    
	   static final String[] conjunction = { "and", "or", "but", "because"}; 
	   static final String[] properNoun = { "Ronaldo", "Messi", "Mbappe","Ramos", "Silva", "Mendy", "Lewandoski"};    
	   static final String[] commonNoun = { "goalkeeper", "defender", "midfielder", "forward", "manager"}; 
	   static final String[] determiner = { "a", "the", "every", "some"};
	   static final String[] adjective = { "agile", "tall","strong", "smart", "decisive", "prolific", "skilled", "fast", "experienced"};  
	   static final String[] intransVerb = { "runs", "jumps", "talks", "sleeps"};   
	   static final String[] transVerb = { "loves", "hates", "sees", "knows", "looks for", "finds"}; 
	   public static void main(String[] args) {  
			   Sentence();  
		   }

   static void Sentence() {    
	   randomNounPhrase();             
	   randomVerbPhrase();    
	   if (Math.random() > 0.75) {
		   System.out.print(" " + randomItem(conjunction));   
		   Sentence();       
		   }   
	   }
          static void randomNounPhrase() { 
        	  if (Math.random() > 0.75)   
        		  System.out.print(" " + randomItem(properNoun));   
        	  else  {   
        		  System.out.print(" " + randomItem(determiner));    
        		  if (Math.random() > 0.5)     
        			  System.out.print(" " + randomItem(adjective)+".");
        		  System.out.print(" " + randomItem(commonNoun));           
        		  if (Math.random() > 0.5){   
        			  System.out.print(" who" );  
        			  randomVerbPhrase();          
        			  }         
        		  }   
        	  }          
          static void randomVerbPhrase() {              
        	  if (Math.random() > 0.75)         
        		  System.out.print(" " + randomItem(intransVerb));   
        	  else if (Math.random() > 0.50) {                   
        		  System.out.print(" " + randomItem(transVerb));    
        		  randomNounPhrase();        
        		  }                
        	  else if (Math.random() > 0.25)   
        		  System.out.print(" is " + randomItem(adjective));    
        	  else {                  
        		  System.out.print(" believes that");        
        		  randomNounPhrase();                
        		  randomVerbPhrase();             
        		  }   
        	  }    
          static String randomItem(String[] listOfStrings){    
        	  return listOfStrings[(int)(Math.random()*listOfStrings.length)];    
        	  } 
          } 


