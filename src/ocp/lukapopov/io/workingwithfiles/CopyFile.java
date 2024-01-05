package ocp.lukapopov.io.workingwithfiles;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {


        //example: copy text file (no buffering)
        copyTextFileInProject("source.txt","destination.txt");

    }


    /**
     * example: copy text file (no buffering)
     */
    public static void copyTextFileInProject(String sourceFilePath, String destinationFilePath){
        File srcFile = new File(
                "/home/user/IdeaProjects/UIProjeSmartCardLinkTeam1-main (5)/" +
                        "JavaCertificationScratchBook/"+sourceFilePath);
        File destFile = new File(
                "/home/user/IdeaProjects/UIProjeSmartCardLinkTeam1-main (5)/" +
                        "JavaCertificationScratchBook/"+destinationFilePath);
        //loading physical files into java objects


        try (
                var reader = new FileReader(srcFile);
                var writer = new FileWriter(destFile)){//using try-with-resources to make sure that
            // close() is applied on our objects
            int c;
            while ((c = reader.read()) != -1) {//reading character by character with read() method
                //(in Java, -1 signals the end of the stream)
                writer.write(c);//writing character by character with write() method
            }
        } catch (IOException e) {
            e.printStackTrace();//catching IOException
        }
    }

    /**
     * example: copy text file (with buffering, same files)
     */
    public static void copyTextFileInProjectWithBufferingSameFiles(String sourceFilePath, String destinationFilePath){
        File srcFile = new File(
                "/home/user/IdeaProjects/UIProjeSmartCardLinkTeam1-main (5)/" +
                        "JavaCertificationScratchBook/"+sourceFilePath);
        File destFile = new File(
                "/home/user/IdeaProjects/UIProjeSmartCardLinkTeam1-main (5)/" +
                        "JavaCertificationScratchBook/"+destinationFilePath);

        try (
                var reader = new BufferedReader(new FileReader(srcFile));
                var writer = new BufferedWriter(new FileWriter(destFile))){ //wrapping FileReader into BufferedReader
            String line;
            while ((line = reader.readLine()) != null) {//we use readLine() method, specific to BufferedReader
                writer.write(line);
                writer.newLine();//we use newLine() because readLine() strips out the end-of-line character
                                 //strip out = cikarmak
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * example: copy binary file (no buffering)
     */
    public static void copyBinaryFileNoBuffering(String sourceFilePath, String destinationFilePath){
        File srcFile = new File(
                "/home/user/IdeaProjects/UIProjeSmartCardLinkTeam1-main (5)/" +
                        "JavaCertificationScratchBook/"+sourceFilePath);
        File destFile = new File(
                "/home/user/IdeaProjects/UIProjeSmartCardLinkTeam1-main (5)/" +
                        "JavaCertificationScratchBook/"+destinationFilePath);

        try (
                var in = new FileInputStream(srcFile);
                var out = new FileOutputStream(destFile)){
            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * example: copy binary file (with buffering, same files)
     */
    public static void copyBinaryFileWithBufferingSameFiles(String sourceFilePath, String destinationFilePath){
        File srcFile = new File(
                "/home/user/IdeaProjects/UIProjeSmartCardLinkTeam1-main (5)/" +
                        "JavaCertificationScratchBook/"+sourceFilePath);
        File destFile = new File(
                "/home/user/IdeaProjects/UIProjeSmartCardLinkTeam1-main (5)/" +
                        "JavaCertificationScratchBook/"+destinationFilePath);

        try (
                var in = new BufferedInputStream(new FileInputStream(srcFile));
                var out = new BufferedOutputStream(new FileOutputStream(destFile))){
            var buffer = new byte[1024];//reads buffer (up to 1024 bytes) and stores it in buffer,
                                        //and returns number of bytes read
            int numBytesRead;
            while ((numBytesRead = in.read(buffer)) >0) {
                out.write(buffer,0,numBytesRead);//write bytes from buffer, from 0 to buffer length
                out.flush();//used if we want to ensure the data is written immediately
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
