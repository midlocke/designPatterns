package com.example.pattern.decorator.javaIO;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by lichao on 2017/10/27.
 */
public class LowerCaseInputStream extends FilterInputStream{

    public LowerCaseInputStream(InputStream inputStream){
        super(inputStream);
    }

    public int read() throws IOException{
        int c = super.read();
        return (c==-1?c:Character.toLowerCase((char)c));
    }

    public int read(byte[] bytes,int offset,int len)throws IOException{
        int result = super.read(bytes,offset,len);
        for(int i=offset;i<offset+result;i++){
            bytes[i] = (byte)Character.toLowerCase((char)bytes[i]);
        }
        return result;
    }
}
