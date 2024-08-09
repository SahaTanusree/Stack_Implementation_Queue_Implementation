
import java.util.*;

class CustomQueuemain {
    public static void main(String[] args) throws Exception {
        CustomQueue que = new CustomQueue(3);
        que.insertion(1);
        que.insertion(5);
        que.insertion(7);
        que.display();
        System.out.println("Remove");
        System.out.println(que.remove());
        que.display();
        System.out.println("Front of the queue:" + que.front());

    }
}
