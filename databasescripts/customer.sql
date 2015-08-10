Create Table: CREATE TABLE `customer` (
  `customerId` int(11) NOT NULL AUTO_INCREMENT,
  `customerCode` varchar(45) NOT NULL,
  `customerName` varchar(45) NOT NULL,
  `phoneNo` varchar(45) NOT NULL,
  `department` varchar(45) NOT NULL,
  PRIMARY KEY (`customerId`)
  )