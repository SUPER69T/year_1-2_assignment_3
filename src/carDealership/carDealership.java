package carDealership;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;

public class carDealership {  //כבר יצרתי נתיבים אוטומטיים במחלקות עצמן, רק עכשיו אומרים ליצור ב-main?

    public static <T extends Comparable<T>> ArrayList<T> list_Sorter(ArrayList<T> not_Sorted_list){
        Collections.sort(not_Sorted_list);
        return not_Sorted_list;
    }

    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter();
        }
        catch (IOException e){
            throw new IllegalStateException("Failed to write to sales log.", e);
        }
    }

}

