import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
   /*
       if ( ){

       }
  */

        // condition -- boolean
        // < less than
        // > greater than
        // <= less than or equal to
        // >= greater than or equal to
        // == equal to -- the same as
        // != not equal to

        double fuelLevel = .05;

        if (fuelLevel < .25){
            out.println("stop for gas");
        }

        double walmartGasPrice=2.95, chevronGasPrice = 3.15;

        if (walmartGasPrice < chevronGasPrice){
            out.println("stop at walmart");
            out.println("get groceries");
            }
        else{
            out.println("stop at chevron");
        }

        String craving = " ";

        if (craving.equals("mcnuggets")){
            out.println("stop at McD");
        }
        else if (craving.equals("real chicken")){
            out.println("stop at Popeyes");
        }
        else if (craving.equals("whopper")){
            out.println("stop at bk");
        }
        else{
            out.println("stop at in-and-out");
        }

    }
}