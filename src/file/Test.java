package file;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File file=new File("F:\\lhw\\笔记\\自己的\\img");
        ShowFile(file);
    }
    public static void ShowFile(File file){
        if (file.isDirectory()){
            File file1[]=file.listFiles();
            for (File f:file1){
                ShowFile(f);
            }
        }else{
            System.out.println(file.getName());
        }
    }
}
