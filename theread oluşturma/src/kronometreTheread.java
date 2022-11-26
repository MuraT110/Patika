public class kronometreTheread implements Runnable {

    private Thread t;
    private String threadName;

    public kronometreTheread(String threadName){
        this.threadName=threadName;
        System.out.println("oluşturuluyor : " + threadName);
    }

    @Override
    public void run() {
        System.out.println("çalıştırılıyor : " + threadName);




                    try {
                        for (int i=1;i<=10;i++) {
                            System.out.println(threadName + " ; " + i);
                            Thread.sleep(1000);
                        }
                    } catch (InterruptedException exception) {

                    }


    }
    public void start(){
        System.out.println("Thread nesnesi oluşuyor : ");
        if (t==null){
            t=new Thread(this.threadName);
            t.start();
        }
    }

}

