import java.io.*;
public class DataFilterStream {
    static void save(){
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        try{
            fos = new FileOutputStream("data.bin");
            dos = new DataOutputStream(fos);

            dos.writeInt(123);
            dos.writeDouble(3.14);
        }
        catch(FileNotFoundException fnfe){
            System.err.print(fnfe.getMessage());
        }
        catch(IOException ie){
            ie.printStackTrace();
        }
        finally{
            try{
                if(dos != null)dos.close();
                if(fos != null)fos.close();
            }
            catch(IOException ioe){
                ioe.printStackTrace();
            }
        }
    }

    static void load(){
        FileInputStream fis = null;
        DataInputStream dis = null;
        try {
            fis = new FileInputStream("data.bin");
            dis = new DataInputStream(fis);

            int n = dis.readInt();
            double pi = dis.readDouble();

            System.out.println("> "+ n);
            System.out.println("> "+ pi);
        }
        catch(FileNotFoundException fnfe) {
            System.err.print(fnfe.getMessage());
        }
        catch( IOException ie){
            ie.printStackTrace();
        }
        finally{
            try{
                if(dis != null)
                    dis.close();
                if(fis != null)
                    fis.close();
            }
            catch( IOException ie){
                ie.printStackTrace();
            }
        }
    }
    static void bufferedSave(){
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        DataOutputStream dos = null;
        try{
            fos = new FileOutputStream("data.bin");
            bos = new BufferedOutputStream(fos);
            dos = new DataOutputStream (bos);

            dos.writeInt(123);
            dos.writeDouble(3.14);

            dos.flush();
        }
        catch(FileNotFoundException fnfe){
            System.err.print(fnfe.getMessage());
        }
        catch(IOException ie){
            ie.printStackTrace();
        }
        finally{
            try{
                if(dos!=null) dos.close();
                if(bos!=null)bos.close();
                if(fos != null) fos.close();
            }
            catch(IOException ioe){
                ioe.printStackTrace();
            }
        }
    }
    static void bufferedLoad() {
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        DataInputStream dis = null;
//파일로 부터 읽어들임
        try {
            fis = new FileInputStream("data.bin");
            bis = new BufferedInputStream (fis);
            dis = new DataInputStream (bis);
            int n = dis.readInt();
            double pi = dis.readDouble ();
            System.out.println("> " + n);
            System.out.println("> " + pi);
        }
        catch (FileNotFoundException fnfe) {
            System.err.print(fnfe.getMessage ());
        }
        catch (IOException ie) {
            ie.printStackTrace();
        }
        finally {
            try{
                if(dis != null) dis.close();
                if(bis != null) bis.close();
                if(fis != null)  fis.close();
            }
            catch(IOException ioe){
                ioe.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        bufferedSave();
        bufferedLoad();
    }
}