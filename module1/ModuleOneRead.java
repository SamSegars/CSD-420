import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.Date;

public class ModuleOneRead {
    public static void main(String[] args) {
        readData();

    }
    public static void readData(){
        try{
            DataInputStream inputStream = new DataInputStream(new FileInputStream("SamSegarsDataFile.dat"));
            System.out.println("\n**Integer Array** ");
            for(int i = 0; i < 5; i++){
                System.out.println(inputStream.readInt());
            }

            System.out.println("\nDate: " + new Date(inputStream.readLong()));

            System.out.println("\n**Double Array** ");
            for(int i =0; i<5; i++){
                System.out.println(inputStream.readDouble());
            }
            inputStream.close();
            System.out.println(" ");
        }catch(Exception ex){
            System.out.println("Error:" + ex.getMessage());
        }
    }
}
