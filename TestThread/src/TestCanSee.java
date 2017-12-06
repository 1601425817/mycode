class MyCanSee implements Runnable {  
    volatile long num = 100;  
    public void run() {  
        if (Thread.currentThread().getName().equals("t1")) {  
            increment();  
        } else {  
            decrement();  
        }  
    }  
  
    public void increment() {  
        for (int i = 0; i < 99990; i++) {  
            num++;  
            System.out.println("increase"+num);
        }  
    }  
  
    public void decrement() {  
        for (int i = 0; i < 80000; i++) {  
            num--;  
            System.out.println("decrease"+num);
        }  
    }  
}  
  
public class TestCanSee {  
  
    public static void main(String[] args) {  
        MyCanSee thread = new MyCanSee();  
        Thread a = new Thread(thread, "t1");  
        Thread b = new Thread(thread, "t2");  
  
        a.start();  
        b.start();  
        try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(thread.num);
 
    }  
}  