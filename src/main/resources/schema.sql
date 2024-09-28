CREATE TABLE IF NOT EXISTS users (
    id           VARCHAR(36)     PRIMARY KEY,
    login        VARCHAR(100)    NOT NULL,
    email        VARCHAR(100)    NOT NULL,
    password     VARCHAR(100)    NOT NULL,
    name         VARCHAR(100)    NOT NULL,
    surname      VARCHAR(100)    NOT NULL
);

CREATE TABLE IF NOT EXISTS books (
    id           VARCHAR(36)    PRIMARY KEY,
    title        VARCHAR(100)    NOT NULL,
    author       VARCHAR(100)    NOT NULL,
    year         VARCHAR(100)    NULL,
    publisher    VARCHAR(100)    NULL,
    owner_id     VARCHAR(100)    NOT NULL,
    description  VARCHAR(100)    NULL,
    status       VARCHAR(100)    NOT NULL,
    url          VARCHAR(100)    NULL
);

CREATE TABLE IF NOT EXISTS orders (
    id           VARCHAR(36)    PRIMARY KEY,
    user_id      VARCHAR(100)    NOT NULL,
    book_id      VARCHAR(100)    NOT NULL,
    status       VARCHAR(100)    NOT NULL,
    order_date   VARCHAR(100)    NOT NULL,
    start_date   VARCHAR(100)    NULL,
    end_date     VARCHAR(100)    NULL,
    remarks      VARCHAR(100)    NULL
)