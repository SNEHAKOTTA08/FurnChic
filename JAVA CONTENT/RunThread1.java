class RunThread1{
public static void main(String args[]){
MyThread1 mt1 = new MyThread1();
Thread t =new Thread(mt1);
t.start();
}
}