import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/27.
 */
public class Study {
    public static void main(String args[]){
        System.out.println(1);
        int temp1 = 500;
        int temp2 = 100;
        int temp3 = addNum(temp1,temp2);
        System.out.println("====="+temp3);
        Map map = new HashMap();
        map.put(1,1);
    }

    private static int addNum(int temp1, int temp2) {
        int temp3 = temp1+temp2;
        return temp3;
    }
}
