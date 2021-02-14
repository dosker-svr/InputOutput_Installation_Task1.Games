package InputOutput_Installation_Task1.Games.src.main;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String pre = "src\\InputOutput_Installation_Task1\\Games\\";
        StringBuilder log = new StringBuilder("");

        File src = new File(pre + "src");
        log.append("Add dir: Games.src\n");
        File main = new File(pre + "src\\main");
        log.append("Add dir: Games.src.main\n");
        File test = new File(pre + "src\\test");

        File res = new File(pre + "res");
        File drawables = new File(pre + "res\\drawables");
        File vectors = new File(pre + "res\\vectors");
        File icons = new File(pre + "res\\icons");

        File savegames = new File(pre + "savegames");
        File temp = new File(pre + "temp");

        createFolderAndAddLineToLog(test, log);
        createFolderAndAddLineToLog(res, log);
        createFolderAndAddLineToLog(drawables, log);
        createFolderAndAddLineToLog(vectors, log);
        createFolderAndAddLineToLog(icons, log);
        createFolderAndAddLineToLog(savegames, log);
        createFolderAndAddLineToLog(temp, log);

        File mainJava = new File(pre + "src\\main", "Main.java");
        File utilsJava = new File(pre + "src\\main", "Utils.java");
        File tempTxt = new File(pre + "temp", "Temp.txt");

        createFileAndAddLineToLog(utilsJava, log);
        createFileAndAddLineToLog(tempTxt, log);

        try (FileWriter logWriter = new FileWriter(tempTxt, false);
             BufferedWriter bufferedLogWriter = new BufferedWriter(logWriter)) {

            bufferedLogWriter.write(log.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void createFolderAndAddLineToLog(File file, StringBuilder sb) {
        file.mkdir();
        try {
            sb.append("Add dir: " + file.getCanonicalPath() + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void createFileAndAddLineToLog(File file, StringBuilder sb) {
        try {
            if (file.createNewFile()) sb.append("Add file: " + file.getPath() + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
