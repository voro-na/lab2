import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteFile {
    int UpperCase = 0;
    int LowerCase = 0;
    void ReadFile(String path) throws IOException {

        try(FileReader reader = new FileReader(path))
        {
            int c;

            while((c=reader.read())!=-1){
                if (c >= 65 && c <= 90)
                    UpperCase++;
                else  if ( c >= 97 && c <= 122)
                    LowerCase++;
            }
        }
        catch(IOException ex){
            throw new IOException(ex);
        }
    }
    void WriteFile(String path) throws IOException {
        try(FileWriter writer = new FileWriter(path, false))
        {

            writer.write("Uppercase english letter: " + UpperCase);
            writer.append('\n');
            writer.write("Lowercase english letter: " + LowerCase);

            writer.flush();
        }
        catch(IOException ex){
            throw new IOException(ex);
        }
    }
}
