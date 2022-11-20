import java.io.*;
public class CharBufferdeIO {
    static void write () {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter("charBIO.txt");
            bw = new BufferedWriter(fw);
            String str1 = "Bufferedwriter 테스트입니다. ";
            bw.write(str1);
            bw.newLine();
            bw.write("안녕하세요" + System.getProperty("1ine. separator"));
        }
        catch(IOException ioe){
                ioe.printStackTrace();
        }
        finally{
            try{
                if(bw != null) bw.close();
                if(fw != null) fw.close();
            }
            catch(IOException ioe){
                ioe.printStackTrace();
            }
        }
    }
    static void read() {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("charBIO.txt");
            br = new BufferedReader(fr);
            String msg;

            while ((msg = br.readLine()) != null)
                System.out.println(msg);
        }
            catch(IOException ioe){
                ioe.printStackTrace();
            }
            finally{
                try {
                    if (br != null) br.close();
                    if (fr != null) fr.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
        }
        public static void main(String[] args){
        CharBufferdeIO.write();
        CharBufferdeIO.read();
        }
    }
