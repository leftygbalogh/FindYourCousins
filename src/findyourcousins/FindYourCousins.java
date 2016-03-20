/*
 * Code is prose.
 * 
 * Lefty G Balogh
 */
package findyourcousins;

import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Lefty G Balogh
 */
public class FindYourCousins {

    public static void main(String[] args) {
        String thisIsMe = "/home/lefty/path1/d1/Anyuka/thisIsMe_Lefty";
        Set<File> cousins = new TreeSet<>();
        File myMum = null;
        File myGrandma = null;
        File[] myGrandmasChildren = null;
        File[] auntiesChildren = null;
        File me = new File(thisIsMe);

        if (me.getParentFile() != null) {
            myMum = me.getParentFile();
        }

        if (myMum.getParentFile() != null) {
            myGrandma = myMum.getParentFile();
        }

        myGrandmasChildren = myGrandma.listFiles();

        for (File myGrandmasChild : myGrandmasChildren) {
            if (!myGrandmasChild.equals(myMum)) {
                auntiesChildren = (myGrandmasChild.listFiles());
            }
            for (File cousin : auntiesChildren) {
                cousins.add(cousin);
            }
        }

        System.out.println("These are my cousins: ");
        for (File cousin : cousins) {
            System.out.println(cousin.getName());
        }
    }
}
