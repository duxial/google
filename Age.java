import java.util.Scanner;
public class InputScanner{
    final String younggirl = "YOUNGER";
	final String oldergirl = "OLDER";
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print（“Please input the age of your girl:");
	int age = scan.nextInt();
	
	String nickname = girl;
    
    if(age < 15){
	    nickname = younggirl;
	}

    if(age>= 15){
	    nickname = oldergirl;
	}
	
	switch(nickname){
	    case younggirl：
		    System.out.println("you are young");
			break;
	
	
	    case oldergirl：
		    System.out.println("you are old");
			break;
			
		default：
             System.out.println("Please try again");		
	}
}