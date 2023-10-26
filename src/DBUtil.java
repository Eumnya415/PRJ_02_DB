//DB 연동을 위한 MyBatis 프레임워크 사용
//주소관리 프로그램을 위한 DB 작업을 수행하는 클래스인 DBUtil 구현

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.ArrayList;

public class DBUtil {

	// DB 연결 정보
	String url = "jdbc:mariadb://127.0.0.1:3306/addr_prj";
	String user = "root";
	String pass = "12345";
	SqlSessionFactory sqlSessionFactory;

	// MyBatis 설정 초기화 메서드
	public void init() {
		try {
			String resource = "mybatis-config.xml"; // MyBatis 설정 파일
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		} catch (Exception e) {
			System.out.println("MyBatis 설정 파일 가져오는 중 문제 발생!!");
			e.printStackTrace();
		}
	}
	
	public ArrayList<Addr> getAddresses() { // 주소록을 가져오는 메서드
		SqlSession session = sqlSessionFactory.openSession();
		AddrMapper mapper = session.getMapper(AddrMapper.class);
		ArrayList<Addr> addrList = mapper.getAddresses();
		
		return addrList;
	}

	// 주소를 추가하는 메서드
	public void insertAddress(String name, String address, String phone) {
		SqlSession session = sqlSessionFactory.openSession();
		AddrMapper mapper = session.getMapper(AddrMapper.class);
		Addr addr = new Addr(name, address, phone);
		mapper.insertAddress(addr);
		
		session.commit(); // update, delete, insert
	}

	// 주소를 수정하는 메서드
	public void updateAddress(int id, String name, String address, String phone) {
		SqlSession session = sqlSessionFactory.openSession();
		AddrMapper mapper = session.getMapper(AddrMapper.class);
		Addr addr = new Addr(id, name, address, phone);
		mapper.updateAddress(addr);
		
		session.commit(); // update, delete, insert
	}

	// 주소를 삭제하는 메서드
	public void deleteAddress(int id) {
		SqlSession session = sqlSessionFactory.openSession();
		AddrMapper mapper = session.getMapper(AddrMapper.class);
		mapper.deleteAddress(id);
		
		session.commit(); // update, delete, insert
	}
	
}









