package test;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadTest tt=new ThreadTest();
		System.out.println("结果："+tt.dofetch());
	}
	
	public int dofetch() {
		int result=0;
		ExecutorService threadPool2 =  Executors.newFixedThreadPool(10);  
        CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(threadPool2); 
        completionService.submit(callableA);
        completionService.submit(callableB);
        completionService.submit(callableC);
        try {
			result=completionService.take().get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	Callable<Integer> callableA=new Callable<Integer>() {  
        @Override  
        public Integer call() throws Exception {  
            Thread.sleep(new Random().nextInt(5000));  
            return 1;  
        }  
    };
    Callable<Integer> callableB=new Callable<Integer>() {  
    	@Override  
    	public Integer call() throws Exception {  
    		Thread.sleep(new Random().nextInt(5000));  
    		return 2;  
    	}  
    };
    Callable<Integer> callableC=new Callable<Integer>() {  
    	@Override  
    	public Integer call() throws Exception {  
    		Thread.sleep(new Random().nextInt(5000));  
    		return 3;  
    	}  
    };

}
