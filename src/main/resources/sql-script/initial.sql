drop table if exists `d_dog`;
create table `d_dog`
(
    `id`          bigint primary key auto_increment,
    `name`        varchar(255) null,
    `create_at`   datetime     not null,
    `update_at`   datetime     not null,
    `data_status` tinyint(1)   not null
);