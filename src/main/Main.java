package InputOutput_Installation_Task1.Games.src.main;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        StringBuilder log = new StringBuilder("");
        File src = new File("C:\\NetologyProjects\\JavaCoreNetology\\src\\InputOutput_Installation_Task1\\Games\\src");
        log.append("Add dir: Games.src\n");
        File main = new File("C:\\NetologyProjects\\JavaCoreNetology\\src\\InputOutput_Installation_Task1\\Games\\src\\main");
        log.append("Add dir: Games.src.main\n");
        File test = new File("C:\\NetologyProjects\\JavaCOreNetology\\src\\InputOutput_Installation_Task1\\Games\\src\\test");

        File res = new File("C:\\NetologyProjects\\JavaCoreNetology\\src\\InputOutput_Installation_Task1\\Games\\res");
        File drawables = new File("C:\\NetologyProjects\\JavaCOreNetology\\src\\InputOutput_Installation_Task1\\Games\\res\\drawables");
        File vectors = new File("C:\\NetologyProjects\\JavaCOreNetology\\src\\InputOutput_Installation_Task1\\Games\\res\\vectors");
        File icons = new File("C:\\NetologyProjects\\JavaCOreNetology\\src\\InputOutput_Installation_Task1\\Games\\res\\icons");

        File savegames = new File("C:\\NetologyProjects\\JavaCoreNetology\\src\\InputOutput_Installation_Task1\\Games\\savegames");
        File temp = new File("C:\\NetologyProjects\\JavaCoreNetology\\src\\InputOutput_Installation_Task1\\Games\\temp");

        test.mkdir();
        log.append("Add dir: Games.src.test\n");
        res.mkdir();
        log.append("Add dir: Games.res\n");
        drawables.mkdir();
        log.append("Add dir: Games.res.drawables\n");
        vectors.mkdir();
        log.append("Add dir: Games.res.vectors\n");
        icons.mkdir();
        log.append("Add dir: Games.res.icons\n");
        savegames.mkdir();
        log.append("Add dir: Games.savegames\n");
        temp.mkdir();
        log.append("Add dir: Games.temp\n");

        File mainJava = new File(
                "C:\\NetologyProjects\\JavaCoreNetology\\src\\InputOutput_Installation_Task1\\Games\\src\\main",
                "Main.java");
        File utilsJava = new File(
                "C:\\NetologyProjects\\JavaCoreNetology\\src\\InputOutput_Installation_Task1\\Games\\src\\main",
                "Utils.java");
        File tempTxt = new File(
                "C:\\NetologyProjects\\JavaCoreNetology\\src\\InputOutput_Installation_Task1\\Games\\temp",
                "Temp.txt");

        try {
            if (utilsJava.createNewFile()) log.append("Add file: Games.src.main.Utils.java");
            if (tempTxt.createNewFile()) log.append("Add file: Games.temp.Temp.txt\n");
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileWriter logWriter = new FileWriter(tempTxt, true);
             BufferedWriter bufferedLogWriter = new BufferedWriter(logWriter)) {

            bufferedLogWriter.write(log.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
