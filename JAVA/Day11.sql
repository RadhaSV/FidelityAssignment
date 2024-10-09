CREATE TABLE Customers (
  CustomerID INT PRIMARY KEY,
  CompanyName VARCHAR(100),
  ContactName VARCHAR(100),
  ContactTitle VARCHAR(100),
  Address VARCHAR(100),
  City VARCHAR(100),
  Region VARCHAR(100),
  PostalCode VARCHAR(100),
  Country VARCHAR(100),
  Phone VARCHAR(10),
  Fax VARCHAR(10)
);
SELECT *from Customers;


CREATE TABLE Shippers (
  ShipperID INT PRIMARY KEY,
  CompanyName VARCHAR(100) UNIQUE,
  Phone VARCHAR(10),
  Fax VARCHAR(10)
);
SELECT *from Shippers;

CREATE TABLE Orders (
  OrderID INT PRIMARY KEY,
  CustomerID INT,
  EmployeeID INT,
  ShipName VARCHAR(100),
  ShipAddress VARCHAR(100),
  ShipCity VARCHAR(100),
  ShipRegion VARCHAR(100),
  ShipPostalCode VARCHAR(100),
  ShipCountry VARCHAR(100),
  ShipVia INT,
  OrderDate DATE,
  RequiredDate DATE,
  ShippedDate DATE,
  Freight DECIMAL(10, 2),
  FOREIGN KEY (CustomerID) REFERENCES tblCustomers(CustomerID)
);
SELECT *from Orders;

CREATE TABLE OrderDetails (
  OrderID INT,
  ProductID INT,
  UnitPrice DECIMAL(10, 2),
  Quantity INT CHECK (Quantity > 0),
  Discount DECIMAL(10, 2),
  PRIMARY KEY (OrderID, ProductID),
  FOREIGN KEY (OrderID) REFERENCES tblOrders(OrderID)
);
SELECT *from OrderDetails;

CREATE TABLE Products (
  ProductID INT PRIMARY KEY,
  SupplierID INT,
  CategoryID INT,
  ProductName VARCHAR(100),
  UnitPrice DECIMAL(10, 2),
  EnglishName VARCHAR(255),
  QuantityPerUnit VARCHAR(100),
  UnitsInStock INT,
  UnitsOnOrder INT,
  ReorderLevel INT,
  Discontinued BIT
);
SELECT *from Products;

CREATE TABLE Supplies (
  ShipCity VARCHAR(100),
  ShipRegion VARCHAR(100),
  ShipPostalCode VARCHAR(100),
  ShipCountry VARCHAR(100),
  ShipWa VARCHAR(100)
);
SELECT *from Supplies;

CREATE TABLE Supplier (
  SupplierID INT PRIMARY KEY,
  Name VARCHAR(100),
  Address VARCHAR(100),
  City VARCHAR(100),
  Province VARCHAR(100)
);
SELECT *from Supplier;

ALTER TABLE Orders
ADD CONSTRAINT CK_ShippedDate
CHECK(ShippedDate>OrderDate);
