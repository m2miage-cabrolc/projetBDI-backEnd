set transaction isolation level READ COMMITTED;
DROP trigger tr_Presentation_StockPhysique;
DROP trigger tr_Pres_StockPhyInfStockLo;



CREATE TRIGGER tr_Presentation_StockPhysique
    BEFORE UPDATE ON Pres
    FOR EACH ROW
BEGIN
    IF NEW.STOCK_PHYSIQUE < 0 THEN
        RAISE_APPLICATION_ERROR(-20000, 'Le stock physique ne peut pas être inférieur à 0');
    END IF;
END;

CREATE TRIGGER tr_Pres_StockPhyInfStockLo
    BEFORE UPDATE ON Pres
    FOR EACH ROW
BEGIN
    IF NEW.STOCK_PHYSIQUE < new.STOCK_LOGIQUE THEN
        RAISE_APPLICATION_ERROR(-45000, 'Le stock logique ne peut pas être supérieur au stock physique');
    END IF;
END;