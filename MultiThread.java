 
 class OddThread extends Thread{
 public void run(){
 		
 		
 			Thread t=Thread.currentThread();
			OddThread ot1 = new OddThread();
			ot1.checkAccess();
	 		System.out.println(" "+ t.getName());
 			t.checkAccess();
			 for(int i=1;i<=100;i++){
			 if(i%2!=0)
			 {
			 System.out.println("Odd Number :"+ i);
			 System.out.println(ot1.getName() + " has accessed ");
			 	
			 try{
			 	Thread.sleep(1000);
			 	}catch(InterruptedException ie){
			 	ie.printStackTrace();
			 	}
 	
 
 			}		
 
 	}
 
 }
 }
 
  
 class EvenThread extends Thread implements Runnable {

 public void run() {
 
			EvenThread et1  = new EvenThread();
			et1.checkAccess();
			
			 for(int i=1;i<=100;i++)
			 {
			 	if(i%2==0)
			 	{
			 		System.out.println("Even Number: "+ i);
					System.out.println(et1.getName() + " EvenThread has accessed ");
					if(i == 12)
					{
						try{
						et1.sleep(50000);
						
						System.out.println("Stoped...." + et1.getName());
						}catch(InterruptedException et2){
							et2.printStackTrace();
						}
					}
			 	try{
			 	Thread.sleep(1000);
			 	}catch(InterruptedException ie){
			 	ie.printStackTrace();
			 	}
 	
 
 				}		
 
 			}
 
		 }
 }
 
 class MultiThread extends Thread{
 
	 public static void main(String args[]){
	 
		MultiThread  t1 = new MultiThread();
	 	EvenThread ett = new EvenThread();
	 	OddThread ott = new OddThread();
		 Thread et =new Thread(ett);
		 Thread ot =new Thread(ott);
		 t1.start();
		 t1.checkAccess();
		
	 	et.start();
		
		
		 ot.start();
	 
	 }
	 
	 
 
 
 }
