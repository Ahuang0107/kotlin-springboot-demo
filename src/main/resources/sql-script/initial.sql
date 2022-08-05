CREATE TYPE project_stage AS ENUM (
    'NOT_STARTED',
    'DRAFT',
    'RMA',
    'PASSED'
    );

drop table if exists p_project;
create table p_project
(
    id           bigint                   not null,
    project_name varchar(255)             not null,
    engage_code  varchar(255)             not null,
    total_fee    decimal(12, 2)           not null default 0,
    stage        varchar(32)              not null,
    closed       bool                     not null default false,
    create_at    timestamp with time zone not null,
    update_at    timestamp with time zone not null,
    primary key (id)
);

drop table if exists p_project_bak;
create table p_project_bak
(
    id             bigint                   not null,
    rel_project_id bigint                   not null,
    project_name   varchar(255)             not null,
    engage_code    varchar(255)             not null,
    total_fee      decimal(12, 2)           not null default 0,
    stage          varchar(32)              not null,
    closed         bool                     not null default false,
    create_at      timestamp with time zone not null,
    update_at      timestamp with time zone not null,
    primary key (id)
);