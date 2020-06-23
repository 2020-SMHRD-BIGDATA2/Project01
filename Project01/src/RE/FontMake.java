package RE;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

public class FontMake {

	public void fontChange(GraphicsEnvironment ge) {
		// String path = "C:\\Users\\SMHRD\\AppData\\Local\\Microsoft\\Windows\\Fonts\\Recipekorea 레코체FONT.ttf";
		
		// 윗부분에 필요한 폰트의 주소를 바꾸면서 사용

		String path = "C:\\Users\\SMHRD\\AppData\\Local\\Microsoft\\Windows\\Fonts\\\\GmarketSansBold.otf";

		Font recipe;
		try {
			recipe = Font.createFont(Font.TRUETYPE_FONT, new File(path)).deriveFont(12f);
			ge.registerFont(recipe);
			// 위에서 생성한 폰트를 추가
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
