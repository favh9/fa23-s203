package bomb;

import common.IntList;
import edu.princeton.cs.algs4.In;

public class BombMain {
    public static void main(String[] args) {
        int phase = 2;
        if (args.length > 0) {
            phase = Integer.parseInt(args[0]);
        }
        // TODO: Find the correct inputs (passwords) to each phase using debugging techniques
        Bomb b = new Bomb();
        if (phase >= 0) {
            b.phase0("39291226");
        }
        if (phase >= 1) {

            IntList lst1;
            lst1 = new IntList(8, null);
            lst1 = new IntList(0, lst1);
            lst1 = new IntList(3, lst1);
            lst1 = new IntList(9, lst1);
            lst1 = new IntList(0, lst1);

            // alt way of writing
            IntList lst2 = new IntList(0, new IntList(9, new IntList(3, new IntList(0, new IntList(8, null)))));

            // alt way of writing
            IntList lst3 = IntList.of(0,9,3,0,8);

            b.phase1(lst3); // Figure this out too
        }
        if (phase >= 2) {

            String s = ". ".repeat(1336) +
                    " -81201430";
            b.phase2(s);
        }
    }
}
