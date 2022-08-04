drop table if exists d_dog;
create table d_dog
(
    id        bigint                   not null,
    name      varchar(255)             null,
    create_at timestamp with time zone not null,
    update_at timestamp with time zone not null,
    primary key (id)
);