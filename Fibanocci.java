package week1.day2;



public class Fibanocci {

	public static void main(String[] args) {
		
		
			int range =8 , firstNum = 0, secNum = 1,sum=0;
            System.out.println(firstNum);
            
            System.out.println(secNum);
            
            System.out.println("Fibanocci output \n");
            
            for (int i = 1; i <=range; ++i) 
    
                {
	           sum=firstNum+secNum;
	           
	           System.out.println(sum);
	           
	           firstNum=secNum;
	           secNum=sum;
	      
	           
                           }

	}	
}


