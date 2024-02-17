CREATE TABLE IF NOT EXISTS INVESTORS (
  Investor_ID bigint(10) NOT NULL,
  Investor_Name varchar(50) NOT NULL,
  Investor_Address varchar(50) NOT NULL,
  Investor_Phone varchar(50) NOT NULL,
  Investor_Password varchar(50) NOT NULL,
  Date_Of_Birth varchar(50) NOT NULL,
  Primary key (Investor_ID));

CREATE TABLE IF NOT EXISTS PRODUCTS (
    Product_ID bigint(10) NOT NULL,
    Investor_ID bigint(10) NOT NULL,
    Product_Type varchar(255) NOT NULL,
    Product_Name varchar(255) NOT NULL,
    Product_Balance varchar(255) NOT NULL,
    PRIMARY KEY (Product_ID),
    FOREIGN KEY (Investor_ID) REFERENCES INVESTORS(Investor_ID)
);
CREATE TABLE IF NOT EXISTS WITHDRAWALNOTICE (
  Withdrawal_ID bigint(10) NOT NULL,
  Product_ID bigint(10) NOT NULL,
  Withdrawal_Amount decimal(9,2) NOT NULL,
  Product_Balance decimal(9,2) NOT NULL,
  Withdrawal_Date date NOT NULL,
  PRIMARY KEY (Withdrawal_ID),
  FOREIGN KEY (Product_ID) REFERENCES PRODUCTS(Product_ID)
);

INSERT INTO INVESTORS (Investor_ID,Investor_Name,Investor_Address,Investor_Phone,Investor_Password,Date_Of_Birth) VALUES (1,'Vinte','3 Nevada Parkway,Syracuse,NY','315-252-7305','123','1956-12-24');
INSERT INTO INVESTORS (Investor_ID, Investor_Name, Investor_Address, Investor_Phone, Investor_Password, Date_Of_Birth) VALUES (2,'Myworks','34267 Glendale Parkway,Huntington,WV','304-659-1170','321','1990-01-30');
INSERT INTO INVESTORS (Investor_ID, Investor_Name, Investor_Address, Investor_Phone, Investor_Password, Date_Of_Birth) VALUES (3,'Yadel','096 Pawling Parkway,San Francisco,CA','415-144-6037','456','1954-06-09');
INSERT INTO INVESTORS (Investor_ID, Investor_Name, Investor_Address, Investor_Phone, Investor_Password, Date_Of_Birth) VALUES (4,'Kwideo','81674 Westerfield Circle,Waco,TX','254-750-0784','654','1958-12-05');
INSERT INTO INVESTORS (Investor_ID, Investor_Name, Investor_Address, Investor_Phone, Investor_Password, Date_Of_Birth) VALUES (5,'Topiclounge','0863 Farmco Road,Portland,OR','971-888-9129','789','2000-07-26');

INSERT INTO PRODUCTS (Investor_ID,Product_Type, Product_Name,Product_Balance) VALUES (4,'Retirement','nedbank',2023745.96);
INSERT INTO PRODUCTS (Investor_ID,Product_Type, Product_Name,Product_Balance) VALUES (1,'Savings','capitec',24308.38);
INSERT INTO PRODUCTS (Investor_ID,Product_Type, Product_Name,Product_Balance) VALUES (3,'Savings','fnb',58404.72);
INSERT INTO PRODUCTS (Investor_ID,Product_Type, Product_Name,Product_Balance) VALUES (3,'Savings','fnb',30594.55);
INSERT INTO PRODUCTS (Investor_ID,Product_Type, Product_Name,Product_Balance) VALUES (4,'Savings','nedbank',73802.36);
INSERT INTO PRODUCTS (Investor_ID,Product_Type, Product_Name,Product_Balance) VALUES (1,'Savings','capitec',47739.09);
INSERT INTO PRODUCTS (Investor_ID,Product_Type, Product_Name,Product_Balance) VALUES (3,'Retirement','fnb',1623345.06);
INSERT INTO PRODUCTS (Investor_ID,Product_Type, Product_Name,Product_Balance) VALUES (1,'Retirement','capitec',423839.73);



