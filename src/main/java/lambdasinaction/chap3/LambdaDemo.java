package lambdasinaction.chap3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author: qiudong
 * @description:
 * @date: Created in 10:30 2018-02-05
 */
public class LambdaDemo {

    public static void main(String[] args){
        try {
            String value = processFile(br -> br.readLine()+br.readLine());
            System.out.println(value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String processFile(BufferedReaderProcessor p) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("D:\\IdeaProjects_my\\Java8InAction\\src\\main\\resources\\lambdasinaction\\chap3\\data.txt"))){
            return p.process(br);
        }
    }
}

