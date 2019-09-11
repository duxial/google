public class SayHi{
    public static void main(String[] args) {
        //System.out.println("Say Hi");
		sayHi(sum());
    }
	
    public static void sayHi(int sum){
	    System.out.println("Say Hi" + sum);	
	}
	
	public static int sum(){
		int sum = 0;
		for(int i=0;i<=100;i++){
			sum +=i;
		}
		return sum;
	}	
}