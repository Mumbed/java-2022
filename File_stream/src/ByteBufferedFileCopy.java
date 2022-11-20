import java.io.*;
public class ByteBufferedFileCopy {

    String srcFileName;
    String destFileName;
    ByteBufferedFileCopy(String srcFileName, String destFileName){
        this.srcFileName = srcFileName;
        this.destFileName = destFileName;
    }
    void copy(){
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        try {
            fis = new FileInputStream(srcFileName);
            bis = new BufferedInputStream(fis);
            fos = new FileOutputStream(destFileName);
            bos = new BufferedOutputStream(fos);
            int bData;
            int cnt = 0;
            while (true) {
                bData = bis.read();
                if(bData == -1)
                    break;

                bos.write(bData);
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
                if(bis != null)
                    bis.close();
                if(fis != null)
                    fis.close();
                if(bos != null)
                    bos.close();
                if(fos != null)
                    fos.close();
            }
            catch( IOException ioe){
                ioe.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ByteBufferedFileCopy bcopy = new ByteBufferedFileCopy("origianl.jpg","target.jpg");
        bcopy.copy();
    }
}