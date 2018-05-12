//***** 朝潮型n番艦の艦名を調べるプログラム *****
import java.util.*;

public class AsashioName {
    public static void main(String[] args) {
        // Here your code !
        Scanner scan = new Scanner(System.in);

        String [] str = { "","朝潮","大潮","満潮","荒潮","山雲","夏雲","朝雲","嶺雲","霞","霰"};
		ArrayList<String> kanList = new ArrayList<String>(Arrays.asList(str));
        //System.out.print(kanList.size());

        int kanNo;
        String kanStr;
        while(true) {
            System.out.print("朝潮型何番艦の名前を調べますか？>");
            try {
	            kanNo = scan.nextInt();
	            if (kanNo <= 0) break;
	            if (kanNo > kanList.size()-1) {
	                System.out.println(">>朝潮型"+kanNo+"番艦は存在しません。");
	            } else {
		            System.out.println(">>朝潮型"+kanNo+"番艦は「"+kanList.get(kanNo)+"」です。");
	            }
            } catch (InputMismatchException e) {
                System.out.println(">>不正な入力です。");
                scan.next();	//バッファのクリア
			}
        }
    System.out.print("終了します。");
    }
}
