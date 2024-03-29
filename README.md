# :blue_book: JAVA / MyBatis / MariaDB - Address book CRUD

* JAVA / MyBatis / MariaDB - Address book CRUD
* 주소록 저장 프로그램
<br>

## 🔎 INDEX
1. [프로젝트 소개](#-프로젝트-소개)
2. [프로그램 구현 방식](#-프로그램-구현-방식)
3. [개발 환경](#-개발-환경)
     - [MariaDB](#-MariaDB)
     - [Java](#-Java)
     - [MyBatis](#-MyBatis)
4. [작성 시 신경 쓴 부분](#-작성-시-신경-쓴-부분)
5. [구현 화면](#-구현-화면)
6. [파일 구조](#-파일-구조)
7. [회고](#-회고)

<br>
<br>

## 🔎 프로젝트 소개
* MyBatis 기반 JAVA CLI 프로그램으로 주소록을 CRUD 할 수 있는 프로그램
<br>

## 🔎 프로그램 구현 방식
* `Java` 클래스 (주로 `DAO`)에서 `MyBatis`와 상호 작용하고, 필요한 `SQL` 쿼리를 정의하거나 호출한다.
* `MyBatis`는 이 `SQL` 쿼리를 `DB`에 전달하고 실행한다. `DB`에서 검색, 삽입, 수정 및 삭제 작업을 수행한다. (`CRUD`)
* `MyBatis`는 `DB`에서 반환된 결과를 `Java` 객체로 매핑하고, `Java` 코드로 다루기 쉬운 형태로 반환한다.
* `Java` 코드에서는 데이터 모델과 비즈니스 로직을 사용하여 애플리케이션의 주요 기능을 구현한다.
* 이런 식으로 `Java`, `MariaDB`, 그리고 `MyBatis`가 함께 작동하여 주소록 애플리케이션을 완성한다.
<br>

## 🔎 개발 환경 

### ✏️ MariaDB
`MariaDB`은 관계형 데이터베이스 관리 시스템(`RDBMS`)으로, 데이터 저장 및 관리 역할을 수행한다. <br>주소록 프로그램에서의 주요 역할은 다음과 같다.
* 데이터 저장: 주소록 애플리케이션의 정보를 효율적으로 저장한다. 데이터는 테이블 형태로 구조화되고 `SQL` 쿼리를 사용하여 관리된다.
* 데이터 검색: `MyBatis`와 함께 `DB`에서 필요한 정보를 검색하고, 결과를 `Java` 객체로 반환한다.
* 데이터 보관: 데이터는 지속적으로 보관되며, 향후에도 액세스 가능하다.

### ✏️ Java
`Java`는 주소록 프로그램의 핵심 언어로 사용되며, 주요 기능은 다음과 같다.
* 비즈니스 로직: 주소록 애플리케이션의 주요 기능 및 동작을 구현한다.
* 데이터 모델: `DB`의 레코드를 `Java` 객체로 매핑하고, `Java` 클래스를 통해 데이터를 다룬다. 이 예제에서는 `Contact` 클래스를 사용하여 주소록 항목을 나타낸다.
* 데이터 액세스: `MyBatis`를 사용하여 데이터베이스와 상호 작용한다. 데이터를 `DB`에 저장, 검색, 수정, 및 삭제한다. (`CRUD`)

### ✏️ MyBatis
`MyBatis`는 `DB`와 `Java` 객체 사이의 매핑 및 상호 작용을 관리한다. 주요 역할은 다음과 같다.
* `ORM` (객체-관계 매핑): `MyBatis`는 데이터베이스 레코드를 `Java` 객체에 매핑하고, 이 객체를 데이터베이스 레코드로 돌려주는 역할을 한다. 이것을 통해 `Java` 코드에서 `SQL`을 직접 작성하지 않아도 된다.
* `DB` 연결 관리: `MyBatis`는 데이터베이스 연결 및 세션 관리를 담당한다. `DB` 커넥션풀 및 세션 관리를 통해 애플리케이션의 성능을 향상시키고, 리소스 유출을 방지한다.
* `SQL` 쿼리 정의: `MyBatis`는 `SQL` 쿼리를 `XML` 또는 애너테이션을 통해 정의하고, 이를 `DB`에 보내고 결과를 반환하는 역할을 한다.
<br>

  
## 🔎 작성 시 신경 쓴 부분
* `Java`, `MariaDB` 및 `MyBatis`를 사용하여 주소록 애플리케이션을 생성하려면 `DB` 설정, `MyBatis` 구성, 데이터 액세스를 위한 `Java` 클래스 생성 및 애플리케이션 구축을 포함한 여러 단계가 필요한데, 각 단계에 맞게 설정하기 위해 신경을 썼다.
* 위의 단계를 순차적으로 진행하여 최종 구현이 되는지 고려하였다.
  
<br>  

## 🔎 구현 화면
* Read : list 표시<br>

![image](https://github.com/Eumnya415/PRJ_02_DB/assets/145963611/d38eedb4-ea95-4317-bd8f-16aaede21840)

* Create : 주소록 추가하기<br>

![image](https://github.com/Eumnya415/PRJ_02_DB/assets/145963611/98ae5f13-ba4a-4249-99aa-7e1aadde2269)
<br>

## 🔎 파일 구조
<details><summary>파일 구조 보기</summary>
📦PRJ_02_DB-main <br>
 ┣ 📂sql <br>
 ┃ ┗ 📜t_address.sql <br>
 ┣ 📂src <br>
 ┃ ┣ 📜Addr.java <br>
 ┃ ┣ 📜AddrApp.java <br>
 ┃ ┣ 📜AddrMapper.java <br>
 ┃ ┣ 📜AddrMapper.xml <br>
 ┃ ┣ 📜DBUtil.java <br>
 ┃ ┣ 📜mybatis-config.xml <br>
 ┃ ┗ 📜WebView.java <br>
 ┣ 📜Addr.class <br>
 ┣ 📜AddrApp.class <br>
 ┣ 📜AddrMapper.class <br>
 ┣ 📜DBUtil.class <br>
 ┣ 📜Main.class <br>
 ┣ 📜mariadb-java-client-3.2.0.jar <br>
 ┣ 📜mybatis-3.5.11.jar <br>
 ┣ 📜README.md <br>
 ┗ 📜WebView.class <br>
</details>
<br>

## 🔎 회고
* 모두 아직 익숙치 않지만, `MyBatis`는 처음이라 더 힘들었다. 툴에 더 익숙해져야 겠다고 생각했다. 특히 `Java`만 다루는 것이 아니라, 각 스택에 맞게끔 운용을 해야 했다. 스택에 대한 개념을 알고, 각 스택이 어떻게 작동하는지 구조도를 파악해야 겠다.
<br>




