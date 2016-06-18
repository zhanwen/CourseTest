package threeQuestion;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBird {
	public static void main(String[] args) {
		Bird b = new Bird();
		String str = b.run();
		
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("F:\\1.txt", true);// true表示在文件末尾追加
			fos.write(str.getBytes());
			fos.write("\r\n".getBytes());
			fos.close();// 流要及时关闭

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
