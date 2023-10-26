package Model;

import java.util.Map;
import java.util.TreeMap;

public class Polynomial {
    private final TreeMap<Integer, Double> list;
    public Polynomial(){
        list = new TreeMap<>();
    }
    public String toString() {
        StringBuilder result = new StringBuilder();
        if(this.list.size() < 1){
            result.append(0);
        }
        for (Map.Entry<Integer, Double> set : list.entrySet()) {
            if(set.getValue() > 0){
                result.append("+").append(Math.round(set.getValue() * 100) / 100D).append("x^").append(set.getKey());
                continue;
            }
            result.append(Math.round(set.getValue() * 100) / 100D).append("x^").append(set.getKey());
        }
        return result.toString();
    }
    public void addMonom(Monom m1){
        if(m1 == null || m1.getKey() < 0){
            return;
        }
        this.list.put(m1.getKey(), m1.getCoefficient());
    }
    public TreeMap<Integer, Double> getList() {
        return list;
    }
    public void setList(TreeMap<Integer, Double> list) {
        for (Map.Entry<Integer, Double> set : list.entrySet()) {
            this.addMonom(new Monom(set.getKey(), set.getValue()));
        }
    }
}
