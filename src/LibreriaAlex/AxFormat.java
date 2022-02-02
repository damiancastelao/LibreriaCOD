package LibreriaAlex;

import java.text.DecimalFormat;

public class AxFormat {

    public static String floatFormat(float number,int nDecimal){

        String decimal="0.";

        for(int i=0;i<nDecimal;i++){
            decimal+=0;
        }

        DecimalFormat dc= new DecimalFormat(decimal);

        return dc.format(number);

    }

    public static String doubleFormat(double number,int nDecimal){

        String decimal="0.";

        for(int i=0;i<nDecimal;i++){
            decimal+=0;
        }

        DecimalFormat dc= new DecimalFormat(decimal);

        return dc.format(number);

    }
}
