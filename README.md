# Library Management

# Create Library Table and Inserting Values Into Table 
```sql
CREATE TABLE librarytable(book_id number primary key , bookname varchar(200) not null,author varchar(200) not null,book_publication varchar(200) not null, yearofPublication number, No_of_Copies number not       null,BOOK_SERIAL_NUMBER NUMBER AUTO GENERATED BY DEFAULT AS IDENTITY (START WITH 1000 INCREMENT BY 11),
BOOK_AVAILABLITY_STATUS VARCHAR(10) ,BOOK_BAY NUMBER VARCHAR(20),BOOK_SHELF VARCHAR(10));
  // INSERTING VALUES INTO TABLE 
insert into librarytable(bookname , author , book_publication ,yearofPublication, No_of_Copies) values ('Mobile Computing' , 'Vinay Kumar Singhal'  , 'K Nath and Sons' , 1987 , 10  );
insert into librarytable(bookname , author , book_publication ,yearofPublication, No_of_Copies)values ('Computer Networks' , 'Sharad Kumar Verma'  , 'Sun India Publication' , 2010 , 10  );
insert into librarytable(bookname , author , book_publication ,yearofPublication, No_of_Copies)values ( '.NET Framework and C#' , 'Sharad Kumar Verma',  'Sun India Publication' , 2002 , 10  );
insert into librarytable(bookname ,author,book_publication,yearofPublication,no_of_copies)values('Client Server Computing','Lalit Kumar','Sun India Publications',2012,20);
insert into librarytable(bookname , author , book_publication ,yearofPublication, no_of_copies)values ('Junior Level Books Introduction to Computer' , 'Amit Garg ' , 'Readers Zone ' , 2012 , 10  );

```
 Display Table 
```sql
SELECT * FROM LIBRARY TABLE 
```

# Library Table 
 | Book ID | Book Name |BOOK SERAIL NUMBER | Author | Book Publications | Year Of Publication | No Of Copies | BOOK AVAILABLITY STATUS | BOOK BAY NUMBER | BOOK SHELF NUMBER |
 |:------- |:----------|:-------|:------------------|:--------------------|:-------------|:----------------|:---------------------------|:---------------|:------------------|
 | 1000  |Junior Level Books Introduction to Computer| 3116 |	Amit Garg | Readers Zone|2011|20| YES | A1 | 2A |
 | 1001 |Publish News Letter| 3117 |Amit Garg|MCA Department MIET|2011|20| YES | B7 | 2B |
 | 1002 | Client Server Computing | 3118 |lalit kumar | Sun India | 1918 | 20 | YES | C7 | 3C |
 | 1003 |Mobile Computing | 3119 | Vinay Kumar | K Nath | 1987 | 20 | YES | D2 | 3D | 
 |1004  |Computer Networks| 3120 | Sharad Kumar | Sun India | 2010 | 20 | YES | E3 | 1E |
  
  
 
 
 
 
# CREATE ADMIN  TABLE 
 ```sql
 CREATE TABLE ADMIN_TABLE
 (
 ADMIN_ID NUMBER PRIMARY KEY ,
 ADMIN_NAME VARCHAR(100),
ADMIN_PASSWORD VARCHAR(200),
 ADMIN_NUMBER NUMBER 
 );
  ```
 # DISPLAY ADMIN TABLE 
  ``` sql
  SELECT * FROM USER_TABLE
   ```
  # ADMIN TABLE 
  | USER ID | USER NAME  | USER PASSWORD  | USER NUMBER  | 
  |:--------|:-----------|:---------------|:-------------|
 | 30001| NEVIL | Password@123 | 9876543219 | 
 | 30002 | Krishna | Password@123 | 8876543219 |
 | 30003 | Lingtan | Password@123  | 7654321890 | 
 | 30004 | Venkat  | Password@123  | 6543217890 |
 
 # CREATE LIBRARY MEMBER TABLE 
 ```sql
 CREATE TABLE MEMBER_TABLE(
 MEMBER_ID NUMBER,
 MEMBER_NAME VARCHAR(100),
 MEMBER_MOBILE_NUMBER NUMBER,
 MEMBER_JOINED_DATE DATE
 MEMBER_STATUS VARCHAR(20)
 )
 ```
 # DISPLAY MEMBER TABLE 
 
  | MEMBER ID | MEMBER NAME  | MEMBER NUMBER  | MEMBER JOINING DATE  | MEMBER STATUS |
  |:--------|:-----------|:---------------|:--------------|:-------------------|
 | 2000| MAGESH  | 9876543219 | 2021-07-01| ACTIVE |
 | 20001 | RAJA  | 8876543219 | 2021-06-28 | INACTIVE |
 | 20002 | MUTHU | 7654321890 | 2021-06-25 | ACTIVE |
 | 20003 | NARESH   | 6543217890 | 2021-07-12 | ACTIVE |
 
 # TRANSACTION TABLE  
 ```sql
 CREATE TABLE TRANSACTION_TABLE 
 (
 TRANSCATION_ID NUMBER,
 MEMBER_ID NUMBER,
 BOOK ID NUMBER,
 BOOK_NAME VARCHAR(100),
 BOOK_TAKEN_DATE DATE ,
 BOOK_RETURNED_DATE DATE,
 BOOK_DUE_DATE DATE
 BOOK_STATUS 
 )
 ```
 
# TRANSCATION DATE 
|TRANSCATION ID | MEMBER ID | BOOK ID | BOOK NAME | BOOK TAKEN DATE | BOOK DUE DATE | BOOK RETURNED DATE | BOOK STATUS |
|:--------------|:----------|:--------|:----------|:----------------|:--------------|:-------------------|:------------|
| 9000 | 2000 | 1001 | Publish News Letter | 12-07-2021 | 17-07-2021 | - | Not Returned |
| 9001 | 2001 | 1004 |  Computer Networks | 12-07-2021 | 17-07-2021 | - | Not Returned |
 
 
 
