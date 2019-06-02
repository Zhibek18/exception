package kz.kakimzhanova.exception.reader;

import kz.kakimzhanova.exception.exception.WrongInputException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    private static final int N = 10;
    public double[] readNumbers(String dataFileName) throws IOException,
            WrongInputException {
        BufferedReader br;
        double[] doubles = new double[N];

        br = new BufferedReader(new FileReader("/home/sam/exception/src/main/resources/" + dataFileName));
        try {
            String tmp;
            int k = 0;
            while ((tmp = br.readLine()) != null) {
                String[] s = tmp.split("\\s");
                for (String res : s) {
                    double d = Double.parseDouble(res);
                    if ((Double.isInfinite(d))||(Double.isNaN(d))) {
                        throw new WrongInputException("wrong input data");
                    }
                    doubles[k++] = d;
                }
            }
            if (k != N){
                throw new WrongInputException("file contains "+ k +" numbers instead of "+ N );
            }
        }
        finally {
            br.close();
        }
        return doubles;
    }
}
