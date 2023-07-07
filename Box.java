package OOPHomeworkSeminar4;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    List<T> fruList = new ArrayList<>();

    public void add(T fruit) {
        fruList.add(fruit);
    }

    public int getWeight() {
        int sum = 0;
        for (T t : fruList) {
            sum += t.getWeight();
        }
        return sum;
    }

    public void moveTo(Box<? super T> anotherBox) {
        anotherBox.fruList.addAll(fruList);
        this.fruList.removeAll(fruList);
    }
}
