create database saatcms
use saatcms

Create Table content(
	id int not null AUTO_INCREMENT,
	name varchar(250) not null,
	status varchar(250) not null,
	licenses varchar(250) not null,
	poster_url varchar(250) not null,
	video_url varchar(250) not null,
	primary key (id)
	
);

insert into content(name,status,licenses,poster_url,video_url)
values("İron-Man","Action","Licence","www.posterurl.com","www.posterurl.com");

insert into content(name,status,licenses,poster_url,video_url)
values("Super-Man","Action","Licence","www.posterurl.com","www.posterurl.com");

select * from content


Create Table licence(
	id int not null AUTO_INCREMENT,
	name varchar(250) not null,
	start_time varchar(250) not null,
	end_time varchar(250) not null,
	contents varchar(250) not null,
	primary key (id)
	
);

insert into licence(name,start_time,end_time,contents)
values("Super-Man","5","100","action");

select * from Licence

