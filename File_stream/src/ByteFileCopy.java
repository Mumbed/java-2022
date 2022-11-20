import java.io.*;
public class ByteFileCopy {

    String srcFileName;
    String destFileName;
    ByteFileCopy(String srcFileName, String destFileName){
        this.srcFileName = srcFileName;
        this.destFileName = destFileName;
    }
    void copy(){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(srcFileName);
            fos = new FileOutputStream(destFileName);
            int bData;
            int cnt = 0;
            while (true) {
                bData = fis.read();
                if(bData == -1)
                    break;

                fos.write(bData);
                cnt++;
            }
            System.out.println("복사된 바이트: " + cnt);
        }
        catch(FileNotFoundException fnfe) {
            System.err.print(fnfe.getMessage());
            System.err.println(" - 복사를 취소합니다!");
        }
        catch( IOException ie){
            ie.printStackTrace();
        }
        finally{
            try{
                if(fis != null)
                    fis.close();
                if(fos != null)
                    fos.close();
            }
            catch( IOException ioe){
                ioe.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ByteFileCopy bcopy = new ByteFileCopy("origianl.jpg","target.jpg");
        bcopy.copy();
    }
}