CREATE TABLE IF NOT EXISTS Users (
    id          VARCHAR(100)    PRIMARY KEY,
    login       VARCHAR(100)    NOT NULL,
    email       VARCHAR(100)    NOT NULL,
    password    VARCHAR(100)    NOT NULL,
    name        VARCHAR(100)    NOT NULL,
    surname     VARCHAR(100)    NOT NULL
);

CREATE TABLE IF NOT EXISTS Books (
    id          VARCHAR(100)    PRIMARY KEY,
    title       VARCHAR(100)    NOT NULL,
    author      VARCHAR(100)    NOT NULL,
    year        VARCHAR(100)    NULL,
    publisher   VARCHAR(100)    NULL,
    ownerId     VARCHAR(100)    NOT NULL,
    description VARCHAR(100)    NULL,
    status      VARCHAR(100)    NOT NULL,
    url         VARCHAR(100)    NULL
);

CREATE TABLE IF NOT EXISTS Orders (
    id          VARCHAR(100)    PRIMARY KEY,
    userId      VARCHAR(100)    NOT NULL,
    bookId      VARCHAR(100)    NOT NULL,
    status      VARCHAR(100)    NOT NULL,
    orderDate   VARCHAR(100)    NOT NULL,
    startDate   VARCHAR(100)    NULL,
    endDate     VARCHAR(100)    NULL,
    remarks     VARCHAR(100)    NULL
)