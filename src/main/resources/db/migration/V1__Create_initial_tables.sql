create table user
(
  user_id varchar(16) not null primary key,
  user_name varchar(128) not null
);

create table subject
(
  subject_id TINYINT not null primary key,
  subject_name varchar(32) not null
);

create table cost
(
  date_time datetime null,
  subject_id tinyint not null,
  cost int null,
  uuid varchar(36) not null
    primary key,
  user_id varchar(16) not null,
  constraint cost_ibfk_1
  foreign key (subject_id) references mydb.subject (subject_id),
  constraint cost_user_id_fk
  foreign key (user_id) references mydb.user (user_id)
)
;

create index subject_id
  on cost (subject_id)
;

create index cost_user_github_user_id_fk
  on cost (user_id)
;

