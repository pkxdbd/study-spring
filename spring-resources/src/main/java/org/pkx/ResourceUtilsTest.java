package org.pkx;

import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Properties;

public class ResourceUtilsTest {

    public static void main(String[] args) throws FileNotFoundException {
        Properties properties = System.getProperties();
        String property = properties.getProperty("user.dir");
        System.out.println(property);
        String classpath = ResourceUtils.getURL("classpath:").getPath();
        System.out.println(classpath);
        URL url = ResourceUtils.getURL("classpath:");

    }

}
