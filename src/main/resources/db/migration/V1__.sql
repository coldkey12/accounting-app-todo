CREATE TABLE transactions
(
    id               UUID                        NOT NULL,
    user_id          UUID                        NOT NULL,
    product_id       UUID                        NOT NULL,
    transaction_type VARCHAR(255),
    sum              DOUBLE PRECISION            NOT NULL,
    quantity         DOUBLE PRECISION            NOT NULL,
    price_per_piece  DOUBLE PRECISION            NOT NULL,
    created_at       TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    updated_at       TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    CONSTRAINT pk_transactions PRIMARY KEY (id)
);