package org.java;

public class TestThread extends Thread {
	
	private String name;
	
	public static void main(String[] args) {
		TestThread th1 = new TestThread("aaa");
		TestThread th2 = new TestThread("bbb");
		TestThread th3 = new TestThread("ccc");
		th1.start();
		th2.start();
		th3.start();
	}
	
	public TestThread(String name){
		this.name = name;
	}
	
	public void run(){
		for(int i = 0;i < 5;i++){
			System.out.println(name+"运行: "+i);
			try{
				sleep((int)Math.random() * 10);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
