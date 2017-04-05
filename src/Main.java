import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        String donne = "No man is an island, entire of itself; every man is a piece of the continent, a part of the main. If a clod be washed away by the sea, Europe is the less, as well as if a promontory were, as well as if a manor of thy friend's or of thine own were: any man's death diminishes me, because I am involved in mankind, and therefore seek not to know for whom the bell tolls; it tolls for thee.";

        String mini = "barft";
        //compareTo
        if (donne.compareTo(donne) == 0) {
            System.out.println("SUCCESS - comparedTo");
        } else {
            System.out.println("ERROR - it must be the same size as itself");
        }
        if (donne.compareTo("A rose by any other name") > 0) {
            System.out.println("SUCCESS - donne > 'a rose'");
        } else {
            System.out.println("ERROR - compareTo should be greater than 0, if donne is larger..");
        }

        //Contains
        String zee = "z";    //Neither
        String at = "at";      //only donne
        String prom = "promontory";  // Only donne


        if (donne.contains(zee)) {
            System.out.println("ERROR - donne contains " + zee);
        } else {
            System.out.println("SUCCESS - donne does not contain " + zee);
        }

        if (mini.contains(zee)) {
            System.out.println("ERROR - mini does not contain z");
        } else {
            System.out.println("SUCCESS - mini does not contain "+ zee);
        }

        if (donne.contains(at)){
            System.out.println("SUCCESS - donne contains " + at);
        } else {
            System.out.println("ERROR - donne does NOT contain " + at);
        }

        if (mini.contains(at)){
            System.out.println("ERROR - mini does NOT contain " +at);
        } else {
            System.out.println("SUCCESS - mini does not contain "+at);
        }

        //endsWith

        if (donne.endsWith(".")){
            System.out.println("SUCCESS - donne ends with '.' ");
        } else {
            System.out.println("ERROR - donne DOES end with '.'");
        }

        //equalsIgnoreCase
        if (mini.equalsIgnoreCase("BARFt")){
            System.out.println("SUCCESS - barft equals BARFt (ignoring case)");

        }else {
            System.out.println("ERROR - barft and BARFt should be equal (ignoring case)");
        }

        //lastIndexOf
        System.out.println("SUCCESS - the last index of r in 'mini' is " + mini.lastIndexOf("r"));

        if (donne.lastIndexOf("island")==13){
            System.out.println("SUCCESS - 'island' last seen at index " +donne.lastIndexOf("island"));
        } else {
            System.out.println("ERROR - 'island was at index 13 ");
        }

        //replace
        String newMini= mini.replace("t", "ing");
        System.out.println("new mini is -> " + newMini);
        String newerMini = newMini.replace("ing", "sRus!");
        System.out.println("replace again -> " + newerMini);

        if (newerMini.equals("barfsRus!")){
            System.out.println("SUCCESS - barfsRus!");
        } else {
            System.out.println("ERROR - we want barfsRus!");
        }

        String upper = "UPPER";
        String newUpper = upper.toLowerCase();
        System.out.println("calling .toLowerCase on 'UPPER' -> " + newUpper);

        if (newUpper.equals("upper")){
            System.out.println("SUCCESS - newUpper is 'upper' !");
        } else {
            System.out.println("ERROR - newUpper should be 'upper'");
        }

//StringUtils has some nice methods to simplify your code. Write the StringUtils methods
//                isBlank
//                equalsIgnoreCase
//                leftPad(String str, int size, char padChar)

        String upper2 = "UPPER";

        //isBlank
        System.out.println(StringUtils.isBlank(upper2));


    }
}
