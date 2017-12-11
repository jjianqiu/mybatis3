
create table team(
  team_id int(11) primary key,
  team_name varchar(32) ,
  team_money decimal(11,2)
);

CREATE TABLE people(
	people_id VARCHAR(32) PRIMARY KEY,
	people_name VARCHAR(32)
);

CREATE TABLE card(
	card_id VARCHAR(32) PRIMARY KEY,
	people_id VARCHAR(32),
	address VARCHAR(255)
);

INSERT INTO people VALUES('1','王菲'),('2','miss');
INSERT INTO card VALUES('asss123','1','北京'),('bbb124','2','深圳');

CREATE TABLE player(
	player_id INT(11) PRIMARY KEY,
	player_name VARCHAR(32),
	team_id INT(11)
);

INSERT INTO player VALUES(1,"姚明",1),(2,"姚明2",1),(3,"奥巴马",2),(4,"川普",3);

CREATE TABLE author(
	author_id INT(11) PRIMARY KEY,
	author_name VARCHAR(32),
);

CREATE TABLE blog(
	blog_id INT(11) PRIMARY KEY,
	blog_title VARCHAR(255),
	blog_content VARCHAR(10000),
	author_id INT(11)
);

CREATE TABLE COMMENT(
	comment_id INT(11) PRIMARY KEY,
	comment_content VARCHAR(255),
	blog_id INT(11)
);