package lockdemo;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Classname Dog
 * @Description TODO
 * @Date 2022/12/13 3:42 PM
 * @Created by fuwk
 */
public class Dog {

//    private final Object objectLock = new Object();


    public void eat(String name){
        synchronized (Dog.class){
            System.out.println("我是：" + name + "正在吃东西。");
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Dog dog = new Dog();
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int j = i;
            AtomicInteger atomicInteger = new AtomicInteger(++j);
            Thread thread = new Thread(() -> {
                dog.eat(atomicInteger.getAndIncrement() + "");
            });
            thread.setName(i + "");
            threads.add(thread);
//            Thread.sleep(500);
        }
        threads.forEach(Thread::start);


    }



}
