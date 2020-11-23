package files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        String str = "File handling in java using  FileWriter and  FileReader and there are sveeral things that can be taken into consideration %%%778943 092148mkfjdl 873846. 1";
        fileWriterMethod(str , "MyFile.txt");
        fileReaderMethod("MyFile.txt");
    }

    private static void fileReaderMethod( String fileName)  throws  IOException{
        int ch ;
        FileReader fileReader = null;
        StringBuilder sb = new StringBuilder();
        try{
            fileReader = new FileReader(fileName);
        }
        catch (FileNotFoundException e){

        }
        while( (ch = fileReader.read()) != -1){
            sb.append((char) ch);
        }
        System.out.println(sb.toString());
    }

    public static  void fileWriterMethod(String str , String fileName) throws IOException {

        // attache file to the file writer
        FileWriter fileWriter = new FileWriter(fileName);

        // Write the above string to the fie

        for(int i = 0; i < str.length(); i++){
            fileWriter.write(str.charAt(i));
        }
        System.out.println("Suuccess");
        fileWriter.close();
    }
}
