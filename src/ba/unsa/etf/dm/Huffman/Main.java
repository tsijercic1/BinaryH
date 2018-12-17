package ba.unsa.etf.dm.Huffman;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Grupa a = new Grupa();
        a.add(new KodnaRijec("A",86.0/421));
        Grupa b = new Grupa();
        b.add(new KodnaRijec("B",34.0/421));
        Grupa c = new Grupa();
        c.add(new KodnaRijec("C",19.0/421));
        Grupa d = new Grupa();
        d.add(new KodnaRijec("D",11.0/421));
        Grupa e = new Grupa();
        e.add(new KodnaRijec("E",42.0/421));
        Grupa f = new Grupa();
        f.add(new KodnaRijec("F",87.0/421));
        Grupa g = new Grupa();
        g.add(new KodnaRijec("G",22.0/421));
        Grupa h = new Grupa();
        h.add(new KodnaRijec("H",17.0/421));
        Grupa i = new Grupa();
        i.add(new KodnaRijec("I",15.0/421));
        Grupa j = new Grupa();
        j.add(new KodnaRijec("J",88.0/421));
        Huffman zadatak = new Huffman();
//        zadatak.add(a);
//        zadatak.add(b);
//        zadatak.add(c);
//        zadatak.add(d);
//        zadatak.add(e);
//        zadatak.add(f);
//        zadatak.add(g);
//        zadatak.add(h);
//        zadatak.add(i);
//        zadatak.add(j);
//        while(zadatak.iterate()){
//            System.out.println("Iteracija\n");
//            System.out.println(zadatak);
//        }
//        System.out.println(zadatak.entropija());
//        System.out.println(zadatak.nsrednje());
//        System.out.println(zadatak.protok());

        TernaryHuffman x = new TernaryHuffman();
        x.add(a);
        x.add(b);
        x.add(c);
        x.add(d);
        x.add(e);
        x.add(f);
        x.add(g);
        x.add(h);
        x.add(i);
        x.add(j);
        while(x.iterate()){
            System.out.println("Iteracija\n");
            System.out.println(x);
        }
        System.out.println(x.entropija());
        System.out.println(x.nsrednje());
        System.out.println(x.protok());
        System.out.println(x.iskoristenost());

    }
}
