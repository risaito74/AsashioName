//***** �����^n�Ԋ͖͂̊��𒲂ׂ�v���O���� *****
import java.util.*;

public class AsashioName {
    public static void main(String[] args) {
        // Here your code !
        Scanner scan = new Scanner(System.in);

        String [] str = { "","����","�咪","����","�r��","�R�_","�ĉ_","���_","��_","��","��"};
		ArrayList<String> kanList = new ArrayList<String>(Arrays.asList(str));
        //System.out.print(kanList.size());

        int kanNo;
        String kanStr;
        while(true) {
            System.out.print("�����^���Ԋ̖͂��O�𒲂ׂ܂����H>");
            try {
	            kanNo = scan.nextInt();
	            if (kanNo <= 0) break;
	            if (kanNo > kanList.size()-1) {
	                System.out.println(">>�����^"+kanNo+"�Ԋ͂͑��݂��܂���B");
	            } else {
		            System.out.println(">>�����^"+kanNo+"�Ԋ͂́u"+kanList.get(kanNo)+"�v�ł��B");
	            }
            } catch (InputMismatchException e) {
                System.out.println(">>�s���ȓ��͂ł��B");
                scan.next();	//�o�b�t�@�̃N���A
			}
        }
    System.out.print("�I�����܂��B");
    }
}
