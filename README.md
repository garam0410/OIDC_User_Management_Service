# OIDC_User_Management_Service (사용자 관리 서비스)
심박수 기반 영화 순위 제공서비스 'Movie by Heart'의 사용자 관리서비스를 구성하는 레포지토리

## Controller
- 로그인(GET)  **/login**
  - parameter : userId, userPw
  
  <br>
  
- 회원가입(GET) **/register**
  - parameter : uname, userId, userPw, uAge, usex, userEmail, unumber
  
  <br>
  
- ID/PW 찾기(GET) **/findidpw**
  - parameter : uname, userEmail, unumber
  
  <br>

## Interface
- login() : 로그인을 위해 사용자 정보를 DB로부터 비교하기 위한 기능
- checkId() : 회원가입 과정에서 ID의 중복검사를 위한 기능
- register() : 회원가입을 위해, 회원 기입 정보를 DB에 Insert하기 위한 기능
- findIdPw() : 잃어버림 ID/PW를 찾기 위한 기능
