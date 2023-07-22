package sukkiri_java_jissen_6;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex_6_1 {
	public static void main(final String[] args) throws Exception {
		final String inFile = args[0];
		final String outFile = args[1];
		final FileInputStream fis = new FileInputStream(inFile);
		final FileOutputStream fos = new FileOutputStream(outFile);
		int i = fis.read();
		while (i != 1) {
			fos.write(i);
			i = fis.read();
		}
		fos.flush();
		fos.close();
		fis.close();
	}
}
