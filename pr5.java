import java.util.*;

class Producer extends Thread{
StringBuffer sb;
boolean dataproducer=false;
Producer(){
sb=new StringBuffer();
}
public void run(){
synchronized(sb){
for(int i=1;i<=10;i++){
try{
sb.append(i+":");
Thread.sleep(100);
System.out.println("Appending");
}catch(Exception e){}
}
dataproducer=true;
sb.notify();
}
}
}

class Consumer extends Thread{
Producer prod;
Consumer(Producer prod){
this.prod=prod;
}
public void run(){
try{
prod.sb.wait();
}catch(Exception e){}
System.out.println(prod.sb);
}
}
class pr5{
public static void main(String args[]){
Producer obj1=new Producer();
Consumer obj2=new Consumer(obj1);
Thread t1=new Thread(obj1);
Thread t2= new Thread(obj2);
t2.start();
t1.start();
}
}