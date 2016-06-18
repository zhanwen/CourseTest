package threeQuestion;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFish {
	public static void main(String[] args) {
		Fish f = new Fish();
		String str = f.run();

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
