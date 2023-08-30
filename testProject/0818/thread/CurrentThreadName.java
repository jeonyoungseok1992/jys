package thread;

public class CurrentThreadName {
	public static void main(String[] args) {
//		Thread ct = Thread.currentThread();   //Thread 대문자니 클래스라는거 유추가능    //외부클래스에서 다른 클래스이름.메서드이름()=스태틱메서드 호출
//											//컴파일러가 스레드클래스를 하나 만들어서 그 안에서 run을 호출해서 main문을 실행시킨다
//		String name = ct.getName();
//		
//		System.out.println(name);
		
		
		
//		Runnable task = () -> {           //쓰레드가 실행하게 할 내용
//			int n1 = 10;
//			int n2 = 20;
//			String name = Thread.currentThread().getName();
//			System.out.println(name + " : " + (n1 + n2));
//		};
//		
//		Thread t = new Thread(task);
//		t.start();                        //쓰레드 생성 및 실행
//		System.out.println("End " + Thread.currentThread().getName());
		
		
		   Runnable task1 = () -> { // 20 미만 짝수 출력
			      try {
			         for(int i = 0; i < 20; i++) {
			            if(i % 2 == 0)
			               System.out.print(i + " ");
			            Thread.sleep(100); // 0.1초간 잠을 잔다.
			         }
			      }catch(InterruptedException e) {
			         e.printStackTrace();
			      }
			   };
			   Runnable task2 = () -> { // 20 미만 홀수 출력
			      try {
			         for(int i = 0; i < 20; i++) {
			            if(i % 2 == 1)
			               System.out.print(i + " ");
			            Thread.sleep(200); // 0.1초간 잠을 잔다.
			         }
			      }catch(InterruptedException e) {
			         e.printStackTrace();
			      }
			   };
			   
			   Thread t1 = new Thread(task1);
			   Thread t2 = new Thread(task2);
			   t2.start();
			   t1.start();
			   

		
		
		
		}

}
