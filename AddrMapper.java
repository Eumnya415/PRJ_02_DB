/* 주소록 관리에 필요한 메서드들을 선언하고 있다.
AddrMapper 인터페이스는 주소록 관리 시 DB와의 상호작용을 추상화하는 역할을 한다.
이 인터페이스를 구현하는 클래스는 주소록 데이터를 어떤 방식으로 저장하고 관리하는지에 따라 다를 수 있는데,
이를 아래 각 메서드에서 DB 접근 및 조작 로직을 구현하고 있다.
이 인터페이스를 사용하면 다른 주소록 관리 클래스에서도 동일한 메서드를 사용하여 주소록 관리를 할 수 있다. */

import java.util.ArrayList;

public interface AddrMapper {
	
	public ArrayList<Addr> getAddresses();
	//주소록에 있는 모든 항목을 조회하는 메서드.
	//주소록 데이터를 객체의 목록인 ArrayList<Addr>로 반환해야 한다.

	public void insertAddress(Addr addr);
	//주소록에 새 항목을 추가하는 메서드.

	public void updateAddress(Addr addr);
	//주소록의 항목을 수정하는 메서드
	public void deleteAddress(int id);
	//주소록 항목 삭제하는 메서드
}
