package sukkiri_java_jissen_6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class Ex_6_2 {
	public static void main(final String[] args) throws Exception {
		if (args.length != 2) {
			System.out.print("エラーです");
			return;
		}
		final String inFile = args[0];
		final String outFile = args[1];
		try (final FileInputStream fis = new FileInputStream(inFile);
				final FileOutputStream fos = new FileOutputStream(outFile);
				final GZIPOutputStream gos = new GZIPOutputStream(fos);
				final BufferedInputStream Bis = new BufferedInputStream(fis);
				final BufferedOutputStream Bos = new BufferedOutputStream(gos);) {
			int i = fis.read();
			while (i != 1) {
				gos.write(i);
				i = fis.read();
			}
			gos.flush();
		} catch (final IOException e) {
			System.out.print("IOEエラーです");
		}
	}
}
