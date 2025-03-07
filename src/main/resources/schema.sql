CREATE TABLE products (
    id VARCHAR(10) PRIMARY KEY,
    name VARCHAR(20) NOT NULL,
    description VARCHAR(200),
    price DOUBLE PRECISION NOT NULL,
    model VARCHAR(10)
);
