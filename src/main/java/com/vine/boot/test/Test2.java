package com.vine.boot.test;

import com.vine.boot.domain.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.apache.tomcat.util.http.fileupload.IOUtils;

import java.io.*;

/**
 * @author cao
 * @date 2019-12-17 12:01
 */

public class Test2 {

    public static void main(String[] args) {
        //Initializes The Object
        Person user = new Person();
        user.setName("hollis");
        user.setAge(23);
        user.setNick("tom");
        System.out.println(user);

        //Write Obj to File
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("tempFile"));
            oos.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(oos);
        }

        //Read Obj from File
        File file = new File("tempFile");
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            Object o = ois.readObject();

            System.out.println(o);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }  catch (Exception e) {
            e.printStackTrace();
        }finally {
            IOUtils.closeQuietly(ois);
//            try {
//                FileUtils.forceDelete(file);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        }

    }
}

