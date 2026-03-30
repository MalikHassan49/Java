package other.tools;

// class A implements Runnable {
//   public void run() {
//     for (int i = 1; i <= 5; i++) {
//       System.out.println("in A show");
//     }
//   }
// }

// class B implements Runnable {
//   public void run() {
//     for (int i = 1; i <= 5; i++) {
//       System.out.println("in B show");
//     }
//   }
// }

class Counter {
  int count;
  public synchronized void increment() {
    count++;
  }
  
}

public class RunnableVsThread {
  public static void main(String[] args) {
    // Runnable obj1 = new A();
    // Runnable obj2 = new B();

    // Runnable obj1 = () -> {
    //     for (int i = 1; i <= 5; i++) {
    //       System.out.println("Hi");
    //       try {
    //         Thread.sleep(5);
    //       }
    //       catch (InterruptedException e) {
    //         e.printStackTrace();
    //       }
    //     }
    //   };

    // Runnable obj2 = () -> {
    //     for (int i = 1; i <= 5; i++) {
    //       System.out.println("Hello");
    //       try {
    //         Thread.sleep(5);
    //       } 
    //       catch (InterruptedException e) {
    //         e.printStackTrace();
    //       }
    //     }
    // };

    Counter c = new Counter();

    Runnable obj1 = () -> {
        for (int i = 1; i <= 1000; i++) {
          c.increment();
        }
      };

    Runnable obj2 = () -> {
        for (int i = 1; i <= 1000; i++) {
         c.increment();
        }
    };

    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);

    t1.start();
    t2.start();

    try {
      t1.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    try {
      t2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println(c.count);
    // start() -> JVM -> OS scheduler -> CPU ko assign karte ha thread ->
    // CPU execute
  }
}
