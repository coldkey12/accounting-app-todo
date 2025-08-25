ALTER TABLE transactions
    DROP COLUMN quantity;

ALTER TABLE transactions
    ADD quantity INTEGER NOT NULL;