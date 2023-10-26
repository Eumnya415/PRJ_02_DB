/*이 코드는 주소록 관리 프로그램을 구현한 것이다.
사용자는 명령어를 입력하여 주소록 항목을 추가, 수정, 조회 및 삭제할 수 있다.
DBUtil 클래스를 사용하여 DB와 상호작용하고, WebView 클래스를 사용하여 주소록 항목을 화면에 출력한다.
사용자가 "exit" 명령어를 입력하면 프로그램이 종료된다.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class AddrApp {

  public static void main(String[] args) {
		
		DBUtil db = new DBUtil();
		Scanner scan = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 객체 생성
		db.init(); // DB 초기화

		while(true) {
			System.out.print("명령어를 입력해주세요 : ");
			String cmd = scan.nextLine();
			
			if(cmd.equals("exit")) {
				break; // "exit" 명령어가 입력되면 프로그램 종료
				
			} else if(cmd.equals("add")) { // "add" 명령어: 주소록 항목 추가
				System.out.println("========= 주소록 등록 =========");
				System.out.print("이름 : ");
				String name = scan.nextLine();
				System.out.print("주소 : ");
				String address = scan.nextLine();
				System.out.print("전화번호 : ");
				String phone = scan.nextLine();
				
				db.insertAddress(name, address, phone); // DBUtil을 사용하여 주소록 항목을 DB에 추가
				
				System.out.println("주소록 등록 완료.");
				System.out.println("============================");
				
			} else if(cmd.equals("list")) { // "list" 명령어: 주소록 목록 조회
				
				ArrayList<Addr> addrList = db.getAddresses(); // WebView 클래스를 사용하여 주소록 목록을 화면에 출력
				WebView wv = new WebView();
				wv.printAddr(addrList);
				
				
			} else if(cmd.equals("update")) { // "update" 명령어: 주소록 항목 수정
				System.out.print("몇번 주소록을 수정하시겠습니까 : ");
				int id = Integer.parseInt(scan.nextLine()); 
				System.out.println("========= 주소록 수정 =========");
				System.out.print("이름 : ");
				String name = scan.nextLine();
				System.out.print("주소 : ");
				String address = scan.nextLine();
				System.out.print("전화번호 : ");
				String phone = scan.nextLine();
				
				db.updateAddress(id, name, address, phone); // DBUtil을 사용하여 주소록 항목을 DB에서 수정
				
				System.out.println("주소록 수정 완료.");
				System.out.println("============================");
				
			} else if(cmd.equals("delete")) { // "delete" 명령어: 주소록 항목 삭제
				System.out.print("몇번 주소록을 삭제하시겠습니까 : ");
				int id = Integer.parseInt(scan.nextLine());
				db.deleteAddress(id); // DBUtil을 사용하여 주소록 항목을 DB에서 삭제
				System.out.println(id + "번 주소록이 삭제되었습니다.");
				System.out.println("==============================");
			}
		}	
	}
}
