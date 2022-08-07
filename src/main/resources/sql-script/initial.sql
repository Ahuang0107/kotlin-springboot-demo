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
    finance_year int2                     not null,
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
    finance_year   int2                     not null,
    project_name   varchar(255)             not null,
    engage_code    varchar(255)             not null,
    total_fee      decimal(12, 2)           not null default 0,
    stage          varchar(32)              not null,
    closed         bool                     not null default false,
    create_at      timestamp with time zone not null,
    update_at      timestamp with time zone not null,
    primary key (id)
);

drop table if exists p_member;
create table p_member
(
    id             bigint                   not null,
    rel_project_id bigint                   not null,
    member_name    varchar(255)             not null,
    member_gpn     varchar(255)             not null,
    total_hours    decimal(12, 2)           not null default 0,
    total_ser      decimal(12, 2)           not null default 0,
    statistics     jsonb                    null,
    hours          jsonb                    not null,
    create_at      timestamp with time zone not null,
    update_at      timestamp with time zone not null,
    primary key (id),
    constraint project_staff_constraint unique (rel_project_id, member_gpn)
);