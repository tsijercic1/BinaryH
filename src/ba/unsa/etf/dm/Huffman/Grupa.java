package ba.unsa.etf.dm.Huffman;

import java.util.ArrayList;
import java.util.Comparator;

public class Grupa implements Comparable {
    private ArrayList<KodnaRijec> grupa = new ArrayList<KodnaRijec>();
    private Double prob;

    private int half;

    public void code(String a){
        grupa.forEach((m)->{
            m.code(a);
        });
    }
    public ArrayList<KodnaRijec> getGrupa() {
        return grupa;
    }

    public void setGrupa(ArrayList<KodnaRijec> grupa) {
        this.grupa = grupa;
    }

    public Double getProb() {
        prob = 0.0;
        for (int i=0;i<grupa.size();i++){
            prob+=grupa.get(i).getProb();
        }
        return prob;
    }

    public void add(KodnaRijec k){
        grupa.add(k);
        grupa.sort(new Comparator<KodnaRijec>() {
            @Override
            public int compare(KodnaRijec o1, KodnaRijec o2) {
                return o2.compareTo(o1);
            }
        });
    }



    @Override
    public int compareTo(Object o) {
        return this.getProb().compareTo(((Grupa)o).getProb());
    }

    @Override
    public String toString() {
        String res="";
        for(KodnaRijec x : grupa){
            res+=x;
        }
        return res;
    }
}
