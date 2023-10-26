/*이 코드는 주소록 항목을 저장하고 다룰 수 있는 클래스이다.
클래스 내에는 주요한 정보를 나타내는 속성 (ID, 이름, 주소, 전화번호)과
해당 속성을 다루기 위한 생성자, getter 및 setter 메서드가 포함되어 있다.
이 클래스는 주소록 항목을 표현하고 관리하기 위한 프로그램에서 사용된다. */

public class Addr {
	private int id;  //주소록 항목의 고유 ID
	private String name;
	private String address;
	private String phone;

	//생성자 : 모든 속성을 초기화하는 생성자
	public Addr(int id, String name, String address, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	// 생성자: ID 없이 이름, 주소, 전화번호만 초기화하는 생성자
	public Addr(String name, String address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public int getId() { //ID 반환
		return id;
	}

	public void setId(int id) { //ID 설정
		this.id = id;
	}

	public String getName() { //이름 반환
		return name;
	}

	public void setName(String name) {  //이름 설정
		this.name = name;
	}
	public String getAddress() {  //주소 반환
		return address;
	}
	public void setAddress(String address) { //주소 설정
		this.address = address;
	}
	public String getPhone() { //전화번호 반환
		return phone;
	}
	public void setPhone(String phone) { //전화번호 설정
		this.phone = phone;
	}	
}