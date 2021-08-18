package src.Generics.ListUtilities;
import java.util.List;
public class ListUtils<T extends Comparable> {

//    public T getMax(List<T> lizt) {
//        T max = lizt.get(0);
//
//        for (int i = 1; i <lizt.size()-1 ; i++) {
//            if(lizt.get(i).compareTo(max)>0){
//                max =lizt.get(i);
//            }
//        }
//
//
//        return max;
//    }

public static <T extends Comparable<T>> T maxValue(List<T> array){
    T max = array.get(0);
    for(T data: array){
        if(data.compareTo(max)>0)
            max =data;
    }
    return max;
}
    public static <T extends Comparable<T>> T minValue(List<T> array){
        T min = array.get(0);
        for(T data: array){
            if(data.compareTo(min)<0)
                min =data;
        }
        return min;
    }


}
// 1,  2    ,18   ,2,    -1