set transaction isolation level serializable;
CREATE TRIGGER tr_Presentation_StokLogique
    BEFORE UPDATE ON Presentation
    FOR EACH ROW
BEGIN
    IF NEW.StokLogique < 0 THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Le stock logique ne peut pas être inférieur à 0';
END IF;
END;