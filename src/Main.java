public class Main {
    public static void main(String[] args) {


        Pet pt = new Pet("dog", "Sky", "black and brown" );
        Pet ps = new Pet("cat", "Murka", "yellow") ;
        Pet pr = new Pet("rabbit", "Clever", "white");
        Pet pg = new Pet("cow", "Mumu", "black,white");
        Pet pz = new Pet("horse", "Pony", "gold");

        System.out.println(pt.toString());
        System.out.println(ps.toString());
        System.out.println(pr.toString());
        System.out.println(pg.toString());
        System.out.println(pz.toString());

       String[] nm = {pt.getTip(), ps.getTip(),pr.getTip(),pg.getTip(), pz.getTip()};
        for (int  i = 0; i < nm.length ; i++) {
            System.out.println(nm[i]);
        }
    }
}