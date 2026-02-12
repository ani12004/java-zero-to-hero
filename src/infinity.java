import java.util.concurrent.TimeUnit;
public class infinity {
    public static void main(String[] args) {
        int i = 0;
        while(true){
            i = i +1;
            System.out.println("current value is " + i);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
