import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MyClassLoader extends ClassLoader {
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            String className = name + ".class";
            File file = new File("E://test//class-lib", className);
            FileInputStream fis = new FileInputStream(file);
            int len = 0;
            ByteArrayOutputStream byteOus = new ByteArrayOutputStream();
            try {
                while ((len = fis.read()) != -1) {
                    byteOus.write(len);
                }
                byte[] data = byteOus.toByteArray();
                return defineClass(name, data, 0, data.length);
            } catch (Exception e) {
                e.printStackTrace();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        return super.findClass(name);

    }
}
