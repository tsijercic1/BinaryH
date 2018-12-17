package ba.unsa.etf.dm.Huffman;

public class KodnaRijec implements Comparable {
    private String naziv;
    private Double prob;
    private String kod;

    public KodnaRijec(String naziv, Double prob) {
        this.naziv = naziv;
        this.prob = prob;
        this.kod="";
    }

    public String getNaziv() {
        return naziv;
    }

    public void code(String a){
        this.kod=a+this.kod;
    }

    public String getKod() {
        return kod;
    }

    public Double getProb() {
        return prob;
    }

    @Override
    public int compareTo(Object o) {
        return prob.compareTo(((KodnaRijec)o).getProb());
    }

    @Override
    public String toString() {
        return naziv + '/' +prob + " / "+ kod+"\n";
    }
}
