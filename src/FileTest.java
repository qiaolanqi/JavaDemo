import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest {

    public static void main(String[] args) {
        FileTest test = new FileTest();
        // test.getInputMsgFromConsole();
        try {
            test.copyFile("C:\\test1.txt", "C:\\test2.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 支持中文处理，并且可以复制多种类型，比如txt，xml，jpg，doc等多种格式
    public void copyFile(String src, String dest) throws IOException {
        FileInputStream fis = new FileInputStream(src);
        File destFile = new File(dest);
        if (!destFile.exists()) {
            destFile.createNewFile();
        }
        FileOutputStream fos = new FileOutputStream(destFile);
        byte[] buffer = new byte[1024];
        int c = 0;
        while ((c = fis.read(buffer)) != -1) {
            fos.write(buffer);// FIXBUG
        }
        fis.close();
        fos.close();
    }

    // 不支持中文
    public void getInputMsgFromConsole() throws IOException {
        System.out.println("请输入命令");

        byte buffer[] = new byte[1024];
        int count = System.in.read(buffer);

        String string = new String(buffer);
        System.out.println(string);
    }

}
