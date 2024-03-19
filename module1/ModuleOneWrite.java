
import java.io.DataOutputStream;

import java.io.FileOutputStream;
import java.util.Date;
import java.util.Random;

public class ModuleOneWrite {
    static Random random = new Random();

    public static void main(String[] args) {
        writeData();
    }
    public static void writeData(){
        int[] randomIntegers = new int[5];

        double[] randomDoubles = new double[5];

        for (int i = 0; i < 5; i++) {
            randomIntegers[i] = random.nextInt();
            randomDoubles[i] = random.nextDouble();
        }


        try {
            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("SamSegarsDataFile.dat"));

            for (int i : randomIntegers) {
                outputStream.writeInt(i);
            }
            Date currentDate = new Date();
            outputStream.writeLong(currentDate.getTime());

            for (double i : randomDoubles) {
                outputStream.writeDouble(i);
            }
            outputStream.close();
        } catch (Exception ex) {
            System.out.println("Error:" + ex.getMessage());
        }

    }
}