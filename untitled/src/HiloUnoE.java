public class HiloUnoE extends Thread{

    @Override
    public void run(){
        System.out.println("NOSEQUIENES:");
        for (int i = 0; i <= 15; i++) {
            System.out.println(i + " pasos dados:");
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }    }
}