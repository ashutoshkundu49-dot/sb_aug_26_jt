create table if not exists expenses(
    id int auto_increment primary key,
    title varchar(50) not null,
    category varchar(50) not null,
    price double not null,
    date date not null
);