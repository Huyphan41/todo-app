create table if not exists todo (
    id uuid not null,
    description varchar(255),
    completed boolean not null,
    user_id uuid,
    primary key (id)
);