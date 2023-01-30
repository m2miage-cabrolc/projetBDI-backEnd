set transaction isolation level serializable;

CREATE TRIGGER tr_Presentation_StockLogique
    BEFORE UPDATE ON Presentation
    FOR EACH ROW
BEGIN
    IF NEW.StockLogique < 0 THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Le stock logique ne peut pas être inférieur à 0';
END IF;
END;


CREATE TRIGGER tr_Presentation_StockPhysique
    BEFORE UPDATE ON Presentation
    FOR EACH ROW
BEGIN
    IF NEW.StockPhysique < 0 THEN
        SIGNAL SQLSTATE '46000' SET MESSAGE_TEXT = 'Le stock physique ne peut pas être inférieur à 0';
END IF;
END;

CREATE TRIGGER tr_Presentation_StockPhysiqueInfStockLogique
    BEFORE UPDATE ON Presentation
    FOR EACH ROW
BEGIN
    IF NEW.StockPhysique < new.StockLogique THEN
        SIGNAL SQLSTATE '47000' SET MESSAGE_TEXT = 'Le stock logique ne peut pas être supérieur au stock physique';
END IF;
END;