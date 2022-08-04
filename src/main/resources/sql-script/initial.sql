drop table if exists p_project;
create table p_project
(
    id        bigint                   not null,
    name      varchar(255)             null,
    create_at timestamp with time zone not null,
    update_at timestamp with time zone not null,
    primary key (id)
);