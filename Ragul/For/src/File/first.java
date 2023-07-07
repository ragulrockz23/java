package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class first {
	public static void main(String args[]) throws IOException {
		File f=new File("C:\\Users\\Lenovo\\eclipse-workspace\\Ragul\\bin\\myProject\\For\\I Love you dii Pondatti");
		System.out.println(f.getName());
		System.out.println(f.getPath());
		System.out.println(f.length());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.isFile());
		//f.createNewFile();
		String s="I Love you dii Pondatti";
		FileOutputStream fos =new FileOutputStream(s);
		byte b[]=s.getBytes();
		fos.write(b);
		fos.close();
		FileInputStream fis=new FileInputStream(f);
		int c;
		while((c=fis.read())!=-1) {
			System.out.print((char)c);
		}
		
	}

}
