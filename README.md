# 스프링 배치 5

### BeforeEntity 테이블 데이터 등록 쿼리
```sql
INSERT INTO BeforeEntity (username) VALUES
('Alice Johnson'),
('Bob Smith'),
('Charlie Brown'),
('Diana Prince'),
('Edward Davis'),
('Fiona White'),
('George Harris'),
('Hannah Clark'),
('Ian Walker'),
('Jessica Lee'),
('Kevin Robinson'),
('Laura King'),
('Michael Scott'),
('Nina Evans'),
('Oscar Wright'),
('Pamela Adams'),
('Quincy Green'),
('Rachel Baker'),
('Sam Harris'),
('Tina Nelson'),
('Ursula Moore'),
('Victor Young'),
('Wendy Thompson'),
('Xander Garcia'),
('Yara Martinez'),
('Zachary Lewis'),
('Amelia Jones'),
('Benjamin Wilson'),
('Clara Taylor'),
('David Anderson'),
('Emma Martinez'),
('Frank Hernandez'),
('Grace Robinson'),
('Henry Walker'),
('Ivy Young'),
('Jack Scott'),
('Katherine Lee'),
('Liam Brown'),
('Mia Harris'),
('Noah King'),
('Olivia Adams'),
('Paul Nelson'),
('Quinn Green'),
('Riley White'),
('Sophia Davis'),
('Thomas Clark'),
('Uma Evans'),
('Vera Robinson'),
('William Wright'),
('Xena Baker'),
('Yusuf Harris'),
('Zoe Martinez'),
('Aaron Scott'),
('Bella Young'),
('Carlos Robinson'),
('Daisy Thompson'),
('Ethan Moore'),
('Faith Lewis'),
('Gina Clark'),
('Hank Green'),
('Iris Martinez'),
('James Taylor'),
('Kelly Adams'),
('Lucas King'),
('Maggie White'),
('Nathan Wilson'),
('Opal Harris'),
('Peter Scott'),
('Queenie Davis'),
('Ryan Baker'),
('Sandra Green'),
('Travis Johnson'),
('Ulysses Clark'),
('Vivian Martinez'),
('Walter White'),
('Xander Robinson'),
('Yvette King'),
('Zach Smith'),
('Allison Davis'),
('Bradley Moore'),
('Chloe Harris'),
('Daniel Green'),
('Emily Taylor'),
('Freddie Brown'),
('Gabriella Wilson'),
('Henry Scott'),
('Isabella White'),
('Jake Adams'),
('Kaitlyn Robinson'),
('Leo Clark'),
('Madison King'),
('Nina Brown'),
('Owen Martinez'),
('Peyton Harris'),
('Quinton Moore'),
('Rebecca White'),
('Steve Wilson'),
('Tara Scott'),
('Ursula Green'),
('Victor Harris'),
('Wendy Adams'),
('Xander King'),
('Yvonne Davis'),
('Zachary White');
```


### WinEntity 테이블 데이터 등록 쿼리
```sql
INSERT INTO WinEntity (id, reward, username, win) VALUES
  (1, FALSE, 'xxxjjhhh', 10),
  (2, FALSE, 'devyummi', 1),
  (3, FALSE, 'jihun', 3),
  (4, FALSE, 'user4', 20),
  (5, FALSE, 'user5', 20),
  (6, FALSE, 'user6', 7),
  (7, FALSE, 'user7', 13),
  (8, FALSE, 'user8', 11),
  (9, FALSE, 'user9', 14),
  (10, FALSE, 'user10', 0),
  (11, FALSE, 'user11', 5),
  (12, FALSE, 'user12', 6),
  (13, FALSE, 'user13', 13),
  (14, FALSE, 'user14', 17),
  (15, FALSE, 'user15', 8),
  (16, FALSE, 'user16', 3),
  (17, FALSE, 'user17', 9),
  (18, FALSE, 'user18', 11),
  (19, FALSE, 'user19', 13),
  (20, FALSE, 'user20', 19),
  (21, FALSE, 'user21', 5),
  (22, FALSE, 'user22', 3),
  (23, FALSE, 'user23', 1),
  (24, FALSE, 'user24', 0),
  (25, FALSE, 'user25', 0),
  (26, FALSE, 'user26', 1),
  (27, FALSE, 'user27', 3),
  (28, FALSE, 'user28', 4),
  (29, FALSE, 'user29', 12),
  (30, FALSE, 'user30', 11),
  (31, FALSE, 'user31', 10),
  (32, FALSE, 'user32', 20),
  (33, FALSE, 'user33', 2),
  (34, FALSE, 'user34', 5),
  (35, FALSE, 'user35', 1),
  (36, FALSE, 'user36', 16),
  (37, FALSE, 'user37', 7),
  (38, FALSE, 'user38', 6),
  (39, FALSE, 'user39', 10),
  (40, FALSE, 'user40', 20),
  (41, FALSE, 'user41', 19),
  (42, FALSE, 'user42', 2),
  (43, FALSE, 'user43', 3),
  (44, FALSE, 'user44', 4),
  (45, FALSE, 'user45', 4),
  (46, FALSE, 'user46', 14),
  (47, FALSE, 'user47', 2),
  (48, FALSE, 'user48', 0),
  (49, FALSE, 'user49', 19),
  (50, FALSE, 'user50', 13),
  (51, FALSE, 'user51', 0),
  (52, FALSE, 'user52', 12),
  (53, FALSE, 'user53', 19),
  (54, FALSE, 'user54', 7),
  (55, FALSE, 'user55', 9),
  (56, FALSE, 'user56', 7),
  (57, FALSE, 'user57', 2),
  (58, FALSE, 'user58', 20),
  (59, FALSE, 'user59', 19),
  (60, FALSE, 'user60', 18),
  (61, FALSE, 'user61', 12),
  (62, FALSE, 'user62', 11),
  (63, FALSE, 'user63', 1),
  (64, FALSE, 'user64', 0),
  (65, FALSE, 'user65', 21),
  (66, FALSE, 'user66', 4),
  (67, FALSE, 'user67', 5),
  (68, FALSE, 'user68', 8),
  (69, FALSE, 'user69', 2),
  (70, FALSE, 'user70', 3),
  (71, FALSE, 'user71', 11),
  (72, FALSE, 'user72', 11),
  (73, FALSE, 'user73', 11),
  (74, FALSE, 'user74', 7),
  (75, FALSE, 'user75', 18),
  (76, FALSE, 'user76', 19),
  (77, FALSE, 'user77', 12),
  (78, FALSE, 'user78', 3),
  (79, FALSE, 'user79', 7),
  (80, FALSE, 'user80', 7),
  (81, FALSE, 'user81', 8),
  (82, FALSE, 'user82', 5),
  (83, FALSE, 'user83', 5),
  (84, FALSE, 'user84', 2),
  (85, FALSE, 'user85', 1),
  (86, FALSE, 'user86', 3),
  (87, FALSE, 'user87', 8),
  (88, FALSE, 'user88', 9),
  (89, FALSE, 'user89', 12),
  (90, FALSE, 'user90', 11),
  (91, FALSE, 'user91', 1),
  (92, FALSE, 'user92', 3),
  (93, FALSE, 'user93', 2),
  (94, FALSE, 'user94', 19),
  (95, FALSE, 'user95', 20),
  (96, FALSE, 'user96', 23),
  (97, FALSE, 'user97', 1),
  (98, FALSE, 'user98', 0),
  (99, FALSE, 'user99', 3),
  (100, FALSE, 'batchhh100', 8);
```
### Job 이름 설정
```properties
spring.batch.job.name=${job.name:NONE}

```

```-Djob.name={job_name}```

## 참고
- 참고1: [스프링 배치 5 Youtube 강좌](https://www.youtube.com/watch?v=MNzPsOQ3NJk&list=PLJkjrxxiBSFCaxkvfuZaK5FzqQWJwmTfR&index=1)
- 참고2: [스프링 배치 5 블로그](https://www.devyummi.com/page?id=66951d4d823bbb8bc327ba0e)
- 참고3: [ChainedTransactionManager 데이터소스 트랜잭션 연결하기](https://taes-k.github.io/2020/06/09/chained-transaction-manager/)
- 참고4: [JobParameter 받기](https://jojoldu.tistory.com/490)
- 참고5: [Spring JDBC batch insert](https://www.baeldung.com/spring-jdbc-batch-inserts)
