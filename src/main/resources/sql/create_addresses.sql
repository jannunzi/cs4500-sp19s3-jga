create table addresses (
   id integer not null auto_increment,
    city varchar(255),
    country varchar(255),
    state varchar(255),
    street1 varchar(255),
    street2 varchar(255),
    user_id integer,
    primary key (id)
	constraint FK1fa36y2oqhao3wgg2rw1pi459 foreign key (user_id) references users (id)
) engine=InnoDB
