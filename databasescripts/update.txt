USE `customers`;
DELIMITER $$

CREATE TRIGGER `customer_AINS` AFTER INSERT ON customer FOR EACH ROW
-- Edit trigger body code below this line. Do not edit lines above this one
BEGIN
DECLARE message varchar(25);
DECLARE logdate datetime;
SET message=CONCAT('Cusomer id',NEW.customerId,'inserted');
SET logdate=NOW();

INSERT INTO log(message,logdate)
VALUES(message,logdate);


END
