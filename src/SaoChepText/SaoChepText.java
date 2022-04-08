package SaoChepText;

import java.io.*;

public class SaoChepText {
    public static void saoChepFile(String f1,String f2){
        try {
            File file1 = new File(f1);
            File file2 = new File(f2);
//            if (file2!=null){
//                throw new FileNotFoundException();
//            }
            InputStream inputStream = new FileInputStream(file1);
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";
            String str = "";
            while ((line = br.readLine())!=null){
                str+=line+"\n";
            }
            OutputStream outputStream = new FileOutputStream(file2);
            OutputStreamWriter or = new OutputStreamWriter(outputStream);
            or.write(str);
            or.flush();
            System.out.println("số chữ  = "+soKiTuTrongFile(str));
        } catch (IOException e) {
            System.out.println("target file đã tồn tại hoặc src file không có dữ liệu");
        }
    }
    public static int soKiTuTrongFile(String str){
        String[] arr = str.split(" ");
        return arr.length+2;
    }
}
