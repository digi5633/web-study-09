CREATE TABLE MEMBER (
	name varchar2(10),
	userid varchar2(10),
	pwd varchar2(10),
	email varchar2(20),
	phone char(13),
	admin number(1) DEFAULT 0, -- 0: 사용자, 1: 관리자
	joinDate DATE DEFAULT sysdate,
	PRIMARY key(userid)
);

DROP TABLE "MEMBER";

SELECT * FROM MEMBER;

SELECT *
  FROM USER_TABLES
 WHERE TABLE_NAME = 'MEMBER';
 
-- 접속한 계정의 테이블별 컬럼 조회 
SELECT *
  FROM USER_TAB_COLUMNS
 WHERE TABLE_NAME in('MEMBER');

-- 접속한 계정의 테이블별 제약조건 검색
SELECT *
  FROM USER_CONSTRAINTS
 WHERE TABLE_NAME in('MEMBER');