package ba.unsa.etf.dm.Huffman;

import java.util.ArrayList;
import java.util.Comparator;

public class Huffman {
    ArrayList<Grupa> grupe = new ArrayList<>();

    public Huffman(){}

    public void setGrupe(ArrayList<Grupa> grupe){
        this.grupe=grupe;
    }

    public ArrayList<Grupa> getGrupe(){
        return this.grupe;
    }

    public void add(Grupa grupa){
        grupe.add(grupa);
    }

    public boolean iterate(){
        if(grupe.size()==1)return false;

        grupe.sort(new Comparator<Grupa>() {
            @Override
            public int compare(Grupa o1, Grupa o2) {
                return o2.compareTo(o1);
            }
        });

        Grupa zadnja = grupe.get(grupe.size()-1);
        grupe.remove(grupe.size()-1);
        Grupa predzadnja = grupe.get(grupe.size()-1);
        grupe.remove(grupe.size()-1);
        zadnja.code("1");
        predzadnja.code("0");
        Grupa nova = new Grupa();
        predzadnja.getGrupa().forEach(nova::add);
        zadnja.getGrupa().forEach(nova::add);
        grupe.add(nova);
        return true;
    }

    @Override
    public String toString() {
        String res="";
        for(Grupa x : grupe){
            res+=x;
        }
        return res;
    }

    public double entropija(){
        double e=0;
            for(Grupa x : grupe) {
                for(KodnaRijec y : x.getGrupa())
                e += y.getProb() * Math.log10(y.getProb()) / Math.log10(2);
            }

        e=-e;
        return e;
    }
    public double nsrednje(){
        double res = 0;
        for(Grupa x : grupe) {
            for(KodnaRijec y : x.getGrupa())
                res += y.getProb()*y.getKod().length();
        }
        return res;
    }
    public double protok(){
        return this.entropija()/this.nsrednje();
    }
}
