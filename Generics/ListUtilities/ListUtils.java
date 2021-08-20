package src.Generics.ListUtilities;
import java.util.List;
public class ListUtils<T extends Comparable<T>> {



public static <T extends Comparable<T>> T maxValue(List<T> list){
    if(list.size()==0) throw new IllegalArgumentException();
    T max = list.get(0);
    for(T data: list){
        if(data.compareTo(max)>0)
            max =data;
    }
    return max;
}
    public static <T extends Comparable<T>> T minValue(List<T> list){
        if(list.size()==0) throw new IllegalArgumentException();
        T min = list.get(0);
        for(T data: list){
            if(data.compareTo(min)<0)
                min =data;
        }
        return min;
    }


}
