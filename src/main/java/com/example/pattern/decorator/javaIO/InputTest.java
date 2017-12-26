package com.example.pattern.decorator.javaIO;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.*;

/**
 * Created by lichao on 2017/10/27.
 */
public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;

        Resource resource = new ClassPathResource("lc/decorator/test.txt");
        File file = resource.getFile();
        InputStream inputStream = new LowerCaseInputStream(new BufferedInputStream(
                new FileInputStream(file)));
        while ((c=inputStream.read())>=0){
            System.out.print((char)c);
        }
        inputStream.close();
    }
}
